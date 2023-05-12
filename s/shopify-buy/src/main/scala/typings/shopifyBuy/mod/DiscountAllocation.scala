package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscountAllocation extends StObject {
  
  var allocatedAmount: MoneyV2
  
  var discountApplication: DiscountApplication
}
object DiscountAllocation {
  
  inline def apply(allocatedAmount: MoneyV2, discountApplication: DiscountApplication): DiscountAllocation = {
    val __obj = js.Dynamic.literal(allocatedAmount = allocatedAmount.asInstanceOf[js.Any], discountApplication = discountApplication.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscountAllocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiscountAllocation] (val x: Self) extends AnyVal {
    
    inline def setAllocatedAmount(value: MoneyV2): Self = StObject.set(x, "allocatedAmount", value.asInstanceOf[js.Any])
    
    inline def setDiscountApplication(value: DiscountApplication): Self = StObject.set(x, "discountApplication", value.asInstanceOf[js.Any])
  }
}
