package typings
package reactDashCalendarDashHeatmapLib.reactDashCalendarDashHeatmapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var classForValue: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  var endDate: js.UndefOr[java.lang.String | scala.Double | stdLib.Date] = js.undefined
  var gutterSize: js.UndefOr[scala.Double] = js.undefined
  var horizontal: js.UndefOr[scala.Boolean] = js.undefined
  var monthLabels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var numDays: js.UndefOr[scala.Double] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* value */ js.Any, scala.Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function2[/* e */ js.Any, /* value */ js.Any, scala.Unit]] = js.undefined
  var onMouseOver: js.UndefOr[js.Function2[/* e */ js.Any, /* value */ js.Any, scala.Unit]] = js.undefined
  var showMonthLabels: js.UndefOr[scala.Boolean] = js.undefined
  var showOutOfRangeDays: js.UndefOr[scala.Boolean] = js.undefined
  var showWeekdayLabels: js.UndefOr[scala.Boolean] = js.undefined
  var startDate: js.UndefOr[java.lang.String | scala.Double | stdLib.Date] = js.undefined
  var titleForValue: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  var tooltipDataAttrs: js.UndefOr[js.Object] = js.undefined
  var transformDayElement: js.UndefOr[js.Function3[/* rect */ js.Any, /* value */ js.Any, /* index */ scala.Double, _]] = js.undefined
  var values: js.Array[_]
  var weekdayLabels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    values: js.Array[_],
    classForValue: /* value */ js.Any => _ = null,
    endDate: java.lang.String | scala.Double | stdLib.Date = null,
    gutterSize: scala.Int | scala.Double = null,
    horizontal: js.UndefOr[scala.Boolean] = js.undefined,
    monthLabels: js.Array[java.lang.String] = null,
    numDays: scala.Int | scala.Double = null,
    onClick: /* value */ js.Any => scala.Unit = null,
    onMouseLeave: (/* e */ js.Any, /* value */ js.Any) => scala.Unit = null,
    onMouseOver: (/* e */ js.Any, /* value */ js.Any) => scala.Unit = null,
    showMonthLabels: js.UndefOr[scala.Boolean] = js.undefined,
    showOutOfRangeDays: js.UndefOr[scala.Boolean] = js.undefined,
    showWeekdayLabels: js.UndefOr[scala.Boolean] = js.undefined,
    startDate: java.lang.String | scala.Double | stdLib.Date = null,
    titleForValue: /* value */ js.Any => _ = null,
    tooltipDataAttrs: js.Object = null,
    transformDayElement: (/* rect */ js.Any, /* value */ js.Any, /* index */ scala.Double) => _ = null,
    weekdayLabels: js.Array[java.lang.String] = null
  ): Props = {
    val __obj = js.Dynamic.literal(values = values)
    if (classForValue != null) __obj.updateDynamic("classForValue")(js.Any.fromFunction1(classForValue))
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (gutterSize != null) __obj.updateDynamic("gutterSize")(gutterSize.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (monthLabels != null) __obj.updateDynamic("monthLabels")(monthLabels)
    if (numDays != null) __obj.updateDynamic("numDays")(numDays.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction2(onMouseLeave))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction2(onMouseOver))
    if (!js.isUndefined(showMonthLabels)) __obj.updateDynamic("showMonthLabels")(showMonthLabels)
    if (!js.isUndefined(showOutOfRangeDays)) __obj.updateDynamic("showOutOfRangeDays")(showOutOfRangeDays)
    if (!js.isUndefined(showWeekdayLabels)) __obj.updateDynamic("showWeekdayLabels")(showWeekdayLabels)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (titleForValue != null) __obj.updateDynamic("titleForValue")(js.Any.fromFunction1(titleForValue))
    if (tooltipDataAttrs != null) __obj.updateDynamic("tooltipDataAttrs")(tooltipDataAttrs)
    if (transformDayElement != null) __obj.updateDynamic("transformDayElement")(js.Any.fromFunction3(transformDayElement))
    if (weekdayLabels != null) __obj.updateDynamic("weekdayLabels")(weekdayLabels)
    __obj.asInstanceOf[Props]
  }
}

