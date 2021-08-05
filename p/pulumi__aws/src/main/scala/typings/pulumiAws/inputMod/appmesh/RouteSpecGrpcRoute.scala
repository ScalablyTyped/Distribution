package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecGrpcRoute extends StObject {
  
  /**
    * The action to take if a match is determined.
    */
  var action: Input[RouteSpecGrpcRouteAction]
  
  /**
    * The criteria for determining an gRPC request match.
    */
  var `match`: Input[RouteSpecGrpcRouteMatch]
  
  /**
    * The retry policy.
    */
  var retryPolicy: js.UndefOr[Input[RouteSpecGrpcRouteRetryPolicy]] = js.undefined
  
  /**
    * The types of timeouts.
    */
  var timeout: js.UndefOr[Input[RouteSpecGrpcRouteTimeout]] = js.undefined
}
object RouteSpecGrpcRoute {
  
  inline def apply(action: Input[RouteSpecGrpcRouteAction], `match`: Input[RouteSpecGrpcRouteMatch]): RouteSpecGrpcRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecGrpcRoute]
  }
  
  extension [Self <: RouteSpecGrpcRoute](x: Self) {
    
    inline def setAction(value: Input[RouteSpecGrpcRouteAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setMatch(value: Input[RouteSpecGrpcRouteMatch]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setRetryPolicy(value: Input[RouteSpecGrpcRouteRetryPolicy]): Self = StObject.set(x, "retryPolicy", value.asInstanceOf[js.Any])
    
    inline def setRetryPolicyUndefined: Self = StObject.set(x, "retryPolicy", js.undefined)
    
    inline def setTimeout(value: Input[RouteSpecGrpcRouteTimeout]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
