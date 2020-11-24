package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpecHttp2RouteAction extends js.Object {
  
  /**
    * The targets that traffic is routed to when a request matches the route.
    * You can specify one or more targets and their relative weights with which to distribute traffic.
    */
  var weightedTargets: Input[js.Array[Input[RouteSpecHttp2RouteActionWeightedTarget]]] = js.native
}
object RouteSpecHttp2RouteAction {
  
  @scala.inline
  def apply(weightedTargets: Input[js.Array[Input[RouteSpecHttp2RouteActionWeightedTarget]]]): RouteSpecHttp2RouteAction = {
    val __obj = js.Dynamic.literal(weightedTargets = weightedTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttp2RouteAction]
  }
  
  @scala.inline
  implicit class RouteSpecHttp2RouteActionOps[Self <: RouteSpecHttp2RouteAction] (val x: Self) extends AnyVal {
    
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
    def setWeightedTargetsVarargs(value: Input[RouteSpecHttp2RouteActionWeightedTarget]*): Self = this.set("weightedTargets", js.Array(value :_*))
    
    @scala.inline
    def setWeightedTargets(value: Input[js.Array[Input[RouteSpecHttp2RouteActionWeightedTarget]]]): Self = this.set("weightedTargets", value.asInstanceOf[js.Any])
  }
}
