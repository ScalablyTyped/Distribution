package typings.reactNativeCalendars.mod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarTheme extends js.Object {
  
  var arrowColor: js.UndefOr[String] = js.native
  
  var arrowStyle: js.UndefOr[ViewStyle] = js.native
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var calendarBackground: js.UndefOr[String] = js.native
  
  var dayTextColor: js.UndefOr[String] = js.native
  
  var dotColor: js.UndefOr[String] = js.native
  
  var dotStyle: js.UndefOr[ViewStyle] = js.native
  
  var indicatorColor: js.UndefOr[String] = js.native
  
  var monthTextColor: js.UndefOr[String] = js.native
  
  var selectedDayBackgroundColor: js.UndefOr[String] = js.native
  
  var selectedDayTextColor: js.UndefOr[String] = js.native
  
  var selectedDotColor: js.UndefOr[String] = js.native
  
  @JSName("stylesheet.agenda.list")
  var stylesheetDotagendaDotlist: js.UndefOr[CalendarThemeIdStyle] = js.native
  
  @JSName("stylesheet.agenda.main")
  var stylesheetDotagendaDotmain: js.UndefOr[CalendarThemeIdStyle] = js.native
  
  @JSName("stylesheet.calendar-list.main")
  var `stylesheetDotcalendar-listDotmain`: js.UndefOr[CalendarThemeIdStyle] = js.native
  
  // Theme ID's to style for
  @JSName("stylesheet.calendar.header")
  var stylesheetDotcalendarDotheader: js.UndefOr[CalendarThemeIdStyle] = js.native
  
  @JSName("stylesheet.calendar.main")
  var stylesheetDotcalendarDotmain: js.UndefOr[CalendarThemeIdStyle] = js.native
  
  @JSName("stylesheet.day.basic")
  var stylesheetDotdayDotbasic: js.UndefOr[CalendarThemeIdStyle] = js.native
  
  @JSName("stylesheet.day.multiDot")
  var stylesheetDotdayDotmultiDot: js.UndefOr[CalendarThemeIdStyle] = js.native
  
  @JSName("stylesheet.day.period")
  var stylesheetDotdayDotperiod: js.UndefOr[CalendarThemeIdStyle] = js.native
  
  @JSName("stylesheet.day.single")
  var stylesheetDotdayDotsingle: js.UndefOr[CalendarThemeIdStyle] = js.native
  
  @JSName("stylesheet.dot")
  var stylesheetDotdot: js.UndefOr[CalendarThemeIdStyle] = js.native
  
  var textDayFontFamily: js.UndefOr[String] = js.native
  
  var textDayFontSize: js.UndefOr[Double] = js.native
  
  var textDayFontWeight: js.UndefOr[String] = js.native
  
  var textDayHeaderFontFamily: js.UndefOr[String] = js.native
  
  var textDayHeaderFontSize: js.UndefOr[Double] = js.native
  
  var textDayHeaderFontWeight: js.UndefOr[String] = js.native
  
  var textDayStyle: js.UndefOr[TextStyle] = js.native
  
  var textDisabledColor: js.UndefOr[String] = js.native
  
  var textMonthFontFamily: js.UndefOr[String] = js.native
  
  var textMonthFontSize: js.UndefOr[Double] = js.native
  
  var textMonthFontWeight: js.UndefOr[String] = js.native
  
  var textSectionTitleColor: js.UndefOr[String] = js.native
  
  var todayTextColor: js.UndefOr[String] = js.native
}
object CalendarTheme {
  
