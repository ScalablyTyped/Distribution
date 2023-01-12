package typings.reduxLittleRouter.mod

import typings.reduxLittleRouter.anon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HapiRouterArgs extends StObject {
  
  var request: Path
  
  var routes: Routes
}
object HapiRouterArgs {
  
  inline def apply(request: Path, routes: Routes): HapiRouterArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[HapiRouterArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HapiRouterArgs] (val x: Self) extends AnyVal {
    
    inline def setRequest(value: Path): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRoutes(value: Routes): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
  }
}
