package typings.reactDatepicker

import org.scalablytyped.runtime.StringDictionary
import typings.dateFns.mod.Locale
import typings.popperJs.mod.Modifiers
import typings.react.mod.Component
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.reactDatepicker.anon.ChangeMonth
import typings.reactDatepicker.anon.Children
import typings.reactDatepicker.anon.Code
import typings.reactDatepicker.reactDatepickerStrings.scroll
import typings.reactDatepicker.reactDatepickerStrings.select
import typings.std.Date
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-datepicker", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait ReactDatePicker
    extends Component[ReactDatePickerProps, js.Object, js.Any] {
    def isCalendarOpen(): Boolean = js.native
    def setBlur(): Unit = js.native
    def setFocus(): Unit = js.native
    def setOpen(open: Boolean): Unit = js.native
    def setOpen(open: Boolean, skipSetBlur: Boolean): Unit = js.native
  }
  
  @js.native
  trait ReactDatePickerProps extends js.Object {
    var adjustDateOnChange: js.UndefOr[Boolean] = js.native
    var allowSameDay: js.UndefOr[Boolean] = js.native
    var ariaLabelClose: js.UndefOr[String] = js.native
    var ariaLabelledBy: js.UndefOr[String] = js.native
    var autoComplete: js.UndefOr[String] = js.native
    var autoFocus: js.UndefOr[Boolean] = js.native
    var calendarClassName: js.UndefOr[String] = js.native
    var calendarContainer: js.UndefOr[js.Function1[/* props */ Children, ReactNode]] = js.native
    var children: js.UndefOr[ReactNode] = js.native
    var chooseDayAriaLabelPrefix: js.UndefOr[String] = js.native
    var className: js.UndefOr[String] = js.native
    var clearButtonTitle: js.UndefOr[String] = js.native
    var closeOnScroll: js.UndefOr[Boolean | (js.Function1[/* e */ Event, Boolean])] = js.native
    var customInput: js.UndefOr[ReactNode] = js.native
    var customInputRef: js.UndefOr[String] = js.native
    var customTimeInput: js.UndefOr[ReactNode] = js.native
    var dateFormat: js.UndefOr[String | js.Array[String]] = js.native
    var dateFormatCalendar: js.UndefOr[String] = js.native
    var dayClassName: js.UndefOr[js.Function1[/* date */ Date, String | Null]] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var disabledDayAriaLabelPrefix: js.UndefOr[String] = js.native
    var disabledKeyboardNavigation: js.UndefOr[Boolean] = js.native
    var dropdownMode: js.UndefOr[scroll | select] = js.native
    var enableTabLoop: js.UndefOr[Boolean] = js.native
    var endDate: js.UndefOr[Date | Null] = js.native
    var excludeDates: js.UndefOr[js.Array[Date]] = js.native
    var excludeScrollbar: js.UndefOr[Boolean] = js.native
    var excludeTimes: js.UndefOr[js.Array[Date]] = js.native
    var filterDate: js.UndefOr[js.Function1[/* date */ Date, Boolean]] = js.native
    var fixedHeight: js.UndefOr[Boolean] = js.native
    var focusSelectedMonth: js.UndefOr[Boolean] = js.native
    var forceShowMonthNavigation: js.UndefOr[Boolean] = js.native
    var formatWeekDay: js.UndefOr[js.Function1[/* formattedDate */ String, String]] = js.native
    var formatWeekNumber: js.UndefOr[js.Function1[/* date */ Date, String | Double]] = js.native
    var highlightDates: js.UndefOr[js.Array[HighlightDates | Date]] = js.native
    var id: js.UndefOr[String] = js.native
    var includeDates: js.UndefOr[js.Array[Date]] = js.native
    var includeTimes: js.UndefOr[js.Array[Date]] = js.native
    var injectTimes: js.UndefOr[js.Array[Date]] = js.native
    var `inline`: js.UndefOr[Boolean] = js.native
    var isClearable: js.UndefOr[Boolean] = js.native
    var locale: js.UndefOr[String | Locale] = js.native
    var maxDate: js.UndefOr[Date | Null] = js.native
    var maxTime: js.UndefOr[Date] = js.native
    var minDate: js.UndefOr[Date | Null] = js.native
    var minTime: js.UndefOr[Date] = js.native
    var monthClassName: js.UndefOr[js.Function1[/* date */ Date, String | Null]] = js.native
    var monthsShown: js.UndefOr[Double] = js.native
    var name: js.UndefOr[String] = js.native
    var nextMonthButtonLabel: js.UndefOr[String] = js.native
    var nextYearButtonLabel: js.UndefOr[String] = js.native
    var onBlur: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLInputElement], Unit]] = js.native
    var onCalendarClose: js.UndefOr[js.Function0[Unit]] = js.native
    var onCalendarOpen: js.UndefOr[js.Function0[Unit]] = js.native
    var onChangeRaw: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLInputElement], Unit]] = js.native
    var onClickOutside: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.native
    var onDayMouseEnter: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.native
    var onFocus: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLInputElement], Unit]] = js.native
    var onInputClick: js.UndefOr[js.Function0[Unit]] = js.native
    var onInputError: js.UndefOr[js.Function1[/* err */ Code, Unit]] = js.native
    var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent[HTMLDivElement], Unit]] = js.native
    var onMonthChange: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.native
    var onMonthMouseLeave: js.UndefOr[js.Function0[Unit]] = js.native
    var onSelect: js.UndefOr[
        js.Function2[/* date */ Date, /* event */ js.UndefOr[SyntheticEvent[_, Event]], Unit]
      ] = js.native
    var onWeekSelect: js.UndefOr[
        js.Function3[
          /* firstDayOfWeek */ Date, 
          /* weekNumber */ String | Double, 
          /* event */ js.UndefOr[SyntheticEvent[_, Event]], 
          Unit
        ]
      ] = js.native
    var onYearChange: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.native
    var open: js.UndefOr[Boolean] = js.native
    var openToDate: js.UndefOr[Date] = js.native
    var peekNextMonth: js.UndefOr[Boolean] = js.native
    var placeholderText: js.UndefOr[String] = js.native
    var popperClassName: js.UndefOr[String] = js.native
    var popperContainer: js.UndefOr[js.Function1[/* props */ Children, ReactNode]] = js.native
    var popperModifiers: js.UndefOr[Modifiers] = js.native
    var popperPlacement: js.UndefOr[String] = js.native
    var popperProps: js.UndefOr[js.Object] = js.native
    var portalId: js.UndefOr[String] = js.native
    var preventOpenOnFocus: js.UndefOr[Boolean] = js.native
    var previousMonthButtonLabel: js.UndefOr[String] = js.native
    var previousYearButtonLabel: js.UndefOr[String] = js.native
    var readOnly: js.UndefOr[Boolean] = js.native
    var renderCustomHeader: js.UndefOr[js.Function1[/* params */ ChangeMonth, ReactNode]] = js.native
    var renderDayContents: js.UndefOr[js.Function2[/* dayOfMonth */ Double, /* date */ js.UndefOr[Date], ReactNode]] = js.native
    var required: js.UndefOr[Boolean] = js.native
    var scrollableMonthYearDropdown: js.UndefOr[Boolean] = js.native
    var scrollableYearDropdown: js.UndefOr[Boolean] = js.native
    var selected: js.UndefOr[Date | Null] = js.native
    var selectsEnd: js.UndefOr[Boolean] = js.native
    var selectsRange: js.UndefOr[Boolean] = js.native
    var selectsStart: js.UndefOr[Boolean] = js.native
    var shouldCloseOnSelect: js.UndefOr[Boolean] = js.native
    var showDisabledMonthNavigation: js.UndefOr[Boolean] = js.native
    var showFullMonthYearPicker: js.UndefOr[Boolean] = js.native
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
    var startDate: js.UndefOr[Date | Null] = js.native
    var startOpen: js.UndefOr[Boolean] = js.native
    var strictParsing: js.UndefOr[Boolean] = js.native
    var tabIndex: js.UndefOr[Double] = js.native
    var timeCaption: js.UndefOr[String] = js.native
    var timeClassName: js.UndefOr[js.Function1[/* date */ Date, String | Null]] = js.native
    var timeFormat: js.UndefOr[String] = js.native
    var timeInputLabel: js.UndefOr[String] = js.native
    var timeIntervals: js.UndefOr[Double] = js.native
    var title: js.UndefOr[String] = js.native
    var todayButton: js.UndefOr[ReactNode] = js.native
    var useShortMonthInDropdown: js.UndefOr[Boolean] = js.native
    var useWeekdaysShort: js.UndefOr[Boolean] = js.native
    var value: js.UndefOr[String] = js.native
    var weekAriaLabelPrefix: js.UndefOr[String] = js.native
    var weekDayClassName: js.UndefOr[js.Function1[/* date */ Date, String | Null]] = js.native
    var weekLabel: js.UndefOr[String] = js.native
    var withPortal: js.UndefOr[Boolean] = js.native
    var wrapperClassName: js.UndefOr[String] = js.native
    var yearDropdownItemNumber: js.UndefOr[Double] = js.native
    def onChange(): Unit = js.native
    def onChange(date: Null, event: SyntheticEvent[_, Event]): Unit = js.native
    def onChange(date: Date): Unit = js.native
    def onChange(date: Date, event: SyntheticEvent[_, Event]): Unit = js.native
  }
  
  @js.native
  class default () extends ReactDatePicker
  
  def CalendarContainer(className: String, children: js.Array[ReactNode], showPopperArrow: Boolean, arrowProps: js.Object): ReactNode = js.native
  def getDefaultLocale(): String = js.native
  def registerLocale(localeName: String, localeData: js.Object): Unit = js.native
  def setDefaultLocale(localeName: String): Unit = js.native
  type HighlightDates = StringDictionary[js.Array[Date]]
}

