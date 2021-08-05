package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecHttpRoute extends StObject {
  
  /**
    * The action to take if a match is determined.
    */
  var action: RouteSpecHttpRouteAction
  
  /**
    * The criteria for determining an HTTP request match.
    */
  var `match`: RouteSpecHttpRouteMatch
  
  /**
    * The retry policy.
    */
  var retryPolicy: js.UndefOr[RouteSpecHttpRouteRetryPolicy] = js.undefined
  
  /**
    * The types of timeouts.
    */
  var timeout: js.UndefOr[RouteSpecHttpRouteTimeout] = js.undefined
}
object RouteSpecHttpRoute {
  
  inline def apply(action: RouteSpecHttpRouteAction, `match`: RouteSpecHttpRouteMatch): RouteSpecHttpRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttpRoute]
  }
  
  extension [Self <: RouteSpecHttpRoute](x: Self) {
    
    inline def setAction(value: RouteSpecHttpRouteAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setMatch(value: RouteSpecHttpRouteMatch): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setRetryPolicy(value: RouteSpecHttpRouteRetryPolicy): Self = StObject.set(x, "retryPolicy", value.asInstanceOf[js.Any])
    
    inline def setRetryPolicyUndefined: Self = StObject.set(x, "retryPolicy", js.undefined)
    
    inline def setTimeout(value: RouteSpecHttpRouteTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
