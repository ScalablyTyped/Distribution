package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CartCost extends StObject {
  
  var checkoutChargeAmount: MoneyV2
  
  var subtotalAmount: MoneyV2
  
  var subtotalAmountEstimated: Boolean
  
  var totalAmount: MoneyV2
  
  var totalAmountEstimated: Boolean
  
  var totalTaxAmount: MoneyV2
  
  var totalTaxAmountEstimated: Boolean
}
object CartCost {
  
  inline def apply(
    checkoutChargeAmount: MoneyV2,
    subtotalAmount: MoneyV2,
    subtotalAmountEstimated: Boolean,
    totalAmount: MoneyV2,
    totalAmountEstimated: Boolean,
    totalTaxAmount: MoneyV2,
    totalTaxAmountEstimated: Boolean
  ): CartCost = {
    val __obj = js.Dynamic.literal(checkoutChargeAmount = checkoutChargeAmount.asInstanceOf[js.Any], subtotalAmount = subtotalAmount.asInstanceOf[js.Any], subtotalAmountEstimated = subtotalAmountEstimated.asInstanceOf[js.Any], totalAmount = totalAmount.asInstanceOf[js.Any], totalAmountEstimated = totalAmountEstimated.asInstanceOf[js.Any], totalTaxAmount = totalTaxAmount.asInstanceOf[js.Any], totalTaxAmountEstimated = totalTaxAmountEstimated.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartCost]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CartCost] (val x: Self) extends AnyVal {
    
    inline def setCheckoutChargeAmount(value: MoneyV2): Self = StObject.set(x, "checkoutChargeAmount", value.asInstanceOf[js.Any])
    
    inline def setSubtotalAmount(value: MoneyV2): Self = StObject.set(x, "subtotalAmount", value.asInstanceOf[js.Any])
    
    inline def setSubtotalAmountEstimated(value: Boolean): Self = StObject.set(x, "subtotalAmountEstimated", value.asInstanceOf[js.Any])
    
    inline def setTotalAmount(value: MoneyV2): Self = StObject.set(x, "totalAmount", value.asInstanceOf[js.Any])
    
    inline def setTotalAmountEstimated(value: Boolean): Self = StObject.set(x, "totalAmountEstimated", value.asInstanceOf[js.Any])
    
    inline def setTotalTaxAmount(value: MoneyV2): Self = StObject.set(x, "totalTaxAmount", value.asInstanceOf[js.Any])
    
    inline def setTotalTaxAmountEstimated(value: Boolean): Self = StObject.set(x, "totalTaxAmountEstimated", value.asInstanceOf[js.Any])
  }
}
