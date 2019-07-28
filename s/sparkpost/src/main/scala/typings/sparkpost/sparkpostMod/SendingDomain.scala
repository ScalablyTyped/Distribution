package typings.sparkpost.sparkpostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendingDomain extends js.Object {
  /** JSON object in which DKIM key configuration is defined. */
  var dkim: js.UndefOr[DKIM] = js.undefined
  /** Size, in bits, of the DKIM private key to be generated. This option only applies if generate_dkim is ‘true’. */
  var dkim_key_length: js.UndefOr[Double] = js.undefined
  /** Name of the sending domain. */
  var domain: String
  /** Whether to generate a DKIM keypair on creation. */
  var generate_dkim: js.UndefOr[Boolean] = js.undefined
  /** Setting to true allows this domain to be used by subaccounts. Defaults to false, only available to domains belonging to a master account. */
  var shared_with_subaccounts: Boolean
  /** JSON object containing status details, including whether this domain’s ownership has been verified. */
  var status: Status
  /** Associated tracking domain. */
  var tracking_domain: String
}

object SendingDomain {
  @scala.inline
  def apply(
    domain: String,
    shared_with_subaccounts: Boolean,
    status: Status,
    tracking_domain: String,
    dkim: DKIM = null,
    dkim_key_length: Int | Double = null,
    generate_dkim: js.UndefOr[Boolean] = js.undefined
  ): SendingDomain = {
    val __obj = js.Dynamic.literal(domain = domain, shared_with_subaccounts = shared_with_subaccounts, status = status, tracking_domain = tracking_domain)
    if (dkim != null) __obj.updateDynamic("dkim")(dkim)
    if (dkim_key_length != null) __obj.updateDynamic("dkim_key_length")(dkim_key_length.asInstanceOf[js.Any])
    if (!js.isUndefined(generate_dkim)) __obj.updateDynamic("generate_dkim")(generate_dkim)
    __obj.asInstanceOf[SendingDomain]
  }
}

