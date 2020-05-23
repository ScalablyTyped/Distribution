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
    channelCount: js.UndefOr[Double] = js.undefined,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    numberOfInputs: js.UndefOr[Double] = js.undefined,
    numberOfOutputs: js.UndefOr[Double] = js.undefined,
    outputChannelCount: js.Array[Double] = null,
    parameterData: Record[java.lang.String, Double] = null,
    processorOptions: js.Any = null
  ): AudioWorkletNodeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(channelCount)) __obj.updateDynamic("channelCount")(channelCount.get.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode.asInstanceOf[js.Any])
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfInputs)) __obj.updateDynamic("numberOfInputs")(numberOfInputs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfOutputs)) __obj.updateDynamic("numberOfOutputs")(numberOfOutputs.get.asInstanceOf[js.Any])
    if (outputChannelCount != null) __obj.updateDynamic("outputChannelCount")(outputChannelCount.asInstanceOf[js.Any])
    if (parameterData != null) __obj.updateDynamic("parameterData")(parameterData.asInstanceOf[js.Any])
    if (processorOptions != null) __obj.updateDynamic("processorOptions")(processorOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioWorkletNodeOptions]
  }
}

