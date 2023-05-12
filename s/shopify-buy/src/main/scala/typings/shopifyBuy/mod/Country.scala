package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Country extends StObject {
  
  var availableLanguages: js.Array[Language]
  
  var currency: Currency
  
  var isoCode: CurrencyCode
  
  var name: String
  
  var unitSystem: UnitSystem
}
object Country {
  
  inline def apply(
    availableLanguages: js.Array[Language],
    currency: Currency,
    isoCode: CurrencyCode,
    name: String,
    unitSystem: UnitSystem
  ): Country = {
    val __obj = js.Dynamic.literal(availableLanguages = availableLanguages.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], isoCode = isoCode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], unitSystem = unitSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Country]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Country] (val x: Self) extends AnyVal {
    
    inline def setAvailableLanguages(value: js.Array[Language]): Self = StObject.set(x, "availableLanguages", value.asInstanceOf[js.Any])
    
    inline def setAvailableLanguagesVarargs(value: Language*): Self = StObject.set(x, "availableLanguages", js.Array(value*))
    
    inline def setCurrency(value: Currency): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setIsoCode(value: CurrencyCode): Self = StObject.set(x, "isoCode", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUnitSystem(value: UnitSystem): Self = StObject.set(x, "unitSystem", value.asInstanceOf[js.Any])
  }
}
