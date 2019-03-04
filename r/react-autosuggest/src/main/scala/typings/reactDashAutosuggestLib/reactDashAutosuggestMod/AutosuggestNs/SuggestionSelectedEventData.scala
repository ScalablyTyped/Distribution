package typings
package reactDashAutosuggestLib.reactDashAutosuggestMod.AutosuggestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestionSelectedEventData[TSuggestion] extends js.Object {
  var method: reactDashAutosuggestLib.reactDashAutosuggestLibStrings.click | reactDashAutosuggestLib.reactDashAutosuggestLibStrings.enter
  var sectionIndex: scala.Double | scala.Null
  var suggestion: TSuggestion
  var suggestionIndex: scala.Double
  var suggestionValue: java.lang.String
}

object SuggestionSelectedEventData {
  @scala.inline
  def apply[TSuggestion](
    method: reactDashAutosuggestLib.reactDashAutosuggestLibStrings.click | reactDashAutosuggestLib.reactDashAutosuggestLibStrings.enter,
    suggestion: TSuggestion,
    suggestionIndex: scala.Double,
    suggestionValue: java.lang.String,
    sectionIndex: scala.Int | scala.Double = null
  ): SuggestionSelectedEventData[TSuggestion] = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], suggestion = suggestion.asInstanceOf[js.Any], suggestionIndex = suggestionIndex, suggestionValue = suggestionValue)
    if (sectionIndex != null) __obj.updateDynamic("sectionIndex")(sectionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestionSelectedEventData[TSuggestion]]
  }
}

