package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayRouteSpecHttpRouteActionTargetVirtualService extends StObject {
  
  /**
    * The name of the virtual service that traffic is routed to. Must be between 1 and 255 characters in length.
    */
  var virtualServiceName: Input[String]
}
object GatewayRouteSpecHttpRouteActionTargetVirtualService {
  
  inline def apply(virtualServiceName: Input[String]): GatewayRouteSpecHttpRouteActionTargetVirtualService = {
    val __obj = js.Dynamic.literal(virtualServiceName = virtualServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecHttpRouteActionTargetVirtualService]
  }
  
  extension [Self <: GatewayRouteSpecHttpRouteActionTargetVirtualService](x: Self) {
    
    inline def setVirtualServiceName(value: Input[String]): Self = StObject.set(x, "virtualServiceName", value.asInstanceOf[js.Any])
  }
}
