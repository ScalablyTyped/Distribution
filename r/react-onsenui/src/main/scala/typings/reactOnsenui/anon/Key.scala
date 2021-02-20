package typings.reactOnsenui.anon

import typings.reactOnsenui.mod.Route
import typings.reactOnsenui.mod.RouteConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Key extends StObject {
  
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
  implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setRoute(value: Route): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteConfig(value: RouteConfig): Self = StObject.set(x, "routeConfig", value.asInstanceOf[js.Any])
  }
}
