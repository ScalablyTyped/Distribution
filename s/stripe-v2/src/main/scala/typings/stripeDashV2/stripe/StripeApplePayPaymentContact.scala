package typings.stripeDashV2.stripe

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
    val __obj = js.Dynamic.literal(addressLines = addressLines.asInstanceOf[js.Any], administrativeArea = administrativeArea.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], familyName = familyName.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StripeApplePayPaymentContact]
  }
}

