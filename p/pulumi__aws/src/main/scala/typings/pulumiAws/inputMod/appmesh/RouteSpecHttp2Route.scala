package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecHttp2Route extends StObject {
  
  /**
    * The action to take if a match is determined.
    */
  var action: Input[RouteSpecHttp2RouteAction]
  
  /**
    * The criteria for determining an gRPC request match.
    */
  var `match`: Input[RouteSpecHttp2RouteMatch]
  
  /**
    * The retry policy.
    */
  var retryPolicy: js.UndefOr[Input[RouteSpecHttp2RouteRetryPolicy]] = js.undefined
  
  /**
    * The types of timeouts.
    */
  var timeout: js.UndefOr[Input[RouteSpecHttp2RouteTimeout]] = js.undefined
}
object RouteSpecHttp2Route {
  
  inline def apply(action: Input[RouteSpecHttp2RouteAction], `match`: Input[RouteSpecHttp2RouteMatch]): RouteSpecHttp2Route = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttp2Route]
  }
  
  extension [Self <: RouteSpecHttp2Route](x: Self) {
    
    inline def setAction(value: Input[RouteSpecHttp2RouteAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setMatch(value: Input[RouteSpecHttp2RouteMatch]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setRetryPolicy(value: Input[RouteSpecHttp2RouteRetryPolicy]): Self = StObject.set(x, "retryPolicy", value.asInstanceOf[js.Any])
    
    inline def setRetryPolicyUndefined: Self = StObject.set(x, "retryPolicy", js.undefined)
    
    inline def setTimeout(value: Input[RouteSpecHttp2RouteTimeout]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
