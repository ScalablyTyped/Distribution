package typings.reactDashDayDashPicker.typesPropsMod

import typings.reactDashDayDashPicker.Anon_Day
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeekdayElementProps extends js.Object {
  var className: String
  var locale: String
  var localeUtils: Anon_Day
  var weekday: Double
  var weekdaysLong: js.UndefOr[js.Array[String]] = js.undefined
  var weekdaysShort: js.UndefOr[js.Array[String]] = js.undefined
}

object WeekdayElementProps {
  @scala.inline
  def apply(
    className: String,
    locale: String,
    localeUtils: Anon_Day,
    weekday: Double,
    weekdaysLong: js.Array[String] = null,
    weekdaysShort: js.Array[String] = null
  ): WeekdayElementProps = {
    val __obj = js.Dynamic.literal(className = className, locale = locale, localeUtils = localeUtils, weekday = weekday)
    if (weekdaysLong != null) __obj.updateDynamic("weekdaysLong")(weekdaysLong)
    if (weekdaysShort != null) __obj.updateDynamic("weekdaysShort")(weekdaysShort)
    __obj.asInstanceOf[WeekdayElementProps]
  }
}

