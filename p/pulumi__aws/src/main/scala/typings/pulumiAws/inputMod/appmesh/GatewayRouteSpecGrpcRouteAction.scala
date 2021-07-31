package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayRouteSpecGrpcRouteAction extends StObject {
  
  /**
    * The target that traffic is routed to when a request matches the gateway route.
    */
  var target: Input[GatewayRouteSpecGrpcRouteActionTarget]
}
object GatewayRouteSpecGrpcRouteAction {
  
  @scala.inline
  def apply(target: Input[GatewayRouteSpecGrpcRouteActionTarget]): GatewayRouteSpecGrpcRouteAction = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecGrpcRouteAction]
  }
  
  @scala.inline
  implicit class GatewayRouteSpecGrpcRouteActionMutableBuilder[Self <: GatewayRouteSpecGrpcRouteAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: Input[GatewayRouteSpecGrpcRouteActionTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
