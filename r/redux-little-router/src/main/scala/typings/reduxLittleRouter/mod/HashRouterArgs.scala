package typings.reduxLittleRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashRouterArgs extends StObject {
  
  var basename: js.UndefOr[String] = js.undefined
  
  var hashType: js.UndefOr[String] = js.undefined
  
  var history: js.UndefOr[History] = js.undefined
  
  var routes: Routes
}
object HashRouterArgs {
  
  inline def apply(routes: Routes): HashRouterArgs = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashRouterArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HashRouterArgs] (val x: Self) extends AnyVal {
    
    inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
    
    inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
    
    inline def setHashType(value: String): Self = StObject.set(x, "hashType", value.asInstanceOf[js.Any])
    
    inline def setHashTypeUndefined: Self = StObject.set(x, "hashType", js.undefined)
    
    inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setRoutes(value: Routes): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
  }
}
