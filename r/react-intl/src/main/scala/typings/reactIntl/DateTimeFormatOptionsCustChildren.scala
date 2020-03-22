package typings.reactIntl

import typings.react.mod.ReactElement
import typings.std.Date
import typings.std.Intl.DateTimeFormatPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Intl.DateTimeFormatOptions & react-intl.react-intl.CustomFormatConfig & {  value  :string | number | std.Date | undefined, children (val : std.Array<std.Intl.DateTimeFormatPart>): react.react.ReactElement | null} */
trait DateTimeFormatOptionsCustChildren extends js.Object {
  var day: js.UndefOr[String] = js.undefined
  var era: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var formatMatcher: js.UndefOr[String] = js.undefined
  var hour: js.UndefOr[String] = js.undefined
  var hour12: js.UndefOr[Boolean] = js.undefined
  var localeMatcher: js.UndefOr[String] = js.undefined
  var minute: js.UndefOr[String] = js.undefined
  var month: js.UndefOr[String] = js.undefined
  var second: js.UndefOr[String] = js.undefined
  var timeZone: js.UndefOr[String] = js.undefined
  var timeZoneName: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | Double | Date] = js.undefined
  var weekday: js.UndefOr[String] = js.undefined
  var year: js.UndefOr[String] = js.undefined
  def children(`val`: js.Array[DateTimeFormatPart]): ReactElement | Null
}

object DateTimeFormatOptionsCustChildren {
  @scala.inline
  def apply(
    children: js.Array[DateTimeFormatPart] => ReactElement | Null,
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
    value: String | Double | Date = null,
    weekday: String = null,
    year: String = null
  ): DateTimeFormatOptionsCustChildren = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (era != null) __obj.updateDynamic("era")(era.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatMatcher != null) __obj.updateDynamic("formatMatcher")(formatMatcher.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (!js.isUndefined(hour12)) __obj.updateDynamic("hour12")(hour12.asInstanceOf[js.Any])
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    if (timeZoneName != null) __obj.updateDynamic("timeZoneName")(timeZoneName.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (weekday != null) __obj.updateDynamic("weekday")(weekday.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeFormatOptionsCustChildren]
  }
}

