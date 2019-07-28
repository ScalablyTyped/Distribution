package typings.recharts.rechartsMod

import typings.react.reactMod.ReactElement
import typings.recharts.rechartsStrings.category
import typings.recharts.rechartsStrings.left
import typings.recharts.rechartsStrings.number
import typings.recharts.rechartsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAxisProps extends EventAttributes {
  var allowDataOverflow: js.UndefOr[Boolean] = js.undefined
  var allowDecimals: js.UndefOr[Boolean] = js.undefined
  var axisLine: js.UndefOr[Boolean | js.Object] = js.undefined
  // The key of data displayed in the axis
  var dataKey: js.UndefOr[DataKey] = js.undefined
  var domain: js.UndefOr[js.Tuple2[AxisDomain, AxisDomain]] = js.undefined
  // The height of axis which is usually calculated in Chart
  var height: js.UndefOr[Double] = js.undefined
  var hide: js.UndefOr[Boolean] = js.undefined
  var interval: js.UndefOr[AxisInterval] = js.undefined
  // see label section at http://recharts.org/#/en-US/api/YAxis
  var label: js.UndefOr[String | Double | Label | LabelProps] = js.undefined
  var minTickGap: js.UndefOr[Double] = js.undefined
  var mirror: js.UndefOr[Boolean] = js.undefined
  // The name of data displayed in the axis
  var name: js.UndefOr[String | Double] = js.undefined
  // The orientation of axis
  var orientation: js.UndefOr[left | right] = js.undefined
  var padding: js.UndefOr[YPadding] = js.undefined
  var reversed: js.UndefOr[Boolean] = js.undefined
  var scale: js.UndefOr[ScaleType | RechartsFunction] = js.undefined
  var stroke: js.UndefOr[String] = js.undefined
  var tick: js.UndefOr[Boolean | ContentRenderer[_] | js.Object | ReactElement] = js.undefined
  // The count of ticks
  var tickCount: js.UndefOr[Double] = js.undefined
  // The formatter function of tick
  var tickFormatter: js.UndefOr[TickFormatterFunction] = js.undefined
  var tickLine: js.UndefOr[Boolean | js.Object] = js.undefined
  // The margin between tick line and the label
  var tickMargin: js.UndefOr[Double] = js.undefined
  var tickSize: js.UndefOr[Double] = js.undefined
  // Ticks can be any type when the axis is the type of category
  // Ticks must be numbers when the axis is the type of number
  var ticks: js.UndefOr[js.Array[_]] = js.undefined
  var `type`: js.UndefOr[number | category] = js.undefined
  // The unit of data displayed in the axis
  var unit: js.UndefOr[String | Double] = js.undefined
  // The width of axis, which need to be set by user
  var width: js.UndefOr[Double] = js.undefined
  // The unique id of y-axis
  var yAxisId: js.UndefOr[String | Double] = js.undefined
}

object YAxisProps {
  @scala.inline
  def apply(
    allowDataOverflow: js.UndefOr[Boolean] = js.undefined,
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    axisLine: Boolean | js.Object = null,
    dataKey: DataKey = null,
    domain: js.Tuple2[AxisDomain, AxisDomain] = null,
    height: Int | Double = null,
    hide: js.UndefOr[Boolean] = js.undefined,
    interval: AxisInterval = null,
    label: String | Double | Label | LabelProps = null,
    minTickGap: Int | Double = null,
    mirror: js.UndefOr[Boolean] = js.undefined,
    name: String | Double = null,
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
    orientation: left | right = null,
    padding: YPadding = null,
    reversed: js.UndefOr[Boolean] = js.undefined,
    scale: ScaleType | RechartsFunction = null,
    stroke: String = null,
    tick: Boolean | ContentRenderer[_] | js.Object | ReactElement = null,
    tickCount: Int | Double = null,
    tickFormatter: TickFormatterFunction = null,
    tickLine: Boolean | js.Object = null,
    tickMargin: Int | Double = null,
    tickSize: Int | Double = null,
    ticks: js.Array[_] = null,
    `type`: number | category = null,
    unit: String | Double = null,
    width: Int | Double = null,
    yAxisId: String | Double = null
  ): YAxisProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDataOverflow)) __obj.updateDynamic("allowDataOverflow")(allowDataOverflow)
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals)
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
    if (yAxisId != null) __obj.updateDynamic("yAxisId")(yAxisId.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAxisProps]
  }
}

