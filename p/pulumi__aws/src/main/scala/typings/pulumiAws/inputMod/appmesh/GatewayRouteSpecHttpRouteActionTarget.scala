package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayRouteSpecHttpRouteActionTarget extends js.Object {
  
  /**
    * The virtual service gateway route target.
    */
  var virtualService: Input[GatewayRouteSpecHttpRouteActionTargetVirtualService] = js.native
}
object GatewayRouteSpecHttpRouteActionTarget {
  
  @scala.inline
  def apply(virtualService: Input[GatewayRouteSpecHttpRouteActionTargetVirtualService]): GatewayRouteSpecHttpRouteActionTarget = {
    val __obj = js.Dynamic.literal(virtualService = virtualService.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecHttpRouteActionTarget]
  }
  
  @scala.inline
  implicit class GatewayRouteSpecHttpRouteActionTargetOps[Self <: GatewayRouteSpecHttpRouteActionTarget] (val x: Self) extends AnyVal {
    
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
    def setVirtualService(value: Input[GatewayRouteSpecHttpRouteActionTargetVirtualService]): Self = this.set("virtualService", value.asInstanceOf[js.Any])
  }
}
