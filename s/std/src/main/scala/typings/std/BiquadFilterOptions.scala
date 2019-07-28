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
    Q: Int | Double = null,
    channelCount: Int | Double = null,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    detune: Int | Double = null,
    frequency: Int | Double = null,
    gain: Int | Double = null,
    `type`: BiquadFilterType = null
  ): BiquadFilterOptions = {
    val __obj = js.Dynamic.literal()
    if (Q != null) __obj.updateDynamic("Q")(Q.asInstanceOf[js.Any])
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode)
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation)
    if (detune != null) __obj.updateDynamic("detune")(detune.asInstanceOf[js.Any])
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    if (gain != null) __obj.updateDynamic("gain")(gain.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BiquadFilterOptions]
  }
}

