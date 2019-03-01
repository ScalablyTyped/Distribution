package typings
package reactDashBigDashCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action extends js.Object {
  var action: reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.select | reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.click | reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.doubleClick
  var end: reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.stringOrDate
  var slots: js.Array[stdLib.Date] | js.Array[java.lang.String]
  var start: reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.stringOrDate
}

object Anon_Action {
  @scala.inline
  def apply(
    action: reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.select | reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.click | reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.doubleClick,
    end: reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.stringOrDate,
    slots: js.Array[stdLib.Date] | js.Array[java.lang.String],
    start: reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.stringOrDate
  ): Anon_Action = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    __obj.updateDynamic("slots")(slots.asInstanceOf[js.Any])
    __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Action]
  }
}

