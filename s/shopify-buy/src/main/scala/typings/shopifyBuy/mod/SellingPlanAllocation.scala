package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SellingPlanAllocation extends StObject {
  
  var checkoutChargeAmount: MoneyV2
  
  var priceAdjustments: js.Array[SellingPlanAllocationPriceAdjustment]
  
  var remainingBalanceChargeAmount: MoneyV2
  
  var sellingPlan: SellingPlan
}
object SellingPlanAllocation {
  
  inline def apply(
    checkoutChargeAmount: MoneyV2,
    priceAdjustments: js.Array[SellingPlanAllocationPriceAdjustment],
    remainingBalanceChargeAmount: MoneyV2,
    sellingPlan: SellingPlan
  ): SellingPlanAllocation = {
    val __obj = js.Dynamic.literal(checkoutChargeAmount = checkoutChargeAmount.asInstanceOf[js.Any], priceAdjustments = priceAdjustments.asInstanceOf[js.Any], remainingBalanceChargeAmount = remainingBalanceChargeAmount.asInstanceOf[js.Any], sellingPlan = sellingPlan.asInstanceOf[js.Any])
    __obj.asInstanceOf[SellingPlanAllocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SellingPlanAllocation] (val x: Self) extends AnyVal {
    
    inline def setCheckoutChargeAmount(value: MoneyV2): Self = StObject.set(x, "checkoutChargeAmount", value.asInstanceOf[js.Any])
    
    inline def setPriceAdjustments(value: js.Array[SellingPlanAllocationPriceAdjustment]): Self = StObject.set(x, "priceAdjustments", value.asInstanceOf[js.Any])
    
    inline def setPriceAdjustmentsVarargs(value: SellingPlanAllocationPriceAdjustment*): Self = StObject.set(x, "priceAdjustments", js.Array(value*))
    
    inline def setRemainingBalanceChargeAmount(value: MoneyV2): Self = StObject.set(x, "remainingBalanceChargeAmount", value.asInstanceOf[js.Any])
    
    inline def setSellingPlan(value: SellingPlan): Self = StObject.set(x, "sellingPlan", value.asInstanceOf[js.Any])
  }
}
