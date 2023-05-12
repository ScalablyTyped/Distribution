package typings.shippo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAddressRequest extends StObject {
  
  var city: String
  
  var company: js.UndefOr[String] = js.undefined
  
  var country: Country
  
  var email: js.UndefOr[String] = js.undefined
  
  var is_residential: js.UndefOr[Boolean] = js.undefined
  
  var metadata: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var phone: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[String] = js.undefined
  
  var street1: String
  
  var street2: js.UndefOr[String] = js.undefined
  
  var street3: js.UndefOr[String] = js.undefined
  
  var street_no: js.UndefOr[String] = js.undefined
  
  var validate: js.UndefOr[Boolean] = js.undefined
  
  var zip: String
}
object CreateAddressRequest {
  
  inline def apply(city: String, country: Country, name: String, street1: String, zip: String): CreateAddressRequest = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], street1 = street1.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAddressRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAddressRequest] (val x: Self) extends AnyVal {
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    inline def setCountry(value: Country): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setIs_residential(value: Boolean): Self = StObject.set(x, "is_residential", value.asInstanceOf[js.Any])
    
    inline def setIs_residentialUndefined: Self = StObject.set(x, "is_residential", js.undefined)
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStreet1(value: String): Self = StObject.set(x, "street1", value.asInstanceOf[js.Any])
    
    inline def setStreet2(value: String): Self = StObject.set(x, "street2", value.asInstanceOf[js.Any])
    
    inline def setStreet2Undefined: Self = StObject.set(x, "street2", js.undefined)
    
    inline def setStreet3(value: String): Self = StObject.set(x, "street3", value.asInstanceOf[js.Any])
    
    inline def setStreet3Undefined: Self = StObject.set(x, "street3", js.undefined)
    
    inline def setStreet_no(value: String): Self = StObject.set(x, "street_no", value.asInstanceOf[js.Any])
    
    inline def setStreet_noUndefined: Self = StObject.set(x, "street_no", js.undefined)
    
    inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    inline def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
  }
}
