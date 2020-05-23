package typings.reactAutosuggest.mod

import typings.reactAutosuggest.reactAutosuggestStrings.click
import typings.reactAutosuggest.reactAutosuggestStrings.enter
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
    sectionIndex: Double = null.asInstanceOf[Double]
  ): SuggestionSelectedEventData[TSuggestion] = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], suggestion = suggestion.asInstanceOf[js.Any], suggestionIndex = suggestionIndex.asInstanceOf[js.Any], suggestionValue = suggestionValue.asInstanceOf[js.Any], sectionIndex = sectionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestionSelectedEventData[TSuggestion]]
  }
}

