package typings.reactAutosuggest.mod

import typings.reactAutosuggest.reactAutosuggestStrings.`type`
import typings.reactAutosuggest.reactAutosuggestStrings.click
import typings.reactAutosuggest.reactAutosuggestStrings.down
import typings.reactAutosuggest.reactAutosuggestStrings.enter
import typings.reactAutosuggest.reactAutosuggestStrings.escape
import typings.reactAutosuggest.reactAutosuggestStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEvent extends js.Object {
  var method: down | up | escape | enter | click | `type`
  var newValue: String
}

object ChangeEvent {
  @scala.inline
  def apply(method: down | up | escape | enter | click | `type`, newValue: String): ChangeEvent = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent]
  }
}

