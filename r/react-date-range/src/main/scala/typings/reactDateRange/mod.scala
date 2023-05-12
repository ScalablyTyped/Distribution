package typings.reactDateRange

import org.scalablytyped.runtime.StringDictionary
import typings.dateFns.mod.Locale
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactDateRange.reactDateRangeInts.`0`
import typings.reactDateRange.reactDateRangeInts.`1`
import typings.reactDateRange.reactDateRangeInts.`2`
import typings.reactDateRange.reactDateRangeInts.`3`
import typings.reactDateRange.reactDateRangeInts.`4`
import typings.reactDateRange.reactDateRangeInts.`5`
import typings.reactDateRange.reactDateRangeInts.`6`
import typings.reactDateRange.reactDateRangeStrings.backwards
import typings.reactDateRange.reactDateRangeStrings.date
import typings.reactDateRange.reactDateRangeStrings.dateRange
import typings.reactDateRange.reactDateRangeStrings.forwards
import typings.reactDateRange.reactDateRangeStrings.horizontal
import typings.reactDateRange.reactDateRangeStrings.monthOffset
import typings.reactDateRange.reactDateRangeStrings.set
import typings.reactDateRange.reactDateRangeStrings.setMonth
import typings.reactDateRange.reactDateRangeStrings.setYear
import typings.reactDateRange.reactDateRangeStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-date-range", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-date-range", "Calendar")
  @js.native
  open class Calendar protected ()
    extends Component[CalendarProps, js.Object, Any] {
    def this(props: CalendarProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: CalendarProps, context: Any) = this()
  }
  
  @JSImport("react-date-range", "DateRange")
  @js.native
  open class DateRange protected ()
    extends Component[DateRangeProps, js.Object, Any] {
    def this(props: DateRangeProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: DateRangeProps, context: Any) = this()
  }
  
  @JSImport("react-date-range", "DateRangePicker")
  @js.native
  open class DateRangePicker protected ()
    extends Component[DateRangePickerProps, js.Object, Any] {
    def this(props: DateRangePickerProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: DateRangePickerProps, context: Any) = this()
  }
  
  @JSImport("react-date-range", "DefinedRange")
  @js.native
  open class DefinedRange protected ()
    extends Component[DefinedRangeProps, js.Object, Any] {
    def this(props: DefinedRangeProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: DefinedRangeProps, context: Any) = this()
  }
  
  inline def createStaticRanges(ranges: js.Array[StaticRange]): js.Array[StaticRange] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStaticRanges")(ranges.asInstanceOf[js.Any]).asInstanceOf[js.Array[StaticRange]]
  
  @JSImport("react-date-range", "defaultInputRanges")
  @js.native
  val defaultInputRanges: js.Array[InputRange] = js.native
  
  @JSImport("react-date-range", "defaultStaticRanges")
  @js.native
  val defaultStaticRanges: js.Array[StaticRange] = js.native
  
  trait AriaLabelsShape extends StObject {
    
    var dateInput: js.UndefOr[RangeKeyDict] = js.undefined
    
    var monthPicker: js.UndefOr[String] = js.undefined
    
    var nextButton: js.UndefOr[String] = js.undefined
    
    var prevButton: js.UndefOr[String] = js.undefined
    
    var yearPicker: js.UndefOr[String] = js.undefined
  }
  object AriaLabelsShape {
    
    inline def apply(): AriaLabelsShape = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AriaLabelsShape]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AriaLabelsShape] (val x: Self) extends AnyVal {
      
      inline def setDateInput(value: RangeKeyDict): Self = StObject.set(x, "dateInput", value.asInstanceOf[js.Any])
      
      inline def setDateInputUndefined: Self = StObject.set(x, "dateInput", js.undefined)
      
      inline def setMonthPicker(value: String): Self = StObject.set(x, "monthPicker", value.asInstanceOf[js.Any])
      
      inline def setMonthPickerUndefined: Self = StObject.set(x, "monthPicker", js.undefined)
      
      inline def setNextButton(value: String): Self = StObject.set(x, "nextButton", value.asInstanceOf[js.Any])
      
      inline def setNextButtonUndefined: Self = StObject.set(x, "nextButton", js.undefined)
      
      inline def setPrevButton(value: String): Self = StObject.set(x, "prevButton", value.asInstanceOf[js.Any])
      
      inline def setPrevButtonUndefined: Self = StObject.set(x, "prevButton", js.undefined)
      
      inline def setYearPicker(value: String): Self = StObject.set(x, "yearPicker", value.asInstanceOf[js.Any])
      
      inline def setYearPickerUndefined: Self = StObject.set(x, "yearPicker", js.undefined)
    }
  }
  
  trait CalendarProps extends StObject {
    
    /**
      * Custom accessibility aria labels for elements
      *
      * default: `{}`
      */
    var ariaLabels: js.UndefOr[AriaLabelsShape] = js.undefined
    
    /** default: `forwards` */
    var calendarFocus: js.UndefOr[forwards | backwards] = js.undefined
    
    /** default: none */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Custom class names for elements
      *
      * default: `{}`
      */
    var classNames: js.UndefOr[ClassNames] = js.undefined
    
    /** default: `#3d91ff` */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * The currently selected date
      *
      * default: none
      */
    var date: js.UndefOr[js.Date] = js.undefined
    
    /** default: `MMM d, yyyy` */
    var dateDisplayFormat: js.UndefOr[String] = js.undefined
    
    /**
      * Custom renderer function for the calendar days
      *
      * default: none
      */
    var dayContentRenderer: js.UndefOr[js.Function1[/* date */ js.Date, ReactNode]] = js.undefined
    
    /** default: `d` */
    var dayDisplayFormat: js.UndefOr[String] = js.undefined
    
    /** default: `vertical` */
    var direction: js.UndefOr[vertical | horizontal] = js.undefined
    
    /** default: `[]` */
    var disabledDates: js.UndefOr[js.Array[js.Date]] = js.undefined
    
    /**
      * Custom function to determine if a day should be disabled
      *
      * default: `() => {}`
      */
    var disabledDay: js.UndefOr[js.Function1[/* date */ js.Date, Boolean]] = js.undefined
    
    /** default: `date` */
    var displayMode: js.UndefOr[dateRange | date] = js.undefined
    
    /** default: `true` */
    var dragSelectionEnabled: js.UndefOr[Boolean] = js.undefined
    
    /** default: `false` */
    var editableDateInputs: js.UndefOr[Boolean] = js.undefined
    
    /** default: `Continuous` */
    var endDatePlaceholder: js.UndefOr[String] = js.undefined
    
    /** default: `false` */
    var fixedHeight: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Which range and step are focused. First value is index of ranges, second value
      * is which step on date range (startDate or endDate)
      *
      * default: `[0, 0]`
      */
    var focusedRange: js.UndefOr[RangeFocus] = js.undefined
    
    /**
      * Initial value for focused range. See `focusedRange` for usage
      *
      * default: none
      */
    var initialFocusedRange: js.UndefOr[RangeFocus] = js.undefined
    
    /**
      * default: `en-US` from `date-fns/locale`
      *
      * Complete list here: https://github.com/hypeserver/react-date-range/blob/next/src/locale/index.js
      */
    var locale: js.UndefOr[Locale] = js.undefined
    
    /** default: 20 years after the current date */
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    /** default: 100 years before the current date */
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    /** default: `MMM yyyy` */
    var monthDisplayFormat: js.UndefOr[String] = js.undefined
    
    /** default: `1` */
    var months: js.UndefOr[Double] = js.undefined
    
    /**
      * Custom renderer function for the month and year navigation section
      *
      * default: none
      */
    var navigatorRenderer: js.UndefOr[
        js.Function3[
          /* currFocusedDate */ js.Date, 
          /* changeShownDate */ js.Function2[
            /* value */ js.Date | Double | String, 
            /* mode */ js.UndefOr[set | setYear | setMonth | monthOffset], 
            Unit
          ], 
          /* props */ this.type, 
          Element
        ]
      ] = js.undefined
    
    /** default: none */
    var onChange: js.UndefOr[js.Function1[/* date */ js.Date, Unit]] = js.undefined
    
    /** default: none */
    var onPreviewChange: js.UndefOr[js.Function1[/* previewDate */ js.UndefOr[js.Date], Unit]] = js.undefined
    
    /** default: none */
    var onRangeFocusChange: js.UndefOr[js.Function1[/* newFocusedRange */ RangeFocus, Unit]] = js.undefined
    
    /** default: none */
    var onShownDateChange: js.UndefOr[js.Function1[/* date */ js.Date, Unit]] = js.undefined
    
    /** default: false */
    var preventSnapRefocus: js.UndefOr[Boolean] = js.undefined
    
    /** default: none */
    var preview: js.UndefOr[Preview] = js.undefined
    
    /** default: `['#3d91ff', '#3ecf8e', '#fed14c']` */
    var rangeColors: js.UndefOr[js.Array[String]] = js.undefined
    
    /** default: [] */
    var ranges: js.UndefOr[js.Array[Range]] = js.undefined
    
    /**
      * Custom scroll options for various parts of the display
      *
      * default: `{ enabled: false }`
      */
    var scroll: js.UndefOr[ScrollOptions] = js.undefined
    
    /** default: true */
    var showDateDisplay: js.UndefOr[Boolean] = js.undefined
    
    /** default: true */
    var showMonthAndYearPickers: js.UndefOr[Boolean] = js.undefined
    
    /** default: true */
    var showMonthArrow: js.UndefOr[Boolean] = js.undefined
    
    /** default: true */
    var showPreview: js.UndefOr[Boolean] = js.undefined
    
    /** default: none */
    var shownDate: js.UndefOr[js.Date] = js.undefined
    
    /** default: `Early` */
    var startDatePlaceholder: js.UndefOr[String] = js.undefined
    
    /** default: none */
    var updateRange: js.UndefOr[js.Function1[/* newRange */ Range, Unit]] = js.undefined
    
    /** default: none */
    var weekStartsOn: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
    
    /** default: `E` */
    var weekdayDisplayFormat: js.UndefOr[String] = js.undefined
  }
  object CalendarProps {
    
    inline def apply(): CalendarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalendarProps] (val x: Self) extends AnyVal {
      
      inline def setAriaLabels(value: AriaLabelsShape): Self = StObject.set(x, "ariaLabels", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelsUndefined: Self = StObject.set(x, "ariaLabels", js.undefined)
      
      inline def setCalendarFocus(value: forwards | backwards): Self = StObject.set(x, "calendarFocus", value.asInstanceOf[js.Any])
      
      inline def setCalendarFocusUndefined: Self = StObject.set(x, "calendarFocus", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClassNames(value: ClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateDisplayFormat(value: String): Self = StObject.set(x, "dateDisplayFormat", value.asInstanceOf[js.Any])
      
      inline def setDateDisplayFormatUndefined: Self = StObject.set(x, "dateDisplayFormat", js.undefined)
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDayContentRenderer(value: /* date */ js.Date => ReactNode): Self = StObject.set(x, "dayContentRenderer", js.Any.fromFunction1(value))
      
      inline def setDayContentRendererUndefined: Self = StObject.set(x, "dayContentRenderer", js.undefined)
      
      inline def setDayDisplayFormat(value: String): Self = StObject.set(x, "dayDisplayFormat", value.asInstanceOf[js.Any])
      
      inline def setDayDisplayFormatUndefined: Self = StObject.set(x, "dayDisplayFormat", js.undefined)
      
      inline def setDirection(value: vertical | horizontal): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabledDates(value: js.Array[js.Date]): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
      
      inline def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
      
      inline def setDisabledDatesVarargs(value: js.Date*): Self = StObject.set(x, "disabledDates", js.Array(value*))
      
      inline def setDisabledDay(value: /* date */ js.Date => Boolean): Self = StObject.set(x, "disabledDay", js.Any.fromFunction1(value))
      
      inline def setDisabledDayUndefined: Self = StObject.set(x, "disabledDay", js.undefined)
      
      inline def setDisplayMode(value: dateRange | date): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
      
      inline def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
      
      inline def setDragSelectionEnabled(value: Boolean): Self = StObject.set(x, "dragSelectionEnabled", value.asInstanceOf[js.Any])
      
      inline def setDragSelectionEnabledUndefined: Self = StObject.set(x, "dragSelectionEnabled", js.undefined)
      
      inline def setEditableDateInputs(value: Boolean): Self = StObject.set(x, "editableDateInputs", value.asInstanceOf[js.Any])
      
      inline def setEditableDateInputsUndefined: Self = StObject.set(x, "editableDateInputs", js.undefined)
      
      inline def setEndDatePlaceholder(value: String): Self = StObject.set(x, "endDatePlaceholder", value.asInstanceOf[js.Any])
      
      inline def setEndDatePlaceholderUndefined: Self = StObject.set(x, "endDatePlaceholder", js.undefined)
      
      inline def setFixedHeight(value: Boolean): Self = StObject.set(x, "fixedHeight", value.asInstanceOf[js.Any])
      
      inline def setFixedHeightUndefined: Self = StObject.set(x, "fixedHeight", js.undefined)
      
      inline def setFocusedRange(value: RangeFocus): Self = StObject.set(x, "focusedRange", value.asInstanceOf[js.Any])
      
      inline def setFocusedRangeUndefined: Self = StObject.set(x, "focusedRange", js.undefined)
      
      inline def setInitialFocusedRange(value: RangeFocus): Self = StObject.set(x, "initialFocusedRange", value.asInstanceOf[js.Any])
      
      inline def setInitialFocusedRangeUndefined: Self = StObject.set(x, "initialFocusedRange", js.undefined)
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMonthDisplayFormat(value: String): Self = StObject.set(x, "monthDisplayFormat", value.asInstanceOf[js.Any])
      
      inline def setMonthDisplayFormatUndefined: Self = StObject.set(x, "monthDisplayFormat", js.undefined)
      
      inline def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
      
      inline def setNavigatorRenderer(
        value: (/* currFocusedDate */ js.Date, /* changeShownDate */ js.Function2[
              /* value */ js.Date | Double | String, 
              /* mode */ js.UndefOr[set | setYear | setMonth | monthOffset], 
              Unit
            ], CalendarProps) => Element
      ): Self = StObject.set(x, "navigatorRenderer", js.Any.fromFunction3(value))
      
      inline def setNavigatorRendererUndefined: Self = StObject.set(x, "navigatorRenderer", js.undefined)
      
      inline def setOnChange(value: /* date */ js.Date => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnPreviewChange(value: /* previewDate */ js.UndefOr[js.Date] => Unit): Self = StObject.set(x, "onPreviewChange", js.Any.fromFunction1(value))
      
      inline def setOnPreviewChangeUndefined: Self = StObject.set(x, "onPreviewChange", js.undefined)
      
      inline def setOnRangeFocusChange(value: /* newFocusedRange */ RangeFocus => Unit): Self = StObject.set(x, "onRangeFocusChange", js.Any.fromFunction1(value))
      
      inline def setOnRangeFocusChangeUndefined: Self = StObject.set(x, "onRangeFocusChange", js.undefined)
      
      inline def setOnShownDateChange(value: /* date */ js.Date => Unit): Self = StObject.set(x, "onShownDateChange", js.Any.fromFunction1(value))
      
      inline def setOnShownDateChangeUndefined: Self = StObject.set(x, "onShownDateChange", js.undefined)
      
      inline def setPreventSnapRefocus(value: Boolean): Self = StObject.set(x, "preventSnapRefocus", value.asInstanceOf[js.Any])
      
      inline def setPreventSnapRefocusUndefined: Self = StObject.set(x, "preventSnapRefocus", js.undefined)
      
      inline def setPreview(value: Preview): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
      
      inline def setRangeColors(value: js.Array[String]): Self = StObject.set(x, "rangeColors", value.asInstanceOf[js.Any])
      
      inline def setRangeColorsUndefined: Self = StObject.set(x, "rangeColors", js.undefined)
      
      inline def setRangeColorsVarargs(value: String*): Self = StObject.set(x, "rangeColors", js.Array(value*))
      
      inline def setRanges(value: js.Array[Range]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      inline def setRangesVarargs(value: Range*): Self = StObject.set(x, "ranges", js.Array(value*))
      
      inline def setScroll(value: ScrollOptions): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      inline def setShowDateDisplay(value: Boolean): Self = StObject.set(x, "showDateDisplay", value.asInstanceOf[js.Any])
      
      inline def setShowDateDisplayUndefined: Self = StObject.set(x, "showDateDisplay", js.undefined)
      
      inline def setShowMonthAndYearPickers(value: Boolean): Self = StObject.set(x, "showMonthAndYearPickers", value.asInstanceOf[js.Any])
      
      inline def setShowMonthAndYearPickersUndefined: Self = StObject.set(x, "showMonthAndYearPickers", js.undefined)
      
      inline def setShowMonthArrow(value: Boolean): Self = StObject.set(x, "showMonthArrow", value.asInstanceOf[js.Any])
      
      inline def setShowMonthArrowUndefined: Self = StObject.set(x, "showMonthArrow", js.undefined)
      
      inline def setShowPreview(value: Boolean): Self = StObject.set(x, "showPreview", value.asInstanceOf[js.Any])
      
      inline def setShowPreviewUndefined: Self = StObject.set(x, "showPreview", js.undefined)
      
      inline def setShownDate(value: js.Date): Self = StObject.set(x, "shownDate", value.asInstanceOf[js.Any])
      
      inline def setShownDateUndefined: Self = StObject.set(x, "shownDate", js.undefined)
      
      inline def setStartDatePlaceholder(value: String): Self = StObject.set(x, "startDatePlaceholder", value.asInstanceOf[js.Any])
      
      inline def setStartDatePlaceholderUndefined: Self = StObject.set(x, "startDatePlaceholder", js.undefined)
      
      inline def setUpdateRange(value: /* newRange */ Range => Unit): Self = StObject.set(x, "updateRange", js.Any.fromFunction1(value))
      
      inline def setUpdateRangeUndefined: Self = StObject.set(x, "updateRange", js.undefined)
      
      inline def setWeekStartsOn(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "weekStartsOn", value.asInstanceOf[js.Any])
      
      inline def setWeekStartsOnUndefined: Self = StObject.set(x, "weekStartsOn", js.undefined)
      
      inline def setWeekdayDisplayFormat(value: String): Self = StObject.set(x, "weekdayDisplayFormat", value.asInstanceOf[js.Any])
      
      inline def setWeekdayDisplayFormatUndefined: Self = StObject.set(x, "weekdayDisplayFormat", js.undefined)
    }
  }
  
  trait ClassNames extends StObject {
    
    var calendarWrapper: js.UndefOr[String] = js.undefined
    
    var dateDisplay: js.UndefOr[String] = js.undefined
    
    var dateDisplayItem: js.UndefOr[String] = js.undefined
    
    var dateDisplayItemActive: js.UndefOr[String] = js.undefined
    
    var dateDisplayWrapper: js.UndefOr[String] = js.undefined
    
    var dateRangePickerWrapper: js.UndefOr[String] = js.undefined
    
    var dateRangeWrapper: js.UndefOr[String] = js.undefined
    
    var day: js.UndefOr[String] = js.undefined
    
    var dayActive: js.UndefOr[String] = js.undefined
    
    var dayDisabled: js.UndefOr[String] = js.undefined
    
    var dayEndOfMonth: js.UndefOr[String] = js.undefined
    
    var dayEndOfWeek: js.UndefOr[String] = js.undefined
    
    var dayEndPreview: js.UndefOr[String] = js.undefined
    
    var dayHovered: js.UndefOr[String] = js.undefined
    
    var dayInPreview: js.UndefOr[String] = js.undefined
    
    var dayNumber: js.UndefOr[String] = js.undefined
    
    var dayPassive: js.UndefOr[String] = js.undefined
    
    var daySelected: js.UndefOr[String] = js.undefined
    
    var dayStartOfMonth: js.UndefOr[String] = js.undefined
    
    var dayStartOfWeek: js.UndefOr[String] = js.undefined
    
    var dayStartPreview: js.UndefOr[String] = js.undefined
    
    var dayToday: js.UndefOr[String] = js.undefined
    
    var dayWeekend: js.UndefOr[String] = js.undefined
    
    var days: js.UndefOr[String] = js.undefined
    
    var definedRangesWrapper: js.UndefOr[String] = js.undefined
    
    var endEdge: js.UndefOr[String] = js.undefined
    
    var inRange: js.UndefOr[String] = js.undefined
    
    var infiniteMonths: js.UndefOr[String] = js.undefined
    
    var inputRange: js.UndefOr[String] = js.undefined
    
    var inputRangeInput: js.UndefOr[String] = js.undefined
    
    var inputRanges: js.UndefOr[String] = js.undefined
    
    var month: js.UndefOr[String] = js.undefined
    
    var monthAndYearPickers: js.UndefOr[String] = js.undefined
    
    var monthAndYearWrapper: js.UndefOr[String] = js.undefined
    
    var monthName: js.UndefOr[String] = js.undefined
    
    var monthPicker: js.UndefOr[String] = js.undefined
    
    var months: js.UndefOr[String] = js.undefined
    
    var monthsHorizontal: js.UndefOr[String] = js.undefined
    
    var monthsVertical: js.UndefOr[String] = js.undefined
    
    var nextButton: js.UndefOr[String] = js.undefined
    
    var nextPrevButton: js.UndefOr[String] = js.undefined
    
    var prevButton: js.UndefOr[String] = js.undefined
    
    var selected: js.UndefOr[String] = js.undefined
    
    var startEdge: js.UndefOr[String] = js.undefined
    
    var staticRange: js.UndefOr[String] = js.undefined
    
    var staticRangeLabel: js.UndefOr[String] = js.undefined
    
    var staticRangeSelected: js.UndefOr[String] = js.undefined
    
    var staticRanges: js.UndefOr[String] = js.undefined
    
    var weekDay: js.UndefOr[String] = js.undefined
    
    var weekDays: js.UndefOr[String] = js.undefined
    
    var yearPicker: js.UndefOr[String] = js.undefined
  }
  object ClassNames {
    
    inline def apply(): ClassNames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassNames]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClassNames] (val x: Self) extends AnyVal {
      
      inline def setCalendarWrapper(value: String): Self = StObject.set(x, "calendarWrapper", value.asInstanceOf[js.Any])
      
      inline def setCalendarWrapperUndefined: Self = StObject.set(x, "calendarWrapper", js.undefined)
      
      inline def setDateDisplay(value: String): Self = StObject.set(x, "dateDisplay", value.asInstanceOf[js.Any])
      
      inline def setDateDisplayItem(value: String): Self = StObject.set(x, "dateDisplayItem", value.asInstanceOf[js.Any])
      
      inline def setDateDisplayItemActive(value: String): Self = StObject.set(x, "dateDisplayItemActive", value.asInstanceOf[js.Any])
      
      inline def setDateDisplayItemActiveUndefined: Self = StObject.set(x, "dateDisplayItemActive", js.undefined)
      
      inline def setDateDisplayItemUndefined: Self = StObject.set(x, "dateDisplayItem", js.undefined)
      
      inline def setDateDisplayUndefined: Self = StObject.set(x, "dateDisplay", js.undefined)
      
      inline def setDateDisplayWrapper(value: String): Self = StObject.set(x, "dateDisplayWrapper", value.asInstanceOf[js.Any])
      
      inline def setDateDisplayWrapperUndefined: Self = StObject.set(x, "dateDisplayWrapper", js.undefined)
      
      inline def setDateRangePickerWrapper(value: String): Self = StObject.set(x, "dateRangePickerWrapper", value.asInstanceOf[js.Any])
      
      inline def setDateRangePickerWrapperUndefined: Self = StObject.set(x, "dateRangePickerWrapper", js.undefined)
      
      inline def setDateRangeWrapper(value: String): Self = StObject.set(x, "dateRangeWrapper", value.asInstanceOf[js.Any])
      
      inline def setDateRangeWrapperUndefined: Self = StObject.set(x, "dateRangeWrapper", js.undefined)
      
      inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setDayActive(value: String): Self = StObject.set(x, "dayActive", value.asInstanceOf[js.Any])
      
      inline def setDayActiveUndefined: Self = StObject.set(x, "dayActive", js.undefined)
      
      inline def setDayDisabled(value: String): Self = StObject.set(x, "dayDisabled", value.asInstanceOf[js.Any])
      
      inline def setDayDisabledUndefined: Self = StObject.set(x, "dayDisabled", js.undefined)
      
      inline def setDayEndOfMonth(value: String): Self = StObject.set(x, "dayEndOfMonth", value.asInstanceOf[js.Any])
      
      inline def setDayEndOfMonthUndefined: Self = StObject.set(x, "dayEndOfMonth", js.undefined)
      
      inline def setDayEndOfWeek(value: String): Self = StObject.set(x, "dayEndOfWeek", value.asInstanceOf[js.Any])
      
      inline def setDayEndOfWeekUndefined: Self = StObject.set(x, "dayEndOfWeek", js.undefined)
      
      inline def setDayEndPreview(value: String): Self = StObject.set(x, "dayEndPreview", value.asInstanceOf[js.Any])
      
      inline def setDayEndPreviewUndefined: Self = StObject.set(x, "dayEndPreview", js.undefined)
      
      inline def setDayHovered(value: String): Self = StObject.set(x, "dayHovered", value.asInstanceOf[js.Any])
      
      inline def setDayHoveredUndefined: Self = StObject.set(x, "dayHovered", js.undefined)
      
      inline def setDayInPreview(value: String): Self = StObject.set(x, "dayInPreview", value.asInstanceOf[js.Any])
      
      inline def setDayInPreviewUndefined: Self = StObject.set(x, "dayInPreview", js.undefined)
      
      inline def setDayNumber(value: String): Self = StObject.set(x, "dayNumber", value.asInstanceOf[js.Any])
      
      inline def setDayNumberUndefined: Self = StObject.set(x, "dayNumber", js.undefined)
      
      inline def setDayPassive(value: String): Self = StObject.set(x, "dayPassive", value.asInstanceOf[js.Any])
      
      inline def setDayPassiveUndefined: Self = StObject.set(x, "dayPassive", js.undefined)
      
      inline def setDaySelected(value: String): Self = StObject.set(x, "daySelected", value.asInstanceOf[js.Any])
      
      inline def setDaySelectedUndefined: Self = StObject.set(x, "daySelected", js.undefined)
      
      inline def setDayStartOfMonth(value: String): Self = StObject.set(x, "dayStartOfMonth", value.asInstanceOf[js.Any])
      
      inline def setDayStartOfMonthUndefined: Self = StObject.set(x, "dayStartOfMonth", js.undefined)
      
      inline def setDayStartOfWeek(value: String): Self = StObject.set(x, "dayStartOfWeek", value.asInstanceOf[js.Any])
      
      inline def setDayStartOfWeekUndefined: Self = StObject.set(x, "dayStartOfWeek", js.undefined)
      
      inline def setDayStartPreview(value: String): Self = StObject.set(x, "dayStartPreview", value.asInstanceOf[js.Any])
      
      inline def setDayStartPreviewUndefined: Self = StObject.set(x, "dayStartPreview", js.undefined)
      
      inline def setDayToday(value: String): Self = StObject.set(x, "dayToday", value.asInstanceOf[js.Any])
      
      inline def setDayTodayUndefined: Self = StObject.set(x, "dayToday", js.undefined)
      
      inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      inline def setDayWeekend(value: String): Self = StObject.set(x, "dayWeekend", value.asInstanceOf[js.Any])
      
      inline def setDayWeekendUndefined: Self = StObject.set(x, "dayWeekend", js.undefined)
      
      inline def setDays(value: String): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      inline def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
      
      inline def setDefinedRangesWrapper(value: String): Self = StObject.set(x, "definedRangesWrapper", value.asInstanceOf[js.Any])
      
      inline def setDefinedRangesWrapperUndefined: Self = StObject.set(x, "definedRangesWrapper", js.undefined)
      
      inline def setEndEdge(value: String): Self = StObject.set(x, "endEdge", value.asInstanceOf[js.Any])
      
      inline def setEndEdgeUndefined: Self = StObject.set(x, "endEdge", js.undefined)
      
      inline def setInRange(value: String): Self = StObject.set(x, "inRange", value.asInstanceOf[js.Any])
      
      inline def setInRangeUndefined: Self = StObject.set(x, "inRange", js.undefined)
      
      inline def setInfiniteMonths(value: String): Self = StObject.set(x, "infiniteMonths", value.asInstanceOf[js.Any])
      
      inline def setInfiniteMonthsUndefined: Self = StObject.set(x, "infiniteMonths", js.undefined)
      
      inline def setInputRange(value: String): Self = StObject.set(x, "inputRange", value.asInstanceOf[js.Any])
      
      inline def setInputRangeInput(value: String): Self = StObject.set(x, "inputRangeInput", value.asInstanceOf[js.Any])
      
      inline def setInputRangeInputUndefined: Self = StObject.set(x, "inputRangeInput", js.undefined)
      
      inline def setInputRangeUndefined: Self = StObject.set(x, "inputRange", js.undefined)
      
      inline def setInputRanges(value: String): Self = StObject.set(x, "inputRanges", value.asInstanceOf[js.Any])
      
      inline def setInputRangesUndefined: Self = StObject.set(x, "inputRanges", js.undefined)
      
      inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthAndYearPickers(value: String): Self = StObject.set(x, "monthAndYearPickers", value.asInstanceOf[js.Any])
      
      inline def setMonthAndYearPickersUndefined: Self = StObject.set(x, "monthAndYearPickers", js.undefined)
      
      inline def setMonthAndYearWrapper(value: String): Self = StObject.set(x, "monthAndYearWrapper", value.asInstanceOf[js.Any])
      
      inline def setMonthAndYearWrapperUndefined: Self = StObject.set(x, "monthAndYearWrapper", js.undefined)
      
      inline def setMonthName(value: String): Self = StObject.set(x, "monthName", value.asInstanceOf[js.Any])
      
      inline def setMonthNameUndefined: Self = StObject.set(x, "monthName", js.undefined)
      
      inline def setMonthPicker(value: String): Self = StObject.set(x, "monthPicker", value.asInstanceOf[js.Any])
      
      inline def setMonthPickerUndefined: Self = StObject.set(x, "monthPicker", js.undefined)
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setMonths(value: String): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsHorizontal(value: String): Self = StObject.set(x, "monthsHorizontal", value.asInstanceOf[js.Any])
      
      inline def setMonthsHorizontalUndefined: Self = StObject.set(x, "monthsHorizontal", js.undefined)
      
      inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
      
      inline def setMonthsVertical(value: String): Self = StObject.set(x, "monthsVertical", value.asInstanceOf[js.Any])
      
      inline def setMonthsVerticalUndefined: Self = StObject.set(x, "monthsVertical", js.undefined)
      
      inline def setNextButton(value: String): Self = StObject.set(x, "nextButton", value.asInstanceOf[js.Any])
      
      inline def setNextButtonUndefined: Self = StObject.set(x, "nextButton", js.undefined)
      
      inline def setNextPrevButton(value: String): Self = StObject.set(x, "nextPrevButton", value.asInstanceOf[js.Any])
      
      inline def setNextPrevButtonUndefined: Self = StObject.set(x, "nextPrevButton", js.undefined)
      
      inline def setPrevButton(value: String): Self = StObject.set(x, "prevButton", value.asInstanceOf[js.Any])
      
      inline def setPrevButtonUndefined: Self = StObject.set(x, "prevButton", js.undefined)
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setStartEdge(value: String): Self = StObject.set(x, "startEdge", value.asInstanceOf[js.Any])
      
      inline def setStartEdgeUndefined: Self = StObject.set(x, "startEdge", js.undefined)
      
      inline def setStaticRange(value: String): Self = StObject.set(x, "staticRange", value.asInstanceOf[js.Any])
      
      inline def setStaticRangeLabel(value: String): Self = StObject.set(x, "staticRangeLabel", value.asInstanceOf[js.Any])
      
      inline def setStaticRangeLabelUndefined: Self = StObject.set(x, "staticRangeLabel", js.undefined)
      
      inline def setStaticRangeSelected(value: String): Self = StObject.set(x, "staticRangeSelected", value.asInstanceOf[js.Any])
      
      inline def setStaticRangeSelectedUndefined: Self = StObject.set(x, "staticRangeSelected", js.undefined)
      
      inline def setStaticRangeUndefined: Self = StObject.set(x, "staticRange", js.undefined)
      
      inline def setStaticRanges(value: String): Self = StObject.set(x, "staticRanges", value.asInstanceOf[js.Any])
      
      inline def setStaticRangesUndefined: Self = StObject.set(x, "staticRanges", js.undefined)
      
      inline def setWeekDay(value: String): Self = StObject.set(x, "weekDay", value.asInstanceOf[js.Any])
      
      inline def setWeekDayUndefined: Self = StObject.set(x, "weekDay", js.undefined)
      
      inline def setWeekDays(value: String): Self = StObject.set(x, "weekDays", value.asInstanceOf[js.Any])
      
      inline def setWeekDaysUndefined: Self = StObject.set(x, "weekDays", js.undefined)
      
      inline def setYearPicker(value: String): Self = StObject.set(x, "yearPicker", value.asInstanceOf[js.Any])
      
      inline def setYearPickerUndefined: Self = StObject.set(x, "yearPicker", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactDateRange.mod.DefinedRangeProps because var conflicts: className, focusedRange, onChange, onPreviewChange, rangeColors, ranges. Inlined footerContent, headerContent, inputRanges, renderStaticRangeLabel, staticRanges */ trait DateRangePickerProps
    extends StObject
       with DateRangeProps {
    
    /** default: none */
    var footerContent: js.UndefOr[ReactNode] = js.undefined
    
    /** default: none */
    var headerContent: js.UndefOr[ReactNode] = js.undefined
    
    /** default: `defaultInputRanges` (defined and exported in package) */
    var inputRanges: js.UndefOr[js.Array[InputRange]] = js.undefined
    
    /**
      * NOTE: currently the date range picker component passes the `onPreviewChange` prop
      * (if included) to both subcomponents even though they seemingly expect different types
      * for this method. Therefore, if passing this prop, it should be able to handle both
      * types so it will work for either component.
      */
    /** default: none */
    @JSName("onPreviewChange")
    var onPreviewChange_DateRangePickerProps: js.UndefOr[js.Function1[/* preview */ js.UndefOr[js.Date | Preview], Unit]] = js.undefined
    
    /**
      * Custom renderer function for static range labels
      *
      * default: none
      */
    var renderStaticRangeLabel: js.UndefOr[js.Function1[/* staticRange */ StaticRange, ReactNode]] = js.undefined
    
    /** default: `defaultStaticRanges` (defined and exported in package) */
    var staticRanges: js.UndefOr[js.Array[StaticRange]] = js.undefined
  }
  object DateRangePickerProps {
    
    inline def apply(): DateRangePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateRangePickerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DateRangePickerProps] (val x: Self) extends AnyVal {
      
      inline def setFooterContent(value: ReactNode): Self = StObject.set(x, "footerContent", value.asInstanceOf[js.Any])
      
      inline def setFooterContentUndefined: Self = StObject.set(x, "footerContent", js.undefined)
      
      inline def setHeaderContent(value: ReactNode): Self = StObject.set(x, "headerContent", value.asInstanceOf[js.Any])
      
      inline def setHeaderContentUndefined: Self = StObject.set(x, "headerContent", js.undefined)
      
      inline def setInputRanges(value: js.Array[InputRange]): Self = StObject.set(x, "inputRanges", value.asInstanceOf[js.Any])
      
      inline def setInputRangesUndefined: Self = StObject.set(x, "inputRanges", js.undefined)
      
      inline def setInputRangesVarargs(value: InputRange*): Self = StObject.set(x, "inputRanges", js.Array(value*))
      
      inline def setOnPreviewChange(value: /* preview */ js.UndefOr[js.Date | Preview] => Unit): Self = StObject.set(x, "onPreviewChange", js.Any.fromFunction1(value))
      
      inline def setOnPreviewChangeUndefined: Self = StObject.set(x, "onPreviewChange", js.undefined)
      
      inline def setRenderStaticRangeLabel(value: /* staticRange */ StaticRange => ReactNode): Self = StObject.set(x, "renderStaticRangeLabel", js.Any.fromFunction1(value))
      
      inline def setRenderStaticRangeLabelUndefined: Self = StObject.set(x, "renderStaticRangeLabel", js.undefined)
      
      inline def setStaticRanges(value: js.Array[StaticRange]): Self = StObject.set(x, "staticRanges", value.asInstanceOf[js.Any])
      
      inline def setStaticRangesUndefined: Self = StObject.set(x, "staticRanges", js.undefined)
      
      inline def setStaticRangesVarargs(value: StaticRange*): Self = StObject.set(x, "staticRanges", js.Array(value*))
    }
  }
  
  /* Inlined parent std.Omit<react-date-range.react-date-range.CalendarProps, 'onChange'> */
  trait DateRangeProps extends StObject {
    
    var ariaLabels: js.UndefOr[AriaLabelsShape] = js.undefined
    
    var calendarFocus: js.UndefOr[forwards | backwards] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var classNames: js.UndefOr[ClassNames] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var date: js.UndefOr[js.Date] = js.undefined
    
    var dateDisplayFormat: js.UndefOr[String] = js.undefined
    
    var dayContentRenderer: js.UndefOr[js.Function1[/* date */ js.Date, ReactNode]] = js.undefined
    
    var dayDisplayFormat: js.UndefOr[String] = js.undefined
    
    var direction: js.UndefOr[vertical | horizontal] = js.undefined
    
    var disabledDates: js.UndefOr[js.Array[js.Date]] = js.undefined
    
    var disabledDay: js.UndefOr[js.Function1[/* date */ js.Date, Boolean]] = js.undefined
    
    var displayMode: js.UndefOr[dateRange | date] = js.undefined
    
    var dragSelectionEnabled: js.UndefOr[Boolean] = js.undefined
    
    var editableDateInputs: js.UndefOr[Boolean] = js.undefined
    
    var endDatePlaceholder: js.UndefOr[String] = js.undefined
    
    var fixedHeight: js.UndefOr[Boolean] = js.undefined
    
    var focusedRange: js.UndefOr[RangeFocus] = js.undefined
    
    var initialFocusedRange: js.UndefOr[RangeFocus] = js.undefined
    
    var locale: js.UndefOr[Locale] = js.undefined
    
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    var monthDisplayFormat: js.UndefOr[String] = js.undefined
    
    var months: js.UndefOr[Double] = js.undefined
    
    /** default: `false` */
    var moveRangeOnFirstSelection: js.UndefOr[Boolean] = js.undefined
    
    var navigatorRenderer: js.UndefOr[
        js.Function3[
          /* currFocusedDate */ js.Date, 
          /* changeShownDate */ js.Function2[
            /* value */ js.Date | Double | String, 
            /* mode */ js.UndefOr[set | setYear | setMonth | monthOffset], 
            Unit
          ], 
          /* props */ CalendarProps, 
          Element
        ]
      ] = js.undefined
    
    /** default: none */
    var onChange: js.UndefOr[js.Function1[/* rangesByKey */ RangeKeyDict, Unit]] = js.undefined
    
    var onPreviewChange: js.UndefOr[js.Function1[/* previewDate */ js.UndefOr[js.Date], Unit]] = js.undefined
    
    var onRangeFocusChange: js.UndefOr[js.Function1[/* newFocusedRange */ RangeFocus, Unit]] = js.undefined
    
    var onShownDateChange: js.UndefOr[js.Function1[/* date */ js.Date, Unit]] = js.undefined
    
    var preventSnapRefocus: js.UndefOr[Boolean] = js.undefined
    
    var preview: js.UndefOr[Preview] = js.undefined
    
    var rangeColors: js.UndefOr[js.Array[String]] = js.undefined
    
    var ranges: js.UndefOr[js.Array[Range]] = js.undefined
    
    /** default: `false` */
    var retainEndDateOnFirstSelection: js.UndefOr[Boolean] = js.undefined
    
    var scroll: js.UndefOr[ScrollOptions] = js.undefined
    
    var showDateDisplay: js.UndefOr[Boolean] = js.undefined
    
    var showMonthAndYearPickers: js.UndefOr[Boolean] = js.undefined
    
    var showMonthArrow: js.UndefOr[Boolean] = js.undefined
    
    var showPreview: js.UndefOr[Boolean] = js.undefined
    
    var shownDate: js.UndefOr[js.Date] = js.undefined
    
    var startDatePlaceholder: js.UndefOr[String] = js.undefined
    
    var updateRange: js.UndefOr[js.Function1[/* newRange */ Range, Unit]] = js.undefined
    
    var weekStartsOn: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
    
    var weekdayDisplayFormat: js.UndefOr[String] = js.undefined
  }
  object DateRangeProps {
    
    inline def apply(): DateRangeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateRangeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DateRangeProps] (val x: Self) extends AnyVal {
      
      inline def setAriaLabels(value: AriaLabelsShape): Self = StObject.set(x, "ariaLabels", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelsUndefined: Self = StObject.set(x, "ariaLabels", js.undefined)
      
      inline def setCalendarFocus(value: forwards | backwards): Self = StObject.set(x, "calendarFocus", value.asInstanceOf[js.Any])
      
      inline def setCalendarFocusUndefined: Self = StObject.set(x, "calendarFocus", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClassNames(value: ClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateDisplayFormat(value: String): Self = StObject.set(x, "dateDisplayFormat", value.asInstanceOf[js.Any])
      
      inline def setDateDisplayFormatUndefined: Self = StObject.set(x, "dateDisplayFormat", js.undefined)
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDayContentRenderer(value: /* date */ js.Date => ReactNode): Self = StObject.set(x, "dayContentRenderer", js.Any.fromFunction1(value))
      
      inline def setDayContentRendererUndefined: Self = StObject.set(x, "dayContentRenderer", js.undefined)
      
      inline def setDayDisplayFormat(value: String): Self = StObject.set(x, "dayDisplayFormat", value.asInstanceOf[js.Any])
      
      inline def setDayDisplayFormatUndefined: Self = StObject.set(x, "dayDisplayFormat", js.undefined)
      
      inline def setDirection(value: vertical | horizontal): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabledDates(value: js.Array[js.Date]): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
      
      inline def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
      
      inline def setDisabledDatesVarargs(value: js.Date*): Self = StObject.set(x, "disabledDates", js.Array(value*))
      
      inline def setDisabledDay(value: /* date */ js.Date => Boolean): Self = StObject.set(x, "disabledDay", js.Any.fromFunction1(value))
      
      inline def setDisabledDayUndefined: Self = StObject.set(x, "disabledDay", js.undefined)
      
      inline def setDisplayMode(value: dateRange | date): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
      
      inline def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
      
      inline def setDragSelectionEnabled(value: Boolean): Self = StObject.set(x, "dragSelectionEnabled", value.asInstanceOf[js.Any])
      
      inline def setDragSelectionEnabledUndefined: Self = StObject.set(x, "dragSelectionEnabled", js.undefined)
      
      inline def setEditableDateInputs(value: Boolean): Self = StObject.set(x, "editableDateInputs", value.asInstanceOf[js.Any])
      
      inline def setEditableDateInputsUndefined: Self = StObject.set(x, "editableDateInputs", js.undefined)
      
      inline def setEndDatePlaceholder(value: String): Self = StObject.set(x, "endDatePlaceholder", value.asInstanceOf[js.Any])
      
      inline def setEndDatePlaceholderUndefined: Self = StObject.set(x, "endDatePlaceholder", js.undefined)
      
      inline def setFixedHeight(value: Boolean): Self = StObject.set(x, "fixedHeight", value.asInstanceOf[js.Any])
      
      inline def setFixedHeightUndefined: Self = StObject.set(x, "fixedHeight", js.undefined)
      
      inline def setFocusedRange(value: RangeFocus): Self = StObject.set(x, "focusedRange", value.asInstanceOf[js.Any])
      
      inline def setFocusedRangeUndefined: Self = StObject.set(x, "focusedRange", js.undefined)
      
      inline def setInitialFocusedRange(value: RangeFocus): Self = StObject.set(x, "initialFocusedRange", value.asInstanceOf[js.Any])
      
      inline def setInitialFocusedRangeUndefined: Self = StObject.set(x, "initialFocusedRange", js.undefined)
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMonthDisplayFormat(value: String): Self = StObject.set(x, "monthDisplayFormat", value.asInstanceOf[js.Any])
      
      inline def setMonthDisplayFormatUndefined: Self = StObject.set(x, "monthDisplayFormat", js.undefined)
      
      inline def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
      
      inline def setMoveRangeOnFirstSelection(value: Boolean): Self = StObject.set(x, "moveRangeOnFirstSelection", value.asInstanceOf[js.Any])
      
      inline def setMoveRangeOnFirstSelectionUndefined: Self = StObject.set(x, "moveRangeOnFirstSelection", js.undefined)
      
      inline def setNavigatorRenderer(
        value: (/* currFocusedDate */ js.Date, /* changeShownDate */ js.Function2[
              /* value */ js.Date | Double | String, 
              /* mode */ js.UndefOr[set | setYear | setMonth | monthOffset], 
              Unit
            ], /* props */ CalendarProps) => Element
      ): Self = StObject.set(x, "navigatorRenderer", js.Any.fromFunction3(value))
      
      inline def setNavigatorRendererUndefined: Self = StObject.set(x, "navigatorRenderer", js.undefined)
      
      inline def setOnChange(value: /* rangesByKey */ RangeKeyDict => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnPreviewChange(value: /* previewDate */ js.UndefOr[js.Date] => Unit): Self = StObject.set(x, "onPreviewChange", js.Any.fromFunction1(value))
      
      inline def setOnPreviewChangeUndefined: Self = StObject.set(x, "onPreviewChange", js.undefined)
      
      inline def setOnRangeFocusChange(value: /* newFocusedRange */ RangeFocus => Unit): Self = StObject.set(x, "onRangeFocusChange", js.Any.fromFunction1(value))
      
      inline def setOnRangeFocusChangeUndefined: Self = StObject.set(x, "onRangeFocusChange", js.undefined)
      
      inline def setOnShownDateChange(value: /* date */ js.Date => Unit): Self = StObject.set(x, "onShownDateChange", js.Any.fromFunction1(value))
      
      inline def setOnShownDateChangeUndefined: Self = StObject.set(x, "onShownDateChange", js.undefined)
      
      inline def setPreventSnapRefocus(value: Boolean): Self = StObject.set(x, "preventSnapRefocus", value.asInstanceOf[js.Any])
      
      inline def setPreventSnapRefocusUndefined: Self = StObject.set(x, "preventSnapRefocus", js.undefined)
      
      inline def setPreview(value: Preview): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
      
      inline def setRangeColors(value: js.Array[String]): Self = StObject.set(x, "rangeColors", value.asInstanceOf[js.Any])
      
      inline def setRangeColorsUndefined: Self = StObject.set(x, "rangeColors", js.undefined)
      
      inline def setRangeColorsVarargs(value: String*): Self = StObject.set(x, "rangeColors", js.Array(value*))
      
      inline def setRanges(value: js.Array[Range]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      inline def setRangesVarargs(value: Range*): Self = StObject.set(x, "ranges", js.Array(value*))
      
      inline def setRetainEndDateOnFirstSelection(value: Boolean): Self = StObject.set(x, "retainEndDateOnFirstSelection", value.asInstanceOf[js.Any])
      
      inline def setRetainEndDateOnFirstSelectionUndefined: Self = StObject.set(x, "retainEndDateOnFirstSelection", js.undefined)
      
      inline def setScroll(value: ScrollOptions): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      inline def setShowDateDisplay(value: Boolean): Self = StObject.set(x, "showDateDisplay", value.asInstanceOf[js.Any])
      
      inline def setShowDateDisplayUndefined: Self = StObject.set(x, "showDateDisplay", js.undefined)
      
      inline def setShowMonthAndYearPickers(value: Boolean): Self = StObject.set(x, "showMonthAndYearPickers", value.asInstanceOf[js.Any])
      
      inline def setShowMonthAndYearPickersUndefined: Self = StObject.set(x, "showMonthAndYearPickers", js.undefined)
      
      inline def setShowMonthArrow(value: Boolean): Self = StObject.set(x, "showMonthArrow", value.asInstanceOf[js.Any])
      
      inline def setShowMonthArrowUndefined: Self = StObject.set(x, "showMonthArrow", js.undefined)
      
      inline def setShowPreview(value: Boolean): Self = StObject.set(x, "showPreview", value.asInstanceOf[js.Any])
      
      inline def setShowPreviewUndefined: Self = StObject.set(x, "showPreview", js.undefined)
      
      inline def setShownDate(value: js.Date): Self = StObject.set(x, "shownDate", value.asInstanceOf[js.Any])
      
      inline def setShownDateUndefined: Self = StObject.set(x, "shownDate", js.undefined)
      
      inline def setStartDatePlaceholder(value: String): Self = StObject.set(x, "startDatePlaceholder", value.asInstanceOf[js.Any])
      
      inline def setStartDatePlaceholderUndefined: Self = StObject.set(x, "startDatePlaceholder", js.undefined)
      
      inline def setUpdateRange(value: /* newRange */ Range => Unit): Self = StObject.set(x, "updateRange", js.Any.fromFunction1(value))
      
      inline def setUpdateRangeUndefined: Self = StObject.set(x, "updateRange", js.undefined)
      
      inline def setWeekStartsOn(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "weekStartsOn", value.asInstanceOf[js.Any])
      
      inline def setWeekStartsOnUndefined: Self = StObject.set(x, "weekStartsOn", js.undefined)
      
      inline def setWeekdayDisplayFormat(value: String): Self = StObject.set(x, "weekdayDisplayFormat", value.asInstanceOf[js.Any])
      
      inline def setWeekdayDisplayFormatUndefined: Self = StObject.set(x, "weekdayDisplayFormat", js.undefined)
    }
  }
  
  trait DefinedRangeProps extends StObject {
    
    /** default: none */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Which range and step are focused. First value is index of ranges, second value
      * is which step on date range (startDate or endDate)
      *
      * default: `[0, 0]`
      */
    var focusedRange: js.UndefOr[RangeFocus] = js.undefined
    
    /** default: none */
    var footerContent: js.UndefOr[ReactNode] = js.undefined
    
    /** default: none */
    var headerContent: js.UndefOr[ReactNode] = js.undefined
    
    /** default: `defaultInputRanges` (defined and exported in package) */
    var inputRanges: js.UndefOr[js.Array[InputRange]] = js.undefined
    
    /** default: none */
    var onChange: js.UndefOr[js.Function1[/* rangesByKey */ RangeKeyDict, Unit]] = js.undefined
    
    /** default: none */
    var onPreviewChange: js.UndefOr[js.Function1[/* preview */ js.UndefOr[Preview], Unit]] = js.undefined
    
    /** default: `['#3d91ff', '#3ecf8e', '#fed14c']` */
    var rangeColors: js.UndefOr[js.Array[String]] = js.undefined
    
    /** default: [] */
    var ranges: js.UndefOr[js.Array[Range]] = js.undefined
    
    /**
      * Custom renderer function for static range labels
      *
      * default: none
      */
    var renderStaticRangeLabel: js.UndefOr[js.Function1[/* staticRange */ StaticRange, ReactNode]] = js.undefined
    
    /** default: `defaultStaticRanges` (defined and exported in package) */
    var staticRanges: js.UndefOr[js.Array[StaticRange]] = js.undefined
  }
  object DefinedRangeProps {
    
    inline def apply(): DefinedRangeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefinedRangeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefinedRangeProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFocusedRange(value: RangeFocus): Self = StObject.set(x, "focusedRange", value.asInstanceOf[js.Any])
      
      inline def setFocusedRangeUndefined: Self = StObject.set(x, "focusedRange", js.undefined)
      
      inline def setFooterContent(value: ReactNode): Self = StObject.set(x, "footerContent", value.asInstanceOf[js.Any])
      
      inline def setFooterContentUndefined: Self = StObject.set(x, "footerContent", js.undefined)
      
      inline def setHeaderContent(value: ReactNode): Self = StObject.set(x, "headerContent", value.asInstanceOf[js.Any])
      
      inline def setHeaderContentUndefined: Self = StObject.set(x, "headerContent", js.undefined)
      
      inline def setInputRanges(value: js.Array[InputRange]): Self = StObject.set(x, "inputRanges", value.asInstanceOf[js.Any])
      
      inline def setInputRangesUndefined: Self = StObject.set(x, "inputRanges", js.undefined)
      
      inline def setInputRangesVarargs(value: InputRange*): Self = StObject.set(x, "inputRanges", js.Array(value*))
      
      inline def setOnChange(value: /* rangesByKey */ RangeKeyDict => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnPreviewChange(value: /* preview */ js.UndefOr[Preview] => Unit): Self = StObject.set(x, "onPreviewChange", js.Any.fromFunction1(value))
      
      inline def setOnPreviewChangeUndefined: Self = StObject.set(x, "onPreviewChange", js.undefined)
      
      inline def setRangeColors(value: js.Array[String]): Self = StObject.set(x, "rangeColors", value.asInstanceOf[js.Any])
      
      inline def setRangeColorsUndefined: Self = StObject.set(x, "rangeColors", js.undefined)
      
      inline def setRangeColorsVarargs(value: String*): Self = StObject.set(x, "rangeColors", js.Array(value*))
      
      inline def setRanges(value: js.Array[Range]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      inline def setRangesVarargs(value: Range*): Self = StObject.set(x, "ranges", js.Array(value*))
      
      inline def setRenderStaticRangeLabel(value: /* staticRange */ StaticRange => ReactNode): Self = StObject.set(x, "renderStaticRangeLabel", js.Any.fromFunction1(value))
      
      inline def setRenderStaticRangeLabelUndefined: Self = StObject.set(x, "renderStaticRangeLabel", js.undefined)
      
      inline def setStaticRanges(value: js.Array[StaticRange]): Self = StObject.set(x, "staticRanges", value.asInstanceOf[js.Any])
      
      inline def setStaticRangesUndefined: Self = StObject.set(x, "staticRanges", js.undefined)
      
      inline def setStaticRangesVarargs(value: StaticRange*): Self = StObject.set(x, "staticRanges", js.Array(value*))
    }
  }
  
  @js.native
  trait InputRange extends StObject {
    
    def getCurrentValue(range: Range): String | Double = js.native
    
    var label: js.UndefOr[String] = js.native
    
    def range(value: Double): Range = js.native
    def range(value: Double, props: DefinedRangeProps): Range = js.native
  }
  
  /* Inlined std.Pick<react-date-range.react-date-range.Range, 'startDate' | 'endDate' | 'color'> */
  trait Preview extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    var startDate: js.UndefOr[js.Date] = js.undefined
  }
  object Preview {
    
    inline def apply(): Preview = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Preview]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Preview] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    }
  }
  
  trait Range extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var showDateDisplay: js.UndefOr[Boolean] = js.undefined
    
    var startDate: js.UndefOr[js.Date] = js.undefined
  }
  object Range {
    
    inline def apply(): Range = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Range]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setShowDateDisplay(value: Boolean): Self = StObject.set(x, "showDateDisplay", value.asInstanceOf[js.Any])
      
      inline def setShowDateDisplayUndefined: Self = StObject.set(x, "showDateDisplay", js.undefined)
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    }
  }
  
  type RangeFocus = js.Tuple2[Double, `0` | `1`]
  
  type RangeKeyDict = StringDictionary[Range]
  
  trait ScrollOptions extends StObject {
    
    var calendarHeight: js.UndefOr[Double] = js.undefined
    
    var calendarWidth: js.UndefOr[Double] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var longMonthHeight: js.UndefOr[Double] = js.undefined
    
    var monthHeight: js.UndefOr[Double] = js.undefined
    
    var monthWidth: js.UndefOr[Double] = js.undefined
  }
  object ScrollOptions {
    
    inline def apply(): ScrollOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollOptions] (val x: Self) extends AnyVal {
      
      inline def setCalendarHeight(value: Double): Self = StObject.set(x, "calendarHeight", value.asInstanceOf[js.Any])
      
      inline def setCalendarHeightUndefined: Self = StObject.set(x, "calendarHeight", js.undefined)
      
      inline def setCalendarWidth(value: Double): Self = StObject.set(x, "calendarWidth", value.asInstanceOf[js.Any])
      
      inline def setCalendarWidthUndefined: Self = StObject.set(x, "calendarWidth", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setLongMonthHeight(value: Double): Self = StObject.set(x, "longMonthHeight", value.asInstanceOf[js.Any])
      
      inline def setLongMonthHeightUndefined: Self = StObject.set(x, "longMonthHeight", js.undefined)
      
      inline def setMonthHeight(value: Double): Self = StObject.set(x, "monthHeight", value.asInstanceOf[js.Any])
      
      inline def setMonthHeightUndefined: Self = StObject.set(x, "monthHeight", js.undefined)
      
      inline def setMonthWidth(value: Double): Self = StObject.set(x, "monthWidth", value.asInstanceOf[js.Any])
      
      inline def setMonthWidthUndefined: Self = StObject.set(x, "monthWidth", js.undefined)
    }
  }
  
  @js.native
  trait StaticRange extends StObject {
    
    var hasCustomRendering: js.UndefOr[Boolean] = js.native
    
    def isSelected(range: Range): Boolean = js.native
    
    var label: js.UndefOr[String] = js.native
    
    def range(): Preview = js.native
    def range(props: DefinedRangeProps): Preview = js.native
  }
}
