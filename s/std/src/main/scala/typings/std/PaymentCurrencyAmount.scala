package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentCurrencyAmount extends StObject {
  
  var currency: java.lang.String = js.native
  
  var currencySystem: js.UndefOr[java.lang.String] = js.native
  
  var value: java.lang.String = js.native
}
object PaymentCurrencyAmount {
  
  @scala.inline
  def apply(currency: java.lang.String, value: java.lang.String): PaymentCurrencyAmount = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentCurrencyAmount]
  }
  
  @scala.inline
  implicit class PaymentCurrencyAmountMutableBuilder[Self <: PaymentCurrencyAmount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrency(value: java.lang.String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencySystem(value: java.lang.String): Self = StObject.set(x, "currencySystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencySystemUndefined: Self = StObject.set(x, "currencySystem", js.undefined)
    
    @scala.inline
    def setValue(value: java.lang.String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
