package typings.redisClient.anon

import typings.redisClient.distLibCommandsClusterSLOTSMod.ClusterSlotsNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Master extends StObject {
  
  var from: Double
  
  var master: ClusterSlotsNode
  
  var replicas: js.Array[ClusterSlotsNode]
  
  var to: Double
}
object Master {
  
  inline def apply(from: Double, master: ClusterSlotsNode, replicas: js.Array[ClusterSlotsNode], to: Double): Master = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], master = master.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Master]
  }
  
  extension [Self <: Master](x: Self) {
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setMaster(value: ClusterSlotsNode): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
    
    inline def setReplicas(value: js.Array[ClusterSlotsNode]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    inline def setReplicasVarargs(value: ClusterSlotsNode*): Self = StObject.set(x, "replicas", js.Array(value*))
    
    inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
