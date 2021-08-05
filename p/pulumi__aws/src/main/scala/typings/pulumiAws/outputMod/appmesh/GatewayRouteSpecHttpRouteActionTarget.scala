package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayRouteSpecHttpRouteActionTarget extends StObject {
  
  /**
    * The virtual service gateway route target.
    */
  var virtualService: GatewayRouteSpecHttpRouteActionTargetVirtualService
}
object GatewayRouteSpecHttpRouteActionTarget {
  
  inline def apply(virtualService: GatewayRouteSpecHttpRouteActionTargetVirtualService): GatewayRouteSpecHttpRouteActionTarget = {
    val __obj = js.Dynamic.literal(virtualService = virtualService.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecHttpRouteActionTarget]
  }
  
  extension [Self <: GatewayRouteSpecHttpRouteActionTarget](x: Self) {
    
    inline def setVirtualService(value: GatewayRouteSpecHttpRouteActionTargetVirtualService): Self = StObject.set(x, "virtualService", value.asInstanceOf[js.Any])
  }
}
