package typings.reactAutosuggest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestionHighlightedParams extends StObject {
  
  var suggestion: Any
}
object SuggestionHighlightedParams {
  
  inline def apply(suggestion: Any): SuggestionHighlightedParams = {
    val __obj = js.Dynamic.literal(suggestion = suggestion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestionHighlightedParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuggestionHighlightedParams] (val x: Self) extends AnyVal {
    
    inline def setSuggestion(value: Any): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
  }
}
