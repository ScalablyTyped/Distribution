package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number, number> ]:? recharts.recharts.PresentationAttributes<number, number>[P]} */ trait ScatterProps
  extends EventAttributes
     with Animatable {
  var activeIndex: js.UndefOr[scala.Double] = js.undefined
  var activeShape: js.UndefOr[js.Object | RechartsFunction | reactLib.reactMod.ReactElement] = js.undefined
  var data: js.UndefOr[js.Array[js.Object]] = js.undefined
  var hide: js.UndefOr[scala.Boolean] = js.undefined
  var legendType: js.UndefOr[LegendType] = js.undefined
  var line: js.UndefOr[scala.Boolean | js.Object | RechartsFunction | reactLib.reactMod.ReactElement] = js.undefined
  var lineJointType: js.UndefOr[LineType] = js.undefined
  var lineType: js.UndefOr[rechartsLib.rechartsLibStrings.joint | rechartsLib.rechartsLibStrings.fitting] = js.undefined
  var name: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var points: js.UndefOr[js.Array[ScatterPoint]] = js.undefined
  var shape: js.UndefOr[
    rechartsLib.rechartsLibStrings.circle | rechartsLib.rechartsLibStrings.cross | rechartsLib.rechartsLibStrings.diamond | rechartsLib.rechartsLibStrings.square | rechartsLib.rechartsLibStrings.star | rechartsLib.rechartsLibStrings.triangle | rechartsLib.rechartsLibStrings.wye | reactLib.reactMod.ReactElement | ContentRenderer[_]
  ] = js.undefined
  var xAxisId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var yAxisId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var zAxisId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object ScatterProps {
  @scala.inline
  def apply(
    activeIndex: scala.Int | scala.Double = null,
    activeShape: js.Object | RechartsFunction | reactLib.reactMod.ReactElement = null,
    animationBegin: scala.Int | scala.Double = null,
    animationDuration: scala.Int | scala.Double = null,
    animationEasing: AnimationEasingType = null,
    animationId: scala.Int | scala.Double = null,
    data: js.Array[js.Object] = null,
    hide: js.UndefOr[scala.Boolean] = js.undefined,
    isAnimationActive: js.UndefOr[scala.Boolean] = js.undefined,
    isUpdateAnimationActive: js.UndefOr[scala.Boolean] = js.undefined,
    legendType: LegendType = null,
    line: scala.Boolean | js.Object | RechartsFunction | reactLib.reactMod.ReactElement = null,
    lineJointType: LineType = null,
    lineType: rechartsLib.rechartsLibStrings.joint | rechartsLib.rechartsLibStrings.fitting = null,
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
    points: js.Array[ScatterPoint] = null,
    shape: rechartsLib.rechartsLibStrings.circle | rechartsLib.rechartsLibStrings.cross | rechartsLib.rechartsLibStrings.diamond | rechartsLib.rechartsLibStrings.square | rechartsLib.rechartsLibStrings.star | rechartsLib.rechartsLibStrings.triangle | rechartsLib.rechartsLibStrings.wye | reactLib.reactMod.ReactElement | ContentRenderer[_] = null,
    xAxisId: java.lang.String | scala.Double = null,
    yAxisId: java.lang.String | scala.Double = null,
    zAxisId: java.lang.String | scala.Double = null
  ): ScatterProps = {
    val __obj = js.Dynamic.literal()
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (activeShape != null) __obj.updateDynamic("activeShape")(activeShape.asInstanceOf[js.Any])
    if (animationBegin != null) __obj.updateDynamic("animationBegin")(animationBegin.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing)
    if (animationId != null) __obj.updateDynamic("animationId")(animationId.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide)
    if (!js.isUndefined(isAnimationActive)) __obj.updateDynamic("isAnimationActive")(isAnimationActive)
    if (!js.isUndefined(isUpdateAnimationActive)) __obj.updateDynamic("isUpdateAnimationActive")(isUpdateAnimationActive)
    if (legendType != null) __obj.updateDynamic("legendType")(legendType)
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (lineJointType != null) __obj.updateDynamic("lineJointType")(lineJointType.asInstanceOf[js.Any])
    if (lineType != null) __obj.updateDynamic("lineType")(lineType.asInstanceOf[js.Any])
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
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (xAxisId != null) __obj.updateDynamic("xAxisId")(xAxisId.asInstanceOf[js.Any])
    if (yAxisId != null) __obj.updateDynamic("yAxisId")(yAxisId.asInstanceOf[js.Any])
    if (zAxisId != null) __obj.updateDynamic("zAxisId")(zAxisId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterProps]
  }
}

