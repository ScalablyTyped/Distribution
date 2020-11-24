package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayRouteSpecHttp2RouteActionTarget extends js.Object {
  
  /**
    * The virtual service gateway route target.
    */
  var virtualService: GatewayRouteSpecHttp2RouteActionTargetVirtualService = js.native
}
object GatewayRouteSpecHttp2RouteActionTarget {
  
  @scala.inline
  def apply(virtualService: GatewayRouteSpecHttp2RouteActionTargetVirtualService): GatewayRouteSpecHttp2RouteActionTarget = {
    val __obj = js.Dynamic.literal(virtualService = virtualService.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecHttp2RouteActionTarget]
  }
  
  @scala.inline
  implicit class GatewayRouteSpecHttp2RouteActionTargetOps[Self <: GatewayRouteSpecHttp2RouteActionTarget] (val x: Self) extends AnyVal {
    
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
    def setVirtualService(value: GatewayRouteSpecHttp2RouteActionTargetVirtualService): Self = this.set("virtualService", value.asInstanceOf[js.Any])
  }
}
