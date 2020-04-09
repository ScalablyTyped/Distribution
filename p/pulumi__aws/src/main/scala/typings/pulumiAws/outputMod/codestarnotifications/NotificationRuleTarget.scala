package typings.pulumiAws.outputMod.codestarnotifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationRuleTarget extends js.Object {
  /**
    * The ARN of notification rule target. For example, a SNS Topic ARN.
    */
  var address: String = js.native
  /**
    * The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
    */
  var status: String = js.native
  /**
    * The type of the notification target. Default value is `SNS`.
    */
  var `type`: js.UndefOr[String] = js.native
}

object NotificationRuleTarget {
  @scala.inline
  def apply(address: String, status: String, `type`: String = null): NotificationRuleTarget = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationRuleTarget]
  }
}

