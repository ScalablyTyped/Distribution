package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecGrpcRoute extends StObject {
  
  /**
    * The action to take if a match is determined.
    */
  var action: RouteSpecGrpcRouteAction
  
  /**
    * The criteria for determining an gRPC request match.
    */
  var `match`: RouteSpecGrpcRouteMatch
  
  /**
    * The retry policy.
    */
  var retryPolicy: js.UndefOr[RouteSpecGrpcRouteRetryPolicy] = js.undefined
  
  /**
    * The types of timeouts.
    */
  var timeout: js.UndefOr[RouteSpecGrpcRouteTimeout] = js.undefined
}
object RouteSpecGrpcRoute {
  
  inline def apply(action: RouteSpecGrpcRouteAction, `match`: RouteSpecGrpcRouteMatch): RouteSpecGrpcRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecGrpcRoute]
  }
  
  extension [Self <: RouteSpecGrpcRoute](x: Self) {
    
    inline def setAction(value: RouteSpecGrpcRouteAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setMatch(value: RouteSpecGrpcRouteMatch): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setRetryPolicy(value: RouteSpecGrpcRouteRetryPolicy): Self = StObject.set(x, "retryPolicy", value.asInstanceOf[js.Any])
    
    inline def setRetryPolicyUndefined: Self = StObject.set(x, "retryPolicy", js.undefined)
    
    inline def setTimeout(value: RouteSpecGrpcRouteTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
