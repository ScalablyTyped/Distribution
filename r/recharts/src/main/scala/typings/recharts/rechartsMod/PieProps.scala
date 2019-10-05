package typings.recharts.rechartsMod

import typings.react.reactMod.ReactElement
import typings.recharts.Anon_OffsetRadius
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number, number> ]:? recharts.recharts.PresentationAttributes<number, number>[P]} */ trait PieProps
  extends EventAttributes
     with Animatable {
  var activeIndex: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var activeShape: js.UndefOr[js.Object | ContentRenderer[_] | ReactElement] = js.undefined
  var blendStroke: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var cornerRadius: js.UndefOr[Double | String] = js.undefined
   // As the source code states, dataKey will replace valueKey in 1.1.0 and it'll be required (it's already required in current implementation).
  var cx: js.UndefOr[Double | String] = js.undefined
  var cy: js.UndefOr[Double | String] = js.undefined
  var data: js.UndefOr[js.Array[js.Object]] = js.undefined
  var dataKey: DataKey
  var endAngle: js.UndefOr[Double] = js.undefined
  var hide: js.UndefOr[Boolean] = js.undefined
  var innerRadius: js.UndefOr[Double | String] = js.undefined
  var label: js.UndefOr[
    Anon_OffsetRadius | ReactElement | ContentRenderer[PieLabelRenderProps] | Boolean
  ] = js.undefined
  var labelLine: js.UndefOr[js.Object | (ContentRenderer[LineProps with js.Any]) | ReactElement | Boolean] = js.undefined
  var legendType: js.UndefOr[LegendType] = js.undefined
  var maxRadius: js.UndefOr[Double] = js.undefined
  var midAngle: js.UndefOr[Double] = js.undefined
  var minAngle: js.UndefOr[Double] = js.undefined
  var nameKey: js.UndefOr[String | Double | (js.Function1[/* dataObject */ js.Any, Double])] = js.undefined
  var outerRadius: js.UndefOr[Double | String] = js.undefined
  var paddingAngle: js.UndefOr[Double] = js.undefined
  var sectors: js.UndefOr[js.Array[js.Object]] = js.undefined
  var startAngle: js.UndefOr[Double] = js.undefined
  var valueKey: js.UndefOr[String | Double | (js.Function1[/* dataObject */ js.Any, Double])] = js.undefined
}

object PieProps {
  @scala.inline
  def apply(
    dataKey: DataKey,
    activeIndex: Double | js.Array[Double] = null,
    activeShape: js.Object | ContentRenderer[_] | ReactElement = null,
    animationBegin: Int | Double = null,
    animationDuration: Int | Double = null,
    animationEasing: AnimationEasingType = null,
    animationId: Int | Double = null,
    blendStroke: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    cornerRadius: Double | String = null,
    cx: Double | String = null,
    cy: Double | String = null,
    data: js.Array[js.Object] = null,
    endAngle: Int | Double = null,
    hide: js.UndefOr[Boolean] = js.undefined,
    innerRadius: Double | String = null,
    isAnimationActive: js.UndefOr[Boolean] = js.undefined,
    isUpdateAnimationActive: js.UndefOr[Boolean] = js.undefined,
    label: Anon_OffsetRadius | ReactElement | ContentRenderer[PieLabelRenderProps] | Boolean = null,
    labelLine: js.Object | (ContentRenderer[LineProps with js.Any]) | ReactElement | Boolean = null,
    legendType: LegendType = null,
    maxRadius: Int | Double = null,
    midAngle: Int | Double = null,
    minAngle: Int | Double = null,
    nameKey: String | Double | (js.Function1[/* dataObject */ js.Any, Double]) = null,
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
    outerRadius: Double | String = null,
    paddingAngle: Int | Double = null,
    sectors: js.Array[js.Object] = null,
    startAngle: Int | Double = null,
    valueKey: String | Double | (js.Function1[/* dataObject */ js.Any, Double]) = null
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
    if (outerRadius != null) __obj.updateDynamic("outerRadius")(outerRadius.asInstanceOf[js.Any])
    if (paddingAngle != null) __obj.updateDynamic("paddingAngle")(paddingAngle.asInstanceOf[js.Any])
    if (sectors != null) __obj.updateDynamic("sectors")(sectors)
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieProps]
  }
}

