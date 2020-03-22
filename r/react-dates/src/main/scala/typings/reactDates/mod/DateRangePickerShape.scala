package typings.reactDates.mod

import typings.react.mod._Global_.JSX.Element
import typings.reactDates.AnonEndDate
import typings.reactDates.AnonIsVisible
import typings.reactDates.AnonStartDate
import typings.reactDates.mod.momentPropTypes.momentObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// shapes/DateRangePickerShape.js
@js.native
trait DateRangePickerShape extends js.Object {
  var anchorDirection: js.UndefOr[AnchorDirectionShape] = js.native
  var appendToBody: js.UndefOr[Boolean] = js.native
  var block: js.UndefOr[Boolean] = js.native
  var calendarInfoPosition: js.UndefOr[CalendarInfoPositionShape] = js.native
  var customArrowIcon: js.UndefOr[String | Element] = js.native
  var customCloseIcon: js.UndefOr[String | Element] = js.native
  var customInputIcon: js.UndefOr[String | Element] = js.native
  var dayAriaLabelFormat: js.UndefOr[String] = js.native
  var daySize: js.UndefOr[Double] = js.native
  var disableScroll: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[DisabledShape] = js.native
  // internationalization props
  var displayFormat: js.UndefOr[String | js.Function0[String]] = js.native
  var enableOutsideDays: js.UndefOr[Boolean] = js.native
  var endDate: momentObj | Null = js.native
  var endDateId: String = js.native
  var endDatePlaceholderText: js.UndefOr[String] = js.native
  var firstDayOfWeek: js.UndefOr[DayOfWeekShape] = js.native
  var focusedInput: FocusedInputShape | Null = js.native
  var hideKeyboardShortcutsPanel: js.UndefOr[Boolean] = js.native
  var horizontalMargin: js.UndefOr[Double] = js.native
  var initialVisibleMonth: js.UndefOr[js.Function0[momentObj]] = js.native
  var inputIconPosition: js.UndefOr[IconPositionShape] = js.native
  var isDayBlocked: js.UndefOr[js.Function1[/* day */ js.Any, Boolean]] = js.native
  var isDayHighlighted: js.UndefOr[js.Function1[/* day */ js.Any, Boolean]] = js.native
  var isOutsideRange: js.UndefOr[js.Function1[/* day */ js.Any, Boolean]] = js.native
  var isRTL: js.UndefOr[Boolean] = js.native
  var keepFocusOnInput: js.UndefOr[Boolean] = js.native
  var keepOpenOnDateSelect: js.UndefOr[Boolean] = js.native
  var maxDate: js.UndefOr[momentObj] = js.native
  var minDate: js.UndefOr[momentObj] = js.native
  var minimumNights: js.UndefOr[Double] = js.native
  var monthFormat: js.UndefOr[String] = js.native
  var navNext: js.UndefOr[String | Element] = js.native
  // navigation related props
  var navPrev: js.UndefOr[String | Element] = js.native
  var noBorder: js.UndefOr[Boolean] = js.native
  var numberOfMonths: js.UndefOr[Double] = js.native
  var onClose: js.UndefOr[js.Function1[/* final */ AnonStartDate, Unit]] = js.native
  var onNextMonthClick: js.UndefOr[js.Function1[/* newCurrentMonth */ momentObj, Unit]] = js.native
  var onPrevMonthClick: js.UndefOr[js.Function1[/* newCurrentMonth */ momentObj, Unit]] = js.native
  var openDirection: js.UndefOr[OpenDirectionShape] = js.native
  var orientation: js.UndefOr[OrientationShape] = js.native
  var phrases: js.UndefOr[DateRangePickerPhrases] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var regular: js.UndefOr[Boolean] = js.native
  // day presentation and interaction related props
  var renderCalendarDay: js.UndefOr[js.Function1[/* day */ momentObj, String | Element]] = js.native
  var renderCalendarInfo: js.UndefOr[js.Function0[String | Element]] = js.native
  var renderDayContents: js.UndefOr[js.Function1[/* day */ momentObj, String | Element]] = js.native
  var renderMonthElement: js.UndefOr[js.Function1[/* props */ AnonIsVisible, String | Element]] = js.native
  // calendar presentation and interaction related props
  var renderMonthText: js.UndefOr[js.Function1[/* day */ momentObj, String | Element]] = js.native
  var reopenPickerOnClearDates: js.UndefOr[Boolean] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var screenReaderInputMessage: js.UndefOr[String] = js.native
  var showClearDates: js.UndefOr[Boolean] = js.native
  var showDefaultInputIcon: js.UndefOr[Boolean] = js.native
  var small: js.UndefOr[Boolean] = js.native
  // required props for a functional interactive DateRangePicker
  var startDate: momentObj | Null = js.native
  var startDateId: String = js.native
  // input related props
  var startDatePlaceholderText: js.UndefOr[String] = js.native
  var transitionDuration: js.UndefOr[Double] = js.native
  var verticalHeight: js.UndefOr[Double] = js.native
  var verticalSpacing: js.UndefOr[Double] = js.native
  var weekDayFormat: js.UndefOr[String] = js.native
  var withFullScreenPortal: js.UndefOr[Boolean] = js.native
  var withPortal: js.UndefOr[Boolean] = js.native
  def onDatesChange(arg: AnonEndDate): Unit = js.native
  def onFocusChange(): Unit = js.native
  def onFocusChange(arg: FocusedInputShape): Unit = js.native
}

