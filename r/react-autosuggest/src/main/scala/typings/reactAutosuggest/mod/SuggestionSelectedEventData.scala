package typings.reactAutosuggest.mod

import typings.reactAutosuggest.reactAutosuggestStrings.click
import typings.reactAutosuggest.reactAutosuggestStrings.enter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestionSelectedEventData[TSuggestion] extends StObject {
  
  var method: click | enter = js.native
  
  var sectionIndex: Double | Null = js.native
  
  var suggestion: TSuggestion = js.native
  
  var suggestionIndex: Double = js.native
  
  var suggestionValue: String = js.native
}
object SuggestionSelectedEventData {
  
  @scala.inline
  def apply[TSuggestion](method: click | enter, suggestion: TSuggestion, suggestionIndex: Double, suggestionValue: String): SuggestionSelectedEventData[TSuggestion] = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], suggestion = suggestion.asInstanceOf[js.Any], suggestionIndex = suggestionIndex.asInstanceOf[js.Any], suggestionValue = suggestionValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestionSelectedEventData[TSuggestion]]
  }
  
  @scala.inline
  implicit class SuggestionSelectedEventDataMutableBuilder[Self <: SuggestionSelectedEventData[_], TSuggestion] (val x: Self with SuggestionSelectedEventData[TSuggestion]) extends AnyVal {
    
    @scala.inline
    def setMethod(value: click | enter): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionIndex(value: Double): Self = StObject.set(x, "sectionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionIndexNull: Self = StObject.set(x, "sectionIndex", null)
    
    @scala.inline
    def setSuggestion(value: TSuggestion): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionIndex(value: Double): Self = StObject.set(x, "suggestionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionValue(value: String): Self = StObject.set(x, "suggestionValue", value.asInstanceOf[js.Any])
  }
}
