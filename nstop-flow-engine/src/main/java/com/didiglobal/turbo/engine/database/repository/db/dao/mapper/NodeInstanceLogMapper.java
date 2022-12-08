package com.didiglobal.turbo.engine.database.repository.db.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.didiglobal.turbo.engine.database.repository.db.dao.provider.NodeInstanceLogProvider;
import com.didiglobal.turbo.engine.entity.NodeInstanceLogPO;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NodeInstanceLogMapper extends BaseMapper<NodeInstanceLogPO> {

    @InsertProvider(type = NodeInstanceLogProvider.class, method = "batchInsert")
    boolean batchInsert(@Param("flowInstanceId") String flowInstanceId,
                        @Param("nodeInstanceLogList") List<NodeInstanceLogPO> nodeInstanceLogList);

}
