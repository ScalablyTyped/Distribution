package typings.reactBigCalendar

import typings.reactBigCalendar.mod.stringOrDate
import typings.reactBigCalendar.reactBigCalendarStrings.click
import typings.reactBigCalendar.reactBigCalendarStrings.doubleClick
import typings.reactBigCalendar.reactBigCalendarStrings.select
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAction extends js.Object {
  var action: select | click | doubleClick
  var end: stringOrDate
  var slots: js.Array[Date | String]
  var start: stringOrDate
}

object AnonAction {
  @scala.inline
  def apply(
    action: select | click | doubleClick,
    end: stringOrDate,
    slots: js.Array[Date | String],
    start: stringOrDate
  ): AnonAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAction]
  }
}

