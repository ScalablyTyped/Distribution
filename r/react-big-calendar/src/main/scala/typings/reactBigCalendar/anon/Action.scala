package typings.reactBigCalendar.anon

import typings.reactBigCalendar.mod.stringOrDate
import typings.reactBigCalendar.reactBigCalendarStrings.click
import typings.reactBigCalendar.reactBigCalendarStrings.doubleClick
import typings.reactBigCalendar.reactBigCalendarStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var action: select | click | doubleClick
  var end: stringOrDate
  var slots: js.Array[typings.std.Date | String]
  var start: stringOrDate
}

object Action {
  @scala.inline
  def apply(
    action: select | click | doubleClick,
    end: stringOrDate,
    slots: js.Array[typings.std.Date | String],
    start: stringOrDate
  ): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

