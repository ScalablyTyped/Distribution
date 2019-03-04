package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceOptions extends js.Object {
  var amount: js.UndefOr[scala.Double] = js.undefined
  var currency: js.UndefOr[java.lang.String] = js.undefined
  var flow: js.UndefOr[
    stripeDashV3Lib.stripeDashV3LibStrings.redirect | stripeDashV3Lib.stripeDashV3LibStrings.receiver | stripeDashV3Lib.stripeDashV3LibStrings.code_verification | stripeDashV3Lib.stripeDashV3LibStrings.none
  ] = js.undefined
  var metadata: js.UndefOr[js.Object] = js.undefined
  var owner: js.UndefOr[OwnerInfo] = js.undefined
  var redirect: js.UndefOr[stripeDashV3Lib.Anon_Returnurl] = js.undefined
  var sepa_debit: js.UndefOr[stripeDashV3Lib.Anon_Iban] = js.undefined
  var statement_descriptor: js.UndefOr[java.lang.String] = js.undefined
  var three_d_secure: js.UndefOr[stripeDashV3Lib.Anon_Card] = js.undefined
  var token: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
  var usage: js.UndefOr[
    stripeDashV3Lib.stripeDashV3LibStrings.reusable | stripeDashV3Lib.stripeDashV3LibStrings.single_use
  ] = js.undefined
}

object SourceOptions {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    amount: scala.Int | scala.Double = null,
    currency: java.lang.String = null,
    flow: stripeDashV3Lib.stripeDashV3LibStrings.redirect | stripeDashV3Lib.stripeDashV3LibStrings.receiver | stripeDashV3Lib.stripeDashV3LibStrings.code_verification | stripeDashV3Lib.stripeDashV3LibStrings.none = null,
    metadata: js.Object = null,
    owner: OwnerInfo = null,
    redirect: stripeDashV3Lib.Anon_Returnurl = null,
    sepa_debit: stripeDashV3Lib.Anon_Iban = null,
    statement_descriptor: java.lang.String = null,
    three_d_secure: stripeDashV3Lib.Anon_Card = null,
    token: java.lang.String = null,
    usage: stripeDashV3Lib.stripeDashV3LibStrings.reusable | stripeDashV3Lib.stripeDashV3LibStrings.single_use = null
  ): SourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (flow != null) __obj.updateDynamic("flow")(flow.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (redirect != null) __obj.updateDynamic("redirect")(redirect)
    if (sepa_debit != null) __obj.updateDynamic("sepa_debit")(sepa_debit)
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor)
    if (three_d_secure != null) __obj.updateDynamic("three_d_secure")(three_d_secure)
    if (token != null) __obj.updateDynamic("token")(token)
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceOptions]
  }
}

