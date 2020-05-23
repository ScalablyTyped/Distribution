package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GainOptions extends AudioNodeOptions {
  var gain: js.UndefOr[Double] = js.undefined
}

object GainOptions {
  @scala.inline
  def apply(
    channelCount: js.UndefOr[Double] = js.undefined,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    gain: js.UndefOr[Double] = js.undefined
  ): GainOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(channelCount)) __obj.updateDynamic("channelCount")(channelCount.get.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode.asInstanceOf[js.Any])
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation.asInstanceOf[js.Any])
    if (!js.isUndefined(gain)) __obj.updateDynamic("gain")(gain.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GainOptions]
  }
}

