package typings.reactDashAutosuggest.reactDashAutosuggestMod

import typings.reactDashAutosuggest.reactDashAutosuggestStrings.`type`
import typings.reactDashAutosuggest.reactDashAutosuggestStrings.click
import typings.reactDashAutosuggest.reactDashAutosuggestStrings.down
import typings.reactDashAutosuggest.reactDashAutosuggestStrings.enter
import typings.reactDashAutosuggest.reactDashAutosuggestStrings.escape
import typings.reactDashAutosuggest.reactDashAutosuggestStrings.up
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
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], newValue = newValue)
  
    __obj.asInstanceOf[ChangeEvent]
  }
}

