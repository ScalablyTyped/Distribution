package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpecHttpRoute extends js.Object {
  
  /**
    * The action to take if a match is determined.
    */
  var action: Input[RouteSpecHttpRouteAction] = js.native
  
  /**
    * The criteria for determining an HTTP request match.
    */
  var `match`: Input[RouteSpecHttpRouteMatch] = js.native
  
  /**
    * The retry policy.
    */
  var retryPolicy: js.UndefOr[Input[RouteSpecHttpRouteRetryPolicy]] = js.native
  
  /**
    * The types of timeouts.
    */
  var timeout: js.UndefOr[Input[RouteSpecHttpRouteTimeout]] = js.native
}
object RouteSpecHttpRoute {
  
  @scala.inline
  def apply(action: Input[RouteSpecHttpRouteAction], `match`: Input[RouteSpecHttpRouteMatch]): RouteSpecHttpRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttpRoute]
  }
  
  @scala.inline
  implicit class RouteSpecHttpRouteOps[Self <: RouteSpecHttpRoute] (val x: Self) extends AnyVal {
    
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
    def setAction(value: Input[RouteSpecHttpRouteAction]): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: Input[RouteSpecHttpRouteMatch]): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryPolicy(value: Input[RouteSpecHttpRouteRetryPolicy]): Self = this.set("retryPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryPolicy: Self = this.set("retryPolicy", js.undefined)
    
    @scala.inline
    def setTimeout(value: Input[RouteSpecHttpRouteTimeout]): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
