package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BiquadFilterOptions extends AudioNodeOptions {
  var Q: js.UndefOr[Double] = js.undefined
  var detune: js.UndefOr[Double] = js.undefined
  var frequency: js.UndefOr[Double] = js.undefined
  var gain: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[BiquadFilterType] = js.undefined
}

object BiquadFilterOptions {
  @scala.inline
  def apply(
    Q: js.UndefOr[Double] = js.undefined,
    channelCount: js.UndefOr[Double] = js.undefined,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    detune: js.UndefOr[Double] = js.undefined,
    frequency: js.UndefOr[Double] = js.undefined,
    gain: js.UndefOr[Double] = js.undefined,
    `type`: BiquadFilterType = null
  ): BiquadFilterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Q)) __obj.updateDynamic("Q")(Q.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channelCount)) __obj.updateDynamic("channelCount")(channelCount.get.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode.asInstanceOf[js.Any])
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation.asInstanceOf[js.Any])
    if (!js.isUndefined(detune)) __obj.updateDynamic("detune")(detune.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frequency)) __obj.updateDynamic("frequency")(frequency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gain)) __obj.updateDynamic("gain")(gain.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BiquadFilterOptions]
  }
}

