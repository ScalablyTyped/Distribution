package typings.pulumiKubernetes.inputMod.auditregistration.v1alpha1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AuditSinkSpec holds the spec for the audit sink
  */
@js.native
trait AuditSinkSpec extends js.Object {
  /**
    * Policy defines the policy for selecting which events should be sent to the webhook required
    */
  var policy: Input[Policy] = js.native
  /**
    * Webhook to send events required
    */
  var webhook: Input[Webhook] = js.native
}

object AuditSinkSpec {
  @scala.inline
  def apply(policy: Input[Policy], webhook: Input[Webhook]): AuditSinkSpec = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], webhook = webhook.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditSinkSpec]
  }
  @scala.inline
  implicit class AuditSinkSpecOps[Self <: AuditSinkSpec] (val x: Self) extends AnyVal {
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
    def setPolicy(value: Input[Policy]): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebhook(value: Input[Webhook]): Self = this.set("webhook", value.asInstanceOf[js.Any])
  }
  
}

