package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SellingPlanFixedAmountPriceAdjustment
  extends StObject
     with SellingPlanPriceAdjustmentValue {
  
  var adjustmentAmount: MoneyV2
}
object SellingPlanFixedAmountPriceAdjustment {
  
  inline def apply(adjustmentAmount: MoneyV2): SellingPlanFixedAmountPriceAdjustment = {
    val __obj = js.Dynamic.literal(adjustmentAmount = adjustmentAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SellingPlanFixedAmountPriceAdjustment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SellingPlanFixedAmountPriceAdjustment] (val x: Self) extends AnyVal {
    
    inline def setAdjustmentAmount(value: MoneyV2): Self = StObject.set(x, "adjustmentAmount", value.asInstanceOf[js.Any])
  }
}
