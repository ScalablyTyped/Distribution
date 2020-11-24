package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpecHttpRouteAction extends js.Object {
  
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
  implicit class RouteSpecHttpRouteActionOps[Self <: RouteSpecHttpRouteAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWeightedTargetsVarargs(value: Input[RouteSpecHttpRouteActionWeightedTarget]*): Self = this.set("weightedTargets", js.Array(value :_*))
    
    @scala.inline
    def setWeightedTargets(value: Input[js.Array[Input[RouteSpecHttpRouteActionWeightedTarget]]]): Self = this.set("weightedTargets", value.asInstanceOf[js.Any])
  }
}
