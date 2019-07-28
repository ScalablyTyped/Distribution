package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaveShaperOptions extends AudioNodeOptions {
  var curve: js.UndefOr[js.Array[Double] | Float32Array] = js.undefined
  var oversample: js.UndefOr[OverSampleType] = js.undefined
}

object WaveShaperOptions {
  @scala.inline
  def apply(
    channelCount: Int | Double = null,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    curve: js.Array[Double] | Float32Array = null,
    oversample: OverSampleType = null
  ): WaveShaperOptions = {
    val __obj = js.Dynamic.literal()
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode)
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation)
    if (curve != null) __obj.updateDynamic("curve")(curve.asInstanceOf[js.Any])
    if (oversample != null) __obj.updateDynamic("oversample")(oversample)
    __obj.asInstanceOf[WaveShaperOptions]
  }
}

