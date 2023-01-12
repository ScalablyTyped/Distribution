package typings.reactOnsenui.anon

import typings.reactOnsenui.mod.Route
import typings.reactOnsenui.mod.RouteConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  var key: js.UndefOr[Any] = js.undefined
  
  var options: js.UndefOr[Any] = js.undefined
  
  var route: Route
  
  var routeConfig: RouteConfig
}
object Key {
  
  inline def apply(route: Route, routeConfig: RouteConfig): Key = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any], routeConfig = routeConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setRoute(value: Route): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRouteConfig(value: RouteConfig): Self = StObject.set(x, "routeConfig", value.asInstanceOf[js.Any])
  }
}
