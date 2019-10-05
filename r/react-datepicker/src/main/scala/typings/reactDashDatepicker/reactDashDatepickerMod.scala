package typings.reactDashDatepicker

import org.scalablytyped.runtime.StringDictionary
import typings.dateDashFns.dateDashFnsMod.Locale
import typings.popperDotJs.popperDotJsMod.Modifiers
import typings.react.Event
import typings.react.NativeMouseEvent
import typings.react.reactMod.Component
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import typings.react.reactMod.SyntheticEvent
import typings.reactDashDatepicker.reactDashDatepickerMod.HighlightDates
import typings.reactDashDatepicker.reactDashDatepickerMod.ReactDatePicker
import typings.reactDashDatepicker.reactDashDatepickerMod.ReactDatePickerProps
import typings.reactDashDatepicker.reactDashDatepickerStrings.scroll
import typings.reactDashDatepicker.reactDashDatepickerStrings.select
import typings.std.Date
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-datepicker", JSImport.Namespace)
@js.native
object reactDashDatepickerMod extends js.Object {
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
    var autoComplete: js.UndefOr[String] = js.native
    var autoFocus: js.UndefOr[Boolean] = js.native
    var calendarClassName: js.UndefOr[String] = js.native
    var calendarContainer: js.UndefOr[js.Function1[/* props */ Anon_Children, ReactNode]] = js.native
    var children: js.UndefOr[ReactNode] = js.native
    var className: js.UndefOr[String] = js.native
    var clearButtonTitle: js.UndefOr[String] = js.native
    var customInput: js.UndefOr[ReactNode] = js.native
    var customInputRef: js.UndefOr[String] = js.native
    var dateFormat: js.UndefOr[String | js.Array[String]] = js.native
    var dateFormatCalendar: js.UndefOr[String] = js.native
    var dayClassName: js.UndefOr[js.Function1[/* date */ Date, String | Null]] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var disabledKeyboardNavigation: js.UndefOr[Boolean] = js.native
    var dropdownMode: js.UndefOr[scroll | select] = js.native
    var endDate: js.UndefOr[Date | Null] = js.native
    var excludeDates: js.UndefOr[js.Array[Date]] = js.native
    var excludeTimes: js.UndefOr[js.Array[Date]] = js.native
    var filterDate: js.UndefOr[js.Function1[/* date */ Date, Boolean]] = js.native
    var fixedHeight: js.UndefOr[Boolean] = js.native
    var forceShowMonthNavigation: js.UndefOr[Boolean] = js.native
    var formatWeekDay: js.UndefOr[js.Function1[/* formattedDate */ String, String]] = js.native
    var formatWeekNumber: js.UndefOr[js.Function1[/* date */ Date, String | Double]] = js.native
    var highlightDates: js.UndefOr[js.Array[HighlightDates | Date]] = js.native
    var id: js.UndefOr[String] = js.native
    var includeDates: js.UndefOr[js.Array[Date]] = js.native
    var includeTimes: js.UndefOr[js.Array[Date]] = js.native
    var injectTimes: js.UndefOr[js.Array[Date]] = js.native
    var `inline`: js.UndefOr[Boolean] = js.native
    var inlineFocusSelectedMonth: js.UndefOr[Boolean] = js.native
    var isClearable: js.UndefOr[Boolean] = js.native
    var locale: js.UndefOr[String | Locale] = js.native
    var maxDate: js.UndefOr[Date | Null] = js.native
    var maxTime: js.UndefOr[Date] = js.native
    var minDate: js.UndefOr[Date | Null] = js.native
    var minTime: js.UndefOr[Date] = js.native
    var monthsShown: js.UndefOr[Double] = js.native
    var name: js.UndefOr[String] = js.native
    var nextMonthButtonLabel: js.UndefOr[String] = js.native
    var onBlur: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLInputElement], Unit]] = js.native
    var onChangeRaw: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLInputElement], Unit]] = js.native
    var onClickOutside: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.native
    var onDayMouseEnter: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.native
    var onFocus: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLInputElement], Unit]] = js.native
    var onInputClick: js.UndefOr[js.Function0[Unit]] = js.native
    var onInputError: js.UndefOr[js.Function1[/* err */ Anon_Code, Unit]] = js.native
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
    var popperContainer: js.UndefOr[js.Function1[/* props */ Anon_Children, ReactNode]] = js.native
    var popperModifiers: js.UndefOr[Modifiers] = js.native
    var popperPlacement: js.UndefOr[String] = js.native
    var popperProps: js.UndefOr[js.Object] = js.native
    var preventOpenOnFocus: js.UndefOr[Boolean] = js.native
    var previousMonthButtonLabel: js.UndefOr[String] = js.native
    var readOnly: js.UndefOr[Boolean] = js.native
    var renderCustomHeader: js.UndefOr[js.Function1[/* params */ Anon_ChangeMonth, ReactNode]] = js.native
    var renderDayContents: js.UndefOr[js.Function1[/* dayOfMonth */ Double, ReactNode]] = js.native
    var required: js.UndefOr[Boolean] = js.native
    var scrollableMonthYearDropdown: js.UndefOr[Boolean] = js.native
    var scrollableYearDropdown: js.UndefOr[Boolean] = js.native
    var selected: js.UndefOr[Date | Null] = js.native
    var selectsEnd: js.UndefOr[Boolean] = js.native
    var selectsStart: js.UndefOr[Boolean] = js.native
    var shouldCloseOnSelect: js.UndefOr[Boolean] = js.native
    var showDisabledMonthNavigation: js.UndefOr[Boolean] = js.native
    var showMonthDropdown: js.UndefOr[Boolean] = js.native
    var showMonthYearDropdown: js.UndefOr[Boolean] = js.native
    var showMonthYearPicker: js.UndefOr[Boolean] = js.native
    var showTimeInput: js.UndefOr[Boolean] = js.native
    var showTimeSelect: js.UndefOr[Boolean] = js.native
    var showTimeSelectOnly: js.UndefOr[Boolean] = js.native
    var showWeekNumbers: js.UndefOr[Boolean] = js.native
    var showYearDropdown: js.UndefOr[Boolean] = js.native
    var startDate: js.UndefOr[Date | Null] = js.native
    var startOpen: js.UndefOr[Boolean] = js.native
    var strictParsing: js.UndefOr[Boolean] = js.native
    var tabIndex: js.UndefOr[Double] = js.native
    var timeCaption: js.UndefOr[String] = js.native
    var timeFormat: js.UndefOr[String] = js.native
    var timeInputLabel: js.UndefOr[String] = js.native
    var timeIntervals: js.UndefOr[Double] = js.native
    var title: js.UndefOr[String] = js.native
    var todayButton: js.UndefOr[ReactNode] = js.native
    var useShortMonthInDropdown: js.UndefOr[Boolean] = js.native
    var useWeekdaysShort: js.UndefOr[Boolean] = js.native
    var value: js.UndefOr[String] = js.native
    var weekLabel: js.UndefOr[String] = js.native
    var withPortal: js.UndefOr[Boolean] = js.native
    var yearDropdownItemNumber: js.UndefOr[Double] = js.native
    def onChange(): Unit = js.native
    def onChange(date: Null, event: SyntheticEvent[_, Event]): Unit = js.native
    def onChange(date: Date): Unit = js.native
    def onChange(date: Date, event: SyntheticEvent[_, Event]): Unit = js.native
  }
  
  @js.native
  class default () extends ReactDatePicker
  
  def getDefaultLocale(): String = js.native
  def registerLocale(localeName: String, localeData: js.Object): Unit = js.native
  def setDefaultLocale(localeName: String): Unit = js.native
  type HighlightDates = StringDictionary[js.Array[Date]]
}

