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
    channelCount: Int | Double = null,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    detune: Int | Double = null,
    frequency: Int | Double = null,
    periodicWave: PeriodicWave = null,
    `type`: OscillatorType = null
  ): OscillatorOptions = {
    val __obj = js.Dynamic.literal()
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode)
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation)
    if (detune != null) __obj.updateDynamic("detune")(detune.asInstanceOf[js.Any])
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    if (periodicWave != null) __obj.updateDynamic("periodicWave")(periodicWave)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OscillatorOptions]
  }
}

