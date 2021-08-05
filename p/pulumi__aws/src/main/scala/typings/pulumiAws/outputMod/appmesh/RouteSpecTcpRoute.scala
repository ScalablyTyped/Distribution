package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecTcpRoute extends StObject {
  
  /**
    * The action to take if a match is determined.
    */
  var action: RouteSpecTcpRouteAction
  
  /**
    * The types of timeouts.
    */
  var timeout: js.UndefOr[RouteSpecTcpRouteTimeout] = js.undefined
}
object RouteSpecTcpRoute {
  
  inline def apply(action: RouteSpecTcpRouteAction): RouteSpecTcpRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecTcpRoute]
  }
  
  extension [Self <: RouteSpecTcpRoute](x: Self) {
    
    inline def setAction(value: RouteSpecTcpRouteAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: RouteSpecTcpRouteTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
