package typings.pulumiAws.inputMod.codestarnotifications

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationRuleTarget extends js.Object {
  /**
    * The ARN of notification rule target. For example, a SNS Topic ARN.
    */
  var address: Input[String] = js.native
  /**
    * The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
    */
  var status: js.UndefOr[Input[String]] = js.native
  /**
    * The type of the notification target. Default value is `SNS`.
    */
  var `type`: js.UndefOr[Input[String]] = js.native
}

object NotificationRuleTarget {
  @scala.inline
  def apply(address: Input[String]): NotificationRuleTarget = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationRuleTarget]
  }
  @scala.inline
  implicit class NotificationRuleTargetOps[Self <: NotificationRuleTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddress(value: Input[String]): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

