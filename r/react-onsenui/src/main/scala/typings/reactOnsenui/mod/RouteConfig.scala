package typings.reactOnsenui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteConfig extends StObject {
  
  var processStack: js.Array[RouterProcess]
  
  var routeStack: js.Array[Route]
}
object RouteConfig {
  
  inline def apply(processStack: js.Array[RouterProcess], routeStack: js.Array[Route]): RouteConfig = {
    val __obj = js.Dynamic.literal(processStack = processStack.asInstanceOf[js.Any], routeStack = routeStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteConfig]
  }
  
  extension [Self <: RouteConfig](x: Self) {
    
    inline def setProcessStack(value: js.Array[RouterProcess]): Self = StObject.set(x, "processStack", value.asInstanceOf[js.Any])
    
    inline def setProcessStackVarargs(value: RouterProcess*): Self = StObject.set(x, "processStack", js.Array(value :_*))
    
    inline def setRouteStack(value: js.Array[Route]): Self = StObject.set(x, "routeStack", value.asInstanceOf[js.Any])
    
    inline def setRouteStackVarargs(value: Route*): Self = StObject.set(x, "routeStack", js.Array(value :_*))
  }
}
