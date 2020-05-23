package typings.std.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedDateTimeFormatOptions extends js.Object {
  var calendar: String
  var day: js.UndefOr[String] = js.undefined
  var era: js.UndefOr[String] = js.undefined
  var hour: js.UndefOr[String] = js.undefined
  var hour12: js.UndefOr[Boolean] = js.undefined
  var locale: String
  var minute: js.UndefOr[String] = js.undefined
  var month: js.UndefOr[String] = js.undefined
  var numberingSystem: String
  var second: js.UndefOr[String] = js.undefined
  var timeZone: String
  var timeZoneName: js.UndefOr[String] = js.undefined
  var weekday: js.UndefOr[String] = js.undefined
  var year: js.UndefOr[String] = js.undefined
}

object ResolvedDateTimeFormatOptions {
  @scala.inline
  def apply(
    calendar: String,
    locale: String,
    numberingSystem: String,
    timeZone: String,
    day: String = null,
    era: String = null,
    hour: String = null,
    hour12: js.UndefOr[Boolean] = js.undefined,
    minute: String = null,
    month: String = null,
    second: String = null,
    timeZoneName: String = null,
    weekday: String = null,
    year: String = null
  ): ResolvedDateTimeFormatOptions = {
    val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (era != null) __obj.updateDynamic("era")(era.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (!js.isUndefined(hour12)) __obj.updateDynamic("hour12")(hour12.get.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (timeZoneName != null) __obj.updateDynamic("timeZoneName")(timeZoneName.asInstanceOf[js.Any])
    if (weekday != null) __obj.updateDynamic("weekday")(weekday.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedDateTimeFormatOptions]
  }
}

