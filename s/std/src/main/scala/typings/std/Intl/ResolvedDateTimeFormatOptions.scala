package typings.std.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedDateTimeFormatOptions extends js.Object {
  var calendar: java.lang.String
  var day: js.UndefOr[java.lang.String] = js.undefined
  var era: js.UndefOr[java.lang.String] = js.undefined
  var hour: js.UndefOr[java.lang.String] = js.undefined
  var hour12: js.UndefOr[scala.Boolean] = js.undefined
  var locale: java.lang.String
  var minute: js.UndefOr[java.lang.String] = js.undefined
  var month: js.UndefOr[java.lang.String] = js.undefined
  var numberingSystem: java.lang.String
  var second: js.UndefOr[java.lang.String] = js.undefined
  var timeZone: java.lang.String
  var timeZoneName: js.UndefOr[java.lang.String] = js.undefined
  var weekday: js.UndefOr[java.lang.String] = js.undefined
  var year: js.UndefOr[java.lang.String] = js.undefined
}

object ResolvedDateTimeFormatOptions {
  @scala.inline
  def apply(
    calendar: java.lang.String,
    locale: java.lang.String,
    numberingSystem: java.lang.String,
    timeZone: java.lang.String,
    day: java.lang.String = null,
    era: java.lang.String = null,
    hour: java.lang.String = null,
    hour12: js.UndefOr[scala.Boolean] = js.undefined,
    minute: java.lang.String = null,
    month: java.lang.String = null,
    second: java.lang.String = null,
    timeZoneName: java.lang.String = null,
    weekday: java.lang.String = null,
    year: java.lang.String = null
  ): ResolvedDateTimeFormatOptions = {
    val __obj = js.Dynamic.literal(calendar = calendar, locale = locale, numberingSystem = numberingSystem, timeZone = timeZone)
    if (day != null) __obj.updateDynamic("day")(day)
    if (era != null) __obj.updateDynamic("era")(era)
    if (hour != null) __obj.updateDynamic("hour")(hour)
    if (!js.isUndefined(hour12)) __obj.updateDynamic("hour12")(hour12)
    if (minute != null) __obj.updateDynamic("minute")(minute)
    if (month != null) __obj.updateDynamic("month")(month)
    if (second != null) __obj.updateDynamic("second")(second)
    if (timeZoneName != null) __obj.updateDynamic("timeZoneName")(timeZoneName)
    if (weekday != null) __obj.updateDynamic("weekday")(weekday)
    if (year != null) __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[ResolvedDateTimeFormatOptions]
  }
}

