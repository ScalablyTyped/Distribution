package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayRouteSpecHttp2Route extends StObject {
  
  /**
    * The action to take if a match is determined.
    */
  var action: Input[GatewayRouteSpecHttp2RouteAction]
  
  /**
    * The criteria for determining a request match.
    */
  var `match`: Input[GatewayRouteSpecHttp2RouteMatch]
}
object GatewayRouteSpecHttp2Route {
  
  @scala.inline
  def apply(action: Input[GatewayRouteSpecHttp2RouteAction], `match`: Input[GatewayRouteSpecHttp2RouteMatch]): GatewayRouteSpecHttp2Route = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecHttp2Route]
  }
  
  @scala.inline
  implicit class GatewayRouteSpecHttp2RouteMutableBuilder[Self <: GatewayRouteSpecHttp2Route] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: Input[GatewayRouteSpecHttp2RouteAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: Input[GatewayRouteSpecHttp2RouteMatch]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
  }
}
