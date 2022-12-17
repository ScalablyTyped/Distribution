package typings.semanticUiSearch.anon

import typings.semanticUiSearch.SemanticUI.Search.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.SelectorSettings._Impl, 'results'> & std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.SelectorSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.SelectorSettings._Impl>> */
trait PickImplresultsPartialPicCategory
  extends StObject
     with Param {
  
  var category: js.UndefOr[String] = js.undefined
  
  var prompt: js.UndefOr[String] = js.undefined
  
  var result: js.UndefOr[String] = js.undefined
  
  var results: String
  
  var searchButton: js.UndefOr[String] = js.undefined
}
object PickImplresultsPartialPicCategory {
  
  inline def apply(results: String): PickImplresultsPartialPicCategory = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplresultsPartialPicCategory]
  }
  
  extension [Self <: PickImplresultsPartialPicCategory](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setResults(value: String): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setSearchButton(value: String): Self = StObject.set(x, "searchButton", value.asInstanceOf[js.Any])
    
    inline def setSearchButtonUndefined: Self = StObject.set(x, "searchButton", js.undefined)
  }
}
