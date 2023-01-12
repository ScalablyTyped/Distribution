package typings.reactOnsenui.anon

import typings.reactOnsenui.mod.RouteConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var key: js.UndefOr[Any] = js.undefined
  
  var options: js.UndefOr[Any] = js.undefined
  
  var routeConfig: RouteConfig
}
object Options {
  
  inline def apply(routeConfig: RouteConfig): Options = {
    val __obj = js.Dynamic.literal(routeConfig = routeConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setRouteConfig(value: RouteConfig): Self = StObject.set(x, "routeConfig", value.asInstanceOf[js.Any])
  }
}
