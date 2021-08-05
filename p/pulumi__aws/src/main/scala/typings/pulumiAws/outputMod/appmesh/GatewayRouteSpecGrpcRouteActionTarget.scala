package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayRouteSpecGrpcRouteActionTarget extends StObject {
  
  /**
    * The virtual service gateway route target.
    */
  var virtualService: GatewayRouteSpecGrpcRouteActionTargetVirtualService
}
object GatewayRouteSpecGrpcRouteActionTarget {
  
  inline def apply(virtualService: GatewayRouteSpecGrpcRouteActionTargetVirtualService): GatewayRouteSpecGrpcRouteActionTarget = {
    val __obj = js.Dynamic.literal(virtualService = virtualService.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecGrpcRouteActionTarget]
  }
  
  extension [Self <: GatewayRouteSpecGrpcRouteActionTarget](x: Self) {
    
    inline def setVirtualService(value: GatewayRouteSpecGrpcRouteActionTargetVirtualService): Self = StObject.set(x, "virtualService", value.asInstanceOf[js.Any])
  }
}
