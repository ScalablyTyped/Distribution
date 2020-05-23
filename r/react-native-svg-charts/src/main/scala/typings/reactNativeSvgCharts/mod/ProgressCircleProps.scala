package typings.reactNativeSvgCharts.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressCircleProps extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var animateDuration: js.UndefOr[Double] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var endAngle: js.UndefOr[Double] = js.undefined
  var progress: Double
  var progressColor: js.UndefOr[String] = js.undefined
  var startAngle: js.UndefOr[Double] = js.undefined
  var strokeWidth: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object ProgressCircleProps {
  @scala.inline
  def apply(
    progress: Double,
    animate: js.UndefOr[Boolean] = js.undefined,
    animateDuration: js.UndefOr[Double] = js.undefined,
    backgroundColor: String = null,
    endAngle: js.UndefOr[Double] = js.undefined,
    progressColor: String = null,
    startAngle: js.UndefOr[Double] = js.undefined,
    strokeWidth: js.UndefOr[Double] = js.undefined,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined
  ): ProgressCircleProps = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animateDuration)) __obj.updateDynamic("animateDuration")(animateDuration.get.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(endAngle)) __obj.updateDynamic("endAngle")(endAngle.get.asInstanceOf[js.Any])
    if (progressColor != null) __obj.updateDynamic("progressColor")(progressColor.asInstanceOf[js.Any])
    if (!js.isUndefined(startAngle)) __obj.updateDynamic("startAngle")(startAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWidth)) __obj.updateDynamic("strokeWidth")(strokeWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressCircleProps]
  }
}

