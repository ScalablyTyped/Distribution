package typings.reactAutosuggest.mod

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
    highlightedSectionIndex: Double = null.asInstanceOf[Double],
    highlightedSuggestion: TSuggestion = null,
    highlightedSuggestionIndex: Double = null.asInstanceOf[Double],
    valueBeforeUpDown: TSuggestion = null
  ): AutosuggestState[TSuggestion] = {
    val __obj = js.Dynamic.literal(isCollapsed = isCollapsed.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], highlightedSectionIndex = highlightedSectionIndex.asInstanceOf[js.Any], highlightedSuggestion = highlightedSuggestion.asInstanceOf[js.Any], highlightedSuggestionIndex = highlightedSuggestionIndex.asInstanceOf[js.Any], valueBeforeUpDown = valueBeforeUpDown.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutosuggestState[TSuggestion]]
  }
}

