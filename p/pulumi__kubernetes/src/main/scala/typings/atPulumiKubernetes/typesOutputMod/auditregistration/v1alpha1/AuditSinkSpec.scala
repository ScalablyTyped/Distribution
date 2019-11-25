package typings.atPulumiKubernetes.typesOutputMod.auditregistration.v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AuditSinkSpec holds the spec for the audit sink
  */
trait AuditSinkSpec extends js.Object {
  /**
    * Policy defines the policy for selecting which events should be sent to the webhook required
    */
  val policy: Policy
  /**
    * Webhook to send events required
    */
  val webhook: Webhook
}

object AuditSinkSpec {
  @scala.inline
  def apply(policy: Policy, webhook: Webhook): AuditSinkSpec = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], webhook = webhook.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuditSinkSpec]
  }
}

