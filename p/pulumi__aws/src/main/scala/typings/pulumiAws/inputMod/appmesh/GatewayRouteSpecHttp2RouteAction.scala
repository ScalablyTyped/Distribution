package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayRouteSpecHttp2RouteAction extends StObject {
  
  /**
    * The target that traffic is routed to when a request matches the gateway route.
    */
  var target: Input[GatewayRouteSpecHttp2RouteActionTarget]
}
object GatewayRouteSpecHttp2RouteAction {
  
  inline def apply(target: Input[GatewayRouteSpecHttp2RouteActionTarget]): GatewayRouteSpecHttp2RouteAction = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecHttp2RouteAction]
  }
  
  extension [Self <: GatewayRouteSpecHttp2RouteAction](x: Self) {
    
    inline def setTarget(value: Input[GatewayRouteSpecHttp2RouteActionTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
