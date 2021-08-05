package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayRouteSpecHttp2RouteActionTargetVirtualService extends StObject {
  
  /**
    * The name of the virtual service that traffic is routed to. Must be between 1 and 255 characters in length.
    */
  var virtualServiceName: String
}
object GatewayRouteSpecHttp2RouteActionTargetVirtualService {
  
  inline def apply(virtualServiceName: String): GatewayRouteSpecHttp2RouteActionTargetVirtualService = {
    val __obj = js.Dynamic.literal(virtualServiceName = virtualServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecHttp2RouteActionTargetVirtualService]
  }
  
  extension [Self <: GatewayRouteSpecHttp2RouteActionTargetVirtualService](x: Self) {
    
    inline def setVirtualServiceName(value: String): Self = StObject.set(x, "virtualServiceName", value.asInstanceOf[js.Any])
  }
}
