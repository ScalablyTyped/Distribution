package typings.reactAutosuggest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutosuggestState[TSuggestion] extends js.Object {
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
  implicit class AutosuggestStateOps[Self <: AutosuggestState[_], TSuggestion] (val x: Self with AutosuggestState[TSuggestion]) extends AnyVal {
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
    def setIsCollapsed(value: Boolean): Self = this.set("isCollapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFocused(value: Boolean): Self = this.set("isFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlightedSectionIndex(value: Double): Self = this.set("highlightedSectionIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlightedSectionIndexNull: Self = this.set("highlightedSectionIndex", null)
    @scala.inline
    def setHighlightedSuggestion(value: TSuggestion): Self = this.set("highlightedSuggestion", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlightedSuggestionNull: Self = this.set("highlightedSuggestion", null)
    @scala.inline
    def setHighlightedSuggestionIndex(value: Double): Self = this.set("highlightedSuggestionIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlightedSuggestionIndexNull: Self = this.set("highlightedSuggestionIndex", null)
    @scala.inline
    def setValueBeforeUpDown(value: TSuggestion): Self = this.set("valueBeforeUpDown", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueBeforeUpDownNull: Self = this.set("valueBeforeUpDown", null)
  }
  
}

