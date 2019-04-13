package typings
package reactDashDateDashRangeLib.reactDashDateDashRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarProps extends CommonCalendarProps {
  /** default: today */
  var date: DateInputType
}

object CalendarProps {
  @scala.inline
  def apply(
    date: DateInputType,
    firstDayOfWeek: scala.Int | scala.Double = null,
    format: java.lang.String = null,
    lang: LanguageType = null,
    maxDate: DateInputType = null,
    minDate: DateInputType = null,
    onChange: /* range */ Range => scala.Unit = null,
    onInit: /* range */ Range => scala.Unit = null,
    theme: CalendarTheme = null
  ): CalendarProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction1(onInit))
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[CalendarProps]
  }
}

