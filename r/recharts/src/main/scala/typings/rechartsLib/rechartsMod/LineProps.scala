package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number, number> ]:? recharts.recharts.PresentationAttributes<number, number>[P]} */ trait LineProps
  extends EventAttributes
     with Animatable {
  var activeDot: js.UndefOr[
    js.Object | reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[_] | scala.Boolean
  ] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var connectNulls: js.UndefOr[scala.Boolean] = js.undefined
  var data: js.UndefOr[js.Array[js.Object]] = js.undefined
  var dataKey: DataKey
  var dot: js.UndefOr[
    js.Object | reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[DotProps] | scala.Boolean
  ] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var hide: js.UndefOr[scala.Boolean] = js.undefined
   // As the source code states, dataKey will replace valueKey in 1.1.0 and it'll be required (it's already required in current implementation).
  var label: js.UndefOr[
    scala.Boolean | js.Object | reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[_]
  ] = js.undefined
  var layout: js.UndefOr[LayoutType] = js.undefined
  var left: js.UndefOr[scala.Double] = js.undefined
  var legendType: js.UndefOr[LegendType] = js.undefined
  var name: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var points: js.UndefOr[js.Array[Point]] = js.undefined
  var top: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[LineType] = js.undefined
  var unit: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var xAxis: js.UndefOr[js.Object] = js.undefined
  var xAxisId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var yAxis: js.UndefOr[js.Object] = js.undefined
  var yAxisId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object LineProps {
  @scala.inline
  def apply(
    dataKey: DataKey,
    activeDot: js.Object | reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[_] | scala.Boolean = null,
    animationBegin: scala.Int | scala.Double = null,
    animationDuration: scala.Int | scala.Double = null,
    animationEasing: AnimationEasingType = null,
    animationId: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    connectNulls: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Array[js.Object] = null,
    dot: js.Object | reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[DotProps] | scala.Boolean = null,
    height: scala.Int | scala.Double = null,
    hide: js.UndefOr[scala.Boolean] = js.undefined,
    isAnimationActive: js.UndefOr[scala.Boolean] = js.undefined,
    isUpdateAnimationActive: js.UndefOr[scala.Boolean] = js.undefined,
    label: scala.Boolean | js.Object | reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[_] = null,
    layout: LayoutType = null,
    left: scala.Int | scala.Double = null,
    legendType: LegendType = null,
    name: java.lang.String | scala.Double = null,
    onAnimationEnd: RechartsFunction = null,
    onAnimationStart: RechartsFunction = null,
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
    points: js.Array[Point] = null,
    top: scala.Int | scala.Double = null,
    `type`: LineType = null,
    unit: java.lang.String | scala.Double = null,
    width: scala.Int | scala.Double = null,
    xAxis: js.Object = null,
    xAxisId: java.lang.String | scala.Double = null,
    yAxis: js.Object = null,
    yAxisId: java.lang.String | scala.Double = null
  ): LineProps = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any])
    if (activeDot != null) __obj.updateDynamic("activeDot")(activeDot.asInstanceOf[js.Any])
    if (animationBegin != null) __obj.updateDynamic("animationBegin")(animationBegin.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing)
    if (animationId != null) __obj.updateDynamic("animationId")(animationId.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(connectNulls)) __obj.updateDynamic("connectNulls")(connectNulls)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dot != null) __obj.updateDynamic("dot")(dot.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide)
    if (!js.isUndefined(isAnimationActive)) __obj.updateDynamic("isAnimationActive")(isAnimationActive)
    if (!js.isUndefined(isUpdateAnimationActive)) __obj.updateDynamic("isUpdateAnimationActive")(isUpdateAnimationActive)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (legendType != null) __obj.updateDynamic("legendType")(legendType)
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(onAnimationEnd)
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(onAnimationStart)
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
    if (points != null) __obj.updateDynamic("points")(points)
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis)
    if (xAxisId != null) __obj.updateDynamic("xAxisId")(xAxisId.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis)
    if (yAxisId != null) __obj.updateDynamic("yAxisId")(yAxisId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineProps]
  }
}

