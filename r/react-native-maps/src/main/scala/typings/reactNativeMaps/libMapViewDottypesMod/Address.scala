package typings.reactNativeMaps.libMapViewDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  var administrativeArea: String
  
  var country: String
  
  var countryCode: String
  
  var locality: String
  
  var name: String
  
  var postalCode: String
  
  var subAdministrativeArea: String
  
  var subLocality: String
  
  var thoroughfare: String
}
object Address {
  
  inline def apply(
    administrativeArea: String,
    country: String,
    countryCode: String,
    locality: String,
    name: String,
    postalCode: String,
    subAdministrativeArea: String,
    subLocality: String,
    thoroughfare: String
  ): Address = {
    val __obj = js.Dynamic.literal(administrativeArea = administrativeArea.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], subAdministrativeArea = subAdministrativeArea.asInstanceOf[js.Any], subLocality = subLocality.asInstanceOf[js.Any], thoroughfare = thoroughfare.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
    
    inline def setAdministrativeArea(value: String): Self = StObject.set(x, "administrativeArea", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setSubAdministrativeArea(value: String): Self = StObject.set(x, "subAdministrativeArea", value.asInstanceOf[js.Any])
    
    inline def setSubLocality(value: String): Self = StObject.set(x, "subLocality", value.asInstanceOf[js.Any])
    
    inline def setThoroughfare(value: String): Self = StObject.set(x, "thoroughfare", value.asInstanceOf[js.Any])
  }
}
