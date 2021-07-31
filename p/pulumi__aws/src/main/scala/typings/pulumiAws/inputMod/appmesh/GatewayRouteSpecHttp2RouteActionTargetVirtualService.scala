package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayRouteSpecHttp2RouteActionTargetVirtualService extends StObject {
  
  /**
    * The name of the virtual service that traffic is routed to. Must be between 1 and 255 characters in length.
    */
  var virtualServiceName: Input[String]
}
object GatewayRouteSpecHttp2RouteActionTargetVirtualService {
  
  @scala.inline
  def apply(virtualServiceName: Input[String]): GatewayRouteSpecHttp2RouteActionTargetVirtualService = {
    val __obj = js.Dynamic.literal(virtualServiceName = virtualServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecHttp2RouteActionTargetVirtualService]
  }
  
  @scala.inline
  implicit class GatewayRouteSpecHttp2RouteActionTargetVirtualServiceMutableBuilder[Self <: GatewayRouteSpecHttp2RouteActionTargetVirtualService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualServiceName(value: Input[String]): Self = StObject.set(x, "virtualServiceName", value.asInstanceOf[js.Any])
  }
}
