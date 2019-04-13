package typings
package sparkpostLib.sparkpostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyResults extends Status {
  var dns: js.UndefOr[sparkpostLib.Anon_Dkimrecord] = js.undefined
}

object VerifyResults {
  @scala.inline
  def apply(
    abuse_at_status: sparkpostLib.sparkpostLibStrings.valid | sparkpostLib.sparkpostLibStrings.invalid | sparkpostLib.sparkpostLibStrings.unverified | sparkpostLib.sparkpostLibStrings.pending,
    cname_status: sparkpostLib.sparkpostLibStrings.valid | sparkpostLib.sparkpostLibStrings.invalid | sparkpostLib.sparkpostLibStrings.unverified | sparkpostLib.sparkpostLibStrings.pending,
    compliance_status: sparkpostLib.sparkpostLibStrings.valid | sparkpostLib.sparkpostLibStrings.pending | sparkpostLib.sparkpostLibStrings.blocked,
    dkim_status: sparkpostLib.sparkpostLibStrings.valid | sparkpostLib.sparkpostLibStrings.invalid | sparkpostLib.sparkpostLibStrings.unverified | sparkpostLib.sparkpostLibStrings.pending,
    mx_status: sparkpostLib.sparkpostLibStrings.valid | sparkpostLib.sparkpostLibStrings.invalid | sparkpostLib.sparkpostLibStrings.unverified | sparkpostLib.sparkpostLibStrings.pending,
    ownership_verified: scala.Boolean,
    postmaster_at_status: sparkpostLib.sparkpostLibStrings.valid | sparkpostLib.sparkpostLibStrings.invalid | sparkpostLib.sparkpostLibStrings.unverified | sparkpostLib.sparkpostLibStrings.pending,
    spf_status: sparkpostLib.sparkpostLibStrings.valid | sparkpostLib.sparkpostLibStrings.invalid | sparkpostLib.sparkpostLibStrings.unverified | sparkpostLib.sparkpostLibStrings.pending,
    dns: sparkpostLib.Anon_Dkimrecord = null
  ): VerifyResults = {
    val __obj = js.Dynamic.literal(abuse_at_status = abuse_at_status.asInstanceOf[js.Any], cname_status = cname_status.asInstanceOf[js.Any], compliance_status = compliance_status.asInstanceOf[js.Any], dkim_status = dkim_status.asInstanceOf[js.Any], mx_status = mx_status.asInstanceOf[js.Any], ownership_verified = ownership_verified, postmaster_at_status = postmaster_at_status.asInstanceOf[js.Any], spf_status = spf_status.asInstanceOf[js.Any])
    if (dns != null) __obj.updateDynamic("dns")(dns)
    __obj.asInstanceOf[VerifyResults]
  }
}

