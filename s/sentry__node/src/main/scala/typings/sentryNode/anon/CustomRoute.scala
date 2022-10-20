package typings.sentryNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomRoute extends StObject {
  
  var customRoute: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[Boolean] = js.undefined
  
  var path: js.UndefOr[Boolean] = js.undefined
}
object CustomRoute {
  
  inline def apply(): CustomRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomRoute]
  }
  
  extension [Self <: CustomRoute](x: Self) {
    
    inline def setCustomRoute(value: String): Self = StObject.set(x, "customRoute", value.asInstanceOf[js.Any])
    
    inline def setCustomRouteUndefined: Self = StObject.set(x, "customRoute", js.undefined)
    
    inline def setMethod(value: Boolean): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPath(value: Boolean): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
