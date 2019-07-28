package typings.reactDashIntl.ReactIntlNs.IntlComponentNs

import typings.std.IntlNs.DateTimeFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeFormatProps extends DateTimeFormatOptions {
  var format: js.UndefOr[String] = js.undefined
}

object DateTimeFormatProps {
  @scala.inline
  def apply(
    day: String = null,
    era: String = null,
    format: String = null,
    formatMatcher: String = null,
    hour: String = null,
    hour12: js.UndefOr[Boolean] = js.undefined,
    localeMatcher: String = null,
    minute: String = null,
    month: String = null,
    second: String = null,
    timeZone: String = null,
    timeZoneName: String = null,
    weekday: String = null,
    year: String = null
  ): DateTimeFormatProps = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day)
    if (era != null) __obj.updateDynamic("era")(era)
    if (format != null) __obj.updateDynamic("format")(format)
    if (formatMatcher != null) __obj.updateDynamic("formatMatcher")(formatMatcher)
    if (hour != null) __obj.updateDynamic("hour")(hour)
    if (!js.isUndefined(hour12)) __obj.updateDynamic("hour12")(hour12)
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher)
    if (minute != null) __obj.updateDynamic("minute")(minute)
    if (month != null) __obj.updateDynamic("month")(month)
    if (second != null) __obj.updateDynamic("second")(second)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    if (timeZoneName != null) __obj.updateDynamic("timeZoneName")(timeZoneName)
    if (weekday != null) __obj.updateDynamic("weekday")(weekday)
    if (year != null) __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[DateTimeFormatProps]
  }
}

