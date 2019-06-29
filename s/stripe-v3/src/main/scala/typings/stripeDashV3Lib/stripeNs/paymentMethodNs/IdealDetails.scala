package typings
package stripeDashV3Lib.stripeNs.paymentMethodNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdealDetails extends js.Object {
  var bank: stripeDashV3Lib.stripeDashV3LibStrings.abn_amro | stripeDashV3Lib.stripeDashV3LibStrings.asn_bank | stripeDashV3Lib.stripeDashV3LibStrings.bunq | stripeDashV3Lib.stripeDashV3LibStrings.handelsbanken | stripeDashV3Lib.stripeDashV3LibStrings.ing | stripeDashV3Lib.stripeDashV3LibStrings.knab | stripeDashV3Lib.stripeDashV3LibStrings.moneyou | stripeDashV3Lib.stripeDashV3LibStrings.rabobank | stripeDashV3Lib.stripeDashV3LibStrings.regiobank | stripeDashV3Lib.stripeDashV3LibStrings.sns_bank | stripeDashV3Lib.stripeDashV3LibStrings.triodos_bank | stripeDashV3Lib.stripeDashV3LibStrings.van_lanschot
  var bic: java.lang.String
  var iban_last4: java.lang.String
  var verified_name: java.lang.String
}

object IdealDetails {
  @scala.inline
  def apply(
    bank: stripeDashV3Lib.stripeDashV3LibStrings.abn_amro | stripeDashV3Lib.stripeDashV3LibStrings.asn_bank | stripeDashV3Lib.stripeDashV3LibStrings.bunq | stripeDashV3Lib.stripeDashV3LibStrings.handelsbanken | stripeDashV3Lib.stripeDashV3LibStrings.ing | stripeDashV3Lib.stripeDashV3LibStrings.knab | stripeDashV3Lib.stripeDashV3LibStrings.moneyou | stripeDashV3Lib.stripeDashV3LibStrings.rabobank | stripeDashV3Lib.stripeDashV3LibStrings.regiobank | stripeDashV3Lib.stripeDashV3LibStrings.sns_bank | stripeDashV3Lib.stripeDashV3LibStrings.triodos_bank | stripeDashV3Lib.stripeDashV3LibStrings.van_lanschot,
    bic: java.lang.String,
    iban_last4: java.lang.String,
    verified_name: java.lang.String
  ): IdealDetails = {
    val __obj = js.Dynamic.literal(bank = bank.asInstanceOf[js.Any], bic = bic, iban_last4 = iban_last4, verified_name = verified_name)
  
    __obj.asInstanceOf[IdealDetails]
  }
}

