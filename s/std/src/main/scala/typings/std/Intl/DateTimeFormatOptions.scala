package typings.std.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeFormatOptions extends js.Object {
  var day: js.UndefOr[java.lang.String] = js.undefined
  var era: js.UndefOr[java.lang.String] = js.undefined
  var formatMatcher: js.UndefOr[java.lang.String] = js.undefined
  var hour: js.UndefOr[java.lang.String] = js.undefined
  var hour12: js.UndefOr[scala.Boolean] = js.undefined
  var localeMatcher: js.UndefOr[java.lang.String] = js.undefined
  var minute: js.UndefOr[java.lang.String] = js.undefined
  var month: js.UndefOr[java.lang.String] = js.undefined
  var second: js.UndefOr[java.lang.String] = js.undefined
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
  var timeZoneName: js.UndefOr[java.lang.String] = js.undefined
  var weekday: js.UndefOr[java.lang.String] = js.undefined
  var year: js.UndefOr[java.lang.String] = js.undefined
}

object DateTimeFormatOptions {
  @scala.inline
  def apply(
    day: java.lang.String = null,
    era: java.lang.String = null,
    formatMatcher: java.lang.String = null,
    hour: java.lang.String = null,
    hour12: js.UndefOr[scala.Boolean] = js.undefined,
    localeMatcher: java.lang.String = null,
    minute: java.lang.String = null,
    month: java.lang.String = null,
    second: java.lang.String = null,
    timeZone: java.lang.String = null,
    timeZoneName: java.lang.String = null,
    weekday: java.lang.String = null,
    year: java.lang.String = null
  ): DateTimeFormatOptions = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day)
    if (era != null) __obj.updateDynamic("era")(era)
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
    __obj.asInstanceOf[DateTimeFormatOptions]
  }
}

