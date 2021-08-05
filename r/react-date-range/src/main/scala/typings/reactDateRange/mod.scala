package typings.reactDateRange

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.reactDateRange.anon.PartialClassNames
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-date-range", "Calendar")
  @js.native
  class Calendar protected ()
    extends Component[CalendarProps, js.Object, js.Any] {
    def this(props: CalendarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CalendarProps, context: js.Any) = this()
  }
  
  @JSImport("react-date-range", "DateRange")
  @js.native
  class DateRange protected ()
    extends Component[DateRangeProps, js.Object, js.Any] {
    def this(props: DateRangeProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DateRangeProps, context: js.Any) = this()
  }
  
  @JSImport("react-date-range", "DateRangePicker")
  @js.native
  class DateRangePicker protected ()
    extends Component[DateRangeProps, js.Object, js.Any] {
    def this(props: DateRangeProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DateRangeProps, context: js.Any) = this()
  }
  
  type AnyDate = String | Date
  
  trait CalendarProps
    extends StObject
       with CommonCalendarProps {
    
    /** default: today */
    var date: DateInputType
  }
  object CalendarProps {
    
    inline def apply(date: DateInputType): CalendarProps = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarProps]
    }
    
    extension [Self <: CalendarProps](x: Self) {
      
      inline def setDate(value: DateInputType): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateFunction1(value: /* now */ Date => AnyDate): Self = StObject.set(x, "date", js.Any.fromFunction1(value))
    }
  }
  
  trait CalendarTheme extends StObject {
    
    var Calendar: js.UndefOr[CSSProperties] = js.undefined
    
    var DateRange: js.UndefOr[CSSProperties] = js.undefined
    
    var Day: js.UndefOr[CSSProperties] = js.undefined
    
    var DayActive: js.UndefOr[CSSProperties] = js.undefined
    
    var DayEndEdge: js.UndefOr[CSSProperties] = js.undefined
    
    var DayHover: js.UndefOr[CSSProperties] = js.undefined
    
    var DayInRange: js.UndefOr[CSSProperties] = js.undefined
    
    var DayPassive: js.UndefOr[CSSProperties] = js.undefined
    
    var DaySelected: js.UndefOr[CSSProperties] = js.undefined
    
    var DaySpecialDay: js.UndefOr[CSSProperties] = js.undefined
    
    var DayStartEdge: js.UndefOr[CSSProperties] = js.undefined
    
    var DaySunday: js.UndefOr[CSSProperties] = js.undefined
    
    var DayToday: js.UndefOr[CSSProperties] = js.undefined
    
    var MonthAndYear: js.UndefOr[CSSProperties] = js.undefined
    
    var MonthArrow: js.UndefOr[CSSProperties] = js.undefined
    
    var MonthArrowNext: js.UndefOr[CSSProperties] = js.undefined
    
    var MonthArrowPrev: js.UndefOr[CSSProperties] = js.undefined
    
    var MonthButton: js.UndefOr[CSSProperties] = js.undefined
    
    var PredefinedRanges: js.UndefOr[CSSProperties] = js.undefined
    
    var PredefinedRangesItem: js.UndefOr[CSSProperties] = js.undefined
    
    var PredefinedRangesItemActive: js.UndefOr[CSSProperties] = js.undefined
    
    var Weekday: js.UndefOr[CSSProperties] = js.undefined
  }
  object CalendarTheme {
    
    inline def apply(): CalendarTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarTheme]
    }
    
    extension [Self <: CalendarTheme](x: Self) {
      
      inline def setCalendar(value: CSSProperties): Self = StObject.set(x, "Calendar", value.asInstanceOf[js.Any])
      
      inline def setCalendarUndefined: Self = StObject.set(x, "Calendar", js.undefined)
      
      inline def setDateRange(value: CSSProperties): Self = StObject.set(x, "DateRange", value.asInstanceOf[js.Any])
      
      inline def setDateRangeUndefined: Self = StObject.set(x, "DateRange", js.undefined)
      
      inline def setDay(value: CSSProperties): Self = StObject.set(x, "Day", value.asInstanceOf[js.Any])
      
      inline def setDayActive(value: CSSProperties): Self = StObject.set(x, "DayActive", value.asInstanceOf[js.Any])
      
      inline def setDayActiveUndefined: Self = StObject.set(x, "DayActive", js.undefined)
      
      inline def setDayEndEdge(value: CSSProperties): Self = StObject.set(x, "DayEndEdge", value.asInstanceOf[js.Any])
      
      inline def setDayEndEdgeUndefined: Self = StObject.set(x, "DayEndEdge", js.undefined)
      
      inline def setDayHover(value: CSSProperties): Self = StObject.set(x, "DayHover", value.asInstanceOf[js.Any])
      
      inline def setDayHoverUndefined: Self = StObject.set(x, "DayHover", js.undefined)
      
      inline def setDayInRange(value: CSSProperties): Self = StObject.set(x, "DayInRange", value.asInstanceOf[js.Any])
      
      inline def setDayInRangeUndefined: Self = StObject.set(x, "DayInRange", js.undefined)
      
      inline def setDayPassive(value: CSSProperties): Self = StObject.set(x, "DayPassive", value.asInstanceOf[js.Any])
      
      inline def setDayPassiveUndefined: Self = StObject.set(x, "DayPassive", js.undefined)
      
      inline def setDaySelected(value: CSSProperties): Self = StObject.set(x, "DaySelected", value.asInstanceOf[js.Any])
      
      inline def setDaySelectedUndefined: Self = StObject.set(x, "DaySelected", js.undefined)
      
      inline def setDaySpecialDay(value: CSSProperties): Self = StObject.set(x, "DaySpecialDay", value.asInstanceOf[js.Any])
      
      inline def setDaySpecialDayUndefined: Self = StObject.set(x, "DaySpecialDay", js.undefined)
      
      inline def setDayStartEdge(value: CSSProperties): Self = StObject.set(x, "DayStartEdge", value.asInstanceOf[js.Any])
      
      inline def setDayStartEdgeUndefined: Self = StObject.set(x, "DayStartEdge", js.undefined)
      
      inline def setDaySunday(value: CSSProperties): Self = StObject.set(x, "DaySunday", value.asInstanceOf[js.Any])
      
      inline def setDaySundayUndefined: Self = StObject.set(x, "DaySunday", js.undefined)
      
      inline def setDayToday(value: CSSProperties): Self = StObject.set(x, "DayToday", value.asInstanceOf[js.Any])
      
      inline def setDayTodayUndefined: Self = StObject.set(x, "DayToday", js.undefined)
      
      inline def setDayUndefined: Self = StObject.set(x, "Day", js.undefined)
      
      inline def setMonthAndYear(value: CSSProperties): Self = StObject.set(x, "MonthAndYear", value.asInstanceOf[js.Any])
      
      inline def setMonthAndYearUndefined: Self = StObject.set(x, "MonthAndYear", js.undefined)
      
      inline def setMonthArrow(value: CSSProperties): Self = StObject.set(x, "MonthArrow", value.asInstanceOf[js.Any])
      
      inline def setMonthArrowNext(value: CSSProperties): Self = StObject.set(x, "MonthArrowNext", value.asInstanceOf[js.Any])
      
      inline def setMonthArrowNextUndefined: Self = StObject.set(x, "MonthArrowNext", js.undefined)
      
      inline def setMonthArrowPrev(value: CSSProperties): Self = StObject.set(x, "MonthArrowPrev", value.asInstanceOf[js.Any])
      
      inline def setMonthArrowPrevUndefined: Self = StObject.set(x, "MonthArrowPrev", js.undefined)
      
      inline def setMonthArrowUndefined: Self = StObject.set(x, "MonthArrow", js.undefined)
      
      inline def setMonthButton(value: CSSProperties): Self = StObject.set(x, "MonthButton", value.asInstanceOf[js.Any])
      
      inline def setMonthButtonUndefined: Self = StObject.set(x, "MonthButton", js.undefined)
      
      inline def setPredefinedRanges(value: CSSProperties): Self = StObject.set(x, "PredefinedRanges", value.asInstanceOf[js.Any])
      
      inline def setPredefinedRangesItem(value: CSSProperties): Self = StObject.set(x, "PredefinedRangesItem", value.asInstanceOf[js.Any])
      
      inline def setPredefinedRangesItemActive(value: CSSProperties): Self = StObject.set(x, "PredefinedRangesItemActive", value.asInstanceOf[js.Any])
      
      inline def setPredefinedRangesItemActiveUndefined: Self = StObject.set(x, "PredefinedRangesItemActive", js.undefined)
      
      inline def setPredefinedRangesItemUndefined: Self = StObject.set(x, "PredefinedRangesItem", js.undefined)
      
      inline def setPredefinedRangesUndefined: Self = StObject.set(x, "PredefinedRanges", js.undefined)
      
      inline def setWeekday(value: CSSProperties): Self = StObject.set(x, "Weekday", value.asInstanceOf[js.Any])
      
      inline def setWeekdayUndefined: Self = StObject.set(x, "Weekday", js.undefined)
    }
  }
  
  trait ClassNames extends StObject {
    
    var calendarWrapper: String
    
    var dateDisplay: String
    
    var dateDisplayItem: String
    
    var dateDisplayItemActive: String
    
    var dateDisplayWrapper: String
    
    var dateRangePickerWrapper: String
    
    var dateRangeWrapper: String
    
    var day: String
    
    var dayActive: String
    
    var dayDisabled: String
    
    var dayEndOfMonth: String
    
    var dayEndOfWeek: String
    
    var dayEndPreview: String
    
    var dayHovered: String
    
    var dayInPreview: String
    
    var dayNumber: String
    
    var dayPassive: String
    
    var daySelected: String
    
    var dayStartOfMonth: String
    
    var dayStartOfWeek: String
    
    var dayStartPreview: String
    
    var dayToday: String
    
    var dayWeekend: String
    
    var days: String
    
    var definedRangesWrapper: String
    
    var endEdge: String
    
    var inRange: String
    
    var infiniteMonths: String
    
    var inputRange: String
    
    var inputRangeInput: String
    
    var inputRanges: String
    
    var month: String
    
    var monthAndYearPickers: String
    
    var monthAndYearWrapper: String
    
    var monthName: String
    
    var monthPicker: String
    
    var months: String
    
    var monthsHorizontal: String
    
    var monthsVertical: String
    
    var nextButton: String
    
    var nextPrevButton: String
    
    var prevButton: String
    
    var selected: String
    
    var startEdge: String
    
    var staticRange: String
    
    var staticRangeLabel: String
    
    var staticRangeSelected: String
    
    var staticRanges: String
    
    var weekDay: String
    
    var weekDays: String
    
    var yearPicker: String
  }
  object ClassNames {
    
    inline def apply(
      calendarWrapper: String,
      dateDisplay: String,
      dateDisplayItem: String,
      dateDisplayItemActive: String,
      dateDisplayWrapper: String,
      dateRangePickerWrapper: String,
      dateRangeWrapper: String,
      day: String,
      dayActive: String,
      dayDisabled: String,
      dayEndOfMonth: String,
      dayEndOfWeek: String,
      dayEndPreview: String,
      dayHovered: String,
      dayInPreview: String,
      dayNumber: String,
      dayPassive: String,
      daySelected: String,
      dayStartOfMonth: String,
      dayStartOfWeek: String,
      dayStartPreview: String,
      dayToday: String,
      dayWeekend: String,
      days: String,
      definedRangesWrapper: String,
      endEdge: String,
      inRange: String,
      infiniteMonths: String,
      inputRange: String,
      inputRangeInput: String,
      inputRanges: String,
      month: String,
      monthAndYearPickers: String,
      monthAndYearWrapper: String,
      monthName: String,
      monthPicker: String,
      months: String,
      monthsHorizontal: String,
      monthsVertical: String,
      nextButton: String,
      nextPrevButton: String,
      prevButton: String,
      selected: String,
      startEdge: String,
      staticRange: String,
      staticRangeLabel: String,
      staticRangeSelected: String,
      staticRanges: String,
      weekDay: String,
      weekDays: String,
      yearPicker: String
    ): ClassNames = {
      val __obj = js.Dynamic.literal(calendarWrapper = calendarWrapper.asInstanceOf[js.Any], dateDisplay = dateDisplay.asInstanceOf[js.Any], dateDisplayItem = dateDisplayItem.asInstanceOf[js.Any], dateDisplayItemActive = dateDisplayItemActive.asInstanceOf[js.Any], dateDisplayWrapper = dateDisplayWrapper.asInstanceOf[js.Any], dateRangePickerWrapper = dateRangePickerWrapper.asInstanceOf[js.Any], dateRangeWrapper = dateRangeWrapper.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], dayActive = dayActive.asInstanceOf[js.Any], dayDisabled = dayDisabled.asInstanceOf[js.Any], dayEndOfMonth = dayEndOfMonth.asInstanceOf[js.Any], dayEndOfWeek = dayEndOfWeek.asInstanceOf[js.Any], dayEndPreview = dayEndPreview.asInstanceOf[js.Any], dayHovered = dayHovered.asInstanceOf[js.Any], dayInPreview = dayInPreview.asInstanceOf[js.Any], dayNumber = dayNumber.asInstanceOf[js.Any], dayPassive = dayPassive.asInstanceOf[js.Any], daySelected = daySelected.asInstanceOf[js.Any], dayStartOfMonth = dayStartOfMonth.asInstanceOf[js.Any], dayStartOfWeek = dayStartOfWeek.asInstanceOf[js.Any], dayStartPreview = dayStartPreview.asInstanceOf[js.Any], dayToday = dayToday.asInstanceOf[js.Any], dayWeekend = dayWeekend.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], definedRangesWrapper = definedRangesWrapper.asInstanceOf[js.Any], endEdge = endEdge.asInstanceOf[js.Any], inRange = inRange.asInstanceOf[js.Any], infiniteMonths = infiniteMonths.asInstanceOf[js.Any], inputRange = inputRange.asInstanceOf[js.Any], inputRangeInput = inputRangeInput.asInstanceOf[js.Any], inputRanges = inputRanges.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], monthAndYearPickers = monthAndYearPickers.asInstanceOf[js.Any], monthAndYearWrapper = monthAndYearWrapper.asInstanceOf[js.Any], monthName = monthName.asInstanceOf[js.Any], monthPicker = monthPicker.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], monthsHorizontal = monthsHorizontal.asInstanceOf[js.Any], monthsVertical = monthsVertical.asInstanceOf[js.Any], nextButton = nextButton.asInstanceOf[js.Any], nextPrevButton = nextPrevButton.asInstanceOf[js.Any], prevButton = prevButton.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], startEdge = startEdge.asInstanceOf[js.Any], staticRange = staticRange.asInstanceOf[js.Any], staticRangeLabel = staticRangeLabel.asInstanceOf[js.Any], staticRangeSelected = staticRangeSelected.asInstanceOf[js.Any], staticRanges = staticRanges.asInstanceOf[js.Any], weekDay = weekDay.asInstanceOf[js.Any], weekDays = weekDays.asInstanceOf[js.Any], yearPicker = yearPicker.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassNames]
    }
    
    extension [Self <: ClassNames](x: Self) {
      
      inline def setCalendarWrapper(value: String): Self = StObject.set(x, "calendarWrapper", value.asInstanceOf[js.Any])
      
      inline def setDateDisplay(value: String): Self = StObject.set(x, "dateDisplay", value.asInstanceOf[js.Any])
      
      inline def setDateDisplayItem(value: String): Self = StObject.set(x, "dateDisplayItem", value.asInstanceOf[js.Any])
      
      inline def setDateDisplayItemActive(value: String): Self = StObject.set(x, "dateDisplayItemActive", value.asInstanceOf[js.Any])
      
      inline def setDateDisplayWrapper(value: String): Self = StObject.set(x, "dateDisplayWrapper", value.asInstanceOf[js.Any])
      
      inline def setDateRangePickerWrapper(value: String): Self = StObject.set(x, "dateRangePickerWrapper", value.asInstanceOf[js.Any])
      
      inline def setDateRangeWrapper(value: String): Self = StObject.set(x, "dateRangeWrapper", value.asInstanceOf[js.Any])
      
      inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setDayActive(value: String): Self = StObject.set(x, "dayActive", value.asInstanceOf[js.Any])
      
      inline def setDayDisabled(value: String): Self = StObject.set(x, "dayDisabled", value.asInstanceOf[js.Any])
      
      inline def setDayEndOfMonth(value: String): Self = StObject.set(x, "dayEndOfMonth", value.asInstanceOf[js.Any])
      
      inline def setDayEndOfWeek(value: String): Self = StObject.set(x, "dayEndOfWeek", value.asInstanceOf[js.Any])
      
      inline def setDayEndPreview(value: String): Self = StObject.set(x, "dayEndPreview", value.asInstanceOf[js.Any])
      
      inline def setDayHovered(value: String): Self = StObject.set(x, "dayHovered", value.asInstanceOf[js.Any])
      
      inline def setDayInPreview(value: String): Self = StObject.set(x, "dayInPreview", value.asInstanceOf[js.Any])
      
      inline def setDayNumber(value: String): Self = StObject.set(x, "dayNumber", value.asInstanceOf[js.Any])
      
      inline def setDayPassive(value: String): Self = StObject.set(x, "dayPassive", value.asInstanceOf[js.Any])
      
      inline def setDaySelected(value: String): Self = StObject.set(x, "daySelected", value.asInstanceOf[js.Any])
      
      inline def setDayStartOfMonth(value: String): Self = StObject.set(x, "dayStartOfMonth", value.asInstanceOf[js.Any])
      
      inline def setDayStartOfWeek(value: String): Self = StObject.set(x, "dayStartOfWeek", value.asInstanceOf[js.Any])
      
      inline def setDayStartPreview(value: String): Self = StObject.set(x, "dayStartPreview", value.asInstanceOf[js.Any])
      
      inline def setDayToday(value: String): Self = StObject.set(x, "dayToday", value.asInstanceOf[js.Any])
      
      inline def setDayWeekend(value: String): Self = StObject.set(x, "dayWeekend", value.asInstanceOf[js.Any])
      
      inline def setDays(value: String): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      inline def setDefinedRangesWrapper(value: String): Self = StObject.set(x, "definedRangesWrapper", value.asInstanceOf[js.Any])
      
      inline def setEndEdge(value: String): Self = StObject.set(x, "endEdge", value.asInstanceOf[js.Any])
      
      inline def setInRange(value: String): Self = StObject.set(x, "inRange", value.asInstanceOf[js.Any])
      
      inline def setInfiniteMonths(value: String): Self = StObject.set(x, "infiniteMonths", value.asInstanceOf[js.Any])
      
      inline def setInputRange(value: String): Self = StObject.set(x, "inputRange", value.asInstanceOf[js.Any])
      
      inline def setInputRangeInput(value: String): Self = StObject.set(x, "inputRangeInput", value.asInstanceOf[js.Any])
      
      inline def setInputRanges(value: String): Self = StObject.set(x, "inputRanges", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthAndYearPickers(value: String): Self = StObject.set(x, "monthAndYearPickers", value.asInstanceOf[js.Any])
      
      inline def setMonthAndYearWrapper(value: String): Self = StObject.set(x, "monthAndYearWrapper", value.asInstanceOf[js.Any])
      
      inline def setMonthName(value: String): Self = StObject.set(x, "monthName", value.asInstanceOf[js.Any])
      
      inline def setMonthPicker(value: String): Self = StObject.set(x, "monthPicker", value.asInstanceOf[js.Any])
      
      inline def setMonths(value: String): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsHorizontal(value: String): Self = StObject.set(x, "monthsHorizontal", value.asInstanceOf[js.Any])
      
      inline def setMonthsVertical(value: String): Self = StObject.set(x, "monthsVertical", value.asInstanceOf[js.Any])
      
      inline def setNextButton(value: String): Self = StObject.set(x, "nextButton", value.asInstanceOf[js.Any])
      
      inline def setNextPrevButton(value: String): Self = StObject.set(x, "nextPrevButton", value.asInstanceOf[js.Any])
      
      inline def setPrevButton(value: String): Self = StObject.set(x, "prevButton", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setStartEdge(value: String): Self = StObject.set(x, "startEdge", value.asInstanceOf[js.Any])
      
      inline def setStaticRange(value: String): Self = StObject.set(x, "staticRange", value.asInstanceOf[js.Any])
      
      inline def setStaticRangeLabel(value: String): Self = StObject.set(x, "staticRangeLabel", value.asInstanceOf[js.Any])
      
      inline def setStaticRangeSelected(value: String): Self = StObject.set(x, "staticRangeSelected", value.asInstanceOf[js.Any])
      
      inline def setStaticRanges(value: String): Self = StObject.set(x, "staticRanges", value.asInstanceOf[js.Any])
      
      inline def setWeekDay(value: String): Self = StObject.set(x, "weekDay", value.asInstanceOf[js.Any])
      
      inline def setWeekDays(value: String): Self = StObject.set(x, "weekDays", value.asInstanceOf[js.Any])
      
      inline def setYearPicker(value: String): Self = StObject.set(x, "yearPicker", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommonCalendarProps extends StObject {
    
    /** Custom class names for elements */
    var classNames: js.UndefOr[PartialClassNames] = js.undefined
    
    var firstDayOfWeek: js.UndefOr[Double] = js.undefined
    
    /** default: DD/MM/YYY */
    var format: js.UndefOr[String] = js.undefined
    
    /**
      * Calendar languages.
      * ('cn' - Chinese, 'jp' - Japanese,
      * 'fr' - French, 'it' - Italian,
      * 'de' - German, 'ko' - Korean,
      * 'es' - Spanish, 'ru' - Russian,
      * 'tr' - Turkish) default: none
      */
    var lang: js.UndefOr[LanguageType] = js.undefined
    
    /** default: none */
    var maxDate: js.UndefOr[DateInputType] = js.undefined
    
    /** default: none */
    var minDate: js.UndefOr[DateInputType] = js.undefined
    
    /** default: none */
    var onChange: js.UndefOr[js.Function1[/* range */ OnChangeProps, Unit]] = js.undefined
    
    /** default: none */
    var onInit: js.UndefOr[js.Function1[/* range */ Range, Unit]] = js.undefined
    
    var theme: js.UndefOr[CalendarTheme] = js.undefined
  }
  object CommonCalendarProps {
    
    inline def apply(): CommonCalendarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonCalendarProps]
    }
    
    extension [Self <: CommonCalendarProps](x: Self) {
      
      inline def setClassNames(value: PartialClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      inline def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setLang(value: LanguageType): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setMaxDate(value: DateInputType): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateFunction1(value: /* now */ Date => AnyDate): Self = StObject.set(x, "maxDate", js.Any.fromFunction1(value))
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: DateInputType): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateFunction1(value: /* now */ Date => AnyDate): Self = StObject.set(x, "minDate", js.Any.fromFunction1(value))
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setOnChange(value: /* range */ OnChangeProps => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnInit(value: /* range */ Range => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction1(value))
      
      inline def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
      
      inline def setTheme(value: CalendarTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait DateContainerType extends StObject {
    
    var date: Date
  }
  object DateContainerType {
    
    inline def apply(date: Date): DateContainerType = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateContainerType]
    }
    
    extension [Self <: DateContainerType](x: Self) {
      
      inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    }
  }
  
  type DateFunc = js.Function1[/* now */ Date, AnyDate]
  
  type DateInputType = AnyDate | DateFunc
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactDateRange.reactDateRangeStrings.Today
    - typings.reactDateRange.reactDateRangeStrings.Yesterday
    - typings.reactDateRange.reactDateRangeStrings.`Last 7 Days`
    - typings.reactDateRange.reactDateRangeStrings.`Last 30 Days`
  */
  trait DateRangeIndex extends StObject
  object DateRangeIndex {
    
    inline def `Last 30 Days`: typings.reactDateRange.reactDateRangeStrings.`Last 30 Days` = ("Last 30 Days").asInstanceOf[typings.reactDateRange.reactDateRangeStrings.`Last 30 Days`]
    
    inline def `Last 7 Days`: typings.reactDateRange.reactDateRangeStrings.`Last 7 Days` = ("Last 7 Days").asInstanceOf[typings.reactDateRange.reactDateRangeStrings.`Last 7 Days`]
    
    inline def Today: typings.reactDateRange.reactDateRangeStrings.Today = "Today".asInstanceOf[typings.reactDateRange.reactDateRangeStrings.Today]
    
    inline def Yesterday: typings.reactDateRange.reactDateRangeStrings.Yesterday = "Yesterday".asInstanceOf[typings.reactDateRange.reactDateRangeStrings.Yesterday]
  }
  
  trait DateRangeObject extends StObject {
    
    def endDate(now: Date): Date
    
    def startDate(now: Date): Date
  }
  object DateRangeObject {
    
    inline def apply(endDate: Date => Date, startDate: Date => Date): DateRangeObject = {
      val __obj = js.Dynamic.literal(endDate = js.Any.fromFunction1(endDate), startDate = js.Any.fromFunction1(startDate))
      __obj.asInstanceOf[DateRangeObject]
    }
    
    extension [Self <: DateRangeObject](x: Self) {
      
      inline def setEndDate(value: Date => Date): Self = StObject.set(x, "endDate", js.Any.fromFunction1(value))
      
      inline def setStartDate(value: Date => Date): Self = StObject.set(x, "startDate", js.Any.fromFunction1(value))
    }
  }
  
  trait DateRangeProps
    extends StObject
       with Range
       with CommonCalendarProps {
    
    /** default: 2 */
    var calendars: js.UndefOr[Double] = js.undefined
    
    /** default: */
    var className: js.UndefOr[String] = js.undefined
    
    /** default: MMM d, yyyy */
    var dateDisplayFormat: js.UndefOr[String] = js.undefined
    
    /** default: d */
    var dayDisplayFormat: js.UndefOr[String] = js.undefined
    
    /** default: vertical */
    var direction: js.UndefOr[String] = js.undefined
    
    /** default: */
    var disabledDates: js.UndefOr[js.Array[Date]] = js.undefined
    
    /** default: false */
    var editableDateInputs: js.UndefOr[Boolean] = js.undefined
    
    /** default: Continuous */
    var endDatePlaceholder: js.UndefOr[String] = js.undefined
    
    /** default: false */
    var linkedCalendars: js.UndefOr[Boolean] = js.undefined
    
    /** default: enUs from locale. Complete list here https://github.com/Adphorus/react-date-range/blob/next/src/locale/index.js */
    var locale: js.UndefOr[js.Object] = js.undefined
    
    /** default: MMM yyyy */
    var monthDisplayFormat: js.UndefOr[String] = js.undefined
    
    /** default: 1 */
    var months: js.UndefOr[Double] = js.undefined
    
    /** default: false */
    var moveRangeOnFirstSelection: js.UndefOr[Boolean] = js.undefined
    
    /** default: [] */
    var rangeColors: js.UndefOr[js.Array[String]] = js.undefined
    
    /** default: false */
    var rangedCalendars: js.UndefOr[Boolean] = js.undefined
    
    /** default: none */
    var ranges: js.UndefOr[js.Object] = js.undefined
    
    /** default: { enabled: false } */
    var scroll: js.UndefOr[js.Object] = js.undefined
    
    /** default: true */
    var showMonthAndYearPickers: js.UndefOr[Boolean] = js.undefined
    
    /** default: true */
    var showMonthArrow: js.UndefOr[Boolean] = js.undefined
    
    /** default: false */
    var showSelectionPreview: js.UndefOr[Boolean] = js.undefined
    
    /** default: */
    var shownDate: js.UndefOr[Date] = js.undefined
    
    /** default: none */
    var specialDays: js.UndefOr[js.Array[DateContainerType]] = js.undefined
    
    /** default: Early */
    var startDatePlaceholder: js.UndefOr[String] = js.undefined
    
    /** default: false */
    var twoStepChange: js.UndefOr[Boolean] = js.undefined
    
    /** default: */
    var weekStartsOn: js.UndefOr[Double] = js.undefined
    
    /** default: E */
    var weekdayDisplayFormat: js.UndefOr[String] = js.undefined
  }
  object DateRangeProps {
    
    inline def apply(): DateRangeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateRangeProps]
    }
    
    extension [Self <: DateRangeProps](x: Self) {
      
      inline def setCalendars(value: Double): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
      
      inline def setCalendarsUndefined: Self = StObject.set(x, "calendars", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDateDisplayFormat(value: String): Self = StObject.set(x, "dateDisplayFormat", value.asInstanceOf[js.Any])
      
      inline def setDateDisplayFormatUndefined: Self = StObject.set(x, "dateDisplayFormat", js.undefined)
      
      inline def setDayDisplayFormat(value: String): Self = StObject.set(x, "dayDisplayFormat", value.asInstanceOf[js.Any])
      
      inline def setDayDisplayFormatUndefined: Self = StObject.set(x, "dayDisplayFormat", js.undefined)
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabledDates(value: js.Array[Date]): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
      
      inline def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
      
      inline def setDisabledDatesVarargs(value: Date*): Self = StObject.set(x, "disabledDates", js.Array(value :_*))
      
      inline def setEditableDateInputs(value: Boolean): Self = StObject.set(x, "editableDateInputs", value.asInstanceOf[js.Any])
      
      inline def setEditableDateInputsUndefined: Self = StObject.set(x, "editableDateInputs", js.undefined)
      
      inline def setEndDatePlaceholder(value: String): Self = StObject.set(x, "endDatePlaceholder", value.asInstanceOf[js.Any])
      
      inline def setEndDatePlaceholderUndefined: Self = StObject.set(x, "endDatePlaceholder", js.undefined)
      
      inline def setLinkedCalendars(value: Boolean): Self = StObject.set(x, "linkedCalendars", value.asInstanceOf[js.Any])
      
      inline def setLinkedCalendarsUndefined: Self = StObject.set(x, "linkedCalendars", js.undefined)
      
      inline def setLocale(value: js.Object): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMonthDisplayFormat(value: String): Self = StObject.set(x, "monthDisplayFormat", value.asInstanceOf[js.Any])
      
      inline def setMonthDisplayFormatUndefined: Self = StObject.set(x, "monthDisplayFormat", js.undefined)
      
      inline def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
      
      inline def setMoveRangeOnFirstSelection(value: Boolean): Self = StObject.set(x, "moveRangeOnFirstSelection", value.asInstanceOf[js.Any])
      
      inline def setMoveRangeOnFirstSelectionUndefined: Self = StObject.set(x, "moveRangeOnFirstSelection", js.undefined)
      
      inline def setRangeColors(value: js.Array[String]): Self = StObject.set(x, "rangeColors", value.asInstanceOf[js.Any])
      
      inline def setRangeColorsUndefined: Self = StObject.set(x, "rangeColors", js.undefined)
      
      inline def setRangeColorsVarargs(value: String*): Self = StObject.set(x, "rangeColors", js.Array(value :_*))
      
      inline def setRangedCalendars(value: Boolean): Self = StObject.set(x, "rangedCalendars", value.asInstanceOf[js.Any])
      
      inline def setRangedCalendarsUndefined: Self = StObject.set(x, "rangedCalendars", js.undefined)
      
      inline def setRanges(value: js.Object): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      inline def setScroll(value: js.Object): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      inline def setShowMonthAndYearPickers(value: Boolean): Self = StObject.set(x, "showMonthAndYearPickers", value.asInstanceOf[js.Any])
      
      inline def setShowMonthAndYearPickersUndefined: Self = StObject.set(x, "showMonthAndYearPickers", js.undefined)
      
      inline def setShowMonthArrow(value: Boolean): Self = StObject.set(x, "showMonthArrow", value.asInstanceOf[js.Any])
      
      inline def setShowMonthArrowUndefined: Self = StObject.set(x, "showMonthArrow", js.undefined)
      
      inline def setShowSelectionPreview(value: Boolean): Self = StObject.set(x, "showSelectionPreview", value.asInstanceOf[js.Any])
      
      inline def setShowSelectionPreviewUndefined: Self = StObject.set(x, "showSelectionPreview", js.undefined)
      
      inline def setShownDate(value: Date): Self = StObject.set(x, "shownDate", value.asInstanceOf[js.Any])
      
      inline def setShownDateUndefined: Self = StObject.set(x, "shownDate", js.undefined)
      
      inline def setSpecialDays(value: js.Array[DateContainerType]): Self = StObject.set(x, "specialDays", value.asInstanceOf[js.Any])
      
      inline def setSpecialDaysUndefined: Self = StObject.set(x, "specialDays", js.undefined)
      
      inline def setSpecialDaysVarargs(value: DateContainerType*): Self = StObject.set(x, "specialDays", js.Array(value :_*))
      
      inline def setStartDatePlaceholder(value: String): Self = StObject.set(x, "startDatePlaceholder", value.asInstanceOf[js.Any])
      
      inline def setStartDatePlaceholderUndefined: Self = StObject.set(x, "startDatePlaceholder", js.undefined)
      
      inline def setTwoStepChange(value: Boolean): Self = StObject.set(x, "twoStepChange", value.asInstanceOf[js.Any])
      
      inline def setTwoStepChangeUndefined: Self = StObject.set(x, "twoStepChange", js.undefined)
      
      inline def setWeekStartsOn(value: Double): Self = StObject.set(x, "weekStartsOn", value.asInstanceOf[js.Any])
      
      inline def setWeekStartsOnUndefined: Self = StObject.set(x, "weekStartsOn", js.undefined)
      
      inline def setWeekdayDisplayFormat(value: String): Self = StObject.set(x, "weekdayDisplayFormat", value.asInstanceOf[js.Any])
      
      inline def setWeekdayDisplayFormatUndefined: Self = StObject.set(x, "weekdayDisplayFormat", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactDateRange.reactDateRangeStrings.cn
    - typings.reactDateRange.reactDateRangeStrings.jp
    - typings.reactDateRange.reactDateRangeStrings.fr
    - typings.reactDateRange.reactDateRangeStrings.it
    - typings.reactDateRange.reactDateRangeStrings.de
    - typings.reactDateRange.reactDateRangeStrings.ko
    - typings.reactDateRange.reactDateRangeStrings.es
    - typings.reactDateRange.reactDateRangeStrings.ru
    - typings.reactDateRange.reactDateRangeStrings.tr
  */
  trait LanguageType extends StObject
  object LanguageType {
    
    inline def cn: typings.reactDateRange.reactDateRangeStrings.cn = "cn".asInstanceOf[typings.reactDateRange.reactDateRangeStrings.cn]
    
    inline def de: typings.reactDateRange.reactDateRangeStrings.de = "de".asInstanceOf[typings.reactDateRange.reactDateRangeStrings.de]
    
    inline def es: typings.reactDateRange.reactDateRangeStrings.es = "es".asInstanceOf[typings.reactDateRange.reactDateRangeStrings.es]
    
    inline def fr: typings.reactDateRange.reactDateRangeStrings.fr = "fr".asInstanceOf[typings.reactDateRange.reactDateRangeStrings.fr]
    
    inline def it: typings.reactDateRange.reactDateRangeStrings.it = "it".asInstanceOf[typings.reactDateRange.reactDateRangeStrings.it]
    
    inline def jp: typings.reactDateRange.reactDateRangeStrings.jp = "jp".asInstanceOf[typings.reactDateRange.reactDateRangeStrings.jp]
    
    inline def ko: typings.reactDateRange.reactDateRangeStrings.ko = "ko".asInstanceOf[typings.reactDateRange.reactDateRangeStrings.ko]
    
    inline def ru: typings.reactDateRange.reactDateRangeStrings.ru = "ru".asInstanceOf[typings.reactDateRange.reactDateRangeStrings.ru]
    
    inline def tr: typings.reactDateRange.reactDateRangeStrings.tr = "tr".asInstanceOf[typings.reactDateRange.reactDateRangeStrings.tr]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactDateRange.mod.Range
    - typings.reactDateRange.anon.Selection
    - typings.std.Date
  */
  type OnChangeProps = _OnChangeProps | Date
  
  trait Range
    extends StObject
       with _OnChangeProps {
    
    /** default: today */
    var endDate: js.UndefOr[Date] = js.undefined
    
    /** default: today */
    var startDate: js.UndefOr[Date] = js.undefined
  }
  object Range {
    
    inline def apply(): Range = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Range]
    }
    
    extension [Self <: Range](x: Self) {
      
      inline def setEndDate(value: Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setStartDate(value: Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    }
  }
  
  type SizeType = Double
  
  trait _OnChangeProps extends StObject
  object _OnChangeProps {
    
    inline def Range(): typings.reactDateRange.mod.Range = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactDateRange.mod.Range]
    }
    
    inline def Selection(selection: Range): typings.reactDateRange.anon.Selection = {
      val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactDateRange.anon.Selection]
    }
  }
}
