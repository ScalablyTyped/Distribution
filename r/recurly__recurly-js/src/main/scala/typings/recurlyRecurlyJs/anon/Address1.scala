package typings.recurlyRecurlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address1 extends StObject {
  
  var address1: String
  
  var address2: String
  
  var address3: String
  
  var administrativeArea: String
  
  var countryCode: String
  
  var locality: String
  
  var name: String
  
  var phoneNumber: String
  
  var postalCode: String
  
  var sortingCode: String
}
object Address1 {
  
  inline def apply(
    address1: String,
    address2: String,
    address3: String,
    administrativeArea: String,
    countryCode: String,
    locality: String,
    name: String,
    phoneNumber: String,
    postalCode: String,
    sortingCode: String
  ): Address1 = {
    val __obj = js.Dynamic.literal(address1 = address1.asInstanceOf[js.Any], address2 = address2.asInstanceOf[js.Any], address3 = address3.asInstanceOf[js.Any], administrativeArea = administrativeArea.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], sortingCode = sortingCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Address1] (val x: Self) extends AnyVal {
    
    inline def setAddress1(value: String): Self = StObject.set(x, "address1", value.asInstanceOf[js.Any])
    
    inline def setAddress2(value: String): Self = StObject.set(x, "address2", value.asInstanceOf[js.Any])
    
    inline def setAddress3(value: String): Self = StObject.set(x, "address3", value.asInstanceOf[js.Any])
    
    inline def setAdministrativeArea(value: String): Self = StObject.set(x, "administrativeArea", value.asInstanceOf[js.Any])
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setSortingCode(value: String): Self = StObject.set(x, "sortingCode", value.asInstanceOf[js.Any])
  }
}
