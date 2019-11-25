package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioNodeOptions extends js.Object {
  var channelCount: js.UndefOr[Double] = js.undefined
  var channelCountMode: js.UndefOr[ChannelCountMode] = js.undefined
  var channelInterpretation: js.UndefOr[ChannelInterpretation] = js.undefined
}

object AudioNodeOptions {
  @scala.inline
  def apply(
    channelCount: Int | Double = null,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null
  ): AudioNodeOptions = {
    val __obj = js.Dynamic.literal()
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode.asInstanceOf[js.Any])
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioNodeOptions]
  }
}

