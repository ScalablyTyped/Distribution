package typings.pulumiAws.outputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobNotificationProperty extends js.Object {
  /**
    * After a job run starts, the number of minutes to wait before sending a job run delay notification.
    */
  var notifyDelayAfter: js.UndefOr[Double] = js.native
}

object JobNotificationProperty {
  @scala.inline
  def apply(notifyDelayAfter: js.UndefOr[Double] = js.undefined): JobNotificationProperty = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(notifyDelayAfter)) __obj.updateDynamic("notifyDelayAfter")(notifyDelayAfter.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobNotificationProperty]
  }
}

