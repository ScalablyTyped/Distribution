package typings
package atPulumiKubernetesLib.typesOutputMod.auditregistrationNs.v1alpha1Ns

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

