package typings.stripeDashV3.stripe.paymentMethod

import typings.stripeDashV3.Anon_Addressline1check
import typings.stripeDashV3.Anon_Amexexpresscheckout
import typings.stripeDashV3.Anon_Charge
import typings.stripeDashV3.Anon_Supported
import typings.stripeDashV3.stripe.fundingType
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
  var checks: Anon_Addressline1check
  /**
    * Two-letter ISO code representing the country of the card. You
    * could use this attribute to get a sense of the international
    * breakdown of cards you’ve collected.
    */
  var country: String
  /**
    * Two-digit number representing the card’s expiration month.
    */
  var exp_month: Double
  /**
    * Four-digit number representing the card’s expiration year.
    */
  var exp_year: Double
  /**
    * Uniquely identifies this particular card number. You can use
    * this attribute to check whether two customers who’ve signed
    * up with you are using the same card number, for example.
    */
  var fingerprint: String
  /**
    * Card funding type
    */
  var funding: fundingType
  /**
    * Details of the original PaymentMethod that created this object.
    */
  var generated_from: Anon_Charge
  /**
    * The last four digits of the card.
    */
  var last4: String
  /**
    * Contains details on how this Card maybe be used for 3D Secure authentication.
    */
  var three_d_secure_usage: js.UndefOr[Anon_Supported] = js.undefined
  /**
    * If this Card is part of a card wallet, this contains the details of
    * the card wallet.
    */
  var wallet: Anon_Amexexpresscheckout | Null
}

object PaymentMethodCard {
  @scala.inline
  def apply(
    brand: paymentMethodCardBrand,
    checks: Anon_Addressline1check,
    country: String,
    exp_month: Double,
    exp_year: Double,
    fingerprint: String,
    funding: fundingType,
    generated_from: Anon_Charge,
    last4: String,
    three_d_secure_usage: Anon_Supported = null,
    wallet: Anon_Amexexpresscheckout = null
  ): PaymentMethodCard = {
    val __obj = js.Dynamic.literal(brand = brand, checks = checks, country = country, exp_month = exp_month, exp_year = exp_year, fingerprint = fingerprint, funding = funding, generated_from = generated_from, last4 = last4)
    if (three_d_secure_usage != null) __obj.updateDynamic("three_d_secure_usage")(three_d_secure_usage)
    if (wallet != null) __obj.updateDynamic("wallet")(wallet)
    __obj.asInstanceOf[PaymentMethodCard]
  }
}

