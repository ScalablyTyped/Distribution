package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpecHttpRoute extends StObject {
  
  /**
    * The action to take if a match is determined.
    */
  var action: Input[RouteSpecHttpRouteAction] = js.native
  
  /**
    * The criteria for determining an HTTP request match.
    */
  var `match`: Input[RouteSpecHttpRouteMatch] = js.native
  
  /**
    * The retry policy.
    */
  var retryPolicy: js.UndefOr[Input[RouteSpecHttpRouteRetryPolicy]] = js.native
  
  /**
    * The types of timeouts.
    */
  var timeout: js.UndefOr[Input[RouteSpecHttpRouteTimeout]] = js.native
}
object RouteSpecHttpRoute {
  
  @scala.inline
  def apply(action: Input[RouteSpecHttpRouteAction], `match`: Input[RouteSpecHttpRouteMatch]): RouteSpecHttpRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttpRoute]
  }
  
  @scala.inline
  implicit class RouteSpecHttpRouteMutableBuilder[Self <: RouteSpecHttpRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: Input[RouteSpecHttpRouteAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: Input[RouteSpecHttpRouteMatch]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryPolicy(value: Input[RouteSpecHttpRouteRetryPolicy]): Self = StObject.set(x, "retryPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryPolicyUndefined: Self = StObject.set(x, "retryPolicy", js.undefined)
    
    @scala.inline
    def setTimeout(value: Input[RouteSpecHttpRouteTimeout]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
