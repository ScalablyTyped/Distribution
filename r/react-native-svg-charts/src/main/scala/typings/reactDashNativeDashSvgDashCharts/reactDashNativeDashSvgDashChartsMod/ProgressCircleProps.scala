package typings.reactDashNativeDashSvgDashCharts.reactDashNativeDashSvgDashChartsMod

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
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
    animateDuration: Int | Double = null,
    backgroundColor: String = null,
    endAngle: Int | Double = null,
    progressColor: String = null,
    startAngle: Int | Double = null,
    strokeWidth: Int | Double = null,
    style: StyleProp[ViewStyle] = null
  ): ProgressCircleProps = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (animateDuration != null) __obj.updateDynamic("animateDuration")(animateDuration.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (progressColor != null) __obj.updateDynamic("progressColor")(progressColor.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressCircleProps]
  }
}

