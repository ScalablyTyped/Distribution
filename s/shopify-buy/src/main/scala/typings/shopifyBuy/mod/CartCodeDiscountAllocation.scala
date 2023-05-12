package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CartCodeDiscountAllocation extends StObject {
  
  var code: String
  
  var discountedAmount: MoneyV2
}
object CartCodeDiscountAllocation {
  
  inline def apply(code: String, discountedAmount: MoneyV2): CartCodeDiscountAllocation = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], discountedAmount = discountedAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartCodeDiscountAllocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CartCodeDiscountAllocation] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDiscountedAmount(value: MoneyV2): Self = StObject.set(x, "discountedAmount", value.asInstanceOf[js.Any])
  }
}
