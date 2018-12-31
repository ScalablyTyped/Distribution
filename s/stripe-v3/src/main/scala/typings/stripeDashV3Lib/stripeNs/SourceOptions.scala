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

