package typings
package reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgendaThemeStyle extends CalendarTheme {
  var agendaDayNumColor: js.UndefOr[java.lang.String] = js.undefined
  var agendaDayTextColor: js.UndefOr[java.lang.String] = js.undefined
  var agendaKnobColor: js.UndefOr[java.lang.String] = js.undefined
  var agendaTodayColor: js.UndefOr[java.lang.String] = js.undefined
}

object AgendaThemeStyle {
  @scala.inline
  def apply(
    agendaDayNumColor: java.lang.String = null,
    agendaDayTextColor: java.lang.String = null,
    agendaKnobColor: java.lang.String = null,
    agendaTodayColor: java.lang.String = null,
    arrowColor: java.lang.String = null,
    backgroundColor: java.lang.String = null,
    calendarBackground: java.lang.String = null,
    dayTextColor: java.lang.String = null,
    dotColor: java.lang.String = null,
    monthTextColor: java.lang.String = null,
    selectedDayBackgroundColor: java.lang.String = null,
    selectedDayTextColor: java.lang.String = null,
    selectedDotColor: java.lang.String = null,
    `stylesheet.agenda.list`: CalendarThemeIdStyle = null,
    `stylesheet.agenda.main`: CalendarThemeIdStyle = null,
    `stylesheet.calendar-list.main`: CalendarThemeIdStyle = null,
    `stylesheet.calendar.header`: CalendarThemeIdStyle = null,
    `stylesheet.calendar.main`: CalendarThemeIdStyle = null,
    `stylesheet.day.basic`: CalendarThemeIdStyle = null,
    `stylesheet.day.multiDot`: CalendarThemeIdStyle = null,
    `stylesheet.day.period`: CalendarThemeIdStyle = null,
    `stylesheet.day.single`: CalendarThemeIdStyle = null,
    textDayFontFamily: java.lang.String = null,
    textDayFontSize: scala.Int | scala.Double = null,
    textDayHeaderFontFamily: java.lang.String = null,
    textDayHeaderFontSize: scala.Int | scala.Double = null,
    textDisabledColor: java.lang.String = null,
    textMonthFontFamily: java.lang.String = null,
    textMonthFontSize: scala.Int | scala.Double = null,
    textMonthFontWeight: java.lang.String = null,
    textSectionTitleColor: java.lang.String = null,
    todayTextColor: java.lang.String = null
  ): AgendaThemeStyle = {
    val __obj = js.Dynamic.literal()
    if (agendaDayNumColor != null) __obj.updateDynamic("agendaDayNumColor")(agendaDayNumColor)
    if (agendaDayTextColor != null) __obj.updateDynamic("agendaDayTextColor")(agendaDayTextColor)
    if (agendaKnobColor != null) __obj.updateDynamic("agendaKnobColor")(agendaKnobColor)
    if (agendaTodayColor != null) __obj.updateDynamic("agendaTodayColor")(agendaTodayColor)
    if (arrowColor != null) __obj.updateDynamic("arrowColor")(arrowColor)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (calendarBackground != null) __obj.updateDynamic("calendarBackground")(calendarBackground)
    if (dayTextColor != null) __obj.updateDynamic("dayTextColor")(dayTextColor)
    if (dotColor != null) __obj.updateDynamic("dotColor")(dotColor)
    if (monthTextColor != null) __obj.updateDynamic("monthTextColor")(monthTextColor)
    if (selectedDayBackgroundColor != null) __obj.updateDynamic("selectedDayBackgroundColor")(selectedDayBackgroundColor)
    if (selectedDayTextColor != null) __obj.updateDynamic("selectedDayTextColor")(selectedDayTextColor)
    if (selectedDotColor != null) __obj.updateDynamic("selectedDotColor")(selectedDotColor)
    if (`stylesheet.agenda.list` != null) __obj.updateDynamic("stylesheet.agenda.list")(`stylesheet.agenda.list`)
    if (`stylesheet.agenda.main` != null) __obj.updateDynamic("stylesheet.agenda.main")(`stylesheet.agenda.main`)
    if (`stylesheet.calendar-list.main` != null) __obj.updateDynamic("stylesheet.calendar-list.main")(`stylesheet.calendar-list.main`)
    if (`stylesheet.calendar.header` != null) __obj.updateDynamic("stylesheet.calendar.header")(`stylesheet.calendar.header`)
    if (`stylesheet.calendar.main` != null) __obj.updateDynamic("stylesheet.calendar.main")(`stylesheet.calendar.main`)
    if (`stylesheet.day.basic` != null) __obj.updateDynamic("stylesheet.day.basic")(`stylesheet.day.basic`)
    if (`stylesheet.day.multiDot` != null) __obj.updateDynamic("stylesheet.day.multiDot")(`stylesheet.day.multiDot`)
    if (`stylesheet.day.period` != null) __obj.updateDynamic("stylesheet.day.period")(`stylesheet.day.period`)
    if (`stylesheet.day.single` != null) __obj.updateDynamic("stylesheet.day.single")(`stylesheet.day.single`)
    if (textDayFontFamily != null) __obj.updateDynamic("textDayFontFamily")(textDayFontFamily)
    if (textDayFontSize != null) __obj.updateDynamic("textDayFontSize")(textDayFontSize.asInstanceOf[js.Any])
    if (textDayHeaderFontFamily != null) __obj.updateDynamic("textDayHeaderFontFamily")(textDayHeaderFontFamily)
    if (textDayHeaderFontSize != null) __obj.updateDynamic("textDayHeaderFontSize")(textDayHeaderFontSize.asInstanceOf[js.Any])
    if (textDisabledColor != null) __obj.updateDynamic("textDisabledColor")(textDisabledColor)
    if (textMonthFontFamily != null) __obj.updateDynamic("textMonthFontFamily")(textMonthFontFamily)
    if (textMonthFontSize != null) __obj.updateDynamic("textMonthFontSize")(textMonthFontSize.asInstanceOf[js.Any])
    if (textMonthFontWeight != null) __obj.updateDynamic("textMonthFontWeight")(textMonthFontWeight)
    if (textSectionTitleColor != null) __obj.updateDynamic("textSectionTitleColor")(textSectionTitleColor)
    if (todayTextColor != null) __obj.updateDynamic("todayTextColor")(todayTextColor)
    __obj.asInstanceOf[AgendaThemeStyle]
  }
}

