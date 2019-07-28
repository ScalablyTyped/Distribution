package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioWorkletNodeOptions extends AudioNodeOptions {
  var numberOfInputs: js.UndefOr[Double] = js.undefined
  var numberOfOutputs: js.UndefOr[Double] = js.undefined
  var outputChannelCount: js.UndefOr[js.Array[Double]] = js.undefined
  var parameterData: js.UndefOr[Record[java.lang.String, Double]] = js.undefined
  var processorOptions: js.UndefOr[js.Any] = js.undefined
}

object AudioWorkletNodeOptions {
  @scala.inline
  def apply(
    channelCount: Int | Double = null,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    numberOfInputs: Int | Double = null,
    numberOfOutputs: Int | Double = null,
    outputChannelCount: js.Array[Double] = null,
    parameterData: Record[java.lang.String, Double] = null,
    processorOptions: js.Any = null
  ): AudioWorkletNodeOptions = {
    val __obj = js.Dynamic.literal()
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode)
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation)
    if (numberOfInputs != null) __obj.updateDynamic("numberOfInputs")(numberOfInputs.asInstanceOf[js.Any])
    if (numberOfOutputs != null) __obj.updateDynamic("numberOfOutputs")(numberOfOutputs.asInstanceOf[js.Any])
    if (outputChannelCount != null) __obj.updateDynamic("outputChannelCount")(outputChannelCount)
    if (parameterData != null) __obj.updateDynamic("parameterData")(parameterData)
    if (processorOptions != null) __obj.updateDynamic("processorOptions")(processorOptions)
    __obj.asInstanceOf[AudioWorkletNodeOptions]
  }
}

