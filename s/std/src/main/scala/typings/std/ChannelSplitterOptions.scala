package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSplitterOptions extends AudioNodeOptions {
  var numberOfOutputs: js.UndefOr[Double] = js.undefined
}

object ChannelSplitterOptions {
  @scala.inline
  def apply(
    channelCount: js.UndefOr[Double] = js.undefined,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    numberOfOutputs: js.UndefOr[Double] = js.undefined
  ): ChannelSplitterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(channelCount)) __obj.updateDynamic("channelCount")(channelCount.get.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode.asInstanceOf[js.Any])
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfOutputs)) __obj.updateDynamic("numberOfOutputs")(numberOfOutputs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelSplitterOptions]
  }
}

