package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayRouteSpecGrpcRouteAction extends StObject {
  
  /**
    * The target that traffic is routed to when a request matches the gateway route.
    */
  var target: GatewayRouteSpecGrpcRouteActionTarget
}
object GatewayRouteSpecGrpcRouteAction {
  
  inline def apply(target: GatewayRouteSpecGrpcRouteActionTarget): GatewayRouteSpecGrpcRouteAction = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecGrpcRouteAction]
  }
  
  extension [Self <: GatewayRouteSpecGrpcRouteAction](x: Self) {
    
    inline def setTarget(value: GatewayRouteSpecGrpcRouteActionTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
