package typings.sparkpost.sparkpostMod

import typings.sparkpost.sparkpostStrings.blocked
import typings.sparkpost.sparkpostStrings.invalid
import typings.sparkpost.sparkpostStrings.pending
import typings.sparkpost.sparkpostStrings.unverified
import typings.sparkpost.sparkpostStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Status extends js.Object {
  /** Verification status of abuse@ mailbox */
  var abuse_at_status: valid | invalid | unverified | pending
  /** Verification status of CNAME configuration */
  var cname_status: valid | invalid | unverified | pending
  /** Compliance status */
  var compliance_status: valid | pending | blocked
  /** Verification status of DKIM configuration */
  var dkim_status: valid | invalid | unverified | pending
  /** Verification status of MX configuration */
  var mx_status: valid | invalid | unverified | pending
  /** Whether domain ownership has been verified */
  var ownership_verified: Boolean
  /** Verification status of postmaster@ mailbox */
  var postmaster_at_status: valid | invalid | unverified | pending
  /** Verification status of SPF configuration */
  var spf_status: valid | invalid | unverified | pending
}

object Status {
  @scala.inline
  def apply(
    abuse_at_status: valid | invalid | unverified | pending,
    cname_status: valid | invalid | unverified | pending,
    compliance_status: valid | pending | blocked,
    dkim_status: valid | invalid | unverified | pending,
    mx_status: valid | invalid | unverified | pending,
    ownership_verified: Boolean,
    postmaster_at_status: valid | invalid | unverified | pending,
    spf_status: valid | invalid | unverified | pending
  ): Status = {
    val __obj = js.Dynamic.literal(abuse_at_status = abuse_at_status.asInstanceOf[js.Any], cname_status = cname_status.asInstanceOf[js.Any], compliance_status = compliance_status.asInstanceOf[js.Any], dkim_status = dkim_status.asInstanceOf[js.Any], mx_status = mx_status.asInstanceOf[js.Any], ownership_verified = ownership_verified, postmaster_at_status = postmaster_at_status.asInstanceOf[js.Any], spf_status = spf_status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Status]
  }
}

