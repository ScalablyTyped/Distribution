package typings.redisClient

import typings.redisClient.anon.Assigned
import typings.redisClient.anon.MessagesReceived
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsClusterINFOMod {
  
  @JSImport("@redis/client/dist/lib/commands/CLUSTER_INFO", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractLineValue(line: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractLineValue")(line.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def transformArguments(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[js.Array[String]]
  
  inline def transformReply(reply: String): ClusterInfoReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[ClusterInfoReply]
  
  trait ClusterInfoReply extends StObject {
    
    var currentEpoch: Double
    
    var knownNodes: Double
    
    var myEpoch: Double
    
    var size: Double
    
    var slots: Assigned
    
    var state: String
    
    var stats: MessagesReceived
  }
  object ClusterInfoReply {
    
    inline def apply(
      currentEpoch: Double,
      knownNodes: Double,
      myEpoch: Double,
      size: Double,
      slots: Assigned,
      state: String,
      stats: MessagesReceived
    ): ClusterInfoReply = {
      val __obj = js.Dynamic.literal(currentEpoch = currentEpoch.asInstanceOf[js.Any], knownNodes = knownNodes.asInstanceOf[js.Any], myEpoch = myEpoch.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterInfoReply]
    }
    
    extension [Self <: ClusterInfoReply](x: Self) {
      
      inline def setCurrentEpoch(value: Double): Self = StObject.set(x, "currentEpoch", value.asInstanceOf[js.Any])
      
      inline def setKnownNodes(value: Double): Self = StObject.set(x, "knownNodes", value.asInstanceOf[js.Any])
      
      inline def setMyEpoch(value: Double): Self = StObject.set(x, "myEpoch", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSlots(value: Assigned): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStats(value: MessagesReceived): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
}
