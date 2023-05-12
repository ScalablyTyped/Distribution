package typings.remixRunRouter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteId extends StObject {
  
  var requestContext: js.UndefOr[Any] = js.undefined
  
  var routeId: js.UndefOr[String] = js.undefined
}
object RouteId {
  
  inline def apply(): RouteId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouteId] (val x: Self) extends AnyVal {
    
    inline def setRequestContext(value: Any): Self = StObject.set(x, "requestContext", value.asInstanceOf[js.Any])
    
    inline def setRequestContextUndefined: Self = StObject.set(x, "requestContext", js.undefined)
    
    inline def setRouteId(value: String): Self = StObject.set(x, "routeId", value.asInstanceOf[js.Any])
    
    inline def setRouteIdUndefined: Self = StObject.set(x, "routeId", js.undefined)
  }
}
