package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyserOptions extends AudioNodeOptions {
  var fftSize: js.UndefOr[Double] = js.undefined
  var maxDecibels: js.UndefOr[Double] = js.undefined
  var minDecibels: js.UndefOr[Double] = js.undefined
  var smoothingTimeConstant: js.UndefOr[Double] = js.undefined
}

object AnalyserOptions {
  @scala.inline
  def apply(
    channelCount: js.UndefOr[Double] = js.undefined,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    fftSize: js.UndefOr[Double] = js.undefined,
    maxDecibels: js.UndefOr[Double] = js.undefined,
    minDecibels: js.UndefOr[Double] = js.undefined,
    smoothingTimeConstant: js.UndefOr[Double] = js.undefined
  ): AnalyserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(channelCount)) __obj.updateDynamic("channelCount")(channelCount.get.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode.asInstanceOf[js.Any])
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation.asInstanceOf[js.Any])
    if (!js.isUndefined(fftSize)) __obj.updateDynamic("fftSize")(fftSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDecibels)) __obj.updateDynamic("maxDecibels")(maxDecibels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minDecibels)) __obj.updateDynamic("minDecibels")(minDecibels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothingTimeConstant)) __obj.updateDynamic("smoothingTimeConstant")(smoothingTimeConstant.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyserOptions]
  }
}

