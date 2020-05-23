package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OscillatorOptions extends AudioNodeOptions {
  var detune: js.UndefOr[Double] = js.undefined
  var frequency: js.UndefOr[Double] = js.undefined
  var periodicWave: js.UndefOr[PeriodicWave] = js.undefined
  var `type`: js.UndefOr[OscillatorType] = js.undefined
}

object OscillatorOptions {
  @scala.inline
  def apply(
    channelCount: js.UndefOr[Double] = js.undefined,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    detune: js.UndefOr[Double] = js.undefined,
    frequency: js.UndefOr[Double] = js.undefined,
    periodicWave: PeriodicWave = null,
    `type`: OscillatorType = null
  ): OscillatorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(channelCount)) __obj.updateDynamic("channelCount")(channelCount.get.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode.asInstanceOf[js.Any])
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation.asInstanceOf[js.Any])
    if (!js.isUndefined(detune)) __obj.updateDynamic("detune")(detune.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frequency)) __obj.updateDynamic("frequency")(frequency.get.asInstanceOf[js.Any])
    if (periodicWave != null) __obj.updateDynamic("periodicWave")(periodicWave.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OscillatorOptions]
  }
}

