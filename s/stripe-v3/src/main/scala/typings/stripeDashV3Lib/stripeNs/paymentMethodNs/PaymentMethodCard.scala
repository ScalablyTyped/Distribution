package typings
package stripeDashV3Lib.stripeNs.paymentMethodNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethodCard extends js.Object {
  /**
    * Card brand
    */
  var brand: paymentMethodCardBrand
  /**
    * Checks on Card address and CVC if provided.
    */
  var checks: stripeDashV3Lib.Anon_Addressline1check
  /**
    * Two-letter ISO code representing the country of the card. You
    * could use this attribute to get a sense of the international
    * breakdown of cards you’ve collected.
    */
  var country: java.lang.String
  /**
    * Two-digit number representing the card’s expiration month.
    */
  var exp_month: scala.Double
  /**
    * Four-digit number representing the card’s expiration year.
    */
  var exp_year: scala.Double
  /**
    * Uniquely identifies this particular card number. You can use
    * this attribute to check whether two customers who’ve signed
    * up with you are using the same card number, for example.
    */
  var fingerprint: java.lang.String
  /**
    * Card funding type
    */
  var funding: stripeDashV3Lib.stripeNs.fundingType
  /**
    * Details of the original PaymentMethod that created this object.
    */
  var generated_from: stripeDashV3Lib.Anon_Charge
  /**
    * The last four digits of the card.
    */
  var last4: java.lang.String
  /**
    * Contains details on how this Card maybe be used for 3D Secure authentication.
    */
  var three_d_secure_usage: js.UndefOr[stripeDashV3Lib.Anon_Supported] = js.undefined
  /**
    * If this Card is part of a card wallet, this contains the details of
    * the card wallet.
    */
  var wallet: stripeDashV3Lib.Anon_Amexexpresscheckout | scala.Null
}

object PaymentMethodCard {
  @scala.inline
  def apply(
    brand: paymentMethodCardBrand,
    checks: stripeDashV3Lib.Anon_Addressline1check,
    country: java.lang.String,
    exp_month: scala.Double,
    exp_year: scala.Double,
    fingerprint: java.lang.String,
    funding: stripeDashV3Lib.stripeNs.fundingType,
    generated_from: stripeDashV3Lib.Anon_Charge,
    last4: java.lang.String,
    three_d_secure_usage: stripeDashV3Lib.Anon_Supported = null,
    wallet: stripeDashV3Lib.Anon_Amexexpresscheckout = null
  ): PaymentMethodCard = {
    val __obj = js.Dynamic.literal(brand = brand, checks = checks, country = country, exp_month = exp_month, exp_year = exp_year, fingerprint = fingerprint, funding = funding, generated_from = generated_from, last4 = last4)
    if (three_d_secure_usage != null) __obj.updateDynamic("three_d_secure_usage")(three_d_secure_usage)
    if (wallet != null) __obj.updateDynamic("wallet")(wallet)
    __obj.asInstanceOf[PaymentMethodCard]
  }
}

