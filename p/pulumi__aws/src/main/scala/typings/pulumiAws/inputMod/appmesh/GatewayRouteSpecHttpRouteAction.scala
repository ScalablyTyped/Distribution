package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayRouteSpecHttpRouteAction extends StObject {
  
  /**
    * The target that traffic is routed to when a request matches the gateway route.
    */
  var target: Input[GatewayRouteSpecHttpRouteActionTarget]
}
object GatewayRouteSpecHttpRouteAction {
  
  inline def apply(target: Input[GatewayRouteSpecHttpRouteActionTarget]): GatewayRouteSpecHttpRouteAction = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecHttpRouteAction]
  }
  
  extension [Self <: GatewayRouteSpecHttpRouteAction](x: Self) {
    
    inline def setTarget(value: Input[GatewayRouteSpecHttpRouteActionTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
