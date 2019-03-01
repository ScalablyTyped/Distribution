package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyOptions extends js.Object {
  /**
    * A token retrieved from the verification link contained in the abuse@ verification email.
    *
    */
  var abuse_at_token: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Request an email with a verification link to be sent to the sending domain’s abuse@ mailbox.
    *
    */
  var abuse_at_verify: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Request verification of CNAME record
    */
  var cname_verify: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Request verification of DKIM record
    *
    */
  var dkim_verify: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A token retrieved from the verification link contained in the postmaster@ verification email.
    *
    */
  var postmaster_at_token: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Request an email with a verification link to be sent to the sending domain’s postmaster@ mailbox.
    *
    */
  var postmaster_at_verify: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Request verification of SPF record
    *
    * @deprecated
    */
  var spf_verify: js.UndefOr[scala.Boolean] = js.undefined
}

object VerifyOptions {
  @scala.inline
  def apply(
    abuse_at_token: java.lang.String = null,
    abuse_at_verify: js.UndefOr[scala.Boolean] = js.undefined,
    cname_verify: js.UndefOr[scala.Boolean] = js.undefined,
    dkim_verify: js.UndefOr[scala.Boolean] = js.undefined,
    postmaster_at_token: java.lang.String = null,
    postmaster_at_verify: js.UndefOr[scala.Boolean] = js.undefined,
    spf_verify: js.UndefOr[scala.Boolean] = js.undefined
  ): VerifyOptions = {
    val __obj = js.Dynamic.literal()
    if (abuse_at_token != null) __obj.updateDynamic("abuse_at_token")(abuse_at_token)
    if (!js.isUndefined(abuse_at_verify)) __obj.updateDynamic("abuse_at_verify")(abuse_at_verify)
    if (!js.isUndefined(cname_verify)) __obj.updateDynamic("cname_verify")(cname_verify)
    if (!js.isUndefined(dkim_verify)) __obj.updateDynamic("dkim_verify")(dkim_verify)
    if (postmaster_at_token != null) __obj.updateDynamic("postmaster_at_token")(postmaster_at_token)
    if (!js.isUndefined(postmaster_at_verify)) __obj.updateDynamic("postmaster_at_verify")(postmaster_at_verify)
    if (!js.isUndefined(spf_verify)) __obj.updateDynamic("spf_verify")(spf_verify)
    __obj.asInstanceOf[VerifyOptions]
  }
}

