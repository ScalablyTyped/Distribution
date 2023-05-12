package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CartLineCost extends StObject {
  
  var amountPerQuantity: MoneyV2
  
  var compareAtAmountPerQuantity: MoneyV2
  
  var subtotalAmount: MoneyV2
  
  var totalAmount: MoneyV2
}
object CartLineCost {
  
  inline def apply(
    amountPerQuantity: MoneyV2,
    compareAtAmountPerQuantity: MoneyV2,
    subtotalAmount: MoneyV2,
    totalAmount: MoneyV2
  ): CartLineCost = {
    val __obj = js.Dynamic.literal(amountPerQuantity = amountPerQuantity.asInstanceOf[js.Any], compareAtAmountPerQuantity = compareAtAmountPerQuantity.asInstanceOf[js.Any], subtotalAmount = subtotalAmount.asInstanceOf[js.Any], totalAmount = totalAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartLineCost]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CartLineCost] (val x: Self) extends AnyVal {
    
    inline def setAmountPerQuantity(value: MoneyV2): Self = StObject.set(x, "amountPerQuantity", value.asInstanceOf[js.Any])
    
    inline def setCompareAtAmountPerQuantity(value: MoneyV2): Self = StObject.set(x, "compareAtAmountPerQuantity", value.asInstanceOf[js.Any])
    
    inline def setSubtotalAmount(value: MoneyV2): Self = StObject.set(x, "subtotalAmount", value.asInstanceOf[js.Any])
    
    inline def setTotalAmount(value: MoneyV2): Self = StObject.set(x, "totalAmount", value.asInstanceOf[js.Any])
  }
}
