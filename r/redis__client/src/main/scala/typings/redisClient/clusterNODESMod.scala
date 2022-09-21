package typings.redisClient

import typings.redisClient.anon.From
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clusterNODESMod {
  
  @JSImport("@redis/client/dist/lib/commands/CLUSTER_NODES", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait RedisClusterNodeLinkStates extends StObject
  @JSImport("@redis/client/dist/lib/commands/CLUSTER_NODES", "RedisClusterNodeLinkStates")
  @js.native
  object RedisClusterNodeLinkStates extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RedisClusterNodeLinkStates & String] = js.native
    
    @js.native
    sealed trait CONNECTED
      extends StObject
         with RedisClusterNodeLinkStates
    /* "connected" */ val CONNECTED: typings.redisClient.clusterNODESMod.RedisClusterNodeLinkStates.CONNECTED & String = js.native
    
    @js.native
    sealed trait DISCONNECTED
      extends StObject
         with RedisClusterNodeLinkStates
    /* "disconnected" */ val DISCONNECTED: typings.redisClient.clusterNODESMod.RedisClusterNodeLinkStates.DISCONNECTED & String = js.native
  }
  
  inline def transformArguments(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[js.Array[String]]
  
  inline def transformReply(reply: String): js.Array[RedisClusterMasterNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[js.Array[RedisClusterMasterNode]]
  
  trait RedisClusterMasterNode
    extends StObject
       with RedisClusterReplicaNode {
    
    var replicas: js.Array[RedisClusterReplicaNode]
    
    var slots: js.Array[From]
  }
  object RedisClusterMasterNode {
    
    inline def apply(
      address: String,
      configEpoch: Double,
      flags: js.Array[String],
      host: String,
      id: String,
      linkState: RedisClusterNodeLinkStates,
      pingSent: Double,
      pongRecv: Double,
      port: Double,
      replicas: js.Array[RedisClusterReplicaNode],
      slots: js.Array[From]
    ): RedisClusterMasterNode = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], configEpoch = configEpoch.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], linkState = linkState.asInstanceOf[js.Any], pingSent = pingSent.asInstanceOf[js.Any], pongRecv = pongRecv.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], cport = null)
      __obj.asInstanceOf[RedisClusterMasterNode]
    }
    
    extension [Self <: RedisClusterMasterNode](x: Self) {
      
      inline def setReplicas(value: js.Array[RedisClusterReplicaNode]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
      
      inline def setReplicasVarargs(value: RedisClusterReplicaNode*): Self = StObject.set(x, "replicas", js.Array(value*))
      
      inline def setSlots(value: js.Array[From]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsVarargs(value: From*): Self = StObject.set(x, "slots", js.Array(value*))
    }
  }
  
  trait RedisClusterNodeAddress extends StObject {
    
    var cport: Double | Null
    
    var host: String
    
    var port: Double
  }
  object RedisClusterNodeAddress {
    
    inline def apply(host: String, port: Double): RedisClusterNodeAddress = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], cport = null)
      __obj.asInstanceOf[RedisClusterNodeAddress]
    }
    
    extension [Self <: RedisClusterNodeAddress](x: Self) {
      
      inline def setCport(value: Double): Self = StObject.set(x, "cport", value.asInstanceOf[js.Any])
      
      inline def setCportNull: Self = StObject.set(x, "cport", null)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  trait RedisClusterReplicaNode
    extends StObject
       with RedisClusterNodeAddress {
    
    var address: String
    
    var configEpoch: Double
    
    var flags: js.Array[String]
    
    var id: String
    
    var linkState: RedisClusterNodeLinkStates
    
    var pingSent: Double
    
    var pongRecv: Double
  }
  object RedisClusterReplicaNode {
    
    inline def apply(
      address: String,
      configEpoch: Double,
      flags: js.Array[String],
      host: String,
      id: String,
      linkState: RedisClusterNodeLinkStates,
      pingSent: Double,
      pongRecv: Double,
      port: Double
    ): RedisClusterReplicaNode = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], configEpoch = configEpoch.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], linkState = linkState.asInstanceOf[js.Any], pingSent = pingSent.asInstanceOf[js.Any], pongRecv = pongRecv.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], cport = null)
      __obj.asInstanceOf[RedisClusterReplicaNode]
    }
    
    extension [Self <: RedisClusterReplicaNode](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setConfigEpoch(value: Double): Self = StObject.set(x, "configEpoch", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: js.Array[String]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsVarargs(value: String*): Self = StObject.set(x, "flags", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLinkState(value: RedisClusterNodeLinkStates): Self = StObject.set(x, "linkState", value.asInstanceOf[js.Any])
      
      inline def setPingSent(value: Double): Self = StObject.set(x, "pingSent", value.asInstanceOf[js.Any])
      
      inline def setPongRecv(value: Double): Self = StObject.set(x, "pongRecv", value.asInstanceOf[js.Any])
    }
  }
}
