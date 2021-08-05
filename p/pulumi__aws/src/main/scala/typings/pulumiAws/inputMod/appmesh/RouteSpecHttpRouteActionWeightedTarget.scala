package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecHttpRouteActionWeightedTarget extends StObject {
  
  /**
    * The virtual node to associate with the weighted target. Must be between 1 and 255 characters in length.
    */
  var virtualNode: Input[String]
  
  /**
    * The relative weight of the weighted target. An integer between 0 and 100.
    */
  var weight: Input[Double]
}
object RouteSpecHttpRouteActionWeightedTarget {
  
  inline def apply(virtualNode: Input[String], weight: Input[Double]): RouteSpecHttpRouteActionWeightedTarget = {
    val __obj = js.Dynamic.literal(virtualNode = virtualNode.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttpRouteActionWeightedTarget]
  }
  
  extension [Self <: RouteSpecHttpRouteActionWeightedTarget](x: Self) {
    
    inline def setVirtualNode(value: Input[String]): Self = StObject.set(x, "virtualNode", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Input[Double]): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
