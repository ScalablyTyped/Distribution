package typings.reactNativeCalendarPicker

import typings.moment.mod.Moment
import typings.moment.mod.MomentInput
import typings.react.mod.Component
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-calendar-picker", JSImport.Default)
  @js.native
  class default () extends CalendarPicker
  
  @js.native
  trait CalendarPicker
    extends Component[CalendarPickerProps, js.Object, js.Any] {
    
    def handleOnPressDay(date: HandleOnPressDayArg): Unit = js.native
    
    def handleOnPressNext(): Unit = js.native
    
    def handleOnPressPrevious(): Unit = js.native
    
    def resetSelections(): Unit = js.native
  }
  
  trait CalendarPickerProps extends StObject {
    
    var allowBackwardRangeSelect: js.UndefOr[Boolean] = js.undefined
    
    var allowRangeSelection: js.UndefOr[Boolean] = js.undefined
    
    var customDatesStyles: js.UndefOr[js.Array[CustomDateStyle] | CustomDatesStylesFunc] = js.undefined
    
    var customDayHeaderStyles: js.UndefOr[CustomDayHeaderStylesFunc] = js.undefined
    
    var dayLabelsWrapper: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var dayShape: js.UndefOr[circle | square] = js.undefined
    
    var disabledDates: js.UndefOr[js.Array[Date] | DisabledDatesFunc] = js.undefined
    
    var disabledDatesTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var enableDateChange: js.UndefOr[Boolean] = js.undefined
    
    var headingLevel: js.UndefOr[Double] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var initialDate: js.UndefOr[Date] = js.undefined
    
    var maxDate: js.UndefOr[Date] = js.undefined
    
    var maxRangeDuration: js.UndefOr[Double | js.Array[MaxDurationArrayItem]] = js.undefined
    
    var minDate: js.UndefOr[Date] = js.undefined
    
    var minRangeDuration: js.UndefOr[Double | js.Array[MinDurationArrayItem]] = js.undefined
    
    var monthYearHeaderWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var months: js.UndefOr[js.Array[String]] = js.undefined
    
    var nextComponent: js.UndefOr[ReactNode] = js.undefined
    
    var nextTitle: js.UndefOr[String] = js.undefined
    
    var nextTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var onDateChange: js.UndefOr[DateChangedCallback] = js.undefined
    
    var onMonthChange: js.UndefOr[DateChangedCallback] = js.undefined
    
    var previousComponent: js.UndefOr[ReactNode] = js.undefined
    
    var previousTitle: js.UndefOr[String] = js.undefined
    
    var previousTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var restrictMonthNavigation: js.UndefOr[Boolean] = js.undefined
    
    var scaleFactor: js.UndefOr[Double] = js.undefined
    
    var scrollable: js.UndefOr[Boolean] = js.undefined
    
    var selectedDayColor: js.UndefOr[String] = js.undefined
    
    var selectedDayStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var selectedDayTextColor: js.UndefOr[String] = js.undefined
    
    var selectedEndDate: js.UndefOr[Date] = js.undefined
    
    var selectedRangeEndStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var selectedRangeStartStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var selectedRangeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var selectedStartDate: js.UndefOr[Date] = js.undefined
    
    var showDayStragglers: js.UndefOr[Boolean] = js.undefined
    
    var startFromMonday: js.UndefOr[Boolean] = js.undefined
    
    var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var todayBackgroundColor: js.UndefOr[String] = js.undefined
    
    var todayTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var weekdays: js.UndefOr[js.Array[String]] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object CalendarPickerProps {
    
    inline def apply(): CalendarPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarPickerProps]
    }
    
    extension [Self <: CalendarPickerProps](x: Self) {
      
      inline def setAllowBackwardRangeSelect(value: Boolean): Self = StObject.set(x, "allowBackwardRangeSelect", value.asInstanceOf[js.Any])
      
      inline def setAllowBackwardRangeSelectUndefined: Self = StObject.set(x, "allowBackwardRangeSelect", js.undefined)
      
      inline def setAllowRangeSelection(value: Boolean): Self = StObject.set(x, "allowRangeSelection", value.asInstanceOf[js.Any])
      
      inline def setAllowRangeSelectionUndefined: Self = StObject.set(x, "allowRangeSelection", js.undefined)
      
      inline def setCustomDatesStyles(value: js.Array[CustomDateStyle] | CustomDatesStylesFunc): Self = StObject.set(x, "customDatesStyles", value.asInstanceOf[js.Any])
      
      inline def setCustomDatesStylesFunction1(value: /* date */ Moment => ContainerStyle): Self = StObject.set(x, "customDatesStyles", js.Any.fromFunction1(value))
      
      inline def setCustomDatesStylesUndefined: Self = StObject.set(x, "customDatesStyles", js.undefined)
      
      inline def setCustomDatesStylesVarargs(value: CustomDateStyle*): Self = StObject.set(x, "customDatesStyles", js.Array(value :_*))
      
      inline def setCustomDayHeaderStyles(value: /* date */ CustomDayHeaderStylesFuncDateArg => Style): Self = StObject.set(x, "customDayHeaderStyles", js.Any.fromFunction1(value))
      
      inline def setCustomDayHeaderStylesUndefined: Self = StObject.set(x, "customDayHeaderStyles", js.undefined)
      
      inline def setDayLabelsWrapper(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dayLabelsWrapper", value.asInstanceOf[js.Any])
      
      inline def setDayLabelsWrapperNull: Self = StObject.set(x, "dayLabelsWrapper", null)
      
      inline def setDayLabelsWrapperUndefined: Self = StObject.set(x, "dayLabelsWrapper", js.undefined)
      
      inline def setDayShape(value: circle | square): Self = StObject.set(x, "dayShape", value.asInstanceOf[js.Any])
      
      inline def setDayShapeUndefined: Self = StObject.set(x, "dayShape", js.undefined)
      
      inline def setDisabledDates(value: js.Array[Date] | DisabledDatesFunc): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
      
      inline def setDisabledDatesFunction1(value: /* date */ Moment => Boolean): Self = StObject.set(x, "disabledDates", js.Any.fromFunction1(value))
      
      inline def setDisabledDatesTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "disabledDatesTextStyle", value.asInstanceOf[js.Any])
      
      inline def setDisabledDatesTextStyleNull: Self = StObject.set(x, "disabledDatesTextStyle", null)
      
      inline def setDisabledDatesTextStyleUndefined: Self = StObject.set(x, "disabledDatesTextStyle", js.undefined)
      
      inline def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
      
      inline def setDisabledDatesVarargs(value: Date*): Self = StObject.set(x, "disabledDates", js.Array(value :_*))
      
      inline def setEnableDateChange(value: Boolean): Self = StObject.set(x, "enableDateChange", value.asInstanceOf[js.Any])
      
      inline def setEnableDateChangeUndefined: Self = StObject.set(x, "enableDateChange", js.undefined)
      
      inline def setHeadingLevel(value: Double): Self = StObject.set(x, "headingLevel", value.asInstanceOf[js.Any])
      
      inline def setHeadingLevelUndefined: Self = StObject.set(x, "headingLevel", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setInitialDate(value: Date): Self = StObject.set(x, "initialDate", value.asInstanceOf[js.Any])
      
      inline def setInitialDateUndefined: Self = StObject.set(x, "initialDate", js.undefined)
      
      inline def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMaxRangeDuration(value: Double | js.Array[MaxDurationArrayItem]): Self = StObject.set(x, "maxRangeDuration", value.asInstanceOf[js.Any])
      
      inline def setMaxRangeDurationUndefined: Self = StObject.set(x, "maxRangeDuration", js.undefined)
      
      inline def setMaxRangeDurationVarargs(value: MaxDurationArrayItem*): Self = StObject.set(x, "maxRangeDuration", js.Array(value :_*))
      
      inline def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMinRangeDuration(value: Double | js.Array[MinDurationArrayItem]): Self = StObject.set(x, "minRangeDuration", value.asInstanceOf[js.Any])
      
      inline def setMinRangeDurationUndefined: Self = StObject.set(x, "minRangeDuration", js.undefined)
      
      inline def setMinRangeDurationVarargs(value: MinDurationArrayItem*): Self = StObject.set(x, "minRangeDuration", js.Array(value :_*))
      
      inline def setMonthYearHeaderWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "monthYearHeaderWrapperStyle", value.asInstanceOf[js.Any])
      
      inline def setMonthYearHeaderWrapperStyleNull: Self = StObject.set(x, "monthYearHeaderWrapperStyle", null)
      
      inline def setMonthYearHeaderWrapperStyleUndefined: Self = StObject.set(x, "monthYearHeaderWrapperStyle", js.undefined)
      
      inline def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
      
      inline def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value :_*))
      
      inline def setNextComponent(value: ReactNode): Self = StObject.set(x, "nextComponent", value.asInstanceOf[js.Any])
      
      inline def setNextComponentUndefined: Self = StObject.set(x, "nextComponent", js.undefined)
      
      inline def setNextTitle(value: String): Self = StObject.set(x, "nextTitle", value.asInstanceOf[js.Any])
      
      inline def setNextTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "nextTitleStyle", value.asInstanceOf[js.Any])
      
      inline def setNextTitleStyleNull: Self = StObject.set(x, "nextTitleStyle", null)
      
      inline def setNextTitleStyleUndefined: Self = StObject.set(x, "nextTitleStyle", js.undefined)
      
      inline def setNextTitleUndefined: Self = StObject.set(x, "nextTitle", js.undefined)
      
      inline def setOnDateChange(value: (/* date */ Moment, /* type */ START_DATE | END_DATE) => Unit): Self = StObject.set(x, "onDateChange", js.Any.fromFunction2(value))
      
      inline def setOnDateChangeUndefined: Self = StObject.set(x, "onDateChange", js.undefined)
      
      inline def setOnMonthChange(value: (/* date */ Moment, /* type */ START_DATE | END_DATE) => Unit): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction2(value))
      
      inline def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
      
      inline def setPreviousComponent(value: ReactNode): Self = StObject.set(x, "previousComponent", value.asInstanceOf[js.Any])
      
      inline def setPreviousComponentUndefined: Self = StObject.set(x, "previousComponent", js.undefined)
      
      inline def setPreviousTitle(value: String): Self = StObject.set(x, "previousTitle", value.asInstanceOf[js.Any])
      
      inline def setPreviousTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "previousTitleStyle", value.asInstanceOf[js.Any])
      
      inline def setPreviousTitleStyleNull: Self = StObject.set(x, "previousTitleStyle", null)
      
      inline def setPreviousTitleStyleUndefined: Self = StObject.set(x, "previousTitleStyle", js.undefined)
      
      inline def setPreviousTitleUndefined: Self = StObject.set(x, "previousTitle", js.undefined)
      
      inline def setRestrictMonthNavigation(value: Boolean): Self = StObject.set(x, "restrictMonthNavigation", value.asInstanceOf[js.Any])
      
      inline def setRestrictMonthNavigationUndefined: Self = StObject.set(x, "restrictMonthNavigation", js.undefined)
      
      inline def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
      
      inline def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
      
      inline def setScrollable(value: Boolean): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
      
      inline def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
      
      inline def setSelectedDayColor(value: String): Self = StObject.set(x, "selectedDayColor", value.asInstanceOf[js.Any])
      
      inline def setSelectedDayColorUndefined: Self = StObject.set(x, "selectedDayColor", js.undefined)
      
      inline def setSelectedDayStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "selectedDayStyle", value.asInstanceOf[js.Any])
      
      inline def setSelectedDayStyleNull: Self = StObject.set(x, "selectedDayStyle", null)
      
      inline def setSelectedDayStyleUndefined: Self = StObject.set(x, "selectedDayStyle", js.undefined)
      
      inline def setSelectedDayTextColor(value: String): Self = StObject.set(x, "selectedDayTextColor", value.asInstanceOf[js.Any])
      
      inline def setSelectedDayTextColorUndefined: Self = StObject.set(x, "selectedDayTextColor", js.undefined)
      
      inline def setSelectedEndDate(value: Date): Self = StObject.set(x, "selectedEndDate", value.asInstanceOf[js.Any])
      
      inline def setSelectedEndDateUndefined: Self = StObject.set(x, "selectedEndDate", js.undefined)
      
      inline def setSelectedRangeEndStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "selectedRangeEndStyle", value.asInstanceOf[js.Any])
      
      inline def setSelectedRangeEndStyleNull: Self = StObject.set(x, "selectedRangeEndStyle", null)
      
      inline def setSelectedRangeEndStyleUndefined: Self = StObject.set(x, "selectedRangeEndStyle", js.undefined)
      
      inline def setSelectedRangeStartStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "selectedRangeStartStyle", value.asInstanceOf[js.Any])
      
      inline def setSelectedRangeStartStyleNull: Self = StObject.set(x, "selectedRangeStartStyle", null)
      
      inline def setSelectedRangeStartStyleUndefined: Self = StObject.set(x, "selectedRangeStartStyle", js.undefined)
      
      inline def setSelectedRangeStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "selectedRangeStyle", value.asInstanceOf[js.Any])
      
      inline def setSelectedRangeStyleNull: Self = StObject.set(x, "selectedRangeStyle", null)
      
      inline def setSelectedRangeStyleUndefined: Self = StObject.set(x, "selectedRangeStyle", js.undefined)
      
      inline def setSelectedStartDate(value: Date): Self = StObject.set(x, "selectedStartDate", value.asInstanceOf[js.Any])
      
      inline def setSelectedStartDateUndefined: Self = StObject.set(x, "selectedStartDate", js.undefined)
      
      inline def setShowDayStragglers(value: Boolean): Self = StObject.set(x, "showDayStragglers", value.asInstanceOf[js.Any])
      
      inline def setShowDayStragglersUndefined: Self = StObject.set(x, "showDayStragglers", js.undefined)
      
      inline def setStartFromMonday(value: Boolean): Self = StObject.set(x, "startFromMonday", value.asInstanceOf[js.Any])
      
      inline def setStartFromMondayUndefined: Self = StObject.set(x, "startFromMonday", js.undefined)
      
      inline def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      inline def setTodayBackgroundColor(value: String): Self = StObject.set(x, "todayBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setTodayBackgroundColorUndefined: Self = StObject.set(x, "todayBackgroundColor", js.undefined)
      
      inline def setTodayTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "todayTextStyle", value.asInstanceOf[js.Any])
      
      inline def setTodayTextStyleNull: Self = StObject.set(x, "todayTextStyle", null)
      
      inline def setTodayTextStyleUndefined: Self = StObject.set(x, "todayTextStyle", js.undefined)
      
      inline def setWeekdays(value: js.Array[String]): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
      
      inline def setWeekdaysUndefined: Self = StObject.set(x, "weekdays", js.undefined)
      
      inline def setWeekdaysVarargs(value: String*): Self = StObject.set(x, "weekdays", js.Array(value :_*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait CustomDateStyle extends StObject {
    
    var containerStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var date: MomentParsable
    
    var style: js.UndefOr[ViewStyle] = js.undefined
    
    var textStyle: js.UndefOr[TextStyle] = js.undefined
  }
  object CustomDateStyle {
    
    inline def apply(date: MomentParsable): CustomDateStyle = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomDateStyle]
    }
    
    extension [Self <: CustomDateStyle](x: Self) {
      
      inline def setContainerStyle(value: ViewStyle): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setDate(value: MomentParsable): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateVarargs(value: (Double | String)*): Self = StObject.set(x, "date", js.Array(value :_*))
      
      inline def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    }
  }
  
  type CustomDatesStylesFunc = js.Function1[/* date */ Moment, ContainerStyle]
  
  type CustomDayHeaderStylesFunc = js.Function1[/* date */ CustomDayHeaderStylesFuncDateArg, Style]
  
  trait CustomDayHeaderStylesFuncDateArg extends StObject {
    
    var dayOfWeek: Double
    
    var month: Double
    
    var year: Double
  }
  object CustomDayHeaderStylesFuncDateArg {
    
    inline def apply(dayOfWeek: Double, month: Double, year: Double): CustomDayHeaderStylesFuncDateArg = {
      val __obj = js.Dynamic.literal(dayOfWeek = dayOfWeek.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomDayHeaderStylesFuncDateArg]
    }
    
    extension [Self <: CustomDayHeaderStylesFuncDateArg](x: Self) {
      
      inline def setDayOfWeek(value: Double): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  type DateChangedCallback = js.Function2[/* date */ Moment, /* type */ START_DATE | END_DATE, Unit]
  
  /* Inlined {[ key in '0' | '1' | '2' | '3' | '4' | '5' | '6' ]:? react-native.react-native.TextStyle} */
  trait DayOfWeekStyle extends StObject {
    
    var `0`: js.UndefOr[TextStyle] = js.undefined
    
    var `1`: js.UndefOr[TextStyle] = js.undefined
    
    var `2`: js.UndefOr[TextStyle] = js.undefined
    
    var `3`: js.UndefOr[TextStyle] = js.undefined
    
    var `4`: js.UndefOr[TextStyle] = js.undefined
    
    var `5`: js.UndefOr[TextStyle] = js.undefined
    
    var `6`: js.UndefOr[TextStyle] = js.undefined
  }
  object DayOfWeekStyle {
    
    inline def apply(): DayOfWeekStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DayOfWeekStyle]
    }
    
    extension [Self <: DayOfWeekStyle](x: Self) {
      
      inline def set0(value: TextStyle): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      inline def set0Undefined: Self = StObject.set(x, "0", js.undefined)
      
      inline def set1(value: TextStyle): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      inline def set1Undefined: Self = StObject.set(x, "1", js.undefined)
      
      inline def set2(value: TextStyle): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      inline def set2Undefined: Self = StObject.set(x, "2", js.undefined)
      
      inline def set3(value: TextStyle): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
      
      inline def set3Undefined: Self = StObject.set(x, "3", js.undefined)
      
      inline def set4(value: TextStyle): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
      
      inline def set4Undefined: Self = StObject.set(x, "4", js.undefined)
      
      inline def set5(value: TextStyle): Self = StObject.set(x, "5", value.asInstanceOf[js.Any])
      
      inline def set5Undefined: Self = StObject.set(x, "5", js.undefined)
      
      inline def set6(value: TextStyle): Self = StObject.set(x, "6", value.asInstanceOf[js.Any])
      
      inline def set6Undefined: Self = StObject.set(x, "6", js.undefined)
    }
  }
  
  type DisabledDatesFunc = js.Function1[/* date */ Moment, Boolean]
  
  trait HandleOnPressDayArg extends StObject {
    
    var day: Double
    
    var month: Double
    
    var year: Double
  }
  object HandleOnPressDayArg {
    
    inline def apply(day: Double, month: Double, year: Double): HandleOnPressDayArg = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandleOnPressDayArg]
    }
    
    extension [Self <: HandleOnPressDayArg](x: Self) {
      
      inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaxDurationArrayItem extends StObject {
    
    var date: MomentParsable
    
    var maxDuration: Double
  }
  object MaxDurationArrayItem {
    
    inline def apply(date: MomentParsable, maxDuration: Double): MaxDurationArrayItem = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], maxDuration = maxDuration.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxDurationArrayItem]
    }
    
    extension [Self <: MaxDurationArrayItem](x: Self) {
      
      inline def setDate(value: MomentParsable): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateVarargs(value: (Double | String)*): Self = StObject.set(x, "date", js.Array(value :_*))
      
      inline def setMaxDuration(value: Double): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
    }
  }
  
  trait MinDurationArrayItem extends StObject {
    
    var date: MomentParsable
    
    var minDuration: Double
  }
  object MinDurationArrayItem {
    
    inline def apply(date: MomentParsable, minDuration: Double): MinDurationArrayItem = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], minDuration = minDuration.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinDurationArrayItem]
    }
    
    extension [Self <: MinDurationArrayItem](x: Self) {
      
      inline def setDate(value: MomentParsable): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateVarargs(value: (Double | String)*): Self = StObject.set(x, "date", js.Array(value :_*))
      
      inline def setMinDuration(value: Double): Self = StObject.set(x, "minDuration", value.asInstanceOf[js.Any])
    }
  }
  
  type MomentParsable = MomentInput
  
  type MonthChangedCallback = js.Function1[/* date */ Moment, Unit]
}
