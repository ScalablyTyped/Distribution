package typings
package reactDashNativeDashIndicatorsLib.reactDashNativeDashIndicatorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaveIndicatorProps extends BaseIndicatorProps {
  /**
    * Component color
    * @default 'rgb(0, 0, 0)'
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Component count
    * @default 4
    */
  var count: js.UndefOr[scala.Double] = js.undefined
  /**
    * Base component size
    * @default 40
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /**
    * Minimum component scale
    * @default 0.54
    */
  var waveFactor: js.UndefOr[scala.Double] = js.undefined
  /**
    * Maximum component scale
    * @default 'fill'
    */
  var waveMode: js.UndefOr[
    reactDashNativeDashIndicatorsLib.reactDashNativeDashIndicatorsLibStrings.fill | reactDashNativeDashIndicatorsLib.reactDashNativeDashIndicatorsLibStrings.outline
  ] = js.undefined
}

object WaveIndicatorProps {
  @scala.inline
  def apply(
    animating: js.UndefOr[scala.Boolean] = js.undefined,
    animationDuration: scala.Int | scala.Double = null,
    animationEasing: reactDashNativeLib.reactDashNativeMod.EasingFunction = null,
    color: java.lang.String = null,
    count: scala.Int | scala.Double = null,
    interaction: js.UndefOr[scala.Boolean] = js.undefined,
    size: scala.Int | scala.Double = null,
    waveFactor: scala.Int | scala.Double = null,
    waveMode: reactDashNativeDashIndicatorsLib.reactDashNativeDashIndicatorsLibStrings.fill | reactDashNativeDashIndicatorsLib.reactDashNativeDashIndicatorsLibStrings.outline = null
  ): WaveIndicatorProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animating)) __obj.updateDynamic("animating")(animating)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing)
    if (color != null) __obj.updateDynamic("color")(color)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(interaction)) __obj.updateDynamic("interaction")(interaction)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (waveFactor != null) __obj.updateDynamic("waveFactor")(waveFactor.asInstanceOf[js.Any])
    if (waveMode != null) __obj.updateDynamic("waveMode")(waveMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaveIndicatorProps]
  }
}

