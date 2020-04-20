package typings.reactDayPicker.propsMod

import typings.reactDayPicker.localeUtilsMod.LocaleUtils
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeekdayElementProps extends js.Object {
  var className: String
  var locale: String
  var localeUtils: LocaleUtils
  var weekday: Double
  var weekdaysLong: js.UndefOr[js.Array[String]] = js.undefined
  var weekdaysShort: js.UndefOr[js.Array[String]] = js.undefined
}

object WeekdayElementProps {
  @scala.inline
  def apply(
    className: String,
    locale: String,
    localeUtils: LocaleUtils,
    weekday: Double,
    weekdaysLong: js.Array[String] = null,
    weekdaysShort: js.Array[String] = null
  ): WeekdayElementProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], localeUtils = localeUtils.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any])
    if (weekdaysLong != null) __obj.updateDynamic("weekdaysLong")(weekdaysLong.asInstanceOf[js.Any])
    if (weekdaysShort != null) __obj.updateDynamic("weekdaysShort")(weekdaysShort.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeekdayElementProps]
  }
}

