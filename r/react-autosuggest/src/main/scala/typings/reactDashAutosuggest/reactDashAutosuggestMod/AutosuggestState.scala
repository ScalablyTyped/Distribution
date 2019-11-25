package typings.reactDashAutosuggest.reactDashAutosuggestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutosuggestState[TSuggestion] extends js.Object {
  var highlightedSectionIndex: Double | Null
  var highlightedSuggestion: TSuggestion | Null
  var highlightedSuggestionIndex: Double | Null
  var isCollapsed: Boolean
  var isFocused: Boolean
  var valueBeforeUpDown: TSuggestion | Null
}

object AutosuggestState {
  @scala.inline
  def apply[TSuggestion](
    isCollapsed: Boolean,
    isFocused: Boolean,
    highlightedSectionIndex: Int | Double = null,
    highlightedSuggestion: TSuggestion = null,
    highlightedSuggestionIndex: Int | Double = null,
    valueBeforeUpDown: TSuggestion = null
  ): AutosuggestState[TSuggestion] = {
    val __obj = js.Dynamic.literal(isCollapsed = isCollapsed.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any])
    if (highlightedSectionIndex != null) __obj.updateDynamic("highlightedSectionIndex")(highlightedSectionIndex.asInstanceOf[js.Any])
    if (highlightedSuggestion != null) __obj.updateDynamic("highlightedSuggestion")(highlightedSuggestion.asInstanceOf[js.Any])
    if (highlightedSuggestionIndex != null) __obj.updateDynamic("highlightedSuggestionIndex")(highlightedSuggestionIndex.asInstanceOf[js.Any])
    if (valueBeforeUpDown != null) __obj.updateDynamic("valueBeforeUpDown")(valueBeforeUpDown.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutosuggestState[TSuggestion]]
  }
}

