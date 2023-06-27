package typings.remixRunRouter.distRouterMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseNavigateOrFetchOptions extends StObject {
  
  var preventScrollReset: js.UndefOr[Boolean] = js.undefined
  
  var relative: js.UndefOr[RelativeRoutingType] = js.undefined
}
object BaseNavigateOrFetchOptions {
  
  inline def apply(): BaseNavigateOrFetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseNavigateOrFetchOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseNavigateOrFetchOptions] (val x: Self) extends AnyVal {
    
    inline def setPreventScrollReset(value: Boolean): Self = StObject.set(x, "preventScrollReset", value.asInstanceOf[js.Any])
    
    inline def setPreventScrollResetUndefined: Self = StObject.set(x, "preventScrollReset", js.undefined)
    
    inline def setRelative(value: RelativeRoutingType): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
  }
}
