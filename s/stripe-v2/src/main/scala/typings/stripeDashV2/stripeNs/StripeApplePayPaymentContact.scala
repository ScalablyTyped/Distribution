package typings.stripeDashV2.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeApplePayPaymentContact extends js.Object {
  var addressLines: js.Array[String]
  var administrativeArea: String
  var countryCode: String
  var emailAddress: String
  var familyName: String
  var givenName: String
  var locality: String
  var phoneNumber: String
  var postalCode: String
}

object StripeApplePayPaymentContact {
  @scala.inline
  def apply(
    addressLines: js.Array[String],
    administrativeArea: String,
    countryCode: String,
    emailAddress: String,
    familyName: String,
    givenName: String,
    locality: String,
    phoneNumber: String,
    postalCode: String
  ): StripeApplePayPaymentContact = {
    val __obj = js.Dynamic.literal(addressLines = addressLines, administrativeArea = administrativeArea, countryCode = countryCode, emailAddress = emailAddress, familyName = familyName, givenName = givenName, locality = locality, phoneNumber = phoneNumber, postalCode = postalCode)
  
    __obj.asInstanceOf[StripeApplePayPaymentContact]
  }
}

