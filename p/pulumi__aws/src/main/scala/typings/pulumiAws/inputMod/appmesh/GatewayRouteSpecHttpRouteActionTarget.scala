package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayRouteSpecHttpRouteActionTarget extends StObject {
  
  /**
    * The virtual service gateway route target.
    */
  var virtualService: Input[GatewayRouteSpecHttpRouteActionTargetVirtualService]
}
object GatewayRouteSpecHttpRouteActionTarget {
  
  @scala.inline
  def apply(virtualService: Input[GatewayRouteSpecHttpRouteActionTargetVirtualService]): GatewayRouteSpecHttpRouteActionTarget = {
    val __obj = js.Dynamic.literal(virtualService = virtualService.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecHttpRouteActionTarget]
  }
  
  @scala.inline
  implicit class GatewayRouteSpecHttpRouteActionTargetMutableBuilder[Self <: GatewayRouteSpecHttpRouteActionTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualService(value: Input[GatewayRouteSpecHttpRouteActionTargetVirtualService]): Self = StObject.set(x, "virtualService", value.asInstanceOf[js.Any])
  }
}
