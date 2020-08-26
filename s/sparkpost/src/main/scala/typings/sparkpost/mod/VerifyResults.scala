package typings.sparkpost.mod

import typings.sparkpost.anon.Dkimrecord
import typings.sparkpost.sparkpostStrings.blocked
import typings.sparkpost.sparkpostStrings.invalid
import typings.sparkpost.sparkpostStrings.pending
import typings.sparkpost.sparkpostStrings.unverified
import typings.sparkpost.sparkpostStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyResults extends Status {
  var dns: js.UndefOr[Dkimrecord] = js.native
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
    spf_status: valid | invalid | unverified | pending
  ): VerifyResults = {
    val __obj = js.Dynamic.literal(abuse_at_status = abuse_at_status.asInstanceOf[js.Any], cname_status = cname_status.asInstanceOf[js.Any], compliance_status = compliance_status.asInstanceOf[js.Any], dkim_status = dkim_status.asInstanceOf[js.Any], mx_status = mx_status.asInstanceOf[js.Any], ownership_verified = ownership_verified.asInstanceOf[js.Any], postmaster_at_status = postmaster_at_status.asInstanceOf[js.Any], spf_status = spf_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyResults]
  }
  @scala.inline
  implicit class VerifyResultsOps[Self <: VerifyResults] (val x: Self) extends AnyVal {
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
    def setDns(value: Dkimrecord): Self = this.set("dns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDns: Self = this.set("dns", js.undefined)
  }
  
}

