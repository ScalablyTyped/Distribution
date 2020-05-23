package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIRFilterOptions extends AudioNodeOptions {
  var feedback: js.Array[Double]
  var feedforward: js.Array[Double]
}

object IIRFilterOptions {
  @scala.inline
  def apply(
    feedback: js.Array[Double],
    feedforward: js.Array[Double],
    channelCount: js.UndefOr[Double] = js.undefined,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null
  ): IIRFilterOptions = {
    val __obj = js.Dynamic.literal(feedback = feedback.asInstanceOf[js.Any], feedforward = feedforward.asInstanceOf[js.Any])
    if (!js.isUndefined(channelCount)) __obj.updateDynamic("channelCount")(channelCount.get.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode.asInstanceOf[js.Any])
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIRFilterOptions]
  }
}

