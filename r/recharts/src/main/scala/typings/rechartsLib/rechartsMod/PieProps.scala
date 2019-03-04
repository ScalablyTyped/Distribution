package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number, number> ]:? recharts.recharts.PresentationAttributes<number, number>[P]} */ trait PieProps
  extends EventAttributes
     with Animatable {
  var activeIndex: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var activeShape: js.UndefOr[js.Object | ContentRenderer[_] | reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var blendStroke: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var cornerRadius: js.UndefOr[scala.Double | java.lang.String] = js.undefined
   // As the source code states, dataKey will replace valueKey in 1.1.0 and it'll be required (it's already required in current implementation).
  var cx: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var cy: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var data: js.UndefOr[js.Array[js.Object]] = js.undefined
  var dataKey: DataKey
  var endAngle: js.UndefOr[scala.Double] = js.undefined
  var hide: js.UndefOr[scala.Boolean] = js.undefined
  var innerRadius: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var label: js.UndefOr[
    rechartsLib.Anon_OffsetRadius | reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[PieLabelRenderProps] | scala.Boolean
  ] = js.undefined
  var labelLine: js.UndefOr[
    js.Object | (ContentRenderer[LineProps with js.Any]) | reactLib.reactMod.ReactNs.ReactElement[_] | scala.Boolean
  ] = js.undefined
  var legendType: js.UndefOr[LegendType] = js.undefined
  var maxRadius: js.UndefOr[scala.Double] = js.undefined
  var midAngle: js.UndefOr[scala.Double] = js.undefined
  var minAngle: js.UndefOr[scala.Double] = js.undefined
  var nameKey: js.UndefOr[
    java.lang.String | scala.Double | (js.Function1[/* dataObject */ js.Any, scala.Double])
  ] = js.undefined
  var outerRadius: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var paddingAngle: js.UndefOr[scala.Double] = js.undefined
  var sectors: js.UndefOr[js.Array[js.Object]] = js.undefined
  var startAngle: js.UndefOr[scala.Double] = js.undefined
  var valueKey: js.UndefOr[
    java.lang.String | scala.Double | (js.Function1[/* dataObject */ js.Any, scala.Double])
  ] = js.undefined
}

object PieProps {
  @scala.inline
  def apply(
    dataKey: DataKey,
    activeIndex: scala.Double | js.Array[scala.Double] = null,
    activeShape: js.Object | ContentRenderer[_] | reactLib.reactMod.ReactNs.ReactElement[_] = null,
    animationBegin: scala.Int | scala.Double = null,
    animationDuration: scala.Int | scala.Double = null,
    animationEasing: AnimationEasingType = null,
    animationId: scala.Int | scala.Double = null,
    blendStroke: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    cornerRadius: scala.Double | java.lang.String = null,
    cx: scala.Double | java.lang.String = null,
    cy: scala.Double | java.lang.String = null,
    data: js.Array[js.Object] = null,
    endAngle: scala.Int | scala.Double = null,
    hide: js.UndefOr[scala.Boolean] = js.undefined,
    innerRadius: scala.Double | java.lang.String = null,
    isAnimationActive: js.UndefOr[scala.Boolean] = js.undefined,
    isUpdateAnimationActive: js.UndefOr[scala.Boolean] = js.undefined,
    label: rechartsLib.Anon_OffsetRadius | reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[PieLabelRenderProps] | scala.Boolean = null,
    labelLine: js.Object | (ContentRenderer[LineProps with js.Any]) | reactLib.reactMod.ReactNs.ReactElement[_] | scala.Boolean = null,
    legendType: LegendType = null,
    maxRadius: scala.Int | scala.Double = null,
    midAngle: scala.Int | scala.Double = null,
    minAngle: scala.Int | scala.Double = null,
    nameKey: java.lang.String | scala.Double | (js.Function1[/* dataObject */ js.Any, scala.Double]) = null,
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
    outerRadius: scala.Double | java.lang.String = null,
    paddingAngle: scala.Int | scala.Double = null,
    sectors: js.Array[js.Object] = null,
    startAngle: scala.Int | scala.Double = null,
    valueKey: java.lang.String | scala.Double | (js.Function1[/* dataObject */ js.Any, scala.Double]) = null
  ): PieProps = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any])
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (activeShape != null) __obj.updateDynamic("activeShape")(activeShape.asInstanceOf[js.Any])
    if (animationBegin != null) __obj.updateDynamic("animationBegin")(animationBegin.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing)
    if (animationId != null) __obj.updateDynamic("animationId")(animationId.asInstanceOf[js.Any])
    if (!js.isUndefined(blendStroke)) __obj.updateDynamic("blendStroke")(blendStroke)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide)
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(isAnimationActive)) __obj.updateDynamic("isAnimationActive")(isAnimationActive)
    if (!js.isUndefined(isUpdateAnimationActive)) __obj.updateDynamic("isUpdateAnimationActive")(isUpdateAnimationActive)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelLine != null) __obj.updateDynamic("labelLine")(labelLine.asInstanceOf[js.Any])
    if (legendType != null) __obj.updateDynamic("legendType")(legendType)
    if (maxRadius != null) __obj.updateDynamic("maxRadius")(maxRadius.asInstanceOf[js.Any])
    if (midAngle != null) __obj.updateDynamic("midAngle")(midAngle.asInstanceOf[js.Any])
    if (minAngle != null) __obj.updateDynamic("minAngle")(minAngle.asInstanceOf[js.Any])
    if (nameKey != null) __obj.updateDynamic("nameKey")(nameKey.asInstanceOf[js.Any])
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
    if (outerRadius != null) __obj.updateDynamic("outerRadius")(outerRadius.asInstanceOf[js.Any])
    if (paddingAngle != null) __obj.updateDynamic("paddingAngle")(paddingAngle.asInstanceOf[js.Any])
    if (sectors != null) __obj.updateDynamic("sectors")(sectors)
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieProps]
  }
}

