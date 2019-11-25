package typings.reactDashNativeDashIndicators.reactDashNativeDashIndicatorsMod

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNativeDashIndicators.reactDashNativeDashIndicatorsStrings.fill
import typings.reactDashNativeDashIndicators.reactDashNativeDashIndicatorsStrings.outline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaveIndicatorProps extends BaseIndicatorProps {
  /**
    * Component color
    * @default 'rgb(0, 0, 0)'
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Component count
    * @default 4
    */
  var count: js.UndefOr[Double] = js.undefined
  /**
    * Base component size
    * @default 40
    */
  var size: js.UndefOr[Double] = js.undefined
  /**
    * Minimum component scale
    * @default 0.54
    */
  var waveFactor: js.UndefOr[Double] = js.undefined
  /**
    * Maximum component scale
    * @default 'fill'
    */
  var waveMode: js.UndefOr[fill | outline] = js.undefined
}

object WaveIndicatorProps {
  @scala.inline
  def apply(
    animating: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationEasing: /* value */ Double => Double = null,
    color: String = null,
    count: Int | Double = null,
    interaction: js.UndefOr[Boolean] = js.undefined,
    size: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    waveFactor: Int | Double = null,
    waveMode: fill | outline = null
  ): WaveIndicatorProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animating)) __obj.updateDynamic("animating")(animating.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(js.Any.fromFunction1(animationEasing))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(interaction)) __obj.updateDynamic("interaction")(interaction.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (waveFactor != null) __obj.updateDynamic("waveFactor")(waveFactor.asInstanceOf[js.Any])
    if (waveMode != null) __obj.updateDynamic("waveMode")(waveMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaveIndicatorProps]
  }
}

