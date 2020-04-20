package typings.reactAutosuggest.mod

import typings.reactAutosuggest.reactAutosuggestStrings.`escape-pressed`
import typings.reactAutosuggest.reactAutosuggestStrings.`input-changed`
import typings.reactAutosuggest.reactAutosuggestStrings.`input-focused`
import typings.reactAutosuggest.reactAutosuggestStrings.`suggestion-selected`
import typings.reactAutosuggest.reactAutosuggestStrings.`suggestions-revealed`
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
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestionsFetchRequestedParams]
  }
}

