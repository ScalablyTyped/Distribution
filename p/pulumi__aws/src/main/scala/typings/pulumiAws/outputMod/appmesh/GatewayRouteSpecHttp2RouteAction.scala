package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayRouteSpecHttp2RouteAction extends StObject {
  
  /**
    * The target that traffic is routed to when a request matches the gateway route.
    */
  var target: GatewayRouteSpecHttp2RouteActionTarget = js.native
}
object GatewayRouteSpecHttp2RouteAction {
  
  @scala.inline
  def apply(target: GatewayRouteSpecHttp2RouteActionTarget): GatewayRouteSpecHttp2RouteAction = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecHttp2RouteAction]
  }
  
  @scala.inline
  implicit class GatewayRouteSpecHttp2RouteActionMutableBuilder[Self <: GatewayRouteSpecHttp2RouteAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: GatewayRouteSpecHttp2RouteActionTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
