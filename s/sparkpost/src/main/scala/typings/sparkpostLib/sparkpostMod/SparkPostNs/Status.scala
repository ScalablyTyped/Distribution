package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Status extends js.Object {
  /** Verification status of abuse@ mailbox */
  var abuse_at_status: sparkpostLib.sparkpostLibStrings.valid | sparkpostLib.sparkpostLibStrings.invalid | sparkpostLib.sparkpostLibStrings.unverified | sparkpostLib.sparkpostLibStrings.pending
  /** Verification status of CNAME configuration */
  var cname_status: sparkpostLib.sparkpostLibStrings.valid | sparkpostLib.sparkpostLibStrings.invalid | sparkpostLib.sparkpostLibStrings.unverified | sparkpostLib.sparkpostLibStrings.pending
  /** Compliance status */
  var compliance_status: sparkpostLib.sparkpostLibStrings.valid | sparkpostLib.sparkpostLibStrings.pending | sparkpostLib.sparkpostLibStrings.blocked
  /** Verification status of DKIM configuration */
  var dkim_status: sparkpostLib.sparkpostLibStrings.valid | sparkpostLib.sparkpostLibStrings.invalid | sparkpostLib.sparkpostLibStrings.unverified | sparkpostLib.sparkpostLibStrings.pending
  /** Verification status of MX configuration */
  var mx_status: sparkpostLib.sparkpostLibStrings.valid | sparkpostLib.sparkpostLibStrings.invalid | sparkpostLib.sparkpostLibStrings.unverified | sparkpostLib.sparkpostLibStrings.pending
  /** Whether domain ownership has been verified */
  var ownership_verified: scala.Boolean
  /** Verification status of postmaster@ mailbox */
  var postmaster_at_status: sparkpostLib.sparkpostLibStrings.valid | sparkpostLib.sparkpostLibStrings.invalid | sparkpostLib.sparkpostLibStrings.unverified | sparkpostLib.sparkpostLibStrings.pending
  /** Verification status of SPF configuration */
  var spf_status: sparkpostLib.sparkpostLibStrings.valid | sparkpostLib.sparkpostLibStrings.invalid | sparkpostLib.sparkpostLibStrings.unverified | sparkpostLib.sparkpostLibStrings.pending
}

object Status {
  @scala.inline
  def apply(
    abuse_at_status: sparkpostLib.sparkpostLibStrings.valid | sparkpostLib.sparkpostLibStrings.invalid | sparkpostLib.sparkpostLibStrings.unverified | sparkpostLib.sparkpostLibStrings.pending,
    cname_status: sparkpostLib.sparkpostLibStrings.valid | sparkpostLib.sparkpostLibStrings.invalid | sparkpostLib.sparkpostLibStrings.unverified | sparkpostLib.sparkpostLibStrings.pending,
    compliance_status: sparkpostLib.sparkpostLibStrings.valid | sparkpostLib.sparkpostLibStrings.pending | sparkpostLib.sparkpostLibStrings.blocked,
    dkim_status: sparkpostLib.sparkpostLibStrings.valid | sparkpostLib.sparkpostLibStrings.invalid | sparkpostLib.sparkpostLibStrings.unverified | sparkpostLib.sparkpostLibStrings.pending,
    mx_status: sparkpostLib.sparkpostLibStrings.valid | sparkpostLib.sparkpostLibStrings.invalid | sparkpostLib.sparkpostLibStrings.unverified | sparkpostLib.sparkpostLibStrings.pending,
    ownership_verified: scala.Boolean,
    postmaster_at_status: sparkpostLib.sparkpostLibStrings.valid | sparkpostLib.sparkpostLibStrings.invalid | sparkpostLib.sparkpostLibStrings.unverified | sparkpostLib.sparkpostLibStrings.pending,
    spf_status: sparkpostLib.sparkpostLibStrings.valid | sparkpostLib.sparkpostLibStrings.invalid | sparkpostLib.sparkpostLibStrings.unverified | sparkpostLib.sparkpostLibStrings.pending
  ): Status = {
    val __obj = js.Dynamic.literal(abuse_at_status = abuse_at_status.asInstanceOf[js.Any], cname_status = cname_status.asInstanceOf[js.Any], compliance_status = compliance_status.asInstanceOf[js.Any], dkim_status = dkim_status.asInstanceOf[js.Any], mx_status = mx_status.asInstanceOf[js.Any], ownership_verified = ownership_verified, postmaster_at_status = postmaster_at_status.asInstanceOf[js.Any], spf_status = spf_status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Status]
  }
}

