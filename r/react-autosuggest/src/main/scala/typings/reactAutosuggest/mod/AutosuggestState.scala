package typings.reactAutosuggest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutosuggestState[TSuggestion] extends StObject {
  
  var highlightedSectionIndex: Double | Null = js.native
  
  var highlightedSuggestion: TSuggestion | Null = js.native
  
  var highlightedSuggestionIndex: Double | Null = js.native
  
  var isCollapsed: Boolean = js.native
  
  var isFocused: Boolean = js.native
  
  var valueBeforeUpDown: TSuggestion | Null = js.native
}
object AutosuggestState {
  
  @scala.inline
  def apply[TSuggestion](isCollapsed: Boolean, isFocused: Boolean): AutosuggestState[TSuggestion] = {
    val __obj = js.Dynamic.literal(isCollapsed = isCollapsed.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutosuggestState[TSuggestion]]
  }
  
  @scala.inline
  implicit class AutosuggestStateMutableBuilder[Self <: AutosuggestState[_], TSuggestion] (val x: Self with AutosuggestState[TSuggestion]) extends AnyVal {
    
    @scala.inline
    def setHighlightedSectionIndex(value: Double): Self = StObject.set(x, "highlightedSectionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedSectionIndexNull: Self = StObject.set(x, "highlightedSectionIndex", null)
    
    @scala.inline
    def setHighlightedSuggestion(value: TSuggestion): Self = StObject.set(x, "highlightedSuggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedSuggestionIndex(value: Double): Self = StObject.set(x, "highlightedSuggestionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedSuggestionIndexNull: Self = StObject.set(x, "highlightedSuggestionIndex", null)
    
    @scala.inline
    def setHighlightedSuggestionNull: Self = StObject.set(x, "highlightedSuggestion", null)
    
    @scala.inline
    def setIsCollapsed(value: Boolean): Self = StObject.set(x, "isCollapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueBeforeUpDown(value: TSuggestion): Self = StObject.set(x, "valueBeforeUpDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueBeforeUpDownNull: Self = StObject.set(x, "valueBeforeUpDown", null)
  }
}
