package typings
package stripeDashV2Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeApplePayPaymentContact extends js.Object {
  var addressLines: js.Array[java.lang.String]
  var administrativeArea: java.lang.String
  var countryCode: java.lang.String
  var emailAddress: java.lang.String
  var familyName: java.lang.String
  var givenName: java.lang.String
  var locality: java.lang.String
  var phoneNumber: java.lang.String
  var postalCode: java.lang.String
}

object StripeApplePayPaymentContact {
  @scala.inline
  def apply(
    addressLines: js.Array[java.lang.String],
    administrativeArea: java.lang.String,
    countryCode: java.lang.String,
    emailAddress: java.lang.String,
    familyName: java.lang.String,
    givenName: java.lang.String,
    locality: java.lang.String,
    phoneNumber: java.lang.String,
    postalCode: java.lang.String
  ): StripeApplePayPaymentContact = {
    val __obj = js.Dynamic.literal(addressLines = addressLines, administrativeArea = administrativeArea, countryCode = countryCode, emailAddress = emailAddress, familyName = familyName, givenName = givenName, locality = locality, phoneNumber = phoneNumber, postalCode = postalCode)
  
    __obj.asInstanceOf[StripeApplePayPaymentContact]
  }
}

