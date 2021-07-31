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
    
    @scala.inline
    def apply(): CalendarPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarPickerProps]
    }
    
    @scala.inline
    implicit class CalendarPickerPropsMutableBuilder[Self <: CalendarPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowBackwardRangeSelect(value: Boolean): Self = StObject.set(x, "allowBackwardRangeSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowBackwardRangeSelectUndefined: Self = StObject.set(x, "allowBackwardRangeSelect", js.undefined)
      
      @scala.inline
      def setAllowRangeSelection(value: Boolean): Self = StObject.set(x, "allowRangeSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowRangeSelectionUndefined: Self = StObject.set(x, "allowRangeSelection", js.undefined)
      
      @scala.inline
      def setCustomDatesStyles(value: js.Array[CustomDateStyle] | CustomDatesStylesFunc): Self = StObject.set(x, "customDatesStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomDatesStylesFunction1(value: /* date */ Moment => ContainerStyle): Self = StObject.set(x, "customDatesStyles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomDatesStylesUndefined: Self = StObject.set(x, "customDatesStyles", js.undefined)
      
      @scala.inline
      def setCustomDatesStylesVarargs(value: CustomDateStyle*): Self = StObject.set(x, "customDatesStyles", js.Array(value :_*))
      
      @scala.inline
      def setCustomDayHeaderStyles(value: /* date */ CustomDayHeaderStylesFuncDateArg => Style): Self = StObject.set(x, "customDayHeaderStyles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomDayHeaderStylesUndefined: Self = StObject.set(x, "customDayHeaderStyles", js.undefined)
      
      @scala.inline
      def setDayLabelsWrapper(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dayLabelsWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayLabelsWrapperNull: Self = StObject.set(x, "dayLabelsWrapper", null)
      
      @scala.inline
      def setDayLabelsWrapperUndefined: Self = StObject.set(x, "dayLabelsWrapper", js.undefined)
      
      @scala.inline
      def setDayShape(value: circle | square): Self = StObject.set(x, "dayShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayShapeUndefined: Self = StObject.set(x, "dayShape", js.undefined)
      
      @scala.inline
      def setDisabledDates(value: js.Array[Date] | DisabledDatesFunc): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDatesFunction1(value: /* date */ Moment => Boolean): Self = StObject.set(x, "disabledDates", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledDatesTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "disabledDatesTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDatesTextStyleNull: Self = StObject.set(x, "disabledDatesTextStyle", null)
      
      @scala.inline
      def setDisabledDatesTextStyleUndefined: Self = StObject.set(x, "disabledDatesTextStyle", js.undefined)
      
      @scala.inline
      def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
      
      @scala.inline
      def setDisabledDatesVarargs(value: Date*): Self = StObject.set(x, "disabledDates", js.Array(value :_*))
      
      @scala.inline
      def setEnableDateChange(value: Boolean): Self = StObject.set(x, "enableDateChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableDateChangeUndefined: Self = StObject.set(x, "enableDateChange", js.undefined)
      
      @scala.inline
      def setHeadingLevel(value: Double): Self = StObject.set(x, "headingLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadingLevelUndefined: Self = StObject.set(x, "headingLevel", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setInitialDate(value: Date): Self = StObject.set(x, "initialDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialDateUndefined: Self = StObject.set(x, "initialDate", js.undefined)
      
      @scala.inline
      def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMaxRangeDuration(value: Double | js.Array[MaxDurationArrayItem]): Self = StObject.set(x, "maxRangeDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRangeDurationUndefined: Self = StObject.set(x, "maxRangeDuration", js.undefined)
      
      @scala.inline
      def setMaxRangeDurationVarargs(value: MaxDurationArrayItem*): Self = StObject.set(x, "maxRangeDuration", js.Array(value :_*))
      
      @scala.inline
      def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setMinRangeDuration(value: Double | js.Array[MinDurationArrayItem]): Self = StObject.set(x, "minRangeDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinRangeDurationUndefined: Self = StObject.set(x, "minRangeDuration", js.undefined)
      
      @scala.inline
      def setMinRangeDurationVarargs(value: MinDurationArrayItem*): Self = StObject.set(x, "minRangeDuration", js.Array(value :_*))
      
      @scala.inline
      def setMonthYearHeaderWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "monthYearHeaderWrapperStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthYearHeaderWrapperStyleNull: Self = StObject.set(x, "monthYearHeaderWrapperStyle", null)
      
      @scala.inline
      def setMonthYearHeaderWrapperStyleUndefined: Self = StObject.set(x, "monthYearHeaderWrapperStyle", js.undefined)
      
      @scala.inline
      def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
      
      @scala.inline
      def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value :_*))
      
      @scala.inline
      def setNextComponent(value: ReactNode): Self = StObject.set(x, "nextComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextComponentUndefined: Self = StObject.set(x, "nextComponent", js.undefined)
      
      @scala.inline
      def setNextTitle(value: String): Self = StObject.set(x, "nextTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "nextTitleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTitleStyleNull: Self = StObject.set(x, "nextTitleStyle", null)
      
      @scala.inline
      def setNextTitleStyleUndefined: Self = StObject.set(x, "nextTitleStyle", js.undefined)
      
      @scala.inline
      def setNextTitleUndefined: Self = StObject.set(x, "nextTitle", js.undefined)
      
      @scala.inline
      def setOnDateChange(value: (/* date */ Moment, /* type */ START_DATE | END_DATE) => Unit): Self = StObject.set(x, "onDateChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDateChangeUndefined: Self = StObject.set(x, "onDateChange", js.undefined)
      
      @scala.inline
      def setOnMonthChange(value: (/* date */ Moment, /* type */ START_DATE | END_DATE) => Unit): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
      
      @scala.inline
      def setPreviousComponent(value: ReactNode): Self = StObject.set(x, "previousComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousComponentUndefined: Self = StObject.set(x, "previousComponent", js.undefined)
      
      @scala.inline
      def setPreviousTitle(value: String): Self = StObject.set(x, "previousTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "previousTitleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousTitleStyleNull: Self = StObject.set(x, "previousTitleStyle", null)
      
      @scala.inline
      def setPreviousTitleStyleUndefined: Self = StObject.set(x, "previousTitleStyle", js.undefined)
      
      @scala.inline
      def setPreviousTitleUndefined: Self = StObject.set(x, "previousTitle", js.undefined)
      
      @scala.inline
      def setRestrictMonthNavigation(value: Boolean): Self = StObject.set(x, "restrictMonthNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestrictMonthNavigationUndefined: Self = StObject.set(x, "restrictMonthNavigation", js.undefined)
      
      @scala.inline
      def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
      
      @scala.inline
      def setScrollable(value: Boolean): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
      
      @scala.inline
      def setSelectedDayColor(value: String): Self = StObject.set(x, "selectedDayColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedDayColorUndefined: Self = StObject.set(x, "selectedDayColor", js.undefined)
      
      @scala.inline
      def setSelectedDayStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "selectedDayStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedDayStyleNull: Self = StObject.set(x, "selectedDayStyle", null)
      
      @scala.inline
      def setSelectedDayStyleUndefined: Self = StObject.set(x, "selectedDayStyle", js.undefined)
      
      @scala.inline
      def setSelectedDayTextColor(value: String): Self = StObject.set(x, "selectedDayTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedDayTextColorUndefined: Self = StObject.set(x, "selectedDayTextColor", js.undefined)
      
      @scala.inline
      def setSelectedEndDate(value: Date): Self = StObject.set(x, "selectedEndDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedEndDateUndefined: Self = StObject.set(x, "selectedEndDate", js.undefined)
      
      @scala.inline
      def setSelectedRangeEndStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "selectedRangeEndStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedRangeEndStyleNull: Self = StObject.set(x, "selectedRangeEndStyle", null)
      
      @scala.inline
      def setSelectedRangeEndStyleUndefined: Self = StObject.set(x, "selectedRangeEndStyle", js.undefined)
      
      @scala.inline
      def setSelectedRangeStartStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "selectedRangeStartStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedRangeStartStyleNull: Self = StObject.set(x, "selectedRangeStartStyle", null)
      
      @scala.inline
      def setSelectedRangeStartStyleUndefined: Self = StObject.set(x, "selectedRangeStartStyle", js.undefined)
      
      @scala.inline
      def setSelectedRangeStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "selectedRangeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedRangeStyleNull: Self = StObject.set(x, "selectedRangeStyle", null)
      
      @scala.inline
      def setSelectedRangeStyleUndefined: Self = StObject.set(x, "selectedRangeStyle", js.undefined)
      
      @scala.inline
      def setSelectedStartDate(value: Date): Self = StObject.set(x, "selectedStartDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedStartDateUndefined: Self = StObject.set(x, "selectedStartDate", js.undefined)
      
      @scala.inline
      def setShowDayStragglers(value: Boolean): Self = StObject.set(x, "showDayStragglers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDayStragglersUndefined: Self = StObject.set(x, "showDayStragglers", js.undefined)
      
      @scala.inline
      def setStartFromMonday(value: Boolean): Self = StObject.set(x, "startFromMonday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartFromMondayUndefined: Self = StObject.set(x, "startFromMonday", js.undefined)
      
      @scala.inline
      def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
      
      @scala.inline
      def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      @scala.inline
      def setTodayBackgroundColor(value: String): Self = StObject.set(x, "todayBackgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayBackgroundColorUndefined: Self = StObject.set(x, "todayBackgroundColor", js.undefined)
      
      @scala.inline
      def setTodayTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "todayTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayTextStyleNull: Self = StObject.set(x, "todayTextStyle", null)
      
      @scala.inline
      def setTodayTextStyleUndefined: Self = StObject.set(x, "todayTextStyle", js.undefined)
      
      @scala.inline
      def setWeekdays(value: js.Array[String]): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdaysUndefined: Self = StObject.set(x, "weekdays", js.undefined)
      
      @scala.inline
      def setWeekdaysVarargs(value: String*): Self = StObject.set(x, "weekdays", js.Array(value :_*))
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait CustomDateStyle extends StObject {
    
    var containerStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var date: MomentParsable
    
    var style: js.UndefOr[ViewStyle] = js.undefined
    
    var textStyle: js.UndefOr[TextStyle] = js.undefined
  }
  object CustomDateStyle {
    
    @scala.inline
    def apply(date: MomentParsable): CustomDateStyle = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomDateStyle]
    }
    
    @scala.inline
    implicit class CustomDateStyleMutableBuilder[Self <: CustomDateStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerStyle(value: ViewStyle): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      @scala.inline
      def setDate(value: MomentParsable): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateVarargs(value: (Double | String)*): Self = StObject.set(x, "date", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
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
    
    @scala.inline
    def apply(dayOfWeek: Double, month: Double, year: Double): CustomDayHeaderStylesFuncDateArg = {
      val __obj = js.Dynamic.literal(dayOfWeek = dayOfWeek.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomDayHeaderStylesFuncDateArg]
    }
    
    @scala.inline
    implicit class CustomDayHeaderStylesFuncDateArgMutableBuilder[Self <: CustomDayHeaderStylesFuncDateArg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDayOfWeek(value: Double): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(): DayOfWeekStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DayOfWeekStyle]
    }
    
    @scala.inline
    implicit class DayOfWeekStyleMutableBuilder[Self <: DayOfWeekStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set0(value: TextStyle): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set0Undefined: Self = StObject.set(x, "0", js.undefined)
      
      @scala.inline
      def set1(value: TextStyle): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set1Undefined: Self = StObject.set(x, "1", js.undefined)
      
      @scala.inline
      def set2(value: TextStyle): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set2Undefined: Self = StObject.set(x, "2", js.undefined)
      
      @scala.inline
      def set3(value: TextStyle): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set3Undefined: Self = StObject.set(x, "3", js.undefined)
      
      @scala.inline
      def set4(value: TextStyle): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set4Undefined: Self = StObject.set(x, "4", js.undefined)
      
      @scala.inline
      def set5(value: TextStyle): Self = StObject.set(x, "5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set5Undefined: Self = StObject.set(x, "5", js.undefined)
      
      @scala.inline
      def set6(value: TextStyle): Self = StObject.set(x, "6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set6Undefined: Self = StObject.set(x, "6", js.undefined)
    }
  }
  
  type DisabledDatesFunc = js.Function1[/* date */ Moment, Boolean]
  
  trait HandleOnPressDayArg extends StObject {
    
    var day: Double
    
    var month: Double
    
    var year: Double
  }
  object HandleOnPressDayArg {
    
    @scala.inline
    def apply(day: Double, month: Double, year: Double): HandleOnPressDayArg = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandleOnPressDayArg]
    }
    
    @scala.inline
    implicit class HandleOnPressDayArgMutableBuilder[Self <: HandleOnPressDayArg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaxDurationArrayItem extends StObject {
    
    var date: MomentParsable
    
    var maxDuration: Double
  }
  object MaxDurationArrayItem {
    
    @scala.inline
    def apply(date: MomentParsable, maxDuration: Double): MaxDurationArrayItem = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], maxDuration = maxDuration.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxDurationArrayItem]
    }
    
    @scala.inline
    implicit class MaxDurationArrayItemMutableBuilder[Self <: MaxDurationArrayItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: MomentParsable): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateVarargs(value: (Double | String)*): Self = StObject.set(x, "date", js.Array(value :_*))
      
      @scala.inline
      def setMaxDuration(value: Double): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
    }
  }
  
  trait MinDurationArrayItem extends StObject {
    
    var date: MomentParsable
    
    var minDuration: Double
  }
  object MinDurationArrayItem {
    
    @scala.inline
    def apply(date: MomentParsable, minDuration: Double): MinDurationArrayItem = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], minDuration = minDuration.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinDurationArrayItem]
    }
    
    @scala.inline
    implicit class MinDurationArrayItemMutableBuilder[Self <: MinDurationArrayItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: MomentParsable): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateVarargs(value: (Double | String)*): Self = StObject.set(x, "date", js.Array(value :_*))
      
      @scala.inline
      def setMinDuration(value: Double): Self = StObject.set(x, "minDuration", value.asInstanceOf[js.Any])
    }
  }
  
  type MomentParsable = MomentInput
  
  type MonthChangedCallback = js.Function1[/* date */ Moment, Unit]
}
