package typings.redisClient

import typings.redisClient.anon.Master
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsClusterSLOTSMod {
  
  @JSImport("@redis/client/dist/lib/commands/CLUSTER_SLOTS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: ClusterSlotsRawReply): ClusterSlotsReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[ClusterSlotsReply]
  
  trait ClusterSlotsNode extends StObject {
    
    var id: String
    
    var ip: String
    
    var port: Double
  }
  object ClusterSlotsNode {
    
    inline def apply(id: String, ip: String, port: Double): ClusterSlotsNode = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterSlotsNode]
    }
    
    extension [Self <: ClusterSlotsNode](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  type ClusterSlotsRawNode = js.Tuple3[/* ip */ String, /* port */ Double, /* id */ String]
  
  type ClusterSlotsRawReply = js.Array[/* replicas */ Array[Double | ClusterSlotsRawNode]]
  
  type ClusterSlotsReply = js.Array[Master]
}
