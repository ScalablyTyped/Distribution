package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayRouteSpecHttpRoute extends js.Object {
  
  /**
    * The action to take if a match is determined.
    */
  var action: Input[GatewayRouteSpecHttpRouteAction] = js.native
  
  /**
    * The criteria for determining a request match.
    */
  var `match`: Input[GatewayRouteSpecHttpRouteMatch] = js.native
}
object GatewayRouteSpecHttpRoute {
  
  @scala.inline
  def apply(action: Input[GatewayRouteSpecHttpRouteAction], `match`: Input[GatewayRouteSpecHttpRouteMatch]): GatewayRouteSpecHttpRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecHttpRoute]
  }
  
  @scala.inline
  implicit class GatewayRouteSpecHttpRouteOps[Self <: GatewayRouteSpecHttpRoute] (val x: Self) extends AnyVal {
    
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
    def setAction(value: Input[GatewayRouteSpecHttpRouteAction]): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: Input[GatewayRouteSpecHttpRouteMatch]): Self = this.set("match", value.asInstanceOf[js.Any])
  }
}
