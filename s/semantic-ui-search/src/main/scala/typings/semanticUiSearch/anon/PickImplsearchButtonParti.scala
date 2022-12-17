package typings.semanticUiSearch.anon

import typings.semanticUiSearch.SemanticUI.Search.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.SelectorSettings._Impl, 'searchButton'> & std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.SelectorSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.SelectorSettings._Impl>> */
trait PickImplsearchButtonParti
  extends StObject
     with Param {
  
  var category: js.UndefOr[String] = js.undefined
  
  var prompt: js.UndefOr[String] = js.undefined
  
  var result: js.UndefOr[String] = js.undefined
  
  var results: js.UndefOr[String] = js.undefined
  
  var searchButton: String
}
object PickImplsearchButtonParti {
  
  inline def apply(searchButton: String): PickImplsearchButtonParti = {
    val __obj = js.Dynamic.literal(searchButton = searchButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsearchButtonParti]
  }
  
  extension [Self <: PickImplsearchButtonParti](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setResults(value: String): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setSearchButton(value: String): Self = StObject.set(x, "searchButton", value.asInstanceOf[js.Any])
  }
}
