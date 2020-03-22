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
  def apply(notifyDelayAfter: Int | Double = null): JobNotificationProperty = {
    val __obj = js.Dynamic.literal()
    if (notifyDelayAfter != null) __obj.updateDynamic("notifyDelayAfter")(notifyDelayAfter.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobNotificationProperty]
  }
}

