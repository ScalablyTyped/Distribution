package typings.reactDashIntl.ReactIntlNs.FormattedRelativeNs

import typings.reactDashIntl.reactDashIntlStrings.`best fit`
import typings.reactDashIntl.reactDashIntlStrings.day
import typings.reactDashIntl.reactDashIntlStrings.hour
import typings.reactDashIntl.reactDashIntlStrings.minute
import typings.reactDashIntl.reactDashIntlStrings.month
import typings.reactDashIntl.reactDashIntlStrings.numeric
import typings.reactDashIntl.reactDashIntlStrings.second
import typings.reactDashIntl.reactDashIntlStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsBase extends js.Object {
  var format: js.UndefOr[String] = js.undefined
  var initialNow: js.UndefOr[js.Any] = js.undefined
  /*
    * one of "best fit" (default) | "numeric"
    */
  var style: js.UndefOr[(`best fit`) | numeric] = js.undefined
  /*
    * one of "second", "minute", "hour", "day", "month" or "year"
    */
  var units: js.UndefOr[second | minute | hour | day | month | year] = js.undefined
  var updateInterval: js.UndefOr[Double] = js.undefined
}

object PropsBase {
  @scala.inline
  def apply(
    format: String = null,
    initialNow: js.Any = null,
    style: (`best fit`) | numeric = null,
    units: second | minute | hour | day | month | year = null,
    updateInterval: Int | Double = null
  ): PropsBase = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (initialNow != null) __obj.updateDynamic("initialNow")(initialNow)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    if (updateInterval != null) __obj.updateDynamic("updateInterval")(updateInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsBase]
  }
}

