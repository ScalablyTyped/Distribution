package typings.redisClient

import typings.redisClient.anon.Ip
import typings.redisClient.anon.Port
import typings.redisClient.redisClientStrings.master
import typings.redisClient.redisClientStrings.sentinel
import typings.redisClient.redisClientStrings.slave
import typings.redisClient.redisClientStrings.sync_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsRoleMod {
  
  @JSImport("@redis/client/dist/lib/commands/ROLE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/ROLE", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[js.Array[String]]
  
  inline def transformReply(reply: RoleRawReply): RoleReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[RoleReply]
  
  type RoleMasterRawReply = js.Tuple3[master, Double, js.Array[js.Tuple3[String, String, String]]]
  
  trait RoleMasterReply
    extends StObject
       with RoleReplyInterface[master]
       with RoleReply {
    
    var replicas: js.Array[Ip]
    
    var replicationOffest: Double
  }
  object RoleMasterReply {
    
    inline def apply(replicas: js.Array[Ip], replicationOffest: Double): RoleMasterReply = {
      val __obj = js.Dynamic.literal(replicas = replicas.asInstanceOf[js.Any], replicationOffest = replicationOffest.asInstanceOf[js.Any], role = "master")
      __obj.asInstanceOf[RoleMasterReply]
    }
    
    extension [Self <: RoleMasterReply](x: Self) {
      
      inline def setReplicas(value: js.Array[Ip]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
      
      inline def setReplicasVarargs(value: Ip*): Self = StObject.set(x, "replicas", js.Array(value*))
      
      inline def setReplicationOffest(value: Double): Self = StObject.set(x, "replicationOffest", value.asInstanceOf[js.Any])
    }
  }
  
  type RoleRawReply = RoleMasterRawReply | RoleReplicaRawReply | RoleSentinelRawReply
  
  type RoleReplicaRawReply = js.Tuple5[slave, String, Double, RoleReplicaState, Double]
  
  trait RoleReplicaReply
    extends StObject
       with RoleReplyInterface[slave]
       with RoleReply {
    
    var dataReceived: Double
    
    var master: Port
    
    var state: RoleReplicaState
  }
  object RoleReplicaReply {
    
    inline def apply(dataReceived: Double, master: Port, state: RoleReplicaState): RoleReplicaReply = {
      val __obj = js.Dynamic.literal(dataReceived = dataReceived.asInstanceOf[js.Any], master = master.asInstanceOf[js.Any], role = "slave", state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoleReplicaReply]
    }
    
    extension [Self <: RoleReplicaReply](x: Self) {
      
      inline def setDataReceived(value: Double): Self = StObject.set(x, "dataReceived", value.asInstanceOf[js.Any])
      
      inline def setMaster(value: Port): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
      
      inline def setState(value: RoleReplicaState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.redisClient.redisClientStrings.connect
    - typings.redisClient.redisClientStrings.connecting
    - typings.redisClient.redisClientStrings.sync_
    - typings.redisClient.redisClientStrings.connected
  */
  trait RoleReplicaState extends StObject
  object RoleReplicaState {
    
    inline def connect: typings.redisClient.redisClientStrings.connect = "connect".asInstanceOf[typings.redisClient.redisClientStrings.connect]
    
    inline def connected: typings.redisClient.redisClientStrings.connected = "connected".asInstanceOf[typings.redisClient.redisClientStrings.connected]
    
    inline def connecting: typings.redisClient.redisClientStrings.connecting = "connecting".asInstanceOf[typings.redisClient.redisClientStrings.connecting]
    
    inline def sync: sync_ = "sync".asInstanceOf[sync_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.redisClient.distLibCommandsRoleMod.RoleMasterReply
    - typings.redisClient.distLibCommandsRoleMod.RoleReplicaReply
    - typings.redisClient.distLibCommandsRoleMod.RoleSentinelReply
  */
  trait RoleReply extends StObject
  object RoleReply {
    
    inline def RoleMasterReply(replicas: js.Array[Ip], replicationOffest: Double): typings.redisClient.distLibCommandsRoleMod.RoleMasterReply = {
      val __obj = js.Dynamic.literal(replicas = replicas.asInstanceOf[js.Any], replicationOffest = replicationOffest.asInstanceOf[js.Any], role = "master")
      __obj.asInstanceOf[typings.redisClient.distLibCommandsRoleMod.RoleMasterReply]
    }
    
    inline def RoleReplicaReply(dataReceived: Double, master: Port, state: RoleReplicaState): typings.redisClient.distLibCommandsRoleMod.RoleReplicaReply = {
      val __obj = js.Dynamic.literal(dataReceived = dataReceived.asInstanceOf[js.Any], master = master.asInstanceOf[js.Any], role = "slave", state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.redisClient.distLibCommandsRoleMod.RoleReplicaReply]
    }
    
    inline def RoleSentinelReply(masterNames: js.Array[String]): typings.redisClient.distLibCommandsRoleMod.RoleSentinelReply = {
      val __obj = js.Dynamic.literal(masterNames = masterNames.asInstanceOf[js.Any], role = "sentinel")
      __obj.asInstanceOf[typings.redisClient.distLibCommandsRoleMod.RoleSentinelReply]
    }
  }
  
  trait RoleReplyInterface[T /* <: String */] extends StObject {
    
    var role: T
  }
  object RoleReplyInterface {
    
    inline def apply[T /* <: String */](role: T): RoleReplyInterface[T] = {
      val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoleReplyInterface[T]]
    }
    
    extension [Self <: RoleReplyInterface[?], T /* <: String */](x: Self & RoleReplyInterface[T]) {
      
      inline def setRole(value: T): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    }
  }
  
  type RoleSentinelRawReply = js.Tuple2[sentinel, js.Array[String]]
  
  trait RoleSentinelReply
    extends StObject
       with RoleReplyInterface[sentinel]
       with RoleReply {
    
    var masterNames: js.Array[String]
  }
  object RoleSentinelReply {
    
    inline def apply(masterNames: js.Array[String]): RoleSentinelReply = {
      val __obj = js.Dynamic.literal(masterNames = masterNames.asInstanceOf[js.Any], role = "sentinel")
      __obj.asInstanceOf[RoleSentinelReply]
    }
    
    extension [Self <: RoleSentinelReply](x: Self) {
      
      inline def setMasterNames(value: js.Array[String]): Self = StObject.set(x, "masterNames", value.asInstanceOf[js.Any])
      
      inline def setMasterNamesVarargs(value: String*): Self = StObject.set(x, "masterNames", js.Array(value*))
    }
  }
}
