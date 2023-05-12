package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreditCard extends StObject {
  
  var brand: js.UndefOr[String] = js.undefined
  
  var expiryMonth: js.UndefOr[Double] = js.undefined
  
  var expiryYear: js.UndefOr[Double] = js.undefined
  
  var firstDigits: js.UndefOr[String] = js.undefined
  
  var firstName: js.UndefOr[String] = js.undefined
  
  var lastDigits: js.UndefOr[String] = js.undefined
  
  var lastName: js.UndefOr[String] = js.undefined
  
  var maskedNumber: js.UndefOr[String] = js.undefined
}
object CreditCard {
  
  inline def apply(): CreditCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreditCard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreditCard] (val x: Self) extends AnyVal {
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    inline def setExpiryMonth(value: Double): Self = StObject.set(x, "expiryMonth", value.asInstanceOf[js.Any])
    
    inline def setExpiryMonthUndefined: Self = StObject.set(x, "expiryMonth", js.undefined)
    
    inline def setExpiryYear(value: Double): Self = StObject.set(x, "expiryYear", value.asInstanceOf[js.Any])
    
    inline def setExpiryYearUndefined: Self = StObject.set(x, "expiryYear", js.undefined)
    
    inline def setFirstDigits(value: String): Self = StObject.set(x, "firstDigits", value.asInstanceOf[js.Any])
    
    inline def setFirstDigitsUndefined: Self = StObject.set(x, "firstDigits", js.undefined)
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    inline def setLastDigits(value: String): Self = StObject.set(x, "lastDigits", value.asInstanceOf[js.Any])
    
    inline def setLastDigitsUndefined: Self = StObject.set(x, "lastDigits", js.undefined)
    
    inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    inline def setMaskedNumber(value: String): Self = StObject.set(x, "maskedNumber", value.asInstanceOf[js.Any])
    
    inline def setMaskedNumberUndefined: Self = StObject.set(x, "maskedNumber", js.undefined)
  }
}
