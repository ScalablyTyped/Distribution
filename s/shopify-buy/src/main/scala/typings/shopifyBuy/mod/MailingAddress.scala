package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailingAddress
  extends StObject
     with Node {
  
  var address1: js.UndefOr[String] = js.undefined
  
  var address2: js.UndefOr[String] = js.undefined
  
  var city: js.UndefOr[String] = js.undefined
  
  var company: js.UndefOr[String] = js.undefined
  
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * @deprecated
    */
  var countryCode: js.UndefOr[String] = js.undefined
  
  var countryCodeV2: js.UndefOr[CountryCode] = js.undefined
  
  var firstName: js.UndefOr[String] = js.undefined
  
  var formatted: js.Array[String]
  
  var formattedArea: js.UndefOr[String] = js.undefined
  
  var lastName: js.UndefOr[String] = js.undefined
  
  var latitude: js.UndefOr[Double] = js.undefined
  
  var longitude: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var phone: js.UndefOr[String] = js.undefined
  
  var province: js.UndefOr[String] = js.undefined
  
  var provinceCode: js.UndefOr[String] = js.undefined
  
  var zip: js.UndefOr[String] = js.undefined
}
object MailingAddress {
  
  inline def apply(formatted: js.Array[String], id: ID): MailingAddress = {
    val __obj = js.Dynamic.literal(formatted = formatted.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailingAddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MailingAddress] (val x: Self) extends AnyVal {
    
    inline def setAddress1(value: String): Self = StObject.set(x, "address1", value.asInstanceOf[js.Any])
    
    inline def setAddress1Undefined: Self = StObject.set(x, "address1", js.undefined)
    
    inline def setAddress2(value: String): Self = StObject.set(x, "address2", value.asInstanceOf[js.Any])
    
    inline def setAddress2Undefined: Self = StObject.set(x, "address2", js.undefined)
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setCountryCodeV2(value: CountryCode): Self = StObject.set(x, "countryCodeV2", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeV2Undefined: Self = StObject.set(x, "countryCodeV2", js.undefined)
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    inline def setFormatted(value: js.Array[String]): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
    
    inline def setFormattedArea(value: String): Self = StObject.set(x, "formattedArea", value.asInstanceOf[js.Any])
    
    inline def setFormattedAreaUndefined: Self = StObject.set(x, "formattedArea", js.undefined)
    
    inline def setFormattedVarargs(value: String*): Self = StObject.set(x, "formatted", js.Array(value*))
    
    inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
    
    inline def setProvinceCode(value: String): Self = StObject.set(x, "provinceCode", value.asInstanceOf[js.Any])
    
    inline def setProvinceCodeUndefined: Self = StObject.set(x, "provinceCode", js.undefined)
    
    inline def setProvinceUndefined: Self = StObject.set(x, "province", js.undefined)
    
    inline def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    
    inline def setZipUndefined: Self = StObject.set(x, "zip", js.undefined)
  }
}
