package typings.redisInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type PersistenceInfo = typings.redisInfo.mod.BasePersistenceInfo with (typings.redisInfo.mod.PersistenceAOFOnInfo | typings.redisInfo.mod.PersistenceAOFOffInfo) with (typings.redisInfo.mod.PersistenceLoadingOnInfo | typings.redisInfo.mod.PersistenceLoadingOffInfo)
  type RedisInfo = typings.redisInfo.mod.GeneralStats with typings.redisInfo.mod.ServerInfo with typings.redisInfo.mod.ClientsInfo with typings.redisInfo.mod.MemoryInfo with typings.redisInfo.mod.PersistenceInfo with typings.redisInfo.mod.Stats with typings.redisInfo.mod.ReplicationInfo with typings.redisInfo.mod.CPUInfo
  type ReplicationInfo = typings.redisInfo.mod.BaseReplicationInfo with (typings.redisInfo.mod.ReplicationMasterInfo | typings.redisInfo.mod.ReplicationReplicaInfo)
  type ReplicationReplicaInfo = typings.redisInfo.mod.BaseReplicationReplicaInfo with (typings.redisInfo.mod.ReplicationReplicaSyncOnInfo | typings.redisInfo.mod.ReplicationReplicaSyncOffInfo) with (typings.redisInfo.mod.ReplicationReplicaLinkUpInfo | typings.redisInfo.mod.ReplicationReplicaLinkDownInfo)
}
