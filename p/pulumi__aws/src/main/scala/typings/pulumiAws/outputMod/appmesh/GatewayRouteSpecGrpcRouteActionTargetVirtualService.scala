package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayRouteSpecGrpcRouteActionTargetVirtualService extends StObject {
  
  /**
    * The name of the virtual service that traffic is routed to. Must be between 1 and 255 characters in length.
    */
  var virtualServiceName: String
}
object GatewayRouteSpecGrpcRouteActionTargetVirtualService {
  
  inline def apply(virtualServiceName: String): GatewayRouteSpecGrpcRouteActionTargetVirtualService = {
    val __obj = js.Dynamic.literal(virtualServiceName = virtualServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecGrpcRouteActionTargetVirtualService]
  }
  
  extension [Self <: GatewayRouteSpecGrpcRouteActionTargetVirtualService](x: Self) {
    
    inline def setVirtualServiceName(value: String): Self = StObject.set(x, "virtualServiceName", value.asInstanceOf[js.Any])
  }
}
