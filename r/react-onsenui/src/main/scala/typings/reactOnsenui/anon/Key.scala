package typings.reactOnsenui.anon

import typings.reactOnsenui.mod.Route
import typings.reactOnsenui.mod.RouteConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Key extends js.Object {
  
  var key: js.UndefOr[js.Any] = js.native
  
  var options: js.UndefOr[js.Any] = js.native
  
  var route: Route = js.native
  
  var routeConfig: RouteConfig = js.native
}
object Key {
  
  @scala.inline
  def apply(route: Route, routeConfig: RouteConfig): Key = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any], routeConfig = routeConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  @scala.inline
  implicit class KeyOps[Self <: Key] (val x: Self) extends AnyVal {
    
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
    def setRoute(value: Route): Self = this.set("route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteConfig(value: RouteConfig): Self = this.set("routeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: js.Any): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
