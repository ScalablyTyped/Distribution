package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIRFilterOptions extends AudioNodeOptions {
  var feedback: Array[scala.Double]
  var feedforward: Array[scala.Double]
}

object IIRFilterOptions {
  @scala.inline
  def apply(
    feedback: Array[scala.Double],
    feedforward: Array[scala.Double],
    channelCount: scala.Int | scala.Double = null,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null
  ): IIRFilterOptions = {
    val __obj = js.Dynamic.literal(feedback = feedback, feedforward = feedforward)
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode)
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation)
    __obj.asInstanceOf[IIRFilterOptions]
  }
}

