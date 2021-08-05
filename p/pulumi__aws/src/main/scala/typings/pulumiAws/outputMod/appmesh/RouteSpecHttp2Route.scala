package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecHttp2Route extends StObject {
  
  /**
    * The action to take if a match is determined.
    */
  var action: RouteSpecHttp2RouteAction
  
  /**
    * The criteria for determining an gRPC request match.
    */
  var `match`: RouteSpecHttp2RouteMatch
  
  /**
    * The retry policy.
    */
  var retryPolicy: js.UndefOr[RouteSpecHttp2RouteRetryPolicy] = js.undefined
  
  /**
    * The types of timeouts.
    */
  var timeout: js.UndefOr[RouteSpecHttp2RouteTimeout] = js.undefined
}
object RouteSpecHttp2Route {
  
  inline def apply(action: RouteSpecHttp2RouteAction, `match`: RouteSpecHttp2RouteMatch): RouteSpecHttp2Route = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttp2Route]
  }
  
  extension [Self <: RouteSpecHttp2Route](x: Self) {
    
    inline def setAction(value: RouteSpecHttp2RouteAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setMatch(value: RouteSpecHttp2RouteMatch): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setRetryPolicy(value: RouteSpecHttp2RouteRetryPolicy): Self = StObject.set(x, "retryPolicy", value.asInstanceOf[js.Any])
    
    inline def setRetryPolicyUndefined: Self = StObject.set(x, "retryPolicy", js.undefined)
    
    inline def setTimeout(value: RouteSpecHttp2RouteTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
