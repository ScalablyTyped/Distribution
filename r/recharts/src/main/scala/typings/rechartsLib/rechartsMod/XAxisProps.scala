package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAxisProps extends EventAttributes {
  var allowDataOverflow: js.UndefOr[scala.Boolean] = js.undefined
  var allowDecimals: js.UndefOr[scala.Boolean] = js.undefined
  var allowDuplicatedCategory: js.UndefOr[scala.Boolean] = js.undefined
  var axisLine: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  // The key of data displayed in the axis
  var dataKey: js.UndefOr[DataKey] = js.undefined
  var domain: js.UndefOr[js.Tuple2[AxisDomain, AxisDomain]] = js.undefined
  // The height of axis, which need to be set by user
  var height: js.UndefOr[scala.Double] = js.undefined
  var hide: js.UndefOr[scala.Boolean] = js.undefined
  var interval: js.UndefOr[AxisInterval] = js.undefined
  // see label section at http://recharts.org/#/en-US/api/XAxis
  var label: js.UndefOr[java.lang.String | scala.Double | Label | LabelProps] = js.undefined
  var minTickGap: js.UndefOr[scala.Double] = js.undefined
  var mirror: js.UndefOr[scala.Boolean] = js.undefined
  // The name of data displayed in the axis
  var name: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  // The orientation of axis
  var orientation: js.UndefOr[rechartsLib.rechartsLibStrings.top | rechartsLib.rechartsLibStrings.bottom] = js.undefined
  var padding: js.UndefOr[XPadding] = js.undefined
  var reversed: js.UndefOr[scala.Boolean] = js.undefined
  var scale: js.UndefOr[ScaleType | RechartsFunction] = js.undefined
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  var textAnchor: js.UndefOr[java.lang.String] = js.undefined
  var tick: js.UndefOr[
    scala.Boolean | ContentRenderer[_] | js.Object | reactLib.reactMod.ReactElement[_]
  ] = js.undefined
  // The count of ticks
  var tickCount: js.UndefOr[scala.Double] = js.undefined
  // The formatter function of tick
  var tickFormatter: js.UndefOr[TickFormatterFunction] = js.undefined
  var tickLine: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  // The margin between tick line and the label
  var tickMargin: js.UndefOr[scala.Double] = js.undefined
  var tickSize: js.UndefOr[scala.Double] = js.undefined
  // Ticks can be any type when the axis is the type of category
  // Ticks must be numbers when the axis is the type of number
  var ticks: js.UndefOr[js.Array[_]] = js.undefined
  var `type`: js.UndefOr[rechartsLib.rechartsLibStrings.number | rechartsLib.rechartsLibStrings.category] = js.undefined
  // The unit of data displayed in the axis
  var unit: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  // The width of axis which is usually calculated internally
  var width: js.UndefOr[scala.Double] = js.undefined
  // The unique id of x-axis
  var xAxisId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object XAxisProps {
  @scala.inline
  def apply(
    allowDataOverflow: js.UndefOr[scala.Boolean] = js.undefined,
    allowDecimals: js.UndefOr[scala.Boolean] = js.undefined,
    allowDuplicatedCategory: js.UndefOr[scala.Boolean] = js.undefined,
    axisLine: scala.Boolean | js.Object = null,
    dataKey: DataKey = null,
    domain: js.Tuple2[AxisDomain, AxisDomain] = null,
    height: scala.Int | scala.Double = null,
    hide: js.UndefOr[scala.Boolean] = js.undefined,
    interval: AxisInterval = null,
    label: java.lang.String | scala.Double | Label | LabelProps = null,
    minTickGap: scala.Int | scala.Double = null,
    mirror: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String | scala.Double = null,
    onClick: RechartsFunction = null,
    onMouseDown: RechartsFunction = null,
    onMouseEnter: RechartsFunction = null,
    onMouseLeave: RechartsFunction = null,
    onMouseMove: RechartsFunction = null,
    onMouseOut: RechartsFunction = null,
    onMouseOver: RechartsFunction = null,
    onMouseUp: RechartsFunction = null,
    onTouchCancel: RechartsFunction = null,
    onTouchEnd: RechartsFunction = null,
    onTouchMove: RechartsFunction = null,
    onTouchStart: RechartsFunction = null,
    orientation: rechartsLib.rechartsLibStrings.top | rechartsLib.rechartsLibStrings.bottom = null,
    padding: XPadding = null,
    reversed: js.UndefOr[scala.Boolean] = js.undefined,
    scale: ScaleType | RechartsFunction = null,
    stroke: java.lang.String = null,
    textAnchor: java.lang.String = null,
    tick: scala.Boolean | ContentRenderer[_] | js.Object | reactLib.reactMod.ReactElement[_] = null,
    tickCount: scala.Int | scala.Double = null,
    tickFormatter: TickFormatterFunction = null,
    tickLine: scala.Boolean | js.Object = null,
    tickMargin: scala.Int | scala.Double = null,
    tickSize: scala.Int | scala.Double = null,
    ticks: js.Array[_] = null,
    `type`: rechartsLib.rechartsLibStrings.number | rechartsLib.rechartsLibStrings.category = null,
    unit: java.lang.String | scala.Double = null,
    width: scala.Int | scala.Double = null,
    xAxisId: java.lang.String | scala.Double = null
  ): XAxisProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDataOverflow)) __obj.updateDynamic("allowDataOverflow")(allowDataOverflow)
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals)
    if (!js.isUndefined(allowDuplicatedCategory)) __obj.updateDynamic("allowDuplicatedCategory")(allowDuplicatedCategory)
    if (axisLine != null) __obj.updateDynamic("axisLine")(axisLine.asInstanceOf[js.Any])
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (minTickGap != null) __obj.updateDynamic("minTickGap")(minTickGap.asInstanceOf[js.Any])
    if (!js.isUndefined(mirror)) __obj.updateDynamic("mirror")(mirror)
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut)
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor)
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (tickCount != null) __obj.updateDynamic("tickCount")(tickCount.asInstanceOf[js.Any])
    if (tickFormatter != null) __obj.updateDynamic("tickFormatter")(tickFormatter)
    if (tickLine != null) __obj.updateDynamic("tickLine")(tickLine.asInstanceOf[js.Any])
    if (tickMargin != null) __obj.updateDynamic("tickMargin")(tickMargin.asInstanceOf[js.Any])
    if (tickSize != null) __obj.updateDynamic("tickSize")(tickSize.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xAxisId != null) __obj.updateDynamic("xAxisId")(xAxisId.asInstanceOf[js.Any])
    __obj.asInstanceOf[XAxisProps]
  }
}

