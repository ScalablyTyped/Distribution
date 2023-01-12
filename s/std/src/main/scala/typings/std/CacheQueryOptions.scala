package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheQueryOptions extends StObject {
  
  /* standard dom */
  var ignoreMethod: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var ignoreSearch: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var ignoreVary: js.UndefOr[scala.Boolean] = js.undefined
}
object CacheQueryOptions {
  
  inline def apply(): CacheQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheQueryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CacheQueryOptions] (val x: Self) extends AnyVal {
    
    inline def setIgnoreMethod(value: scala.Boolean): Self = StObject.set(x, "ignoreMethod", value.asInstanceOf[js.Any])
    
    inline def setIgnoreMethodUndefined: Self = StObject.set(x, "ignoreMethod", js.undefined)
    
    inline def setIgnoreSearch(value: scala.Boolean): Self = StObject.set(x, "ignoreSearch", value.asInstanceOf[js.Any])
    
    inline def setIgnoreSearchUndefined: Self = StObject.set(x, "ignoreSearch", js.undefined)
    
    inline def setIgnoreVary(value: scala.Boolean): Self = StObject.set(x, "ignoreVary", value.asInstanceOf[js.Any])
    
    inline def setIgnoreVaryUndefined: Self = StObject.set(x, "ignoreVary", js.undefined)
  }
}
