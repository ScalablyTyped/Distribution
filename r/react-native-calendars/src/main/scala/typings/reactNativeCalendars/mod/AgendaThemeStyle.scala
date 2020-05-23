package typings.reactNativeCalendars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgendaThemeStyle extends CalendarTheme {
  var agendaDayNumColor: js.UndefOr[String] = js.undefined
  var agendaDayTextColor: js.UndefOr[String] = js.undefined
  var agendaKnobColor: js.UndefOr[String] = js.undefined
  var agendaTodayColor: js.UndefOr[String] = js.undefined
}

object AgendaThemeStyle {
  @scala.inline
  def apply(
    agendaDayNumColor: String = null,
    agendaDayTextColor: String = null,
    agendaKnobColor: String = null,
    agendaTodayColor: String = null,
    arrowColor: String = null,
    backgroundColor: String = null,
    calendarBackground: String = null,
    dayTextColor: String = null,
    dotColor: String = null,
    indicatorColor: String = null,
    monthTextColor: String = null,
    selectedDayBackgroundColor: String = null,
    selectedDayTextColor: String = null,
    selectedDotColor: String = null,
    stylesheetDotagendaDotlist: CalendarThemeIdStyle = null,
    stylesheetDotagendaDotmain: CalendarThemeIdStyle = null,
    `stylesheetDotcalendar-listDotmain`: CalendarThemeIdStyle = null,
    stylesheetDotcalendarDotheader: CalendarThemeIdStyle = null,
    stylesheetDotcalendarDotmain: CalendarThemeIdStyle = null,
    stylesheetDotdayDotbasic: CalendarThemeIdStyle = null,
    stylesheetDotdayDotmultiDot: CalendarThemeIdStyle = null,
    stylesheetDotdayDotperiod: CalendarThemeIdStyle = null,
    stylesheetDotdayDotsingle: CalendarThemeIdStyle = null,
    textDayFontFamily: String = null,
    textDayFontSize: js.UndefOr[Double] = js.undefined,
    textDayFontWeight: String = null,
    textDayHeaderFontFamily: String = null,
    textDayHeaderFontSize: js.UndefOr[Double] = js.undefined,
    textDayHeaderFontWeight: String = null,
    textDisabledColor: String = null,
    textMonthFontFamily: String = null,
    textMonthFontSize: js.UndefOr[Double] = js.undefined,
    textMonthFontWeight: String = null,
    textSectionTitleColor: String = null,
    todayTextColor: String = null
  ): AgendaThemeStyle = {
    val __obj = js.Dynamic.literal()
    if (agendaDayNumColor != null) __obj.updateDynamic("agendaDayNumColor")(agendaDayNumColor.asInstanceOf[js.Any])
    if (agendaDayTextColor != null) __obj.updateDynamic("agendaDayTextColor")(agendaDayTextColor.asInstanceOf[js.Any])
    if (agendaKnobColor != null) __obj.updateDynamic("agendaKnobColor")(agendaKnobColor.asInstanceOf[js.Any])
    if (agendaTodayColor != null) __obj.updateDynamic("agendaTodayColor")(agendaTodayColor.asInstanceOf[js.Any])
    if (arrowColor != null) __obj.updateDynamic("arrowColor")(arrowColor.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (calendarBackground != null) __obj.updateDynamic("calendarBackground")(calendarBackground.asInstanceOf[js.Any])
    if (dayTextColor != null) __obj.updateDynamic("dayTextColor")(dayTextColor.asInstanceOf[js.Any])
    if (dotColor != null) __obj.updateDynamic("dotColor")(dotColor.asInstanceOf[js.Any])
    if (indicatorColor != null) __obj.updateDynamic("indicatorColor")(indicatorColor.asInstanceOf[js.Any])
    if (monthTextColor != null) __obj.updateDynamic("monthTextColor")(monthTextColor.asInstanceOf[js.Any])
    if (selectedDayBackgroundColor != null) __obj.updateDynamic("selectedDayBackgroundColor")(selectedDayBackgroundColor.asInstanceOf[js.Any])
    if (selectedDayTextColor != null) __obj.updateDynamic("selectedDayTextColor")(selectedDayTextColor.asInstanceOf[js.Any])
    if (selectedDotColor != null) __obj.updateDynamic("selectedDotColor")(selectedDotColor.asInstanceOf[js.Any])
    if (stylesheetDotagendaDotlist != null) __obj.updateDynamic("stylesheet.agenda.list")(stylesheetDotagendaDotlist.asInstanceOf[js.Any])
    if (stylesheetDotagendaDotmain != null) __obj.updateDynamic("stylesheet.agenda.main")(stylesheetDotagendaDotmain.asInstanceOf[js.Any])
    if (`stylesheetDotcalendar-listDotmain` != null) __obj.updateDynamic("stylesheet.calendar-list.main")(`stylesheetDotcalendar-listDotmain`.asInstanceOf[js.Any])
    if (stylesheetDotcalendarDotheader != null) __obj.updateDynamic("stylesheet.calendar.header")(stylesheetDotcalendarDotheader.asInstanceOf[js.Any])
    if (stylesheetDotcalendarDotmain != null) __obj.updateDynamic("stylesheet.calendar.main")(stylesheetDotcalendarDotmain.asInstanceOf[js.Any])
    if (stylesheetDotdayDotbasic != null) __obj.updateDynamic("stylesheet.day.basic")(stylesheetDotdayDotbasic.asInstanceOf[js.Any])
    if (stylesheetDotdayDotmultiDot != null) __obj.updateDynamic("stylesheet.day.multiDot")(stylesheetDotdayDotmultiDot.asInstanceOf[js.Any])
    if (stylesheetDotdayDotperiod != null) __obj.updateDynamic("stylesheet.day.period")(stylesheetDotdayDotperiod.asInstanceOf[js.Any])
    if (stylesheetDotdayDotsingle != null) __obj.updateDynamic("stylesheet.day.single")(stylesheetDotdayDotsingle.asInstanceOf[js.Any])
    if (textDayFontFamily != null) __obj.updateDynamic("textDayFontFamily")(textDayFontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(textDayFontSize)) __obj.updateDynamic("textDayFontSize")(textDayFontSize.get.asInstanceOf[js.Any])
    if (textDayFontWeight != null) __obj.updateDynamic("textDayFontWeight")(textDayFontWeight.asInstanceOf[js.Any])
    if (textDayHeaderFontFamily != null) __obj.updateDynamic("textDayHeaderFontFamily")(textDayHeaderFontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(textDayHeaderFontSize)) __obj.updateDynamic("textDayHeaderFontSize")(textDayHeaderFontSize.get.asInstanceOf[js.Any])
    if (textDayHeaderFontWeight != null) __obj.updateDynamic("textDayHeaderFontWeight")(textDayHeaderFontWeight.asInstanceOf[js.Any])
    if (textDisabledColor != null) __obj.updateDynamic("textDisabledColor")(textDisabledColor.asInstanceOf[js.Any])
    if (textMonthFontFamily != null) __obj.updateDynamic("textMonthFontFamily")(textMonthFontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(textMonthFontSize)) __obj.updateDynamic("textMonthFontSize")(textMonthFontSize.get.asInstanceOf[js.Any])
    if (textMonthFontWeight != null) __obj.updateDynamic("textMonthFontWeight")(textMonthFontWeight.asInstanceOf[js.Any])
    if (textSectionTitleColor != null) __obj.updateDynamic("textSectionTitleColor")(textSectionTitleColor.asInstanceOf[js.Any])
    if (todayTextColor != null) __obj.updateDynamic("todayTextColor")(todayTextColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgendaThemeStyle]
  }
}

