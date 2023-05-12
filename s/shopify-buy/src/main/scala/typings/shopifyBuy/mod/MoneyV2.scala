package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoneyV2
  extends StObject
     with PricingValue
     with SellingPlanCheckoutChargeValue {
  
  var amount: Double
  
  var currencyCode: CurrencyCode
}
object MoneyV2 {
  
  inline def apply(amount: Double, currencyCode: CurrencyCode): MoneyV2 = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currencyCode = currencyCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoneyV2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MoneyV2] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCode(value: CurrencyCode): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
  }
}
