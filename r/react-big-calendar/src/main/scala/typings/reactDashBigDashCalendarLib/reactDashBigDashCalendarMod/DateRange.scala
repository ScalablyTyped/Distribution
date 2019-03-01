package typings
package reactDashBigDashCalendarLib.reactDashBigDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRange extends js.Object {
  var end: stdLib.Date
  var start: stdLib.Date
}

object DateRange {
  @scala.inline
  def apply(end: stdLib.Date, start: stdLib.Date): DateRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[DateRange]
  }
}

