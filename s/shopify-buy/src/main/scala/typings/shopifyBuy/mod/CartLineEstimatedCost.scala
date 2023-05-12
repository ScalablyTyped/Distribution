package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CartLineEstimatedCost extends StObject {
  
  var amount: MoneyV2
  
  var compareAtAmount: js.UndefOr[MoneyV2] = js.undefined
  
  var subtotalAmount: MoneyV2
  
  var totalAmount: MoneyV2
}
object CartLineEstimatedCost {
  
  inline def apply(amount: MoneyV2, subtotalAmount: MoneyV2, totalAmount: MoneyV2): CartLineEstimatedCost = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], subtotalAmount = subtotalAmount.asInstanceOf[js.Any], totalAmount = totalAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartLineEstimatedCost]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CartLineEstimatedCost] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: MoneyV2): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCompareAtAmount(value: MoneyV2): Self = StObject.set(x, "compareAtAmount", value.asInstanceOf[js.Any])
    
    inline def setCompareAtAmountUndefined: Self = StObject.set(x, "compareAtAmount", js.undefined)
    
    inline def setSubtotalAmount(value: MoneyV2): Self = StObject.set(x, "subtotalAmount", value.asInstanceOf[js.Any])
    
    inline def setTotalAmount(value: MoneyV2): Self = StObject.set(x, "totalAmount", value.asInstanceOf[js.Any])
  }
}
