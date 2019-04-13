package typings
package reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarListBaseProps extends CalendarBaseProps {
  /**
    *  Set custom calendar heigth.
    */
  var calendarHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    *  Set custom calendar width.
    */
  var calendarWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    *  Max amount of months allowed to scroll to the future. Default = 50
    */
  var futureScrollRange: js.UndefOr[scala.Double] = js.undefined
  /**
    *  Enable horizontal scrolling, default = false
    */
  var horizontal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  Enable paging on horizontal, default = false
    */
  var pagingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  Max amount of months allowed to scroll to the past. Default = 50
    */
  var pastScrollRange: js.UndefOr[scala.Double] = js.undefined
  /**
    *  Enable or disable scrolling of calendar list
    */
  var scrollEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  When true, the calendar list scrolls to top when the status bar is tapped. Default = true
    */
  var scrollsToTop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Initially selected day
    */
  var selected: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  Enable or disable vertical scroll indicator. Default = false
    */
  var showScrollIndicator: js.UndefOr[scala.Boolean] = js.undefined
}

object CalendarListBaseProps {
  @scala.inline
  def apply(
    calendarHeight: scala.Int | scala.Double = null,
    calendarWidth: scala.Int | scala.Double = null,
    current: TCalendarDate = null,
    dayComponent: (reactLib.reactMod.Component[DayComponentProps, js.Object, _]) | reactLib.reactMod.SFC[DayComponentProps] = null,
    disableMonthChange: js.UndefOr[scala.Boolean] = js.undefined,
    disabledByDefault: js.UndefOr[scala.Boolean] = js.undefined,
    displayLoadingIndicator: js.UndefOr[scala.Boolean] = js.undefined,
    firstDay: scala.Int | scala.Double = null,
    futureScrollRange: scala.Int | scala.Double = null,
    hideArrows: js.UndefOr[scala.Boolean] = js.undefined,
    hideDayNames: js.UndefOr[scala.Boolean] = js.undefined,
    hideExtraDays: js.UndefOr[scala.Boolean] = js.undefined,
    horizontal: js.UndefOr[scala.Boolean] = js.undefined,
    maxDate: TCalendarDate = null,
    minDate: TCalendarDate = null,
    monthFormat: java.lang.String = null,
    onDayLongPress: DateCallbackHandler = null,
    onDayPress: DateCallbackHandler = null,
    onMonthChange: DateCallbackHandler = null,
    onPressArrowLeft: /* substractMonth */ js.Function0[scala.Unit] => scala.Unit = null,
    onPressArrowRight: /* addMonth */ js.Function0[scala.Unit] => scala.Unit = null,
    onVisibleMonthsChange: /* months */ js.Array[DateObject] => scala.Unit = null,
    pagingEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    pastScrollRange: scala.Int | scala.Double = null,
    renderArrow: /* direction */ reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.left | reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.right => reactLib.reactMod.ReactNode = null,
    scrollEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    scrollsToTop: js.UndefOr[scala.Boolean] = js.undefined,
    selected: java.lang.String = null,
    showScrollIndicator: js.UndefOr[scala.Boolean] = js.undefined,
    showWeekNumbers: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    theme: CalendarTheme = null
  ): CalendarListBaseProps = {
    val __obj = js.Dynamic.literal()
    if (calendarHeight != null) __obj.updateDynamic("calendarHeight")(calendarHeight.asInstanceOf[js.Any])
    if (calendarWidth != null) __obj.updateDynamic("calendarWidth")(calendarWidth.asInstanceOf[js.Any])
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (dayComponent != null) __obj.updateDynamic("dayComponent")(dayComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMonthChange)) __obj.updateDynamic("disableMonthChange")(disableMonthChange)
    if (!js.isUndefined(disabledByDefault)) __obj.updateDynamic("disabledByDefault")(disabledByDefault)
    if (!js.isUndefined(displayLoadingIndicator)) __obj.updateDynamic("displayLoadingIndicator")(displayLoadingIndicator)
    if (firstDay != null) __obj.updateDynamic("firstDay")(firstDay.asInstanceOf[js.Any])
    if (futureScrollRange != null) __obj.updateDynamic("futureScrollRange")(futureScrollRange.asInstanceOf[js.Any])
    if (!js.isUndefined(hideArrows)) __obj.updateDynamic("hideArrows")(hideArrows)
    if (!js.isUndefined(hideDayNames)) __obj.updateDynamic("hideDayNames")(hideDayNames)
    if (!js.isUndefined(hideExtraDays)) __obj.updateDynamic("hideExtraDays")(hideExtraDays)
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (monthFormat != null) __obj.updateDynamic("monthFormat")(monthFormat)
    if (onDayLongPress != null) __obj.updateDynamic("onDayLongPress")(onDayLongPress)
    if (onDayPress != null) __obj.updateDynamic("onDayPress")(onDayPress)
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(onMonthChange)
    if (onPressArrowLeft != null) __obj.updateDynamic("onPressArrowLeft")(js.Any.fromFunction1(onPressArrowLeft))
    if (onPressArrowRight != null) __obj.updateDynamic("onPressArrowRight")(js.Any.fromFunction1(onPressArrowRight))
    if (onVisibleMonthsChange != null) __obj.updateDynamic("onVisibleMonthsChange")(js.Any.fromFunction1(onVisibleMonthsChange))
    if (!js.isUndefined(pagingEnabled)) __obj.updateDynamic("pagingEnabled")(pagingEnabled)
    if (pastScrollRange != null) __obj.updateDynamic("pastScrollRange")(pastScrollRange.asInstanceOf[js.Any])
    if (renderArrow != null) __obj.updateDynamic("renderArrow")(js.Any.fromFunction1(renderArrow))
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled)
    if (!js.isUndefined(scrollsToTop)) __obj.updateDynamic("scrollsToTop")(scrollsToTop)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (!js.isUndefined(showScrollIndicator)) __obj.updateDynamic("showScrollIndicator")(showScrollIndicator)
    if (!js.isUndefined(showWeekNumbers)) __obj.updateDynamic("showWeekNumbers")(showWeekNumbers)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[CalendarListBaseProps]
  }
}

