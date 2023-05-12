package typings.reactDatepicker

import org.scalablytyped.runtime.StringDictionary
import typings.dateFns.mod.Locale
import typings.popperjsCore.libEnumsMod.Placement
import typings.react.mod.Component
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.reactDatepicker.anon.Children
import typings.reactDatepicker.anon.Code
import typings.reactDatepicker.anon.End
import typings.reactDatepicker.reactDatepickerStrings.scroll
import typings.reactDatepicker.reactDatepickerStrings.select
import typings.reactPopper.mod.Modifier
import typings.reactPopper.mod.StrictModifierNames
import typings.std.Element
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import typings.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-datepicker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-datepicker", JSImport.Default)
  @js.native
  open class default[CustomModifierNames /* <: String */, WithRange /* <: js.UndefOr[Boolean] */] protected () extends ReactDatePicker[CustomModifierNames, WithRange] {
    def this(props: ReactDatePickerProps[CustomModifierNames, WithRange]) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ReactDatePickerProps[CustomModifierNames, WithRange], context: Any) = this()
  }
  
  inline def CalendarContainer(props: CalendarContainerProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("CalendarContainer")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("react-datepicker", "ReactDatePicker")
  @js.native
  open class ReactDatePicker[CustomModifierNames /* <: String */, WithRange /* <: js.UndefOr[Boolean] */] protected ()
    extends Component[ReactDatePickerProps[CustomModifierNames, WithRange], js.Object, Any] {
    def this(props: ReactDatePickerProps[CustomModifierNames, WithRange]) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ReactDatePickerProps[CustomModifierNames, WithRange], context: Any) = this()
    
    def isCalendarOpen(): Boolean = js.native
    
    def setBlur(): Unit = js.native
    
    def setFocus(): Unit = js.native
    
    def setOpen(open: Boolean): Unit = js.native
    def setOpen(open: Boolean, skipSetBlur: Boolean): Unit = js.native
  }
  
  inline def getDefaultLocale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultLocale")().asInstanceOf[String]
  
  inline def registerLocale(localeName: String, localeData: Locale): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLocale")(localeName.asInstanceOf[js.Any], localeData.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setDefaultLocale(localeName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultLocale")(localeName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait CalendarContainerProps extends StObject {
    
    var arrowProps: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var children: js.UndefOr[ReactNode | js.Array[ReactNode]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var showPopperArrow: js.UndefOr[Boolean] = js.undefined
  }
  object CalendarContainerProps {
    
    inline def apply(): CalendarContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarContainerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalendarContainerProps] (val x: Self) extends AnyVal {
      
      inline def setArrowProps(value: StringDictionary[Any]): Self = StObject.set(x, "arrowProps", value.asInstanceOf[js.Any])
      
      inline def setArrowPropsUndefined: Self = StObject.set(x, "arrowProps", js.undefined)
      
      inline def setChildren(value: ReactNode | js.Array[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setShowPopperArrow(value: Boolean): Self = StObject.set(x, "showPopperArrow", value.asInstanceOf[js.Any])
      
      inline def setShowPopperArrowUndefined: Self = StObject.set(x, "showPopperArrow", js.undefined)
    }
  }
  
  type HighlightDates = StringDictionary[js.Array[js.Date]]
  
  trait ReactDatePickerCustomHeaderProps extends StObject {
    
    def changeMonth(month: Double): Unit
    
    def changeYear(year: Double): Unit
    
    var customHeaderCount: Double
    
    var date: js.Date
    
    def decreaseMonth(): Unit
    
    def decreaseYear(): Unit
    
    def increaseMonth(): Unit
    
    def increaseYear(): Unit
    
    var monthDate: js.Date
    
    var nextMonthButtonDisabled: Boolean
    
    var nextYearButtonDisabled: Boolean
    
    var prevMonthButtonDisabled: Boolean
    
    var prevYearButtonDisabled: Boolean
  }
  object ReactDatePickerCustomHeaderProps {
    
    inline def apply(
      changeMonth: Double => Unit,
      changeYear: Double => Unit,
      customHeaderCount: Double,
      date: js.Date,
      decreaseMonth: () => Unit,
      decreaseYear: () => Unit,
      increaseMonth: () => Unit,
      increaseYear: () => Unit,
      monthDate: js.Date,
      nextMonthButtonDisabled: Boolean,
      nextYearButtonDisabled: Boolean,
      prevMonthButtonDisabled: Boolean,
      prevYearButtonDisabled: Boolean
    ): ReactDatePickerCustomHeaderProps = {
      val __obj = js.Dynamic.literal(changeMonth = js.Any.fromFunction1(changeMonth), changeYear = js.Any.fromFunction1(changeYear), customHeaderCount = customHeaderCount.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], decreaseMonth = js.Any.fromFunction0(decreaseMonth), decreaseYear = js.Any.fromFunction0(decreaseYear), increaseMonth = js.Any.fromFunction0(increaseMonth), increaseYear = js.Any.fromFunction0(increaseYear), monthDate = monthDate.asInstanceOf[js.Any], nextMonthButtonDisabled = nextMonthButtonDisabled.asInstanceOf[js.Any], nextYearButtonDisabled = nextYearButtonDisabled.asInstanceOf[js.Any], prevMonthButtonDisabled = prevMonthButtonDisabled.asInstanceOf[js.Any], prevYearButtonDisabled = prevYearButtonDisabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactDatePickerCustomHeaderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactDatePickerCustomHeaderProps] (val x: Self) extends AnyVal {
      
      inline def setChangeMonth(value: Double => Unit): Self = StObject.set(x, "changeMonth", js.Any.fromFunction1(value))
      
      inline def setChangeYear(value: Double => Unit): Self = StObject.set(x, "changeYear", js.Any.fromFunction1(value))
      
      inline def setCustomHeaderCount(value: Double): Self = StObject.set(x, "customHeaderCount", value.asInstanceOf[js.Any])
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDecreaseMonth(value: () => Unit): Self = StObject.set(x, "decreaseMonth", js.Any.fromFunction0(value))
      
      inline def setDecreaseYear(value: () => Unit): Self = StObject.set(x, "decreaseYear", js.Any.fromFunction0(value))
      
      inline def setIncreaseMonth(value: () => Unit): Self = StObject.set(x, "increaseMonth", js.Any.fromFunction0(value))
      
      inline def setIncreaseYear(value: () => Unit): Self = StObject.set(x, "increaseYear", js.Any.fromFunction0(value))
      
      inline def setMonthDate(value: js.Date): Self = StObject.set(x, "monthDate", value.asInstanceOf[js.Any])
      
      inline def setNextMonthButtonDisabled(value: Boolean): Self = StObject.set(x, "nextMonthButtonDisabled", value.asInstanceOf[js.Any])
      
      inline def setNextYearButtonDisabled(value: Boolean): Self = StObject.set(x, "nextYearButtonDisabled", value.asInstanceOf[js.Any])
      
      inline def setPrevMonthButtonDisabled(value: Boolean): Self = StObject.set(x, "prevMonthButtonDisabled", value.asInstanceOf[js.Any])
      
      inline def setPrevYearButtonDisabled(value: Boolean): Self = StObject.set(x, "prevYearButtonDisabled", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReactDatePickerProps[CustomModifierNames /* <: String */, WithRange /* <: js.UndefOr[Boolean] */] extends StObject {
    
    var adjustDateOnChange: js.UndefOr[Boolean] = js.native
    
    var allowSameDay: js.UndefOr[Boolean] = js.native
    
    var ariaDescribedBy: js.UndefOr[String] = js.native
    
    var ariaInvalid: js.UndefOr[String] = js.native
    
    var ariaLabelClose: js.UndefOr[String] = js.native
    
    var ariaLabelledBy: js.UndefOr[String] = js.native
    
    var ariaRequired: js.UndefOr[String] = js.native
    
    var autoComplete: js.UndefOr[String] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var calendarClassName: js.UndefOr[String] = js.native
    
    var calendarContainer: js.UndefOr[js.Function1[/* props */ CalendarContainerProps, ReactNode]] = js.native
    
    var calendarStartDay: js.UndefOr[Double] = js.native
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var chooseDayAriaLabelPrefix: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var clearButtonClassName: js.UndefOr[String] = js.native
    
    var clearButtonTitle: js.UndefOr[String] = js.native
    
    var closeOnScroll: js.UndefOr[Boolean | (js.Function1[/* e */ Event, Boolean])] = js.native
    
    var customInput: js.UndefOr[ReactNode] = js.native
    
    var customInputRef: js.UndefOr[String] = js.native
    
    var customTimeInput: js.UndefOr[ReactNode] = js.native
    
    var dateFormat: js.UndefOr[String | js.Array[String]] = js.native
    
    var dateFormatCalendar: js.UndefOr[String] = js.native
    
    var dayClassName: js.UndefOr[js.Function1[/* date */ js.Date, String | Null]] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var disabledDayAriaLabelPrefix: js.UndefOr[String] = js.native
    
    var disabledKeyboardNavigation: js.UndefOr[Boolean] = js.native
    
    var dropdownMode: js.UndefOr[scroll | select] = js.native
    
    var enableTabLoop: js.UndefOr[Boolean] = js.native
    
    var endDate: js.UndefOr[js.Date | Null] = js.native
    
    var excludeDateIntervals: js.UndefOr[js.Array[End]] = js.native
    
    var excludeDates: js.UndefOr[js.Array[js.Date]] = js.native
    
    var excludeScrollbar: js.UndefOr[Boolean] = js.native
    
    var excludeTimes: js.UndefOr[js.Array[js.Date]] = js.native
    
    var filterDate: js.UndefOr[js.Function1[/* date */ js.Date, Boolean]] = js.native
    
    var filterTime: js.UndefOr[js.Function1[/* date */ js.Date, Boolean]] = js.native
    
    var fixedHeight: js.UndefOr[Boolean] = js.native
    
    var focusSelectedMonth: js.UndefOr[Boolean] = js.native
    
    var forceShowMonthNavigation: js.UndefOr[Boolean] = js.native
    
    var formatWeekDay: js.UndefOr[js.Function1[/* day */ String, ReactNode]] = js.native
    
    var formatWeekNumber: js.UndefOr[js.Function1[/* date */ js.Date, String | Double]] = js.native
    
    var highlightDates: js.UndefOr[js.Array[HighlightDates | js.Date]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var includeDateIntervals: js.UndefOr[js.Array[End]] = js.native
    
    var includeDates: js.UndefOr[js.Array[js.Date]] = js.native
    
    var includeTimes: js.UndefOr[js.Array[js.Date]] = js.native
    
    var injectTimes: js.UndefOr[js.Array[js.Date]] = js.native
    
    var `inline`: js.UndefOr[Boolean] = js.native
    
    var isClearable: js.UndefOr[Boolean] = js.native
    
    var locale: js.UndefOr[String | Locale] = js.native
    
    var maxDate: js.UndefOr[js.Date | Null] = js.native
    
    var maxTime: js.UndefOr[js.Date] = js.native
    
    var minDate: js.UndefOr[js.Date | Null] = js.native
    
    var minTime: js.UndefOr[js.Date] = js.native
    
    var monthAriaLabelPrefix: js.UndefOr[String] = js.native
    
    var monthClassName: js.UndefOr[js.Function1[/* date */ js.Date, String | Null]] = js.native
    
    var monthsShown: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var nextMonthAriaLabel: js.UndefOr[String] = js.native
    
    var nextMonthButtonLabel: js.UndefOr[String | ReactNode] = js.native
    
    var nextYearAriaLabel: js.UndefOr[String] = js.native
    
    var nextYearButtonLabel: js.UndefOr[String | ReactNode] = js.native
    
    var onBlur: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLInputElement, Element], Unit]] = js.native
    
    var onCalendarClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onCalendarOpen: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onChangeRaw: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLInputElement, Element], Unit]] = js.native
    
    @JSName("onChange")
    def onChange_false(
      date: /* import warning: importer.ImportType#apply Failed type conversion: WithRange extends false | undefined ? std.Date | null : [std.Date | null, std.Date | null] */ js.Any
    ): Unit = js.native
    @JSName("onChange")
    def onChange_false(
      date: /* import warning: importer.ImportType#apply Failed type conversion: WithRange extends false | undefined ? std.Date | null : [std.Date | null, std.Date | null] */ js.Any,
      event: SyntheticEvent[Any, Event]
    ): Unit = js.native
    
    var onClickOutside: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.native
    
    var onDayMouseEnter: js.UndefOr[js.Function1[/* date */ js.Date, Unit]] = js.native
    
    var onFocus: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLInputElement, Element], Unit]] = js.native
    
    var onInputClick: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onInputError: js.UndefOr[js.Function1[/* err */ Code, Unit]] = js.native
    
    var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent[HTMLDivElement], Unit]] = js.native
    
    var onMonthChange: js.UndefOr[js.Function1[/* date */ js.Date, Unit]] = js.native
    
    var onMonthMouseLeave: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onSelect: js.UndefOr[
        js.Function2[/* date */ js.Date, /* event */ js.UndefOr[SyntheticEvent[Any, Event]], Unit]
      ] = js.native
    
    var onWeekSelect: js.UndefOr[
        js.Function3[
          /* firstDayOfWeek */ js.Date, 
          /* weekNumber */ String | Double, 
          /* event */ js.UndefOr[SyntheticEvent[Any, Event]], 
          Unit
        ]
      ] = js.native
    
    var onYearChange: js.UndefOr[js.Function1[/* date */ js.Date, Unit]] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var openToDate: js.UndefOr[js.Date] = js.native
    
    var peekNextMonth: js.UndefOr[Boolean] = js.native
    
    var placeholderText: js.UndefOr[String] = js.native
    
    var popperClassName: js.UndefOr[String] = js.native
    
    var popperContainer: js.UndefOr[js.Function1[/* props */ Children, ReactNode]] = js.native
    
    var popperModifiers: js.UndefOr[js.Array[Modifier[StrictModifierNames | CustomModifierNames, js.Object]]] = js.native
    
    var popperPlacement: js.UndefOr[Placement] = js.native
    
    var popperProps: js.UndefOr[js.Object] = js.native
    
    var portalHost: js.UndefOr[ShadowRoot] = js.native
    
    var portalId: js.UndefOr[String] = js.native
    
    var preventOpenOnFocus: js.UndefOr[Boolean] = js.native
    
    var previousMonthAriaLabel: js.UndefOr[String] = js.native
    
    var previousMonthButtonLabel: js.UndefOr[String | ReactNode] = js.native
    
    var previousYearAriaLabel: js.UndefOr[String] = js.native
    
    var previousYearButtonLabel: js.UndefOr[String | ReactNode] = js.native
    
    var readOnly: js.UndefOr[Boolean] = js.native
    
    var renderCustomHeader: js.UndefOr[js.Function1[/* params */ ReactDatePickerCustomHeaderProps, ReactNode]] = js.native
    
    var renderDayContents: js.UndefOr[js.Function2[/* dayOfMonth */ Double, /* date */ js.UndefOr[js.Date], ReactNode]] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var scrollableMonthYearDropdown: js.UndefOr[Boolean] = js.native
    
    var scrollableYearDropdown: js.UndefOr[Boolean] = js.native
    
    var selected: js.UndefOr[js.Date | Null] = js.native
    
    var selectsEnd: js.UndefOr[Boolean] = js.native
    
    var selectsRange: js.UndefOr[WithRange] = js.native
    
    var selectsStart: js.UndefOr[Boolean] = js.native
    
    var shouldCloseOnSelect: js.UndefOr[Boolean] = js.native
    
    var showDisabledMonthNavigation: js.UndefOr[Boolean] = js.native
    
    var showFourColumnMonthYearPicker: js.UndefOr[Boolean] = js.native
    
    var showFullMonthYearPicker: js.UndefOr[Boolean] = js.native
    
    var showIcon: js.UndefOr[Boolean] = js.native
    
    var showMonthDropdown: js.UndefOr[Boolean] = js.native
    
    var showMonthYearDropdown: js.UndefOr[Boolean] = js.native
    
    var showMonthYearPicker: js.UndefOr[Boolean] = js.native
    
    var showPopperArrow: js.UndefOr[Boolean] = js.native
    
    var showPreviousMonths: js.UndefOr[Boolean] = js.native
    
    var showQuarterYearPicker: js.UndefOr[Boolean] = js.native
    
    var showTimeInput: js.UndefOr[Boolean] = js.native
    
    var showTimeSelect: js.UndefOr[Boolean] = js.native
    
    var showTimeSelectOnly: js.UndefOr[Boolean] = js.native
    
    var showTwoColumnMonthYearPicker: js.UndefOr[Boolean] = js.native
    
    var showWeekNumbers: js.UndefOr[Boolean] = js.native
    
    var showYearDropdown: js.UndefOr[Boolean] = js.native
    
    var showYearPicker: js.UndefOr[Boolean] = js.native
    
    var startDate: js.UndefOr[js.Date | Null] = js.native
    
    var startOpen: js.UndefOr[Boolean] = js.native
    
    var strictParsing: js.UndefOr[Boolean] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var timeCaption: js.UndefOr[String] = js.native
    
    var timeClassName: js.UndefOr[js.Function1[/* date */ js.Date, String | Null]] = js.native
    
    var timeFormat: js.UndefOr[String] = js.native
    
    var timeInputLabel: js.UndefOr[String] = js.native
    
    var timeIntervals: js.UndefOr[Double] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var todayButton: js.UndefOr[ReactNode] = js.native
    
    var useShortMonthInDropdown: js.UndefOr[Boolean] = js.native
    
    var useWeekdaysShort: js.UndefOr[Boolean] = js.native
    
    var value: js.UndefOr[String] = js.native
    
    var weekAriaLabelPrefix: js.UndefOr[String] = js.native
    
    var weekDayClassName: js.UndefOr[js.Function1[/* date */ js.Date, String | Null]] = js.native
    
    var weekLabel: js.UndefOr[String] = js.native
    
    var withPortal: js.UndefOr[Boolean] = js.native
    
    var wrapperClassName: js.UndefOr[String] = js.native
    
    var yearDropdownItemNumber: js.UndefOr[Double] = js.native
    
    var yearItemNumber: js.UndefOr[Double] = js.native
  }
}
