package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CartEstimatedCost extends StObject {
  
  var checkoutChargeAmount: MoneyV2
  
  var subtotalAmount: MoneyV2
  
  var totalAmount: MoneyV2
  
  var totalDutyAmount: js.UndefOr[MoneyV2] = js.undefined
  
  var totalTaxAmount: js.UndefOr[MoneyV2] = js.undefined
}
object CartEstimatedCost {
  
  inline def apply(checkoutChargeAmount: MoneyV2, subtotalAmount: MoneyV2, totalAmount: MoneyV2): CartEstimatedCost = {
    val __obj = js.Dynamic.literal(checkoutChargeAmount = checkoutChargeAmount.asInstanceOf[js.Any], subtotalAmount = subtotalAmount.asInstanceOf[js.Any], totalAmount = totalAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartEstimatedCost]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CartEstimatedCost] (val x: Self) extends AnyVal {
    
    inline def setCheckoutChargeAmount(value: MoneyV2): Self = StObject.set(x, "checkoutChargeAmount", value.asInstanceOf[js.Any])
    
    inline def setSubtotalAmount(value: MoneyV2): Self = StObject.set(x, "subtotalAmount", value.asInstanceOf[js.Any])
    
    inline def setTotalAmount(value: MoneyV2): Self = StObject.set(x, "totalAmount", value.asInstanceOf[js.Any])
    
    inline def setTotalDutyAmount(value: MoneyV2): Self = StObject.set(x, "totalDutyAmount", value.asInstanceOf[js.Any])
    
    inline def setTotalDutyAmountUndefined: Self = StObject.set(x, "totalDutyAmount", js.undefined)
    
    inline def setTotalTaxAmount(value: MoneyV2): Self = StObject.set(x, "totalTaxAmount", value.asInstanceOf[js.Any])
    
    inline def setTotalTaxAmountUndefined: Self = StObject.set(x, "totalTaxAmount", js.undefined)
  }
}
