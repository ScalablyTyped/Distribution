package typings.redisInfo.mod

import typings.redisInfo.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def parse(info: String): RedisInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(info.asInstanceOf[js.Any]).asInstanceOf[RedisInfo]

type PersistenceInfo = BasePersistenceInfo & (PersistenceAOFOnInfo | PersistenceAOFOffInfo) & (PersistenceLoadingOnInfo | PersistenceLoadingOffInfo)

type RedisInfo = GeneralStats & ServerInfo & ClientsInfo & MemoryInfo & PersistenceInfo & Stats & ReplicationInfo & CPUInfo

type ReplicationInfo = (ReplicationMasterInfo & BaseReplicationInfo) | (ReplicationReplicaInfo & BaseReplicationInfo)

type ReplicationReplicaInfo = BaseReplicationReplicaInfo & (ReplicationReplicaSyncOnInfo | ReplicationReplicaSyncOffInfo) & (ReplicationReplicaLinkUpInfo | ReplicationReplicaLinkDownInfo)
