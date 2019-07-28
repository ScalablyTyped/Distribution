package typings.recharts.rechartsMod

import typings.react.reactMod.ReactElement
import typings.recharts.rechartsStrings.bottom
import typings.recharts.rechartsStrings.left
import typings.recharts.rechartsStrings.right
import typings.recharts.rechartsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number, number> ]:? recharts.recharts.PresentationAttributes<number, number>[P]} */ trait CartesianAxisProps extends EventAttributes {
  var axisLine: js.UndefOr[Boolean | js.Object] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var interval: js.UndefOr[AxisInterval] = js.undefined
  var minTickGap: js.UndefOr[Double] = js.undefined
  var mirror: js.UndefOr[Boolean] = js.undefined
  var orientation: js.UndefOr[top | bottom | left | right] = js.undefined
  var stroke: js.UndefOr[String] = js.undefined
  var tick: js.UndefOr[Boolean | ContentRenderer[_] | js.Object | ReactElement] = js.undefined
  var tickFormatter: js.UndefOr[TickFormatterFunction] = js.undefined
  var tickLine: js.UndefOr[Boolean | js.Object] = js.undefined
  var tickSize: js.UndefOr[Double] = js.undefined
  var ticks: js.UndefOr[js.Array[_]] = js.undefined
  var ticksGenerator: js.UndefOr[TickGeneratorFunction] = js.undefined
  var viewBox: js.UndefOr[ViewBox] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object CartesianAxisProps {
  @scala.inline
  def apply(
    axisLine: Boolean | js.Object = null,
    className: String = null,
    height: Int | Double = null,
    interval: AxisInterval = null,
    minTickGap: Int | Double = null,
    mirror: js.UndefOr[Boolean] = js.undefined,
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
    orientation: top | bottom | left | right = null,
    stroke: String = null,
    tick: Boolean | ContentRenderer[_] | js.Object | ReactElement = null,
    tickFormatter: TickFormatterFunction = null,
    tickLine: Boolean | js.Object = null,
    tickSize: Int | Double = null,
    ticks: js.Array[_] = null,
    ticksGenerator: TickGeneratorFunction = null,
    viewBox: ViewBox = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
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

