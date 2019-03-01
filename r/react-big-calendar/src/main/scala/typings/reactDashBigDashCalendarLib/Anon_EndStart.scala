package typings
package reactDashBigDashCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndStart extends js.Object {
  var end: reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.stringOrDate
  var start: reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.stringOrDate
}

object Anon_EndStart {
  @scala.inline
  def apply(
    end: reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.stringOrDate,
    start: reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.stringOrDate
  ): Anon_EndStart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EndStart]
  }
}

