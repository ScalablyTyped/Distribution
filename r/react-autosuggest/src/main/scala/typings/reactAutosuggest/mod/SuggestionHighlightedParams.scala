package typings.reactAutosuggest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestionHighlightedParams extends StObject {
  
  var suggestion: js.Any = js.native
}
object SuggestionHighlightedParams {
  
  @scala.inline
  def apply(suggestion: js.Any): SuggestionHighlightedParams = {
    val __obj = js.Dynamic.literal(suggestion = suggestion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestionHighlightedParams]
  }
  
  @scala.inline
  implicit class SuggestionHighlightedParamsMutableBuilder[Self <: SuggestionHighlightedParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuggestion(value: js.Any): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
  }
}
