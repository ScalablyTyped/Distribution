package typings.reactAutosuggest.mod

import typings.reactAutosuggest.reactAutosuggestStrings.`escape-pressed`
import typings.reactAutosuggest.reactAutosuggestStrings.`input-changed`
import typings.reactAutosuggest.reactAutosuggestStrings.`input-focused`
import typings.reactAutosuggest.reactAutosuggestStrings.`suggestion-selected`
import typings.reactAutosuggest.reactAutosuggestStrings.`suggestions-revealed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestionsFetchRequestedParams extends js.Object {
  var reason: `input-changed` | `input-focused` | `escape-pressed` | `suggestions-revealed` | `suggestion-selected` = js.native
  var value: String = js.native
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
  @scala.inline
  implicit class SuggestionsFetchRequestedParamsOps[Self <: SuggestionsFetchRequestedParams] (val x: Self) extends AnyVal {
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
    def setReason(
      value: `input-changed` | `input-focused` | `escape-pressed` | `suggestions-revealed` | `suggestion-selected`
    ): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

