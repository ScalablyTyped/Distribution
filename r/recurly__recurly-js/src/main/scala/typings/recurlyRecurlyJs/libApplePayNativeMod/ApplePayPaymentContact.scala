package typings.recurlyRecurlyJs.libApplePayNativeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplePayPaymentContact extends StObject {
  
  /**
    * The street portion of the address for the contact.
    */
  var addressLines: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The state for the contact.
    */
  var administrativeArea: js.UndefOr[String] = js.undefined
  
  /**
    * The contact’s two-letter ISO 3166 country code.
    */
  var countryCode: js.UndefOr[String] = js.undefined
  
  /**
    * An email address for the contact.
    */
  var emailAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The contact’s family (last) name.
    */
  var familyName: js.UndefOr[String] = js.undefined
  
  /**
    * The contact’s given (first) name.
    */
  var givenName: js.UndefOr[String] = js.undefined
  
  /**
    * The city for the contact.
    */
  var locality: js.UndefOr[String] = js.undefined
  
  /**
    * A phone number for the contact.
    */
  var phoneNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The zip code or postal code for the contact.
    */
  var postalCode: js.UndefOr[String] = js.undefined
}
object ApplePayPaymentContact {
  
  inline def apply(): ApplePayPaymentContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplePayPaymentContact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplePayPaymentContact] (val x: Self) extends AnyVal {
    
    inline def setAddressLines(value: js.Array[String]): Self = StObject.set(x, "addressLines", value.asInstanceOf[js.Any])
    
    inline def setAddressLinesUndefined: Self = StObject.set(x, "addressLines", js.undefined)
    
    inline def setAddressLinesVarargs(value: String*): Self = StObject.set(x, "addressLines", js.Array(value*))
    
    inline def setAdministrativeArea(value: String): Self = StObject.set(x, "administrativeArea", value.asInstanceOf[js.Any])
    
    inline def setAdministrativeAreaUndefined: Self = StObject.set(x, "administrativeArea", js.undefined)
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    inline def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
    
    inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    inline def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
    
    inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    inline def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
  }
}
