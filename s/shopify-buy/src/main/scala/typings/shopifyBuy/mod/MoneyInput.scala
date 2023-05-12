package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoneyInput extends StObject {
  
  var amount: Double
  
  var currencyCode: CurrencyCode
}
object MoneyInput {
  
  inline def apply(amount: Double, currencyCode: CurrencyCode): MoneyInput = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currencyCode = currencyCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoneyInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MoneyInput] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCode(value: CurrencyCode): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
  }
}
