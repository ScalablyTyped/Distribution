package typings.reactOnsenui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteConfig extends js.Object {
  
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
  implicit class RouteConfigOps[Self <: RouteConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProcessStackVarargs(value: RouterProcess*): Self = this.set("processStack", js.Array(value :_*))
    
    @scala.inline
    def setProcessStack(value: js.Array[RouterProcess]): Self = this.set("processStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteStackVarargs(value: Route*): Self = this.set("routeStack", js.Array(value :_*))
    
    @scala.inline
    def setRouteStack(value: js.Array[Route]): Self = this.set("routeStack", value.asInstanceOf[js.Any])
  }
}
