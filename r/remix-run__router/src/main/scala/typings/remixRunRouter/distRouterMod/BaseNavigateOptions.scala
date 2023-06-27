package typings.remixRunRouter.distRouterMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseNavigateOptions
  extends StObject
     with BaseNavigateOrFetchOptions {
  
  var fromRouteId: js.UndefOr[String] = js.undefined
  
  var replace: js.UndefOr[Boolean] = js.undefined
  
  var state: js.UndefOr[Any] = js.undefined
}
object BaseNavigateOptions {
  
  inline def apply(): BaseNavigateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseNavigateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseNavigateOptions] (val x: Self) extends AnyVal {
    
    inline def setFromRouteId(value: String): Self = StObject.set(x, "fromRouteId", value.asInstanceOf[js.Any])
    
    inline def setFromRouteIdUndefined: Self = StObject.set(x, "fromRouteId", js.undefined)
    
    inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