  @scala.inline
  def apply(): CalendarTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarTheme]
  }
  
  @scala.inline
  implicit class CalendarThemeOps[Self <: CalendarTheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArrowColor(value: String): Self = this.set("arrowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowColor: Self = this.set("arrowColor", js.undefined)
    
    @scala.inline
    def setArrowStyle(value: ViewStyle): Self = this.set("arrowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowStyle: Self = this.set("arrowStyle", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setCalendarBackground(value: String): Self = this.set("calendarBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarBackground: Self = this.set("calendarBackground", js.undefined)
    
    @scala.inline
    def setDayTextColor(value: String): Self = this.set("dayTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayTextColor: Self = this.set("dayTextColor", js.undefined)
    
    @scala.inline
    def setDotColor(value: String): Self = this.set("dotColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotColor: Self = this.set("dotColor", js.undefined)
    
    @scala.inline
    def setDotStyle(value: ViewStyle): Self = this.set("dotStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotStyle: Self = this.set("dotStyle", js.undefined)
    
    @scala.inline
    def setIndicatorColor(value: String): Self = this.set("indicatorColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorColor: Self = this.set("indicatorColor", js.undefined)
    
    @scala.inline
    def setMonthTextColor(value: String): Self = this.set("monthTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthTextColor: Self = this.set("monthTextColor", js.undefined)
    
    @scala.inline
    def setSelectedDayBackgroundColor(value: String): Self = this.set("selectedDayBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedDayBackgroundColor: Self = this.set("selectedDayBackgroundColor", js.undefined)
    
    @scala.inline
    def setSelectedDayTextColor(value: String): Self = this.set("selectedDayTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedDayTextColor: Self = this.set("selectedDayTextColor", js.undefined)
    
    @scala.inline
    def setSelectedDotColor(value: String): Self = this.set("selectedDotColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedDotColor: Self = this.set("selectedDotColor", js.undefined)
    
    @scala.inline
    def setStylesheetDotagendaDotlist(value: CalendarThemeIdStyle): Self = this.set("stylesheet.agenda.list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylesheetDotagendaDotlist: Self = this.set("stylesheet.agenda.list", js.undefined)
    
    @scala.inline
    def setStylesheetDotagendaDotmain(value: CalendarThemeIdStyle): Self = this.set("stylesheet.agenda.main", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylesheetDotagendaDotmain: Self = this.set("stylesheet.agenda.main", js.undefined)
    
    @scala.inline
    def `setStylesheetDotcalendar-listDotmain`(value: CalendarThemeIdStyle): Self = this.set("stylesheet.calendar-list.main", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStylesheetDotcalendar-listDotmain`: Self = this.set("stylesheet.calendar-list.main", js.undefined)
    
    @scala.inline
    def setStylesheetDotcalendarDotheader(value: CalendarThemeIdStyle): Self = this.set("stylesheet.calendar.header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylesheetDotcalendarDotheader: Self = this.set("stylesheet.calendar.header", js.undefined)
    
    @scala.inline
    def setStylesheetDotcalendarDotmain(value: CalendarThemeIdStyle): Self = this.set("stylesheet.calendar.main", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylesheetDotcalendarDotmain: Self = this.set("stylesheet.calendar.main", js.undefined)
    
    @scala.inline
    def setStylesheetDotdayDotbasic(value: CalendarThemeIdStyle): Self = this.set("stylesheet.day.basic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylesheetDotdayDotbasic: Self = this.set("stylesheet.day.basic", js.undefined)
    
    @scala.inline
    def setStylesheetDotdayDotmultiDot(value: CalendarThemeIdStyle): Self = this.set("stylesheet.day.multiDot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylesheetDotdayDotmultiDot: Self = this.set("stylesheet.day.multiDot", js.undefined)
    
    @scala.inline
    def setStylesheetDotdayDotperiod(value: CalendarThemeIdStyle): Self = this.set("stylesheet.day.period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylesheetDotdayDotperiod: Self = this.set("stylesheet.day.period", js.undefined)
    
    @scala.inline
    def setStylesheetDotdayDotsingle(value: CalendarThemeIdStyle): Self = this.set("stylesheet.day.single", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylesheetDotdayDotsingle: Self = this.set("stylesheet.day.single", js.undefined)
    
    @scala.inline
    def setStylesheetDotdot(value: CalendarThemeIdStyle): Self = this.set("stylesheet.dot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylesheetDotdot: Self = this.set("stylesheet.dot", js.undefined)
    
    @scala.inline
    def setTextDayFontFamily(value: String): Self = this.set("textDayFontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDayFontFamily: Self = this.set("textDayFontFamily", js.undefined)
    
    @scala.inline
    def setTextDayFontSize(value: Double): Self = this.set("textDayFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDayFontSize: Self = this.set("textDayFontSize", js.undefined)
    
    @scala.inline
    def setTextDayFontWeight(value: String): Self = this.set("textDayFontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDayFontWeight: Self = this.set("textDayFontWeight", js.undefined)
    
    @scala.inline
    def setTextDayHeaderFontFamily(value: String): Self = this.set("textDayHeaderFontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDayHeaderFontFamily: Self = this.set("textDayHeaderFontFamily", js.undefined)
    
    @scala.inline
    def setTextDayHeaderFontSize(value: Double): Self = this.set("textDayHeaderFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDayHeaderFontSize: Self = this.set("textDayHeaderFontSize", js.undefined)
    
    @scala.inline
    def setTextDayHeaderFontWeight(value: String): Self = this.set("textDayHeaderFontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDayHeaderFontWeight: Self = this.set("textDayHeaderFontWeight", js.undefined)
    
    @scala.inline
    def setTextDayStyle(value: TextStyle): Self = this.set("textDayStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDayStyle: Self = this.set("textDayStyle", js.undefined)
    
    @scala.inline
    def setTextDisabledColor(value: String): Self = this.set("textDisabledColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDisabledColor: Self = this.set("textDisabledColor", js.undefined)
    
    @scala.inline
    def setTextMonthFontFamily(value: String): Self = this.set("textMonthFontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextMonthFontFamily: Self = this.set("textMonthFontFamily", js.undefined)
    
    @scala.inline
    def setTextMonthFontSize(value: Double): Self = this.set("textMonthFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextMonthFontSize: Self = this.set("textMonthFontSize", js.undefined)
    
    @scala.inline
    def setTextMonthFontWeight(value: String): Self = this.set("textMonthFontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextMonthFontWeight: Self = this.set("textMonthFontWeight", js.undefined)
    
    @scala.inline
    def setTextSectionTitleColor(value: String): Self = this.set("textSectionTitleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextSectionTitleColor: Self = this.set("textSectionTitleColor", js.undefined)
    
    @scala.inline
    def setTodayTextColor(value: String): Self = this.set("todayTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTodayTextColor: Self = this.set("todayTextColor", js.undefined)
  }
}
