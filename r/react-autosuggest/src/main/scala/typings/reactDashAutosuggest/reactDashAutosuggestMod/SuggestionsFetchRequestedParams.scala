package typings.reactDashAutosuggest.reactDashAutosuggestMod

import typings.reactDashAutosuggest.reactDashAutosuggestStrings.`escape-pressed`
import typings.reactDashAutosuggest.reactDashAutosuggestStrings.`input-changed`
import typings.reactDashAutosuggest.reactDashAutosuggestStrings.`input-focused`
import typings.reactDashAutosuggest.reactDashAutosuggestStrings.`suggestion-selected`
import typings.reactDashAutosuggest.reactDashAutosuggestStrings.`suggestions-revealed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestionsFetchRequestedParams extends js.Object {
  var reason: `input-changed` | `input-focused` | `escape-pressed` | `suggestions-revealed` | `suggestion-selected`
  var value: String
}

object SuggestionsFetchRequestedParams {
  @scala.inline
  def apply(
    reason: `input-changed` | `input-focused` | `escape-pressed` | `suggestions-revealed` | `suggestion-selected`,
    value: String
  ): SuggestionsFetchRequestedParams = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], value = value)
  
    __obj.asInstanceOf[SuggestionsFetchRequestedParams]
  }
}

