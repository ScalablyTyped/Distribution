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

