package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.MetadataSettings._Impl, 'cache'> */
trait PickImplcacheCache extends StObject {
  
  var cache: String
}
object PickImplcacheCache {
  
  inline def apply(cache: String): PickImplcacheCache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcacheCache]
  }
  
  extension [Self <: PickImplcacheCache](x: Self) {
    
    inline def setCache(value: String): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
  }
}
