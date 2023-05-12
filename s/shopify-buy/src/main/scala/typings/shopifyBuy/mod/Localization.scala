package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Localization extends StObject {
  
  var availableCountries: js.Array[Country]
  
  var availableLanguages: js.Array[Language]
  
  var country: Country
  
  var language: Language
}
object Localization {
  
  inline def apply(
    availableCountries: js.Array[Country],
    availableLanguages: js.Array[Language],
    country: Country,
    language: Language
  ): Localization = {
    val __obj = js.Dynamic.literal(availableCountries = availableCountries.asInstanceOf[js.Any], availableLanguages = availableLanguages.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[Localization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Localization] (val x: Self) extends AnyVal {
    
    inline def setAvailableCountries(value: js.Array[Country]): Self = StObject.set(x, "availableCountries", value.asInstanceOf[js.Any])
    
    inline def setAvailableCountriesVarargs(value: Country*): Self = StObject.set(x, "availableCountries", js.Array(value*))
    
    inline def setAvailableLanguages(value: js.Array[Language]): Self = StObject.set(x, "availableLanguages", value.asInstanceOf[js.Any])
    
    inline def setAvailableLanguagesVarargs(value: Language*): Self = StObject.set(x, "availableLanguages", js.Array(value*))
    
    inline def setCountry(value: Country): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
  }
}
