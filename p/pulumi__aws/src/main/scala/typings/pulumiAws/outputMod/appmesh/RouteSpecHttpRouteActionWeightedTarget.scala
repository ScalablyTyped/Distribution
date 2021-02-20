package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpecHttpRouteActionWeightedTarget extends StObject {
  
  /**
    * The virtual node to associate with the weighted target. Must be between 1 and 255 characters in length.
    */
  var virtualNode: String = js.native
  
  /**
    * The relative weight of the weighted target. An integer between 0 and 100.
    */
  var weight: Double = js.native
}
object RouteSpecHttpRouteActionWeightedTarget {
  
  @scala.inline
  def apply(virtualNode: String, weight: Double): RouteSpecHttpRouteActionWeightedTarget = {
    val __obj = js.Dynamic.literal(virtualNode = virtualNode.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttpRouteActionWeightedTarget]
  }
  
  @scala.inline
  implicit class RouteSpecHttpRouteActionWeightedTargetMutableBuilder[Self <: RouteSpecHttpRouteActionWeightedTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualNode(value: String): Self = StObject.set(x, "virtualNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
