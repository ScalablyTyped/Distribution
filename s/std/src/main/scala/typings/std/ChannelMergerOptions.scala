package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelMergerOptions extends AudioNodeOptions {
  var numberOfInputs: js.UndefOr[Double] = js.undefined
}

object ChannelMergerOptions {
  @scala.inline
  def apply(
    channelCount: Int | Double = null,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    numberOfInputs: Int | Double = null
  ): ChannelMergerOptions = {
    val __obj = js.Dynamic.literal()
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode)
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation)
    if (numberOfInputs != null) __obj.updateDynamic("numberOfInputs")(numberOfInputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelMergerOptions]
  }
}

