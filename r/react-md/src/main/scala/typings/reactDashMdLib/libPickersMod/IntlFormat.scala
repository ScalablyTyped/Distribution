package typings
package reactDashMdLib.libPickersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntlFormat extends IntlTimeFormat {
  var day: js.UndefOr[N2D] = js.undefined
  var era: js.UndefOr[NSL] = js.undefined
  var month: js.UndefOr[NSL | N2D] = js.undefined
  var weekday: js.UndefOr[NSL] = js.undefined
  var year: js.UndefOr[N2D] = js.undefined
}

object IntlFormat {
  @scala.inline
  def apply(
    day: N2D = null,
    era: NSL = null,
    hour: N2D = null,
    minute: N2D = null,
    month: NSL | N2D = null,
    second: N2D = null,
    timeZoneName: reactDashMdLib.reactDashMdLibStrings.short | reactDashMdLib.reactDashMdLibStrings.long = null,
    weekday: NSL = null,
    year: N2D = null
  ): IntlFormat = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day)
    if (era != null) __obj.updateDynamic("era")(era)
    if (hour != null) __obj.updateDynamic("hour")(hour)
    if (minute != null) __obj.updateDynamic("minute")(minute)
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second)
    if (timeZoneName != null) __obj.updateDynamic("timeZoneName")(timeZoneName.asInstanceOf[js.Any])
    if (weekday != null) __obj.updateDynamic("weekday")(weekday)
    if (year != null) __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[IntlFormat]
  }
}

