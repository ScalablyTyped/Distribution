package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CartCustomDiscountAllocation
  extends StObject
     with CartDiscountAllocation {
  
  var title: String
}
object CartCustomDiscountAllocation {
  
  inline def apply(discountedAmount: MoneyV2, title: String): CartCustomDiscountAllocation = {
    val __obj = js.Dynamic.literal(discountedAmount = discountedAmount.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartCustomDiscountAllocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CartCustomDiscountAllocation] (val x: Self) extends AnyVal {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
