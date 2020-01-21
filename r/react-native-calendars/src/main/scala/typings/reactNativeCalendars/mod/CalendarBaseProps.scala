package typings.reactNativeCalendars.mod

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.SFC
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeCalendars.reactNativeCalendarsStrings.left
import typings.reactNativeCalendars.reactNativeCalendarsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarBaseProps extends js.Object {
  /**
    *  Initially visible month. Default = Date()
    */
  var current: js.UndefOr[TCalendarDate] = js.undefined
  /**
    *  Provide custom day rendering component.
    */
  var dayComponent: js.UndefOr[(Component[DayComponentProps, js.Object, _]) | SFC[DayComponentProps]] = js.undefined
  /**
    *  If hideArrows=false and hideExtraDays=false do not switch month when tapping on greyed out
    *  day from another month that is visible in calendar page. Default = false
    */
  var disableMonthChange: js.UndefOr[Boolean] = js.undefined
  /**
    *  Disable days by default. Default = false
    */
  var disabledByDefault: js.UndefOr[Boolean] = js.undefined
  /**
    *  Display loading indicator. Default = false
    */
  var displayLoadingIndicator: js.UndefOr[Boolean] = js.undefined
  /**
    *  If firstDay=1 week starts from Monday. Note that dayNames and dayNamesShort should still start from Sunday.
    */
  var firstDay: js.UndefOr[Double] = js.undefined
  /**
    *  Hide month navigation arrows. Default = false
    */
  var hideArrows: js.UndefOr[Boolean] = js.undefined
  /**
    *  Hide day names. Default = false
    */
  var hideDayNames: js.UndefOr[Boolean] = js.undefined
  /**
    *  Do not show days of other months in month page. Default = false
    */
  var hideExtraDays: js.UndefOr[Boolean] = js.undefined
  /**
    *  Maximum date that can be selected, dates after maxDate will be grayed out. Default = undefined
    */
  var maxDate: js.UndefOr[TCalendarDate] = js.undefined
  /**
    *  Minimum date that can be selected, dates before minDate will be grayed out. Default = undefined
    */
  var minDate: js.UndefOr[TCalendarDate] = js.undefined
  /**
    *  Month format in calendar title. Formatting values: http://arshaw.com/xdate/#Formatting
    */
  var monthFormat: js.UndefOr[String] = js.undefined
  /**
    *  Handler which gets executed on day long press. Default = undefined
    */
  var onDayLongPress: js.UndefOr[DateCallbackHandler] = js.undefined
  /**
    *  Handler which gets executed on day press. Default = undefined
    */
  var onDayPress: js.UndefOr[DateCallbackHandler] = js.undefined
  /**
    *  Handler which gets executed when visible month changes in calendar. Default = undefined
    */
  var onMonthChange: js.UndefOr[DateCallbackHandler] = js.undefined
  /**
    *  Handler which gets executed when press arrow icon left. It receive a callback can go back month
    */
  var onPressArrowLeft: js.UndefOr[js.Function1[/* substractMonth */ js.Function0[Unit], Unit]] = js.undefined
  /**
    *  Handler which gets executed when press arrow icon left. It receive a callback can go next month
    */
  var onPressArrowRight: js.UndefOr[js.Function1[/* addMonth */ js.Function0[Unit], Unit]] = js.undefined
  /**
    *  Callback which gets executed when visible months change in scroll view. Default = undefined
    */
  var onVisibleMonthsChange: js.UndefOr[js.Function1[/* months */ js.Array[DateObject], Unit]] = js.undefined
  /**
    *  Replace default arrows with custom ones (direction can be 'left' or 'right')
    */
  var renderArrow: js.UndefOr[js.Function1[/* direction */ left | right, ReactNode]] = js.undefined
  /**
    *  Show week numbers to the left. Default = false
    */
  var showWeekNumbers: js.UndefOr[Boolean] = js.undefined
  /**
    *  Calendar container style.
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    *  Specify theme properties to override specific styles for calendar parts. Default = {}
    */
  var theme: js.UndefOr[CalendarTheme] = js.undefined
}

