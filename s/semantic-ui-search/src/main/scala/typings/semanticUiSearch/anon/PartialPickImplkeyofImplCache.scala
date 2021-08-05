package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.MetadataSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.MetadataSettings._Impl>> */
trait PartialPickImplkeyofImplCache extends StObject {
  
  var cache: js.UndefOr[String] = js.undefined
  
  var results: js.UndefOr[String] = js.undefined
}
object PartialPickImplkeyofImplCache {
  
  inline def apply(): PartialPickImplkeyofImplCache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplCache]
  }
  
  extension [Self <: PartialPickImplkeyofImplCache](x: Self) {
    
    inline def setCache(value: String): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setResults(value: String): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
  }
}
