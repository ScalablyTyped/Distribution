package typings
package reactDashWidgetsLib.libCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarProps
  extends reactDashWidgetsLib.libCommonPropsMod.ReactWidgetsCommonProps[CalendarClass]
     with reactDashWidgetsLib.libCommonPropsMod.AutoFocus {
  /**
    * A formatter for century, the default formats the first and last year of the century like:
    * 1900 - 1999.
    */
  var centuryFormat: js.UndefOr[java.lang.String | (js.Function1[/* day */ stdLib.Date, java.lang.String])] = js.undefined
  /**
    * Set the culture of the Calendar, passed to the configured localizer.
    */
  var culture: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default current date at which the calendar opens. If none is provided, opens at today's
    * date or the value date (if any).
    * @default Date()
    */
  var currentDate: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * A formatter for day of the month.
    */
  var dateFormat: js.UndefOr[java.lang.String | (js.Function1[/* day */ stdLib.Date, java.lang.String])] = js.undefined
  /**
    * Provide a custom component to render the days of the month.
    * The Component is provided the following props
    * - date: a Date object for the day of the month to render
    * - label: a formatted String of the date to render. To adjust the format of the label
    *          string use the dateFormat prop, listed below.
    */
  var dayComponent: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  /**
    * A formatter calendar days of the week, the default formats each day as a Narrow name:
    * "Mo", "Tu", etc.
    */
  var dayFormat: js.UndefOr[java.lang.String | (js.Function1[/* day */ stdLib.Date, java.lang.String])] = js.undefined
  /**
    * A formatter for decade, the default formats the first and last year of the decade like:
    * 2000 - 2009.
    */
  var decadeFormat: js.UndefOr[java.lang.String | (js.Function1[/* day */ stdLib.Date, java.lang.String])] = js.undefined
  /**
    * Default value.
    */
  var defaultValue: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * Set a unique starting view
    */
  var defaultView: js.UndefOr[CalendarView] = js.undefined
  /**
    * The highest level view the calendar can navigate up to. This value should be higher than
    * initialView
    */
  var finalView: js.UndefOr[
    reactDashWidgetsLib.reactDashWidgetsLibStrings.month | reactDashWidgetsLib.reactDashWidgetsLibStrings.year | reactDashWidgetsLib.reactDashWidgetsLibStrings.decade | reactDashWidgetsLib.reactDashWidgetsLibStrings.century
  ] = js.undefined
  /**
    * Show or hide the Calendar footer.
    * @default false
    */
  var footer: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A formatter for the Calendar footer, formats Today's Date as a string.
    */
  var footerFormat: js.UndefOr[java.lang.String | (js.Function1[/* day */ stdLib.Date, java.lang.String])] = js.undefined
  /**
    * A formatter for the header button of the month view
    */
  var headerFormat: js.UndefOr[java.lang.String | (js.Function1[/* day */ stdLib.Date, java.lang.String])] = js.undefined
  /**
    * The starting and lowest level view the calendar can navigate down to.
    */
  var initialView: js.UndefOr[
    reactDashWidgetsLib.reactDashWidgetsLibStrings.month | reactDashWidgetsLib.reactDashWidgetsLibStrings.year | reactDashWidgetsLib.reactDashWidgetsLibStrings.decade | reactDashWidgetsLib.reactDashWidgetsLibStrings.century
  ] = js.undefined
  /**
    * The maximum date that the Calendar can navigate to.
    */
  var max: js.UndefOr[stdLib.Date] = js.undefined
  var messages: js.UndefOr[CalendarMessages] = js.undefined
  /**
    * The minimum date that the Calendar can navigate from.
    */
  var min: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * A formatter for month name.
    */
  var monthFormat: js.UndefOr[java.lang.String | (js.Function1[/* day */ stdLib.Date, java.lang.String])] = js.undefined
  /**
    * Change event Handler that is called when the value is changed. The handler is called with
    * the Date object
    */
  var onChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[stdLib.Date], scala.Unit]] = js.undefined
  /**
    * Change event Handler that is called when the currentDate is changed. The handler is
    * called with the currentDate object.
    */
  var onCurrentDateChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[stdLib.Date], scala.Unit]] = js.undefined
  /**
    * The native onKeyDown event, called preventDefault will prevent any custom behavior, included keyboard shortcuts.
    */
  var onKeyDown: js.UndefOr[js.Function1[/* event */ stdLib.KeyboardEvent, scala.Unit]] = js.undefined
  /**
    * Callback fired when the Calendar navigates between views, or forward and backwards in
    * time.
    */
  var onNavigate: js.UndefOr[
    js.Function3[
      /* date */ stdLib.Date, 
      /* direction */ java.lang.String, 
      /* view */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * A callback fired when the view changes.
    */
  var onViewChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * The current selected date, should be a Date object or null.
    */
  var value: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * Controls the currently displayed calendar view. Use defaultView to set a unique starting view.
    */
  var view: js.UndefOr[CalendarView] = js.undefined
  /**
    * Defines a list of views the Calendar can traverse through, starting with the first in the list to the last.
    */
  var views: js.UndefOr[js.Array[CalendarView]] = js.undefined
  /**
    * A formatter for the year.
    */
  var yearFormat: js.UndefOr[java.lang.String | (js.Function1[/* day */ stdLib.Date, java.lang.String])] = js.undefined
}

object CalendarProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    centuryFormat: java.lang.String | (js.Function1[/* day */ stdLib.Date, java.lang.String]) = null,
    children: reactLib.reactMod.ReactNode = null,
    culture: java.lang.String = null,
    currentDate: stdLib.Date = null,
    dateFormat: java.lang.String | (js.Function1[/* day */ stdLib.Date, java.lang.String]) = null,
    dayComponent: reactLib.reactMod.ReactType[_] = null,
    dayFormat: java.lang.String | (js.Function1[/* day */ stdLib.Date, java.lang.String]) = null,
    decadeFormat: java.lang.String | (js.Function1[/* day */ stdLib.Date, java.lang.String]) = null,
    defaultValue: stdLib.Date = null,
    defaultView: CalendarView = null,
    disabled: scala.Boolean | js.Array[_] = null,
    finalView: reactDashWidgetsLib.reactDashWidgetsLibStrings.month | reactDashWidgetsLib.reactDashWidgetsLibStrings.year | reactDashWidgetsLib.reactDashWidgetsLibStrings.decade | reactDashWidgetsLib.reactDashWidgetsLibStrings.century = null,
    footer: js.UndefOr[scala.Boolean] = js.undefined,
    footerFormat: java.lang.String | (js.Function1[/* day */ stdLib.Date, java.lang.String]) = null,
    headerFormat: java.lang.String | (js.Function1[/* day */ stdLib.Date, java.lang.String]) = null,
    id: java.lang.String = null,
    initialView: reactDashWidgetsLib.reactDashWidgetsLibStrings.month | reactDashWidgetsLib.reactDashWidgetsLibStrings.year | reactDashWidgetsLib.reactDashWidgetsLibStrings.decade | reactDashWidgetsLib.reactDashWidgetsLibStrings.century = null,
    isRtl: js.UndefOr[scala.Boolean] = js.undefined,
    key: reactLib.reactMod.Key = null,
    max: stdLib.Date = null,
    messages: CalendarMessages = null,
    min: stdLib.Date = null,
    monthFormat: java.lang.String | (js.Function1[/* day */ stdLib.Date, java.lang.String]) = null,
    onChange: /* date */ js.UndefOr[stdLib.Date] => scala.Unit = null,
    onCurrentDateChange: /* date */ js.UndefOr[stdLib.Date] => scala.Unit = null,
    onKeyDown: /* event */ stdLib.KeyboardEvent => scala.Unit = null,
    onNavigate: (/* date */ stdLib.Date, /* direction */ java.lang.String, /* view */ java.lang.String) => scala.Unit = null,
    onViewChange: () => scala.Unit = null,
    readOnly: scala.Boolean | js.Array[_] = null,
    ref: reactLib.reactMod.LegacyRef[CalendarClass] = null,
    value: stdLib.Date = null,
    view: CalendarView = null,
    views: js.Array[CalendarView] = null,
    yearFormat: java.lang.String | (js.Function1[/* day */ stdLib.Date, java.lang.String]) = null
  ): CalendarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (centuryFormat != null) __obj.updateDynamic("centuryFormat")(centuryFormat.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (culture != null) __obj.updateDynamic("culture")(culture)
    if (currentDate != null) __obj.updateDynamic("currentDate")(currentDate)
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (dayComponent != null) __obj.updateDynamic("dayComponent")(dayComponent.asInstanceOf[js.Any])
    if (dayFormat != null) __obj.updateDynamic("dayFormat")(dayFormat.asInstanceOf[js.Any])
    if (decadeFormat != null) __obj.updateDynamic("decadeFormat")(decadeFormat.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (defaultView != null) __obj.updateDynamic("defaultView")(defaultView)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (finalView != null) __obj.updateDynamic("finalView")(finalView.asInstanceOf[js.Any])
    if (!js.isUndefined(footer)) __obj.updateDynamic("footer")(footer)
    if (footerFormat != null) __obj.updateDynamic("footerFormat")(footerFormat.asInstanceOf[js.Any])
    if (headerFormat != null) __obj.updateDynamic("headerFormat")(headerFormat.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (initialView != null) __obj.updateDynamic("initialView")(initialView.asInstanceOf[js.Any])
    if (!js.isUndefined(isRtl)) __obj.updateDynamic("isRtl")(isRtl)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (min != null) __obj.updateDynamic("min")(min)
    if (monthFormat != null) __obj.updateDynamic("monthFormat")(monthFormat.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onCurrentDateChange != null) __obj.updateDynamic("onCurrentDateChange")(js.Any.fromFunction1(onCurrentDateChange))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onNavigate != null) __obj.updateDynamic("onNavigate")(js.Any.fromFunction3(onNavigate))
    if (onViewChange != null) __obj.updateDynamic("onViewChange")(js.Any.fromFunction0(onViewChange))
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (view != null) __obj.updateDynamic("view")(view)
    if (views != null) __obj.updateDynamic("views")(views)
    if (yearFormat != null) __obj.updateDynamic("yearFormat")(yearFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarProps]
  }
}

