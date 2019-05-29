package typings
package reactDashBigDashCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action extends js.Object {
  var action: reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.select | reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.click | reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.doubleClick
  var end: reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.stringOrDate
  var slots: js.Array[stdLib.Date | java.lang.String]
  var start: reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.stringOrDate
}

object Anon_Action {
  @scala.inline
  def apply(
    action: reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.select | reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.click | reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.doubleClick,
    end: reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.stringOrDate,
    slots: js.Array[stdLib.Date | java.lang.String],
    start: reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.stringOrDate
  ): Anon_Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], slots = slots, start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Action]
  }
}

