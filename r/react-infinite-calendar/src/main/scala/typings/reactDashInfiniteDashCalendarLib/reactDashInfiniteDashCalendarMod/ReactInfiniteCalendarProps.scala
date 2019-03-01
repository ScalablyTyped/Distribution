package typings
package reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactInfiniteCalendarProps extends js.Object {
  var Component: js.UndefOr[CalendarClass] = js.undefined
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disabledDates: js.UndefOr[js.Array[DateType]] = js.undefined
  var disabledDays: js.UndefOr[
    js.Array[
      reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`0` | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`1` | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`2` | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`3` | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`4` | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`5` | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`6`
    ]
  ] = js.undefined
  var display: js.UndefOr[
    reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibStrings.days | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibStrings.years
  ] = js.undefined
  var displayOptions: js.UndefOr[reactDashInfiniteDashCalendarLib.Anon_HideYearsOnSelect] = js.undefined
  var height: js.UndefOr[
    scala.Double | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibStrings.auto
  ] = js.undefined
  var locale: js.UndefOr[reactDashInfiniteDashCalendarLib.Anon_0] = js.undefined
  var max: js.UndefOr[DateType] = js.undefined
  var maxDate: js.UndefOr[DateType] = js.undefined
  var min: js.UndefOr[DateType] = js.undefined
  var minDate: js.UndefOr[DateType] = js.undefined
  var onScroll: js.UndefOr[js.Function1[/* scrollTop */ scala.Double, scala.Unit]] = js.undefined
  var onScrollEnd: js.UndefOr[js.Function1[/* scrollTop */ scala.Double, scala.Unit]] = js.undefined
  var onSelect: js.UndefOr[DateSelectFunction | RangedSelectFunction] = js.undefined
  var rowHeight: js.UndefOr[scala.Double] = js.undefined
  var selected: js.UndefOr[
    DateType | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`false` | reactDashInfiniteDashCalendarLib.Anon_End
  ] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var theme: js.UndefOr[reactDashInfiniteDashCalendarLib.Anon_AccentColor] = js.undefined
  var width: js.UndefOr[
    scala.Double | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibStrings.auto | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibStrings.`100%`
  ] = js.undefined
}

object ReactInfiniteCalendarProps {
  @scala.inline
  def apply(
    Component: CalendarClass = null,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    disabledDates: js.Array[DateType] = null,
    disabledDays: js.Array[
      reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`0` | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`1` | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`2` | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`3` | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`4` | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`5` | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`6`
    ] = null,
    display: reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibStrings.days | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibStrings.years = null,
    displayOptions: reactDashInfiniteDashCalendarLib.Anon_HideYearsOnSelect = null,
    height: scala.Double | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibStrings.auto = null,
    locale: reactDashInfiniteDashCalendarLib.Anon_0 = null,
    max: DateType = null,
    maxDate: DateType = null,
    min: DateType = null,
    minDate: DateType = null,
    onScroll: js.Function1[/* scrollTop */ scala.Double, scala.Unit] = null,
    onScrollEnd: js.Function1[/* scrollTop */ scala.Double, scala.Unit] = null,
    onSelect: DateSelectFunction | RangedSelectFunction = null,
    rowHeight: scala.Int | scala.Double = null,
    selected: DateType | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`false` | reactDashInfiniteDashCalendarLib.Anon_End = null,
    tabIndex: scala.Int | scala.Double = null,
    theme: reactDashInfiniteDashCalendarLib.Anon_AccentColor = null,
    width: scala.Double | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibStrings.auto | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibStrings.`100%` = null
  ): ReactInfiniteCalendarProps = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (className != null) __obj.updateDynamic("className")(className)
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates)
    if (disabledDays != null) __obj.updateDynamic("disabledDays")(disabledDays)
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (displayOptions != null) __obj.updateDynamic("displayOptions")(displayOptions)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(onScroll)
    if (onScrollEnd != null) __obj.updateDynamic("onScrollEnd")(onScrollEnd)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactInfiniteCalendarProps]
  }
}

