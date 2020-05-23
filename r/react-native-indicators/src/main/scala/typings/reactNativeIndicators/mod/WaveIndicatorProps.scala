package typings.reactNativeIndicators.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeIndicators.reactNativeIndicatorsStrings.fill
import typings.reactNativeIndicators.reactNativeIndicatorsStrings.outline
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
    animationDuration: js.UndefOr[Double] = js.undefined,
    animationEasing: /* value */ Double => Double = null,
    color: String = null,
    count: js.UndefOr[Double] = js.undefined,
    hidesWhenStopped: js.UndefOr[Boolean] = js.undefined,
    interaction: js.UndefOr[Boolean] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    waveFactor: js.UndefOr[Double] = js.undefined,
    waveMode: fill | outline = null
  ): WaveIndicatorProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animating)) __obj.updateDynamic("animating")(animating.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(js.Any.fromFunction1(animationEasing))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hidesWhenStopped)) __obj.updateDynamic("hidesWhenStopped")(hidesWhenStopped.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interaction)) __obj.updateDynamic("interaction")(interaction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(waveFactor)) __obj.updateDynamic("waveFactor")(waveFactor.get.asInstanceOf[js.Any])
    if (waveMode != null) __obj.updateDynamic("waveMode")(waveMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaveIndicatorProps]
  }
}

