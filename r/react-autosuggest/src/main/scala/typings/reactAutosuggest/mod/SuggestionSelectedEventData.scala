package typings.reactAutosuggest.mod

import typings.reactAutosuggest.reactAutosuggestStrings.click
import typings.reactAutosuggest.reactAutosuggestStrings.enter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestionSelectedEventData[TSuggestion] extends js.Object {
  
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
  implicit class SuggestionSelectedEventDataOps[Self <: SuggestionSelectedEventData[_], TSuggestion] (val x: Self with SuggestionSelectedEventData[TSuggestion]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMethod(value: click | enter): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestion(value: TSuggestion): Self = this.set("suggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionIndex(value: Double): Self = this.set("suggestionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionValue(value: String): Self = this.set("suggestionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionIndex(value: Double): Self = this.set("sectionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionIndexNull: Self = this.set("sectionIndex", null)
  }
}
