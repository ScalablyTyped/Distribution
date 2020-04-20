package typings.reactDaterangePicker.mod

import typings.momentRange.mod.DateRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateState extends js.Object {
  var range: DateRange
  var state: String
}

object DateState {
  @scala.inline
  def apply(range: DateRange, state: String): DateState = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateState]
  }
}

