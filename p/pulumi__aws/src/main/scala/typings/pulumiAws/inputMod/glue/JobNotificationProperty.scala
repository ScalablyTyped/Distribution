package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobNotificationProperty extends js.Object {
  /**
    * After a job run starts, the number of minutes to wait before sending a job run delay notification.
    */
  var notifyDelayAfter: js.UndefOr[Input[Double]] = js.native
}

object JobNotificationProperty {
  @scala.inline
  def apply(notifyDelayAfter: Input[Double] = null): JobNotificationProperty = {
    val __obj = js.Dynamic.literal()
    if (notifyDelayAfter != null) __obj.updateDynamic("notifyDelayAfter")(notifyDelayAfter.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobNotificationProperty]
  }
}

