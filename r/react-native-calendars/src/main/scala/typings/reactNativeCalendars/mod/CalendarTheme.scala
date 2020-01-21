package typings.reactNativeCalendars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarTheme extends js.Object {
  var arrowColor: js.UndefOr[String] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var calendarBackground: js.UndefOr[String] = js.undefined
  var dayTextColor: js.UndefOr[String] = js.undefined
  var dotColor: js.UndefOr[String] = js.undefined
  var indicatorColor: js.UndefOr[String] = js.undefined
  var monthTextColor: js.UndefOr[String] = js.undefined
  var selectedDayBackgroundColor: js.UndefOr[String] = js.undefined
  var selectedDayTextColor: js.UndefOr[String] = js.undefined
  var selectedDotColor: js.UndefOr[String] = js.undefined
  @JSName("stylesheet.agenda.list")
  var stylesheetDotagendaDotlist: js.UndefOr[CalendarThemeIdStyle] = js.undefined
  @JSName("stylesheet.agenda.main")
  var stylesheetDotagendaDotmain: js.UndefOr[CalendarThemeIdStyle] = js.undefined
  @JSName("stylesheet.calendar-list.main")
  var `stylesheetDotcalendar-listDotmain`: js.UndefOr[CalendarThemeIdStyle] = js.undefined
  // Theme ID's to style for
  @JSName("stylesheet.calendar.header")
  var stylesheetDotcalendarDotheader: js.UndefOr[CalendarThemeIdStyle] = js.undefined
  @JSName("stylesheet.calendar.main")
  var stylesheetDotcalendarDotmain: js.UndefOr[CalendarThemeIdStyle] = js.undefined
  @JSName("stylesheet.day.basic")
  var stylesheetDotdayDotbasic: js.UndefOr[CalendarThemeIdStyle] = js.undefined
  @JSName("stylesheet.day.multiDot")
  var stylesheetDotdayDotmultiDot: js.UndefOr[CalendarThemeIdStyle] = js.undefined
  @JSName("stylesheet.day.period")
  var stylesheetDotdayDotperiod: js.UndefOr[CalendarThemeIdStyle] = js.undefined
  @JSName("stylesheet.day.single")
  var stylesheetDotdayDotsingle: js.UndefOr[CalendarThemeIdStyle] = js.undefined
  var textDayFontFamily: js.UndefOr[String] = js.undefined
  var textDayFontSize: js.UndefOr[Double] = js.undefined
  var textDayFontWeight: js.UndefOr[String] = js.undefined
  var textDayHeaderFontFamily: js.UndefOr[String] = js.undefined
  var textDayHeaderFontSize: js.UndefOr[Double] = js.undefined
  var textDayHeaderFontWeight: js.UndefOr[String] = js.undefined
  var textDisabledColor: js.UndefOr[String] = js.undefined
  var textMonthFontFamily: js.UndefOr[String] = js.undefined
  var textMonthFontSize: js.UndefOr[Double] = js.undefined
  var textMonthFontWeight: js.UndefOr[String] = js.undefined
  var textSectionTitleColor: js.UndefOr[String] = js.undefined
  var todayTextColor: js.UndefOr[String] = js.undefined
}

object CalendarTheme {
  @scala.inline
  def apply(
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
    textDayFontSize: Int | Double = null,
    textDayFontWeight: String = null,
    textDayHeaderFontFamily: String = null,
    textDayHeaderFontSize: Int | Double = null,
    textDayHeaderFontWeight: String = null,
    textDisabledColor: String = null,
    textMonthFontFamily: String = null,
    textMonthFontSize: Int | Double = null,
    textMonthFontWeight: String = null,
    textSectionTitleColor: String = null,
    todayTextColor: String = null
  ): CalendarTheme = {
    val __obj = js.Dynamic.literal()
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
    if (textDayFontSize != null) __obj.updateDynamic("textDayFontSize")(textDayFontSize.asInstanceOf[js.Any])
    if (textDayFontWeight != null) __obj.updateDynamic("textDayFontWeight")(textDayFontWeight.asInstanceOf[js.Any])
    if (textDayHeaderFontFamily != null) __obj.updateDynamic("textDayHeaderFontFamily")(textDayHeaderFontFamily.asInstanceOf[js.Any])
    if (textDayHeaderFontSize != null) __obj.updateDynamic("textDayHeaderFontSize")(textDayHeaderFontSize.asInstanceOf[js.Any])
    if (textDayHeaderFontWeight != null) __obj.updateDynamic("textDayHeaderFontWeight")(textDayHeaderFontWeight.asInstanceOf[js.Any])
    if (textDisabledColor != null) __obj.updateDynamic("textDisabledColor")(textDisabledColor.asInstanceOf[js.Any])
    if (textMonthFontFamily != null) __obj.updateDynamic("textMonthFontFamily")(textMonthFontFamily.asInstanceOf[js.Any])
    if (textMonthFontSize != null) __obj.updateDynamic("textMonthFontSize")(textMonthFontSize.asInstanceOf[js.Any])
    if (textMonthFontWeight != null) __obj.updateDynamic("textMonthFontWeight")(textMonthFontWeight.asInstanceOf[js.Any])
    if (textSectionTitleColor != null) __obj.updateDynamic("textSectionTitleColor")(textSectionTitleColor.asInstanceOf[js.Any])
    if (todayTextColor != null) __obj.updateDynamic("todayTextColor")(todayTextColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarTheme]
  }
}

