package typings.stripeV2.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeApplePayPaymentContact extends js.Object {
  var addressLines: js.Array[String] = js.native
  var administrativeArea: String = js.native
  var countryCode: String = js.native
  var emailAddress: String = js.native
  var familyName: String = js.native
  var givenName: String = js.native
  var locality: String = js.native
  var phoneNumber: String = js.native
  var postalCode: String = js.native
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
  @scala.inline
  implicit class StripeApplePayPaymentContactOps[Self <: StripeApplePayPaymentContact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddressLinesVarargs(value: String*): Self = this.set("addressLines", js.Array(value :_*))
    @scala.inline
    def setAddressLines(value: js.Array[String]): Self = this.set("addressLines", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdministrativeArea(value: String): Self = this.set("administrativeArea", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setFamilyName(value: String): Self = this.set("familyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setGivenName(value: String): Self = this.set("givenName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocality(value: String): Self = this.set("locality", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
  }
  
}

