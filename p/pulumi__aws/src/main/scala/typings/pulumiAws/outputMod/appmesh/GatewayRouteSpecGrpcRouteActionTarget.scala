package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayRouteSpecGrpcRouteActionTarget extends StObject {
  
  /**
    * The virtual service gateway route target.
    */
  var virtualService: GatewayRouteSpecGrpcRouteActionTargetVirtualService = js.native
}
object GatewayRouteSpecGrpcRouteActionTarget {
  
  @scala.inline
  def apply(virtualService: GatewayRouteSpecGrpcRouteActionTargetVirtualService): GatewayRouteSpecGrpcRouteActionTarget = {
    val __obj = js.Dynamic.literal(virtualService = virtualService.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecGrpcRouteActionTarget]
  }
  
  @scala.inline
  implicit class GatewayRouteSpecGrpcRouteActionTargetMutableBuilder[Self <: GatewayRouteSpecGrpcRouteActionTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualService(value: GatewayRouteSpecGrpcRouteActionTargetVirtualService): Self = StObject.set(x, "virtualService", value.asInstanceOf[js.Any])
  }
}
