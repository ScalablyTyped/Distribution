package typings.stripeV2.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StripeApplePayPaymentContact extends StObject {
  
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
  
  @scala.inline
  implicit class StripeApplePayPaymentContactMutableBuilder[Self <: StripeApplePayPaymentContact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressLines(value: js.Array[String]): Self = StObject.set(x, "addressLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressLinesVarargs(value: String*): Self = StObject.set(x, "addressLines", js.Array(value :_*))
    
    @scala.inline
    def setAdministrativeArea(value: String): Self = StObject.set(x, "administrativeArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
  }
}
