package typings.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSendingDomain extends js.Object {
  /** JSON object in which DKIM key configuration is defined. */
  var dkim: js.UndefOr[DKIM] = js.undefined
  /** Size, in bits, of the DKIM private key to be generated. This option only applies if generate_dkim is ‘true’. */
  var dkim_key_length: js.UndefOr[Double] = js.undefined
  /** Whether to generate a DKIM keypair on creation. */
  var generate_dkim: js.UndefOr[Boolean] = js.undefined
  /** Setting to true allows this domain to be used by subaccounts. Defaults to false, only available to domains belonging to a master account. */
  var shared_with_subaccounts: js.UndefOr[Boolean] = js.undefined
  /** Associated tracking domain. */
  var tracking_domain: js.UndefOr[String] = js.undefined
}

object UpdateSendingDomain {
  @scala.inline
  def apply(
    dkim: DKIM = null,
    dkim_key_length: js.UndefOr[Double] = js.undefined,
    generate_dkim: js.UndefOr[Boolean] = js.undefined,
    shared_with_subaccounts: js.UndefOr[Boolean] = js.undefined,
    tracking_domain: String = null
  ): UpdateSendingDomain = {
    val __obj = js.Dynamic.literal()
    if (dkim != null) __obj.updateDynamic("dkim")(dkim.asInstanceOf[js.Any])
    if (!js.isUndefined(dkim_key_length)) __obj.updateDynamic("dkim_key_length")(dkim_key_length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(generate_dkim)) __obj.updateDynamic("generate_dkim")(generate_dkim.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shared_with_subaccounts)) __obj.updateDynamic("shared_with_subaccounts")(shared_with_subaccounts.get.asInstanceOf[js.Any])
    if (tracking_domain != null) __obj.updateDynamic("tracking_domain")(tracking_domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSendingDomain]
  }
}

