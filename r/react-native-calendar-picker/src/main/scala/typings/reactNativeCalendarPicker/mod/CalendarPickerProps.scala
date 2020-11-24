package typings.reactNativeCalendarPicker.mod

import typings.moment.mod.Moment
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeCalendarPicker.anon.ContainerStyle
import typings.reactNativeCalendarPicker.anon.Style
import typings.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.END_DATE
import typings.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.START_DATE
import typings.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.circle
import typings.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.square
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarPickerProps extends js.Object {
  
  var allowBackwardRangeSelect: js.UndefOr[Boolean] = js.native
  
  var allowRangeSelection: js.UndefOr[Boolean] = js.native
  
  var customDatesStyles: js.UndefOr[js.Array[CustomDateStyle] | CustomDatesStylesFunc] = js.native
  
  var customDayHeaderStyles: js.UndefOr[CustomDayHeaderStylesFunc] = js.native
  
  var dayLabelsWrapper: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var dayShape: js.UndefOr[circle | square] = js.native
  
  var disabledDates: js.UndefOr[js.Array[Date] | DisabledDatesFunc] = js.native
  
  var disabledDatesTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var enableDateChange: js.UndefOr[Boolean] = js.native
  
  var headingLevel: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var horizontal: js.UndefOr[Boolean] = js.native
  
  var initialDate: js.UndefOr[Date] = js.native
  
  var maxDate: js.UndefOr[Date] = js.native
  
  var maxRangeDuration: js.UndefOr[Double | js.Array[MaxDurationArrayItem]] = js.native
  
  var minDate: js.UndefOr[Date] = js.native
  
  var minRangeDuration: js.UndefOr[Double | js.Array[MinDurationArrayItem]] = js.native
  
  var monthYearHeaderWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var months: js.UndefOr[js.Array[String]] = js.native
  
  var nextComponent: js.UndefOr[ReactNode] = js.native
  
  var nextTitle: js.UndefOr[String] = js.native
  
  var nextTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var onDateChange: js.UndefOr[DateChangedCallback] = js.native
  
  var onMonthChange: js.UndefOr[DateChangedCallback] = js.native
  
  var previousComponent: js.UndefOr[ReactNode] = js.native
  
  var previousTitle: js.UndefOr[String] = js.native
  
  var previousTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var restrictMonthNavigation: js.UndefOr[Boolean] = js.native
  
  var scaleFactor: js.UndefOr[Double] = js.native
  
  var scrollable: js.UndefOr[Boolean] = js.native
  
  var selectedDayColor: js.UndefOr[String] = js.native
  
  var selectedDayStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var selectedDayTextColor: js.UndefOr[String] = js.native
  
  var selectedEndDate: js.UndefOr[Date] = js.native
  
  var selectedRangeEndStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var selectedRangeStartStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var selectedRangeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var selectedStartDate: js.UndefOr[Date] = js.native
  
  var showDayStragglers: js.UndefOr[Boolean] = js.native
  
  var startFromMonday: js.UndefOr[Boolean] = js.native
  
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var todayBackgroundColor: js.UndefOr[String] = js.native
  
  var todayTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var weekdays: js.UndefOr[js.Array[String]] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object CalendarPickerProps {
  
  @scala.inline
  def apply(): CalendarPickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarPickerProps]
  }
  
  @scala.inline
  implicit class CalendarPickerPropsOps[Self <: CalendarPickerProps] (val x: Self) extends AnyVal {
    
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
    def setAllowBackwardRangeSelect(value: Boolean): Self = this.set("allowBackwardRangeSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowBackwardRangeSelect: Self = this.set("allowBackwardRangeSelect", js.undefined)
    
    @scala.inline
    def setAllowRangeSelection(value: Boolean): Self = this.set("allowRangeSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowRangeSelection: Self = this.set("allowRangeSelection", js.undefined)
    
    @scala.inline
    def setCustomDatesStylesVarargs(value: CustomDateStyle*): Self = this.set("customDatesStyles", js.Array(value :_*))
    
    @scala.inline
    def setCustomDatesStylesFunction1(value: /* date */ Moment => ContainerStyle): Self = this.set("customDatesStyles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomDatesStyles(value: js.Array[CustomDateStyle] | CustomDatesStylesFunc): Self = this.set("customDatesStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomDatesStyles: Self = this.set("customDatesStyles", js.undefined)
    
    @scala.inline
    def setCustomDayHeaderStyles(value: /* date */ CustomDayHeaderStylesFuncDateArg => Style): Self = this.set("customDayHeaderStyles", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomDayHeaderStyles: Self = this.set("customDayHeaderStyles", js.undefined)
    
    @scala.inline
    def setDayLabelsWrapper(value: StyleProp[ViewStyle]): Self = this.set("dayLabelsWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayLabelsWrapper: Self = this.set("dayLabelsWrapper", js.undefined)
    
    @scala.inline
    def setDayLabelsWrapperNull: Self = this.set("dayLabelsWrapper", null)
    
    @scala.inline
    def setDayShape(value: circle | square): Self = this.set("dayShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayShape: Self = this.set("dayShape", js.undefined)
    
    @scala.inline
    def setDisabledDatesVarargs(value: Date*): Self = this.set("disabledDates", js.Array(value :_*))
    
    @scala.inline
    def setDisabledDatesFunction1(value: /* date */ Moment => Boolean): Self = this.set("disabledDates", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisabledDates(value: js.Array[Date] | DisabledDatesFunc): Self = this.set("disabledDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledDates: Self = this.set("disabledDates", js.undefined)
    
    @scala.inline
    def setDisabledDatesTextStyle(value: StyleProp[TextStyle]): Self = this.set("disabledDatesTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledDatesTextStyle: Self = this.set("disabledDatesTextStyle", js.undefined)
    
    @scala.inline
    def setDisabledDatesTextStyleNull: Self = this.set("disabledDatesTextStyle", null)
    
    @scala.inline
    def setEnableDateChange(value: Boolean): Self = this.set("enableDateChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDateChange: Self = this.set("enableDateChange", js.undefined)
    
    @scala.inline
    def setHeadingLevel(value: Double): Self = this.set("headingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadingLevel: Self = this.set("headingLevel", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    
    @scala.inline
    def setInitialDate(value: Date): Self = this.set("initialDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialDate: Self = this.set("initialDate", js.undefined)
    
    @scala.inline
    def setMaxDate(value: Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMaxRangeDurationVarargs(value: MaxDurationArrayItem*): Self = this.set("maxRangeDuration", js.Array(value :_*))
    
    @scala.inline
    def setMaxRangeDuration(value: Double | js.Array[MaxDurationArrayItem]): Self = this.set("maxRangeDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRangeDuration: Self = this.set("maxRangeDuration", js.undefined)
    
    @scala.inline
    def setMinDate(value: Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setMinRangeDurationVarargs(value: MinDurationArrayItem*): Self = this.set("minRangeDuration", js.Array(value :_*))
    
    @scala.inline
    def setMinRangeDuration(value: Double | js.Array[MinDurationArrayItem]): Self = this.set("minRangeDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinRangeDuration: Self = this.set("minRangeDuration", js.undefined)
    
    @scala.inline
    def setMonthYearHeaderWrapperStyle(value: StyleProp[ViewStyle]): Self = this.set("monthYearHeaderWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthYearHeaderWrapperStyle: Self = this.set("monthYearHeaderWrapperStyle", js.undefined)
    
    @scala.inline
    def setMonthYearHeaderWrapperStyleNull: Self = this.set("monthYearHeaderWrapperStyle", null)
    
    @scala.inline
    def setMonthsVarargs(value: String*): Self = this.set("months", js.Array(value :_*))
    
    @scala.inline
    def setMonths(value: js.Array[String]): Self = this.set("months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonths: Self = this.set("months", js.undefined)
    
    @scala.inline
    def setNextComponent(value: ReactNode): Self = this.set("nextComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextComponent: Self = this.set("nextComponent", js.undefined)
    
    @scala.inline
    def setNextTitle(value: String): Self = this.set("nextTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextTitle: Self = this.set("nextTitle", js.undefined)
    
    @scala.inline
    def setNextTitleStyle(value: StyleProp[TextStyle]): Self = this.set("nextTitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextTitleStyle: Self = this.set("nextTitleStyle", js.undefined)
    
    @scala.inline
    def setNextTitleStyleNull: Self = this.set("nextTitleStyle", null)
    
    @scala.inline
    def setOnDateChange(value: (/* date */ Moment, /* type */ START_DATE | END_DATE) => Unit): Self = this.set("onDateChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDateChange: Self = this.set("onDateChange", js.undefined)
    
    @scala.inline
    def setOnMonthChange(value: (/* date */ Moment, /* type */ START_DATE | END_DATE) => Unit): Self = this.set("onMonthChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMonthChange: Self = this.set("onMonthChange", js.undefined)
    
    @scala.inline
    def setPreviousComponent(value: ReactNode): Self = this.set("previousComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousComponent: Self = this.set("previousComponent", js.undefined)
    
    @scala.inline
    def setPreviousTitle(value: String): Self = this.set("previousTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousTitle: Self = this.set("previousTitle", js.undefined)
    
    @scala.inline
    def setPreviousTitleStyle(value: StyleProp[TextStyle]): Self = this.set("previousTitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousTitleStyle: Self = this.set("previousTitleStyle", js.undefined)
    
    @scala.inline
    def setPreviousTitleStyleNull: Self = this.set("previousTitleStyle", null)
    
    @scala.inline
    def setRestrictMonthNavigation(value: Boolean): Self = this.set("restrictMonthNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictMonthNavigation: Self = this.set("restrictMonthNavigation", js.undefined)
    
    @scala.inline
    def setScaleFactor(value: Double): Self = this.set("scaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleFactor: Self = this.set("scaleFactor", js.undefined)
    
    @scala.inline
    def setScrollable(value: Boolean): Self = this.set("scrollable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollable: Self = this.set("scrollable", js.undefined)
    
    @scala.inline
    def setSelectedDayColor(value: String): Self = this.set("selectedDayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedDayColor: Self = this.set("selectedDayColor", js.undefined)
    
    @scala.inline
    def setSelectedDayStyle(value: StyleProp[ViewStyle]): Self = this.set("selectedDayStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedDayStyle: Self = this.set("selectedDayStyle", js.undefined)
    
    @scala.inline
    def setSelectedDayStyleNull: Self = this.set("selectedDayStyle", null)
    
    @scala.inline
    def setSelectedDayTextColor(value: String): Self = this.set("selectedDayTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedDayTextColor: Self = this.set("selectedDayTextColor", js.undefined)
    
    @scala.inline
    def setSelectedEndDate(value: Date): Self = this.set("selectedEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedEndDate: Self = this.set("selectedEndDate", js.undefined)
    
    @scala.inline
    def setSelectedRangeEndStyle(value: StyleProp[ViewStyle]): Self = this.set("selectedRangeEndStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedRangeEndStyle: Self = this.set("selectedRangeEndStyle", js.undefined)
    
    @scala.inline
    def setSelectedRangeEndStyleNull: Self = this.set("selectedRangeEndStyle", null)
    
    @scala.inline
    def setSelectedRangeStartStyle(value: StyleProp[ViewStyle]): Self = this.set("selectedRangeStartStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedRangeStartStyle: Self = this.set("selectedRangeStartStyle", js.undefined)
    
    @scala.inline
    def setSelectedRangeStartStyleNull: Self = this.set("selectedRangeStartStyle", null)
    
    @scala.inline
    def setSelectedRangeStyle(value: StyleProp[ViewStyle]): Self = this.set("selectedRangeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedRangeStyle: Self = this.set("selectedRangeStyle", js.undefined)
    
    @scala.inline
    def setSelectedRangeStyleNull: Self = this.set("selectedRangeStyle", null)
    
    @scala.inline
    def setSelectedStartDate(value: Date): Self = this.set("selectedStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedStartDate: Self = this.set("selectedStartDate", js.undefined)
    
    @scala.inline
    def setShowDayStragglers(value: Boolean): Self = this.set("showDayStragglers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDayStragglers: Self = this.set("showDayStragglers", js.undefined)
    
    @scala.inline
    def setStartFromMonday(value: Boolean): Self = this.set("startFromMonday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartFromMonday: Self = this.set("startFromMonday", js.undefined)
    
    @scala.inline
    def setTextStyle(value: StyleProp[TextStyle]): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    
    @scala.inline
    def setTextStyleNull: Self = this.set("textStyle", null)
    
    @scala.inline
    def setTodayBackgroundColor(value: String): Self = this.set("todayBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTodayBackgroundColor: Self = this.set("todayBackgroundColor", js.undefined)
    
    @scala.inline
    def setTodayTextStyle(value: StyleProp[TextStyle]): Self = this.set("todayTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTodayTextStyle: Self = this.set("todayTextStyle", js.undefined)
    
    @scala.inline
    def setTodayTextStyleNull: Self = this.set("todayTextStyle", null)
    
    @scala.inline
    def setWeekdaysVarargs(value: String*): Self = this.set("weekdays", js.Array(value :_*))
    
    @scala.inline
    def setWeekdays(value: js.Array[String]): Self = this.set("weekdays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekdays: Self = this.set("weekdays", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
