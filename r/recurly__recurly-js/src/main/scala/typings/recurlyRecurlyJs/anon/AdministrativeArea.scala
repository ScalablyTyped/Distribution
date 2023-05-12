package typings.recurlyRecurlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdministrativeArea extends StObject {
  
  /**
    * A country subdivision, such as a state or province.
    */
  var administrativeArea: String
  
  /**
    * ISO 3166-1 alpha-2 country code.
    */
  var countryCode: String
  
  /**
    * City, town, neighborhood, or suburb.
    */
  var locality: String
  
  /**
    * The redacted postal code based on the country.
    * For Canada and the UK, this contains only the first three characters.
    * For US, this contains the first five digits.
    */
  var postalCode: String
}
object AdministrativeArea {
  
  inline def apply(administrativeArea: String, countryCode: String, locality: String, postalCode: String): AdministrativeArea = {
    val __obj = js.Dynamic.literal(administrativeArea = administrativeArea.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdministrativeArea]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdministrativeArea] (val x: Self) extends AnyVal {
    
    inline def setAdministrativeArea(value: String): Self = StObject.set(x, "administrativeArea", value.asInstanceOf[js.Any])
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
  }
}
