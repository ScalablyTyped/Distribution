package typings.reactBigCalendar.anon

import typings.reactBigCalendar.mod.stringOrDate
import typings.reactBigCalendar.reactBigCalendarStrings.click
import typings.reactBigCalendar.reactBigCalendarStrings.doubleClick
import typings.reactBigCalendar.reactBigCalendarStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action extends js.Object {
  var action: select | click | doubleClick = js.native
  var end: stringOrDate = js.native
  var slots: js.Array[typings.std.Date | String] = js.native
  var start: stringOrDate = js.native
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
  @scala.inline
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
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
    def setAction(value: select | click | doubleClick): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: stringOrDate): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlotsVarargs(value: (typings.std.Date | String)*): Self = this.set("slots", js.Array(value :_*))
    @scala.inline
    def setSlots(value: js.Array[typings.std.Date | String]): Self = this.set("slots", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: stringOrDate): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

