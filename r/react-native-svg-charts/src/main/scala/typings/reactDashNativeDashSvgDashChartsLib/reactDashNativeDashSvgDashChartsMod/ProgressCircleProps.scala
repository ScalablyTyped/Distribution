package typings
package reactDashNativeDashSvgDashChartsLib.reactDashNativeDashSvgDashChartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressCircleProps extends js.Object {
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  var animateDuration: js.UndefOr[scala.Double] = js.undefined
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var endAngle: js.UndefOr[scala.Double] = js.undefined
  var progress: scala.Double
  var progressColor: js.UndefOr[java.lang.String] = js.undefined
  var startAngle: js.UndefOr[scala.Double] = js.undefined
  var strokeWidth: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
}

object ProgressCircleProps {
  @scala.inline
  def apply(
    progress: scala.Double,
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    animateDuration: scala.Int | scala.Double = null,
    backgroundColor: java.lang.String = null,
    endAngle: scala.Int | scala.Double = null,
    progressColor: java.lang.String = null,
    startAngle: scala.Int | scala.Double = null,
    strokeWidth: scala.Int | scala.Double = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null
  ): ProgressCircleProps = {
    val __obj = js.Dynamic.literal(progress = progress)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (animateDuration != null) __obj.updateDynamic("animateDuration")(animateDuration.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (progressColor != null) __obj.updateDynamic("progressColor")(progressColor)
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressCircleProps]
  }
}

