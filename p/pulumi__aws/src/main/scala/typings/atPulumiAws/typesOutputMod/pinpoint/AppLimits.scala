package typings.atPulumiAws.typesOutputMod.pinpoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppLimits extends js.Object {
  /**
    * The maximum number of messages that the campaign can send daily.
    */
  var daily: js.UndefOr[Double] = js.undefined
  /**
    * The length of time (in seconds) that the campaign can run before it ends and message deliveries stop. This duration begins at the scheduled start time for the campaign. The minimum value is 60.
    */
  var maximumDuration: js.UndefOr[Double] = js.undefined
  /**
    * The number of messages that the campaign can send per second. The minimum value is 50, and the maximum is 20000.
    */
  var messagesPerSecond: js.UndefOr[Double] = js.undefined
  /**
    * The maximum total number of messages that the campaign can send.
    */
  var total: js.UndefOr[Double] = js.undefined
}

object AppLimits {
  @scala.inline
  def apply(
    daily: Int | Double = null,
    maximumDuration: Int | Double = null,
    messagesPerSecond: Int | Double = null,
    total: Int | Double = null
  ): AppLimits = {
    val __obj = js.Dynamic.literal()
    if (daily != null) __obj.updateDynamic("daily")(daily.asInstanceOf[js.Any])
    if (maximumDuration != null) __obj.updateDynamic("maximumDuration")(maximumDuration.asInstanceOf[js.Any])
    if (messagesPerSecond != null) __obj.updateDynamic("messagesPerSecond")(messagesPerSecond.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppLimits]
  }
}