object CalendarBaseProps {
  @scala.inline
  def apply(
    current: TCalendarDate = null,
    dayComponent: (Component[DayComponentProps, js.Object, _]) | SFC[DayComponentProps] = null,
    disableMonthChange: js.UndefOr[Boolean] = js.undefined,
    disabledByDefault: js.UndefOr[Boolean] = js.undefined,
    displayLoadingIndicator: js.UndefOr[Boolean] = js.undefined,
    firstDay: Int | Double = null,
    hideArrows: js.UndefOr[Boolean] = js.undefined,
    hideDayNames: js.UndefOr[Boolean] = js.undefined,
    hideExtraDays: js.UndefOr[Boolean] = js.undefined,
    maxDate: TCalendarDate = null,
    minDate: TCalendarDate = null,
    monthFormat: String = null,
    onDayLongPress: /* date */ DateObject => Unit = null,
    onDayPress: /* date */ DateObject => Unit = null,
    onMonthChange: /* date */ DateObject => Unit = null,
    onPressArrowLeft: /* substractMonth */ js.Function0[Unit] => Unit = null,
    onPressArrowRight: /* addMonth */ js.Function0[Unit] => Unit = null,
    onVisibleMonthsChange: /* months */ js.Array[DateObject] => Unit = null,
    renderArrow: /* direction */ left | right => ReactNode = null,
    showWeekNumbers: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    theme: CalendarTheme = null
  ): CalendarBaseProps = {
    val __obj = js.Dynamic.literal()
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (dayComponent != null) __obj.updateDynamic("dayComponent")(dayComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMonthChange)) __obj.updateDynamic("disableMonthChange")(disableMonthChange.asInstanceOf[js.Any])
    if (!js.isUndefined(disabledByDefault)) __obj.updateDynamic("disabledByDefault")(disabledByDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(displayLoadingIndicator)) __obj.updateDynamic("displayLoadingIndicator")(displayLoadingIndicator.asInstanceOf[js.Any])
    if (firstDay != null) __obj.updateDynamic("firstDay")(firstDay.asInstanceOf[js.Any])
    if (!js.isUndefined(hideArrows)) __obj.updateDynamic("hideArrows")(hideArrows.asInstanceOf[js.Any])
    if (!js.isUndefined(hideDayNames)) __obj.updateDynamic("hideDayNames")(hideDayNames.asInstanceOf[js.Any])
    if (!js.isUndefined(hideExtraDays)) __obj.updateDynamic("hideExtraDays")(hideExtraDays.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (monthFormat != null) __obj.updateDynamic("monthFormat")(monthFormat.asInstanceOf[js.Any])
    if (onDayLongPress != null) __obj.updateDynamic("onDayLongPress")(js.Any.fromFunction1(onDayLongPress))
    if (onDayPress != null) __obj.updateDynamic("onDayPress")(js.Any.fromFunction1(onDayPress))
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(js.Any.fromFunction1(onMonthChange))
    if (onPressArrowLeft != null) __obj.updateDynamic("onPressArrowLeft")(js.Any.fromFunction1(onPressArrowLeft))
    if (onPressArrowRight != null) __obj.updateDynamic("onPressArrowRight")(js.Any.fromFunction1(onPressArrowRight))
    if (onVisibleMonthsChange != null) __obj.updateDynamic("onVisibleMonthsChange")(js.Any.fromFunction1(onVisibleMonthsChange))
    if (renderArrow != null) __obj.updateDynamic("renderArrow")(js.Any.fromFunction1(renderArrow))
    if (!js.isUndefined(showWeekNumbers)) __obj.updateDynamic("showWeekNumbers")(showWeekNumbers.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarBaseProps]
  }
}

