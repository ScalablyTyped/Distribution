package typings.reduxLittleRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserRouterArgs extends StObject {
  
  var basename: js.UndefOr[String] = js.undefined
  
  var history: js.UndefOr[History] = js.undefined
  
  var routes: Routes
}
object BrowserRouterArgs {
  
  @scala.inline
  def apply(routes: Routes): BrowserRouterArgs = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserRouterArgs]
  }
  
  @scala.inline
  implicit class BrowserRouterArgsMutableBuilder[Self <: BrowserRouterArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
    
    @scala.inline
    def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    @scala.inline
    def setRoutes(value: Routes): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
  }
}
