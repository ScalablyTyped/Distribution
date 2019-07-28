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
    channelCount: Int | Double = null,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    fftSize: Int | Double = null,
    maxDecibels: Int | Double = null,
    minDecibels: Int | Double = null,
    smoothingTimeConstant: Int | Double = null
  ): AnalyserOptions = {
    val __obj = js.Dynamic.literal()
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode)
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation)
    if (fftSize != null) __obj.updateDynamic("fftSize")(fftSize.asInstanceOf[js.Any])
    if (maxDecibels != null) __obj.updateDynamic("maxDecibels")(maxDecibels.asInstanceOf[js.Any])
    if (minDecibels != null) __obj.updateDynamic("minDecibels")(minDecibels.asInstanceOf[js.Any])
    if (smoothingTimeConstant != null) __obj.updateDynamic("smoothingTimeConstant")(smoothingTimeConstant.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyserOptions]
  }
}

