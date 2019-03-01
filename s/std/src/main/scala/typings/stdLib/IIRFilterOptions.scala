package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIRFilterOptions extends AudioNodeOptions {
  var feedback: js.Array[scala.Double]
  var feedforward: js.Array[scala.Double]
}

object IIRFilterOptions {
  @scala.inline
  def apply(
    feedback: js.Array[scala.Double],
    feedforward: js.Array[scala.Double],
    channelCount: scala.Int | scala.Double = null,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null
  ): IIRFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("feedback")(feedback)
    __obj.updateDynamic("feedforward")(feedforward)
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode)
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation)
    __obj.asInstanceOf[IIRFilterOptions]
  }
}

