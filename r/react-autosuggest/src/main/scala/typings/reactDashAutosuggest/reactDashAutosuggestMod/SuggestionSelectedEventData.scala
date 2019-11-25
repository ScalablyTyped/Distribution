package typings.reactDashAutosuggest.reactDashAutosuggestMod

import typings.reactDashAutosuggest.reactDashAutosuggestStrings.click
import typings.reactDashAutosuggest.reactDashAutosuggestStrings.enter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestionSelectedEventData[TSuggestion] extends js.Object {
  var method: click | enter
  var sectionIndex: Double | Null
  var suggestion: TSuggestion
  var suggestionIndex: Double
  var suggestionValue: String
}

object SuggestionSelectedEventData {
  @scala.inline
  def apply[TSuggestion](
    method: click | enter,
    suggestion: TSuggestion,
    suggestionIndex: Double,
    suggestionValue: String,
    sectionIndex: Int | Double = null
  ): SuggestionSelectedEventData[TSuggestion] = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], suggestion = suggestion.asInstanceOf[js.Any], suggestionIndex = suggestionIndex.asInstanceOf[js.Any], suggestionValue = suggestionValue.asInstanceOf[js.Any])
    if (sectionIndex != null) __obj.updateDynamic("sectionIndex")(sectionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestionSelectedEventData[TSuggestion]]
  }
}

