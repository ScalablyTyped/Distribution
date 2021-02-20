package typings.reactOnsenui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteConfig extends StObject {
  
  var processStack: js.Array[RouterProcess] = js.native
  
  var routeStack: js.Array[Route] = js.native
}
object RouteConfig {
  
  @scala.inline
  def apply(processStack: js.Array[RouterProcess], routeStack: js.Array[Route]): RouteConfig = {
    val __obj = js.Dynamic.literal(processStack = processStack.asInstanceOf[js.Any], routeStack = routeStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteConfig]
  }
  
  @scala.inline
  implicit class RouteConfigMutableBuilder[Self <: RouteConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProcessStack(value: js.Array[RouterProcess]): Self = StObject.set(x, "processStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessStackVarargs(value: RouterProcess*): Self = StObject.set(x, "processStack", js.Array(value :_*))
    
    @scala.inline
    def setRouteStack(value: js.Array[Route]): Self = StObject.set(x, "routeStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteStackVarargs(value: Route*): Self = StObject.set(x, "routeStack", js.Array(value :_*))
  }
}
