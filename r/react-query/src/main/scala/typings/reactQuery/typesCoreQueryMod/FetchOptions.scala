package typings.reactQuery.typesCoreQueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchOptions extends StObject {
  
  var cancelRefetch: js.UndefOr[Boolean] = js.undefined
  
  var meta: js.UndefOr[Any] = js.undefined
}
object FetchOptions {
  
  inline def apply(): FetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FetchOptions] (val x: Self) extends AnyVal {
    
    inline def setCancelRefetch(value: Boolean): Self = StObject.set(x, "cancelRefetch", value.asInstanceOf[js.Any])
    
    inline def setCancelRefetchUndefined: Self = StObject.set(x, "cancelRefetch", js.undefined)
    
    inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
  }
}
