package typings.pulumiAws.outputMod.pinpoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppLimits extends js.Object {
  /**
    * The maximum number of messages that the campaign can send daily.
    */
  var daily: js.UndefOr[Double] = js.native
  /**
    * The length of time (in seconds) that the campaign can run before it ends and message deliveries stop. This duration begins at the scheduled start time for the campaign. The minimum value is 60.
    */
  var maximumDuration: js.UndefOr[Double] = js.native
  /**
    * The number of messages that the campaign can send per second. The minimum value is 50, and the maximum is 20000.
    */
  var messagesPerSecond: js.UndefOr[Double] = js.native
  /**
    * The maximum total number of messages that the campaign can send.
    */
  var total: js.UndefOr[Double] = js.native
}

object AppLimits {
  @scala.inline
  def apply(
    daily: js.UndefOr[Double] = js.undefined,
    maximumDuration: js.UndefOr[Double] = js.undefined,
    messagesPerSecond: js.UndefOr[Double] = js.undefined,
    total: js.UndefOr[Double] = js.undefined
  ): AppLimits = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(daily)) __obj.updateDynamic("daily")(daily.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumDuration)) __obj.updateDynamic("maximumDuration")(maximumDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(messagesPerSecond)) __obj.updateDynamic("messagesPerSecond")(messagesPerSecond.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppLimits]
  }
}

