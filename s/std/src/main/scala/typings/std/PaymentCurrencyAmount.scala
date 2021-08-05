package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentCurrencyAmount extends StObject {
  
  var currency: java.lang.String
  
  var currencySystem: js.UndefOr[java.lang.String] = js.undefined
  
  var value: java.lang.String
}
object PaymentCurrencyAmount {
  
  inline def apply(currency: java.lang.String, value: java.lang.String): PaymentCurrencyAmount = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentCurrencyAmount]
  }
  
  extension [Self <: PaymentCurrencyAmount](x: Self) {
    
    inline def setCurrency(value: java.lang.String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencySystem(value: java.lang.String): Self = StObject.set(x, "currencySystem", value.asInstanceOf[js.Any])
    
    inline def setCurrencySystemUndefined: Self = StObject.set(x, "currencySystem", js.undefined)
    
    inline def setValue(value: java.lang.String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
