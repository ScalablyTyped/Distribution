package typings
package reactDashDayDashPickerLib.typesPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeekdayElementProps extends js.Object {
  var className: java.lang.String
  var locale: java.lang.String
  var localeUtils: reactDashDayDashPickerLib.typesUtilsMod.LocaleUtils
  var weekday: scala.Double
  var weekdaysLong: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var weekdaysShort: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object WeekdayElementProps {
  @scala.inline
  def apply(
    className: java.lang.String,
    locale: java.lang.String,
    localeUtils: reactDashDayDashPickerLib.typesUtilsMod.LocaleUtils,
    weekday: scala.Double,
    weekdaysLong: js.Array[java.lang.String] = null,
    weekdaysShort: js.Array[java.lang.String] = null
  ): WeekdayElementProps = {
    val __obj = js.Dynamic.literal(className = className, locale = locale, localeUtils = localeUtils, weekday = weekday)
    if (weekdaysLong != null) __obj.updateDynamic("weekdaysLong")(weekdaysLong)
    if (weekdaysShort != null) __obj.updateDynamic("weekdaysShort")(weekdaysShort)
    __obj.asInstanceOf[WeekdayElementProps]
  }
}

