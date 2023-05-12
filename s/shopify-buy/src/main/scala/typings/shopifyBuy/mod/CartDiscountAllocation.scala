package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// end GraphQL Types - Unions
// GraphQL Types - Interfaces
trait CartDiscountAllocation extends StObject {
  
  var discountedAmount: MoneyV2
}
object CartDiscountAllocation {
  
  inline def apply(discountedAmount: MoneyV2): CartDiscountAllocation = {
    val __obj = js.Dynamic.literal(discountedAmount = discountedAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartDiscountAllocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CartDiscountAllocation] (val x: Self) extends AnyVal {
    
    inline def setDiscountedAmount(value: MoneyV2): Self = StObject.set(x, "discountedAmount", value.asInstanceOf[js.Any])
  }
}
