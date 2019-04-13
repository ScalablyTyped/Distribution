package typings
package sparkpostLib.sparkpostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSendingDomain extends js.Object {
  /** JSON object in which DKIM key configuration is defined. */
  var dkim: js.UndefOr[DKIM] = js.undefined
  /** Size, in bits, of the DKIM private key to be generated. This option only applies if generate_dkim is ‘true’. */
  var dkim_key_length: js.UndefOr[scala.Double] = js.undefined
  /** Whether to generate a DKIM keypair on creation. */
  var generate_dkim: js.UndefOr[scala.Boolean] = js.undefined
  /** Setting to true allows this domain to be used by subaccounts. Defaults to false, only available to domains belonging to a master account. */
  var shared_with_subaccounts: js.UndefOr[scala.Boolean] = js.undefined
  /** Associated tracking domain. */
  var tracking_domain: js.UndefOr[java.lang.String] = js.undefined
}

object UpdateSendingDomain {
  @scala.inline
  def apply(
    dkim: DKIM = null,
    dkim_key_length: scala.Int | scala.Double = null,
    generate_dkim: js.UndefOr[scala.Boolean] = js.undefined,
    shared_with_subaccounts: js.UndefOr[scala.Boolean] = js.undefined,
    tracking_domain: java.lang.String = null
  ): UpdateSendingDomain = {
    val __obj = js.Dynamic.literal()
    if (dkim != null) __obj.updateDynamic("dkim")(dkim)
    if (dkim_key_length != null) __obj.updateDynamic("dkim_key_length")(dkim_key_length.asInstanceOf[js.Any])
    if (!js.isUndefined(generate_dkim)) __obj.updateDynamic("generate_dkim")(generate_dkim)
    if (!js.isUndefined(shared_with_subaccounts)) __obj.updateDynamic("shared_with_subaccounts")(shared_with_subaccounts)
    if (tracking_domain != null) __obj.updateDynamic("tracking_domain")(tracking_domain)
    __obj.asInstanceOf[UpdateSendingDomain]
  }
}

