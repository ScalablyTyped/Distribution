package typings.recharts.rechartsMod

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number, number> ]:? recharts.recharts.PresentationAttributes<number, number>[P]} */ trait AreaProps
  extends EventAttributes
     with Animatable {
  var activeDot: js.UndefOr[Boolean | js.Object | ReactElement | ContentRenderer[_]] = js.undefined
  var baseLine: js.UndefOr[Double | js.Array[_]] = js.undefined
   // As the source code states, dataKey will replace valueKey in 1.1.0 and it'll be required (it's already required in current implementation).
  var className: js.UndefOr[String] = js.undefined
  var connectNulls: js.UndefOr[Boolean] = js.undefined
  var dataKey: DataKey
  var dot: js.UndefOr[Boolean | js.Object | ReactElement | ContentRenderer[DotProps]] = js.undefined
  var hide: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var isRange: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[Boolean | js.Object | ContentRenderer[_] | ReactElement] = js.undefined
  var layout: js.UndefOr[LayoutType] = js.undefined
  var legendType: js.UndefOr[LegendType] = js.undefined
  var name: js.UndefOr[String | Double] = js.undefined
  var points: js.UndefOr[js.Array[Point]] = js.undefined
  var stackId: js.UndefOr[String | Double] = js.undefined
  var `type`: js.UndefOr[LineType] = js.undefined
  var unit: js.UndefOr[String | Double] = js.undefined
  var xAxis: js.UndefOr[js.Object] = js.undefined
  var xAxisId: js.UndefOr[String | Double] = js.undefined
  var yAxis: js.UndefOr[js.Object] = js.undefined
  var yAxisId: js.UndefOr[String | Double] = js.undefined
}

object AreaProps {
  @scala.inline
  def apply(
    dataKey: DataKey,
    activeDot: Boolean | js.Object | ReactElement | ContentRenderer[_] = null,
    animationBegin: Int | Double = null,
    animationDuration: Int | Double = null,
    animationEasing: AnimationEasingType = null,
    animationId: Int | Double = null,
    baseLine: Double | js.Array[_] = null,
    className: String = null,
    connectNulls: js.UndefOr[Boolean] = js.undefined,
    dot: Boolean | js.Object | ReactElement | ContentRenderer[DotProps] = null,
    hide: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    isAnimationActive: js.UndefOr[Boolean] = js.undefined,
    isRange: js.UndefOr[Boolean] = js.undefined,
    isUpdateAnimationActive: js.UndefOr[Boolean] = js.undefined,
    label: Boolean | js.Object | ContentRenderer[_] | ReactElement = null,
    layout: LayoutType = null,
    legendType: LegendType = null,
    name: String | Double = null,
    onAnimationEnd: /* repeated */ js.Any => Unit = null,
    onAnimationStart: /* repeated */ js.Any => Unit = null,
    onClick: /* repeated */ js.Any => Unit = null,
    onMouseDown: /* repeated */ js.Any => Unit = null,
    onMouseEnter: /* repeated */ js.Any => Unit = null,
    onMouseLeave: /* repeated */ js.Any => Unit = null,
    onMouseMove: /* repeated */ js.Any => Unit = null,
    onMouseOut: /* repeated */ js.Any => Unit = null,
    onMouseOver: /* repeated */ js.Any => Unit = null,
    onMouseUp: /* repeated */ js.Any => Unit = null,
    onTouchCancel: /* repeated */ js.Any => Unit = null,
    onTouchEnd: /* repeated */ js.Any => Unit = null,
    onTouchMove: /* repeated */ js.Any => Unit = null,
    onTouchStart: /* repeated */ js.Any => Unit = null,
    points: js.Array[Point] = null,
    stackId: String | Double = null,
    `type`: LineType = null,
    unit: String | Double = null,
    xAxis: js.Object = null,
    xAxisId: String | Double = null,
    yAxis: js.Object = null,
    yAxisId: String | Double = null
  ): AreaProps = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any])
    if (activeDot != null) __obj.updateDynamic("activeDot")(activeDot.asInstanceOf[js.Any])
    if (animationBegin != null) __obj.updateDynamic("animationBegin")(animationBegin.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing)
    if (animationId != null) __obj.updateDynamic("animationId")(animationId.asInstanceOf[js.Any])
    if (baseLine != null) __obj.updateDynamic("baseLine")(baseLine.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(connectNulls)) __obj.updateDynamic("connectNulls")(connectNulls)
    if (dot != null) __obj.updateDynamic("dot")(dot.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isAnimationActive)) __obj.updateDynamic("isAnimationActive")(isAnimationActive)
    if (!js.isUndefined(isRange)) __obj.updateDynamic("isRange")(isRange)
    if (!js.isUndefined(isUpdateAnimationActive)) __obj.updateDynamic("isUpdateAnimationActive")(isUpdateAnimationActive)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (legendType != null) __obj.updateDynamic("legendType")(legendType)
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (points != null) __obj.updateDynamic("points")(points)
    if (stackId != null) __obj.updateDynamic("stackId")(stackId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis)
    if (xAxisId != null) __obj.updateDynamic("xAxisId")(xAxisId.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis)
    if (yAxisId != null) __obj.updateDynamic("yAxisId")(yAxisId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaProps]
  }
}

