package typings.sparkpost.mod

import typings.sparkpost.sparkpostStrings.blocked
import typings.sparkpost.sparkpostStrings.invalid
import typings.sparkpost.sparkpostStrings.pending
import typings.sparkpost.sparkpostStrings.unverified
import typings.sparkpost.sparkpostStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Status extends js.Object {
  /** Verification status of abuse@ mailbox */
  var abuse_at_status: valid | invalid | unverified | pending = js.native
  /** Verification status of CNAME configuration */
  var cname_status: valid | invalid | unverified | pending = js.native
  /** Compliance status */
  var compliance_status: valid | pending | blocked = js.native
  /** Verification status of DKIM configuration */
  var dkim_status: valid | invalid | unverified | pending = js.native
  /** Verification status of MX configuration */
  var mx_status: valid | invalid | unverified | pending = js.native
  /** Whether domain ownership has been verified */
  var ownership_verified: Boolean = js.native
  /** Verification status of postmaster@ mailbox */
  var postmaster_at_status: valid | invalid | unverified | pending = js.native
  /** Verification status of SPF configuration */
  var spf_status: valid | invalid | unverified | pending = js.native
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
    val __obj = js.Dynamic.literal(abuse_at_status = abuse_at_status.asInstanceOf[js.Any], cname_status = cname_status.asInstanceOf[js.Any], compliance_status = compliance_status.asInstanceOf[js.Any], dkim_status = dkim_status.asInstanceOf[js.Any], mx_status = mx_status.asInstanceOf[js.Any], ownership_verified = ownership_verified.asInstanceOf[js.Any], postmaster_at_status = postmaster_at_status.asInstanceOf[js.Any], spf_status = spf_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
  @scala.inline
  implicit class StatusOps[Self <: Status] (val x: Self) extends AnyVal {
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
    def setAbuse_at_status(value: valid | invalid | unverified | pending): Self = this.set("abuse_at_status", value.asInstanceOf[js.Any])
    @scala.inline
    def setCname_status(value: valid | invalid | unverified | pending): Self = this.set("cname_status", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompliance_status(value: valid | pending | blocked): Self = this.set("compliance_status", value.asInstanceOf[js.Any])
    @scala.inline
    def setDkim_status(value: valid | invalid | unverified | pending): Self = this.set("dkim_status", value.asInstanceOf[js.Any])
    @scala.inline
    def setMx_status(value: valid | invalid | unverified | pending): Self = this.set("mx_status", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnership_verified(value: Boolean): Self = this.set("ownership_verified", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostmaster_at_status(value: valid | invalid | unverified | pending): Self = this.set("postmaster_at_status", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpf_status(value: valid | invalid | unverified | pending): Self = this.set("spf_status", value.asInstanceOf[js.Any])
  }
  
}

