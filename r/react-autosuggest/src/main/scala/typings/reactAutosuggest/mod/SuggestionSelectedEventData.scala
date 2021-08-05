package typings.reactAutosuggest.mod

import typings.reactAutosuggest.reactAutosuggestStrings.click
import typings.reactAutosuggest.reactAutosuggestStrings.enter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestionSelectedEventData[TSuggestion] extends StObject {
  
  var method: click | enter
  
  var sectionIndex: Double | Null
  
  var suggestion: TSuggestion
  
  var suggestionIndex: Double
  
  var suggestionValue: String
}
object SuggestionSelectedEventData {
  
  inline def apply[TSuggestion](method: click | enter, suggestion: TSuggestion, suggestionIndex: Double, suggestionValue: String): SuggestionSelectedEventData[TSuggestion] = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], suggestion = suggestion.asInstanceOf[js.Any], suggestionIndex = suggestionIndex.asInstanceOf[js.Any], suggestionValue = suggestionValue.asInstanceOf[js.Any], sectionIndex = null)
    __obj.asInstanceOf[SuggestionSelectedEventData[TSuggestion]]
  }
  
  extension [Self <: SuggestionSelectedEventData[?], TSuggestion](x: Self & SuggestionSelectedEventData[TSuggestion]) {
    
    inline def setMethod(value: click | enter): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setSectionIndex(value: Double): Self = StObject.set(x, "sectionIndex", value.asInstanceOf[js.Any])
    
    inline def setSectionIndexNull: Self = StObject.set(x, "sectionIndex", null)
    
    inline def setSuggestion(value: TSuggestion): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
    
    inline def setSuggestionIndex(value: Double): Self = StObject.set(x, "suggestionIndex", value.asInstanceOf[js.Any])
    
    inline def setSuggestionValue(value: String): Self = StObject.set(x, "suggestionValue", value.asInstanceOf[js.Any])
  }
}
