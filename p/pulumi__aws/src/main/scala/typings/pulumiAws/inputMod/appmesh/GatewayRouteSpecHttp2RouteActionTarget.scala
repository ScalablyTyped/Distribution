package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayRouteSpecHttp2RouteActionTarget extends StObject {
  
  /**
    * The virtual service gateway route target.
    */
  var virtualService: Input[GatewayRouteSpecHttp2RouteActionTargetVirtualService]
}
object GatewayRouteSpecHttp2RouteActionTarget {
  
  inline def apply(virtualService: Input[GatewayRouteSpecHttp2RouteActionTargetVirtualService]): GatewayRouteSpecHttp2RouteActionTarget = {
    val __obj = js.Dynamic.literal(virtualService = virtualService.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecHttp2RouteActionTarget]
  }
  
  extension [Self <: GatewayRouteSpecHttp2RouteActionTarget](x: Self) {
    
    inline def setVirtualService(value: Input[GatewayRouteSpecHttp2RouteActionTargetVirtualService]): Self = StObject.set(x, "virtualService", value.asInstanceOf[js.Any])
  }
}
