package typings.semanticUiSearch.anon

import typings.semanticUiSearch.SemanticUI.Search.MetadataSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.MetadataSettings._Impl, 'cache'> & std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.MetadataSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.MetadataSettings._Impl>> */
trait PickImplcachePartialPickICache
  extends StObject
     with Param {
  
  var cache: String
  
  var results: js.UndefOr[String] = js.undefined
}
object PickImplcachePartialPickICache {
  
  inline def apply(cache: String): PickImplcachePartialPickICache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcachePartialPickICache]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplcachePartialPickICache] (val x: Self) extends AnyVal {
    
    inline def setCache(value: String): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setResults(value: String): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
  }
}
