package typings.recharts.rechartsMod

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number, number> ]:? recharts.recharts.PresentationAttributes<number, number>[P]} */ trait RadialBarProps
  extends EventAttributes
     with Animatable {
  var activeShape: js.UndefOr[js.Object | ContentRenderer[_] | ReactElement] = js.undefined
   // As the source code states, dataKey will replace valueKey in 1.1.0 and it'll be required (it's already required in current implementation).
  var angleAxisId: js.UndefOr[String | Double] = js.undefined
  var background: js.UndefOr[Boolean | ReactElement | ContentRenderer[_] | js.Object] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var cornerRadius: js.UndefOr[Double | String] = js.undefined
  var data: js.UndefOr[js.Array[RadialBarData]] = js.undefined
  var dataKey: DataKey
  var hide: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[Boolean | ReactElement | ContentRenderer[_] | js.Object] = js.undefined
  var legendType: js.UndefOr[LegendType] = js.undefined
  var maxBarSize: js.UndefOr[Double] = js.undefined
  var minPointSize: js.UndefOr[Double] = js.undefined
  var radiusAxisId: js.UndefOr[String | Double] = js.undefined
  var shape: js.UndefOr[ContentRenderer[_] | ReactElement] = js.undefined
}

object RadialBarProps {
  @scala.inline
  def apply(
    dataKey: DataKey,
    activeShape: js.Object | ContentRenderer[_] | ReactElement = null,
    angleAxisId: String | Double = null,
    animationBegin: Int | Double = null,
    animationDuration: Int | Double = null,
    animationEasing: AnimationEasingType = null,
    animationId: Int | Double = null,
    background: Boolean | ReactElement | ContentRenderer[_] | js.Object = null,
    className: String = null,
    cornerRadius: Double | String = null,
    data: js.Array[RadialBarData] = null,
    hide: js.UndefOr[Boolean] = js.undefined,
    isAnimationActive: js.UndefOr[Boolean] = js.undefined,
    isUpdateAnimationActive: js.UndefOr[Boolean] = js.undefined,
    label: Boolean | ReactElement | ContentRenderer[_] | js.Object = null,
    legendType: LegendType = null,
    maxBarSize: Int | Double = null,
    minPointSize: Int | Double = null,
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
    radiusAxisId: String | Double = null,
    shape: ContentRenderer[_] | ReactElement = null
  ): RadialBarProps = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any])
    if (activeShape != null) __obj.updateDynamic("activeShape")(activeShape.asInstanceOf[js.Any])
    if (angleAxisId != null) __obj.updateDynamic("angleAxisId")(angleAxisId.asInstanceOf[js.Any])
    if (animationBegin != null) __obj.updateDynamic("animationBegin")(animationBegin.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing)
    if (animationId != null) __obj.updateDynamic("animationId")(animationId.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide)
    if (!js.isUndefined(isAnimationActive)) __obj.updateDynamic("isAnimationActive")(isAnimationActive)
    if (!js.isUndefined(isUpdateAnimationActive)) __obj.updateDynamic("isUpdateAnimationActive")(isUpdateAnimationActive)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (legendType != null) __obj.updateDynamic("legendType")(legendType)
    if (maxBarSize != null) __obj.updateDynamic("maxBarSize")(maxBarSize.asInstanceOf[js.Any])
    if (minPointSize != null) __obj.updateDynamic("minPointSize")(minPointSize.asInstanceOf[js.Any])
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
    if (radiusAxisId != null) __obj.updateDynamic("radiusAxisId")(radiusAxisId.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialBarProps]
  }
}

