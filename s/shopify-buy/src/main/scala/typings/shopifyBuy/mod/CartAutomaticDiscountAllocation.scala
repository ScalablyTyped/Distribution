package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CartAutomaticDiscountAllocation extends StObject {
  
  var discountedAmount: MoneyV2
  
  var title: String
}
object CartAutomaticDiscountAllocation {
  
  inline def apply(discountedAmount: MoneyV2, title: String): CartAutomaticDiscountAllocation = {
    val __obj = js.Dynamic.literal(discountedAmount = discountedAmount.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartAutomaticDiscountAllocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CartAutomaticDiscountAllocation] (val x: Self) extends AnyVal {
    
    inline def setDiscountedAmount(value: MoneyV2): Self = StObject.set(x, "discountedAmount", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
