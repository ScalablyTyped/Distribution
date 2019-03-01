package typings
package reactDashMdLib.libPickersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarTitleFormat extends js.Object {
  var era: js.UndefOr[NSL] = js.undefined
  var month: js.UndefOr[NSL | N2D] = js.undefined
  var year: js.UndefOr[N2D] = js.undefined
}

object CalendarTitleFormat {
  @scala.inline
  def apply(era: NSL = null, month: NSL | N2D = null, year: N2D = null): CalendarTitleFormat = {
    val __obj = js.Dynamic.literal()
    if (era != null) __obj.updateDynamic("era")(era)
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[CalendarTitleFormat]
  }
}

