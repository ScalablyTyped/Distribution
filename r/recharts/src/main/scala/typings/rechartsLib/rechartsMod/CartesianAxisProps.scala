package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number, number> ]:? recharts.recharts.PresentationAttributes<number, number>[P]} */ trait CartesianAxisProps extends EventAttributes {
  var axisLine: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var interval: js.UndefOr[AxisInterval] = js.undefined
  var minTickGap: js.UndefOr[scala.Double] = js.undefined
  var mirror: js.UndefOr[scala.Boolean] = js.undefined
  var orientation: js.UndefOr[
    rechartsLib.rechartsLibStrings.top | rechartsLib.rechartsLibStrings.bottom | rechartsLib.rechartsLibStrings.left | rechartsLib.rechartsLibStrings.right
  ] = js.undefined
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  var tick: js.UndefOr[scala.Boolean | ContentRenderer[_] | js.Object | reactLib.reactMod.ReactElement] = js.undefined
  var tickFormatter: js.UndefOr[TickFormatterFunction] = js.undefined
  var tickLine: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  var tickSize: js.UndefOr[scala.Double] = js.undefined
  var ticks: js.UndefOr[js.Array[_]] = js.undefined
  var ticksGenerator: js.UndefOr[TickGeneratorFunction] = js.undefined
  var viewBox: js.UndefOr[ViewBox] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

object CartesianAxisProps {
  @scala.inline
  def apply(
    axisLine: scala.Boolean | js.Object = null,
    className: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    interval: AxisInterval = null,
    minTickGap: scala.Int | scala.Double = null,
    mirror: js.UndefOr[scala.Boolean] = js.undefined,
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
    orientation: rechartsLib.rechartsLibStrings.top | rechartsLib.rechartsLibStrings.bottom | rechartsLib.rechartsLibStrings.left | rechartsLib.rechartsLibStrings.right = null,
    stroke: java.lang.String = null,
    tick: scala.Boolean | ContentRenderer[_] | js.Object | reactLib.reactMod.ReactElement = null,
    tickFormatter: TickFormatterFunction = null,
    tickLine: scala.Boolean | js.Object = null,
    tickSize: scala.Int | scala.Double = null,
    ticks: js.Array[_] = null,
    ticksGenerator: TickGeneratorFunction = null,
    viewBox: ViewBox = null,
    width: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): CartesianAxisProps = {
    val __obj = js.Dynamic.literal()
    if (axisLine != null) __obj.updateDynamic("axisLine")(axisLine.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (minTickGap != null) __obj.updateDynamic("minTickGap")(minTickGap.asInstanceOf[js.Any])
    if (!js.isUndefined(mirror)) __obj.updateDynamic("mirror")(mirror)
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
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (tickFormatter != null) __obj.updateDynamic("tickFormatter")(tickFormatter)
    if (tickLine != null) __obj.updateDynamic("tickLine")(tickLine.asInstanceOf[js.Any])
    if (tickSize != null) __obj.updateDynamic("tickSize")(tickSize.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks)
    if (ticksGenerator != null) __obj.updateDynamic("ticksGenerator")(ticksGenerator)
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartesianAxisProps]
  }
}

