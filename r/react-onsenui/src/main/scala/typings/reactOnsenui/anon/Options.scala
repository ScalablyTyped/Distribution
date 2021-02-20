package typings.reactOnsenui.anon

import typings.reactOnsenui.mod.RouteConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  var key: js.UndefOr[js.Any] = js.native
  
  var options: js.UndefOr[js.Any] = js.native
  
  var routeConfig: RouteConfig = js.native
}
object Options {
  
  @scala.inline
  def apply(routeConfig: RouteConfig): Options = {
    val __obj = js.Dynamic.literal(routeConfig = routeConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setRouteConfig(value: RouteConfig): Self = StObject.set(x, "routeConfig", value.asInstanceOf[js.Any])
  }
}
