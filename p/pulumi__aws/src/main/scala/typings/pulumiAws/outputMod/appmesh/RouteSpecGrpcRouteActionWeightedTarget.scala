package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecGrpcRouteActionWeightedTarget extends StObject {
  
  /**
    * The virtual node to associate with the weighted target. Must be between 1 and 255 characters in length.
    */
  var virtualNode: String
  
  /**
    * The relative weight of the weighted target. An integer between 0 and 100.
    */
  var weight: Double
}
object RouteSpecGrpcRouteActionWeightedTarget {
  
  inline def apply(virtualNode: String, weight: Double): RouteSpecGrpcRouteActionWeightedTarget = {
    val __obj = js.Dynamic.literal(virtualNode = virtualNode.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecGrpcRouteActionWeightedTarget]
  }
  
  extension [Self <: RouteSpecGrpcRouteActionWeightedTarget](x: Self) {
    
    inline def setVirtualNode(value: String): Self = StObject.set(x, "virtualNode", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
