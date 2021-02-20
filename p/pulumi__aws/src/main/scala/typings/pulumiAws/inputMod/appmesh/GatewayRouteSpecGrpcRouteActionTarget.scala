package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayRouteSpecGrpcRouteActionTarget extends StObject {
  
  /**
    * The virtual service gateway route target.
    */
  var virtualService: Input[GatewayRouteSpecGrpcRouteActionTargetVirtualService] = js.native
}
object GatewayRouteSpecGrpcRouteActionTarget {
  
  @scala.inline
  def apply(virtualService: Input[GatewayRouteSpecGrpcRouteActionTargetVirtualService]): GatewayRouteSpecGrpcRouteActionTarget = {
    val __obj = js.Dynamic.literal(virtualService = virtualService.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecGrpcRouteActionTarget]
  }
  
  @scala.inline
  implicit class GatewayRouteSpecGrpcRouteActionTargetMutableBuilder[Self <: GatewayRouteSpecGrpcRouteActionTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualService(value: Input[GatewayRouteSpecGrpcRouteActionTargetVirtualService]): Self = StObject.set(x, "virtualService", value.asInstanceOf[js.Any])
  }
}
