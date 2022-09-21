package typings.semanticUiSearch.anon

import typings.semanticUiSearch.SemanticUI.Search.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.SelectorSettings._Impl, 'prompt'> & std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.SelectorSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.SelectorSettings._Impl>> */
trait PickImplpromptPartialPick
  extends StObject
     with Param {
  
  var category: js.UndefOr[String] = js.undefined
  
  var prompt: String & js.UndefOr[String]
  
  var result: js.UndefOr[String] = js.undefined
  
  var results: js.UndefOr[String] = js.undefined
  
  var searchButton: js.UndefOr[String] = js.undefined
}
object PickImplpromptPartialPick {
  
  inline def apply(prompt: String & js.UndefOr[String]): PickImplpromptPartialPick = {
    val __obj = js.Dynamic.literal(prompt = prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpromptPartialPick]
  }
  
  extension [Self <: PickImplpromptPartialPick](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setPrompt(value: String & js.UndefOr[String]): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setResults(value: String): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setSearchButton(value: String): Self = StObject.set(x, "searchButton", value.asInstanceOf[js.Any])
    
    inline def setSearchButtonUndefined: Self = StObject.set(x, "searchButton", js.undefined)
  }
}
