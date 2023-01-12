package typings.shippo.mod.Shippo

import typings.shippo.anon.Isvalid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://goshippo.com/docs/reference#addresses
trait Address
  extends StObject
     with Metadata {
  
  var city: String
  
  var company: js.UndefOr[String] = js.undefined
  
  var country: js.UndefOr[Country] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var is_residential: js.UndefOr[Boolean] = js.undefined
  
  var metadata: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var phone: js.UndefOr[String] = js.undefined
  
  var state: String
  
  var street1: String
  
  var street2: js.UndefOr[String] = js.undefined
  
  var street3: js.UndefOr[String] = js.undefined
  
  var street_no: js.UndefOr[String] = js.undefined
  
  var validate: js.UndefOr[Boolean] = js.undefined
  
  var validation_results: js.UndefOr[Isvalid] = js.undefined
  
  var zip: js.UndefOr[String] = js.undefined
}
object Address {
  
  inline def apply(
    city: String,
    name: String,
    object_created: String,
    object_id: String,
    object_owner: String,
    object_updated: String,
    state: String,
    street1: String
  ): Address = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], object_created = object_created.asInstanceOf[js.Any], object_id = object_id.asInstanceOf[js.Any], object_owner = object_owner.asInstanceOf[js.Any], object_updated = object_updated.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], street1 = street1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    inline def setCountry(value: Country): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
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
    
    inline def setStreet1(value: String): Self = StObject.set(x, "street1", value.asInstanceOf[js.Any])
    
    inline def setStreet2(value: String): Self = StObject.set(x, "street2", value.asInstanceOf[js.Any])
    
    inline def setStreet2Undefined: Self = StObject.set(x, "street2", js.undefined)
    
    inline def setStreet3(value: String): Self = StObject.set(x, "street3", value.asInstanceOf[js.Any])
    
    inline def setStreet3Undefined: Self = StObject.set(x, "street3", js.undefined)
    
    inline def setStreet_no(value: String): Self = StObject.set(x, "street_no", value.asInstanceOf[js.Any])
    
    inline def setStreet_noUndefined: Self = StObject.set(x, "street_no", js.undefined)
    
    inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    inline def setValidation_results(value: Isvalid): Self = StObject.set(x, "validation_results", value.asInstanceOf[js.Any])
    
    inline def setValidation_resultsUndefined: Self = StObject.set(x, "validation_results", js.undefined)
    
    inline def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    
    inline def setZipUndefined: Self = StObject.set(x, "zip", js.undefined)
  }
}
