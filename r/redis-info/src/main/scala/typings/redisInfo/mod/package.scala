package typings.redisInfo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def parse(info: java.lang.String): typings.redisInfo.mod.RedisInfo = typings.redisInfo.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(info.asInstanceOf[js.Any]).asInstanceOf[typings.redisInfo.mod.RedisInfo]

type PersistenceInfo = typings.redisInfo.mod.BasePersistenceInfo & (typings.redisInfo.mod.PersistenceAOFOnInfo | typings.redisInfo.mod.PersistenceAOFOffInfo) & (typings.redisInfo.mod.PersistenceLoadingOnInfo | typings.redisInfo.mod.PersistenceLoadingOffInfo)

type RedisInfo = typings.redisInfo.mod.GeneralStats & typings.redisInfo.mod.ServerInfo & typings.redisInfo.mod.ClientsInfo & typings.redisInfo.mod.MemoryInfo & typings.redisInfo.mod.PersistenceInfo & typings.redisInfo.mod.Stats & typings.redisInfo.mod.ReplicationInfo & typings.redisInfo.mod.CPUInfo

type ReplicationInfo = typings.redisInfo.mod.BaseReplicationInfo & (typings.redisInfo.mod.ReplicationMasterInfo | typings.redisInfo.mod.ReplicationReplicaInfo)

type ReplicationReplicaInfo = typings.redisInfo.mod.BaseReplicationReplicaInfo & (typings.redisInfo.mod.ReplicationReplicaSyncOnInfo | typings.redisInfo.mod.ReplicationReplicaSyncOffInfo) & (typings.redisInfo.mod.ReplicationReplicaLinkUpInfo | typings.redisInfo.mod.ReplicationReplicaLinkDownInfo)
