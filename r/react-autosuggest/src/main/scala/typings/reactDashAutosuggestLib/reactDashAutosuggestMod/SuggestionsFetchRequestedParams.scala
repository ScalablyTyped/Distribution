package typings
package reactDashAutosuggestLib.reactDashAutosuggestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestionsFetchRequestedParams extends js.Object {
  var reason: reactDashAutosuggestLib.reactDashAutosuggestLibStrings.`input-changed` | reactDashAutosuggestLib.reactDashAutosuggestLibStrings.`input-focused` | reactDashAutosuggestLib.reactDashAutosuggestLibStrings.`escape-pressed` | reactDashAutosuggestLib.reactDashAutosuggestLibStrings.`suggestions-revealed` | reactDashAutosuggestLib.reactDashAutosuggestLibStrings.`suggestion-selected`
  var value: java.lang.String
}

object SuggestionsFetchRequestedParams {
  @scala.inline
  def apply(
    reason: reactDashAutosuggestLib.reactDashAutosuggestLibStrings.`input-changed` | reactDashAutosuggestLib.reactDashAutosuggestLibStrings.`input-focused` | reactDashAutosuggestLib.reactDashAutosuggestLibStrings.`escape-pressed` | reactDashAutosuggestLib.reactDashAutosuggestLibStrings.`suggestions-revealed` | reactDashAutosuggestLib.reactDashAutosuggestLibStrings.`suggestion-selected`,
    value: java.lang.String
  ): SuggestionsFetchRequestedParams = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], value = value)
  
    __obj.asInstanceOf[SuggestionsFetchRequestedParams]
  }
}

