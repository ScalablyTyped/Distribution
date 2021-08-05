package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayRouteSpecGrpcRoute extends StObject {
  
  /**
    * The action to take if a match is determined.
    */
  var action: GatewayRouteSpecGrpcRouteAction
  
  /**
    * The criteria for determining a request match.
    */
  var `match`: GatewayRouteSpecGrpcRouteMatch
}
object GatewayRouteSpecGrpcRoute {
  
  inline def apply(action: GatewayRouteSpecGrpcRouteAction, `match`: GatewayRouteSpecGrpcRouteMatch): GatewayRouteSpecGrpcRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecGrpcRoute]
  }
  
  extension [Self <: GatewayRouteSpecGrpcRoute](x: Self) {
    
    inline def setAction(value: GatewayRouteSpecGrpcRouteAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setMatch(value: GatewayRouteSpecGrpcRouteMatch): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
  }
}
