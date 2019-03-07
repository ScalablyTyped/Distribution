package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number, number> ]:? recharts.recharts.PresentationAttributes<number, number>[P]} */ trait BarProps
  extends EventAttributes
     with Animatable {
  var background: js.UndefOr[
    scala.Boolean | reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[_] | js.Object
  ] = js.undefined
  var barSize: js.UndefOr[scala.Double] = js.undefined
   // As the source code states, dataKey will replace valueKey in 1.1.0 and it'll be required (it's already required in current implementation).
  var className: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Array[BarData]] = js.undefined
  var dataKey: DataKey
  var fill: js.UndefOr[java.lang.String] = js.undefined
  var hide: js.UndefOr[scala.Boolean] = js.undefined
  // see label section at http://recharts.org/#/en-US/api/Bar
  var label: js.UndefOr[
    scala.Boolean | Label | LabelProps | reactLib.reactMod.ReactNs.SFC[LabelProps] | reactLib.reactMod.ReactNs.ReactElement[LabelProps] | ContentRenderer[_]
  ] = js.undefined
  var layout: js.UndefOr[LayoutType] = js.undefined
  var legendType: js.UndefOr[LegendType] = js.undefined
  var maxBarSize: js.UndefOr[scala.Double] = js.undefined
  var minPointSize: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var radius: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var shape: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[RectangleProps]] = js.undefined
  var stackId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var unit: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var xAxis: js.UndefOr[js.Object] = js.undefined
  var xAxisId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var yAxis: js.UndefOr[js.Object] = js.undefined
  var yAxisId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object BarProps {
  @scala.inline
  def apply(
    dataKey: DataKey,
    animationBegin: scala.Int | scala.Double = null,
    animationDuration: scala.Int | scala.Double = null,
    animationEasing: AnimationEasingType = null,
    animationId: scala.Int | scala.Double = null,
    background: scala.Boolean | reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[_] | js.Object = null,
    barSize: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    data: js.Array[BarData] = null,
    fill: java.lang.String = null,
    hide: js.UndefOr[scala.Boolean] = js.undefined,
    isAnimationActive: js.UndefOr[scala.Boolean] = js.undefined,
    isUpdateAnimationActive: js.UndefOr[scala.Boolean] = js.undefined,
    label: scala.Boolean | Label | LabelProps | reactLib.reactMod.ReactNs.SFC[LabelProps] | reactLib.reactMod.ReactNs.ReactElement[LabelProps] | ContentRenderer[_] = null,
    layout: LayoutType = null,
    legendType: LegendType = null,
    maxBarSize: scala.Int | scala.Double = null,
    minPointSize: scala.Int | scala.Double = null,
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
    radius: scala.Double | js.Array[scala.Double] = null,
    shape: reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[RectangleProps] = null,
    stackId: java.lang.String | scala.Double = null,
    unit: java.lang.String | scala.Double = null,
    xAxis: js.Object = null,
    xAxisId: java.lang.String | scala.Double = null,
    yAxis: js.Object = null,
    yAxisId: java.lang.String | scala.Double = null
  ): BarProps = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any])
    if (animationBegin != null) __obj.updateDynamic("animationBegin")(animationBegin.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing)
    if (animationId != null) __obj.updateDynamic("animationId")(animationId.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (barSize != null) __obj.updateDynamic("barSize")(barSize.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (data != null) __obj.updateDynamic("data")(data)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide)
    if (!js.isUndefined(isAnimationActive)) __obj.updateDynamic("isAnimationActive")(isAnimationActive)
    if (!js.isUndefined(isUpdateAnimationActive)) __obj.updateDynamic("isUpdateAnimationActive")(isUpdateAnimationActive)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (legendType != null) __obj.updateDynamic("legendType")(legendType)
    if (maxBarSize != null) __obj.updateDynamic("maxBarSize")(maxBarSize.asInstanceOf[js.Any])
    if (minPointSize != null) __obj.updateDynamic("minPointSize")(minPointSize.asInstanceOf[js.Any])
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
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (stackId != null) __obj.updateDynamic("stackId")(stackId.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis)
    if (xAxisId != null) __obj.updateDynamic("xAxisId")(xAxisId.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis)
    if (yAxisId != null) __obj.updateDynamic("yAxisId")(yAxisId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarProps]
  }
}

