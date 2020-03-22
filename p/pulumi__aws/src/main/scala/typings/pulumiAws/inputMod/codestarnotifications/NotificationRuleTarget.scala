package typings.pulumiAws.inputMod.codestarnotifications

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationRuleTarget extends js.Object {
  var address: Input[String] = js.native
  /**
    * The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
    */
  var status: js.UndefOr[Input[String]] = js.native
  var `type`: js.UndefOr[Input[String]] = js.native
}

object NotificationRuleTarget {
  @scala.inline
  def apply(address: Input[String], status: Input[String] = null, `type`: Input[String] = null): NotificationRuleTarget = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationRuleTarget]
  }
}

