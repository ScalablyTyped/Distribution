package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpecTcpRoute extends StObject {
  
  /**
    * The action to take if a match is determined.
    */
  var action: RouteSpecTcpRouteAction = js.native
  
  /**
    * The types of timeouts.
    */
  var timeout: js.UndefOr[RouteSpecTcpRouteTimeout] = js.native
}
object RouteSpecTcpRoute {
  
  @scala.inline
  def apply(action: RouteSpecTcpRouteAction): RouteSpecTcpRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecTcpRoute]
  }
  
  @scala.inline
  implicit class RouteSpecTcpRouteMutableBuilder[Self <: RouteSpecTcpRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: RouteSpecTcpRouteAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: RouteSpecTcpRouteTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
