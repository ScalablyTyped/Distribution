package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpecHttpRouteAction extends StObject {
  
  /**
    * The targets that traffic is routed to when a request matches the route.
    * You can specify one or more targets and their relative weights with which to distribute traffic.
    */
  var weightedTargets: Input[js.Array[Input[RouteSpecHttpRouteActionWeightedTarget]]] = js.native
}
object RouteSpecHttpRouteAction {
  
  @scala.inline
  def apply(weightedTargets: Input[js.Array[Input[RouteSpecHttpRouteActionWeightedTarget]]]): RouteSpecHttpRouteAction = {
    val __obj = js.Dynamic.literal(weightedTargets = weightedTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttpRouteAction]
  }
  
  @scala.inline
  implicit class RouteSpecHttpRouteActionMutableBuilder[Self <: RouteSpecHttpRouteAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWeightedTargets(value: Input[js.Array[Input[RouteSpecHttpRouteActionWeightedTarget]]]): Self = StObject.set(x, "weightedTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightedTargetsVarargs(value: Input[RouteSpecHttpRouteActionWeightedTarget]*): Self = StObject.set(x, "weightedTargets", js.Array(value :_*))
  }
}
