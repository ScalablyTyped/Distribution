package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number, number> ]:? recharts.recharts.PresentationAttributes<number, number>[P]} */ trait RadarProps
  extends EventAttributes
     with Animatable {
  var activeDot: js.UndefOr[
    js.Object | reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[_] | scala.Boolean
  ] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var dataKey: DataKey
  var dot: js.UndefOr[
    js.Object | reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[DotProps] | scala.Boolean
  ] = js.undefined
  var hide: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[
    js.Object | reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[_] | scala.Boolean
  ] = js.undefined
  var legendType: js.UndefOr[LegendType] = js.undefined
   // As the source code states, dataKey will replace valueKey in 1.1.0 and it'll be required (it's already required in current implementation).
  var points: js.UndefOr[js.Array[RadarPoint]] = js.undefined
  var shape: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[RadarProps]] = js.undefined
}

object RadarProps {
  @scala.inline
  def apply(
    dataKey: DataKey,
    activeDot: js.Object | reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[_] | scala.Boolean = null,
    animationBegin: scala.Int | scala.Double = null,
    animationDuration: scala.Int | scala.Double = null,
    animationEasing: AnimationEasingType = null,
    animationId: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    dot: js.Object | reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[DotProps] | scala.Boolean = null,
    hide: js.UndefOr[scala.Boolean] = js.undefined,
    isAnimationActive: js.UndefOr[scala.Boolean] = js.undefined,
    isUpdateAnimationActive: js.UndefOr[scala.Boolean] = js.undefined,
    label: js.Object | reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[_] | scala.Boolean = null,
    legendType: LegendType = null,
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
    points: js.Array[RadarPoint] = null,
    shape: reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[RadarProps] = null
  ): RadarProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (activeDot != null) __obj.updateDynamic("activeDot")(activeDot.asInstanceOf[js.Any])
    if (animationBegin != null) __obj.updateDynamic("animationBegin")(animationBegin.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing)
    if (animationId != null) __obj.updateDynamic("animationId")(animationId.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (dot != null) __obj.updateDynamic("dot")(dot.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide)
    if (!js.isUndefined(isAnimationActive)) __obj.updateDynamic("isAnimationActive")(isAnimationActive)
    if (!js.isUndefined(isUpdateAnimationActive)) __obj.updateDynamic("isUpdateAnimationActive")(isUpdateAnimationActive)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (legendType != null) __obj.updateDynamic("legendType")(legendType)
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
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadarProps]
  }
}

