package typings.sparkpost.mod

import typings.sparkpost.AnonDkimrecord
import typings.sparkpost.sparkpostStrings.blocked
import typings.sparkpost.sparkpostStrings.invalid
import typings.sparkpost.sparkpostStrings.pending
import typings.sparkpost.sparkpostStrings.unverified
import typings.sparkpost.sparkpostStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyResults extends Status {
  var dns: js.UndefOr[AnonDkimrecord] = js.undefined
}

object VerifyResults {
  @scala.inline
  def apply(
    abuse_at_status: valid | invalid | unverified | pending,
    cname_status: valid | invalid | unverified | pending,
    compliance_status: valid | pending | blocked,
    dkim_status: valid | invalid | unverified | pending,
    mx_status: valid | invalid | unverified | pending,
    ownership_verified: Boolean,
    postmaster_at_status: valid | invalid | unverified | pending,
    spf_status: valid | invalid | unverified | pending,
    dns: AnonDkimrecord = null
  ): VerifyResults = {
    val __obj = js.Dynamic.literal(abuse_at_status = abuse_at_status.asInstanceOf[js.Any], cname_status = cname_status.asInstanceOf[js.Any], compliance_status = compliance_status.asInstanceOf[js.Any], dkim_status = dkim_status.asInstanceOf[js.Any], mx_status = mx_status.asInstanceOf[js.Any], ownership_verified = ownership_verified.asInstanceOf[js.Any], postmaster_at_status = postmaster_at_status.asInstanceOf[js.Any], spf_status = spf_status.asInstanceOf[js.Any])
    if (dns != null) __obj.updateDynamic("dns")(dns.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyResults]
  }
}

