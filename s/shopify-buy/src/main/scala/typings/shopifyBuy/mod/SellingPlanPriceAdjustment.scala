package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SellingPlanPriceAdjustment extends StObject {
  
  var adjustmentValue: SellingPlanPriceAdjustmentValue
  
  var orderCount: js.UndefOr[Double] = js.undefined
}
object SellingPlanPriceAdjustment {
  
  inline def apply(adjustmentValue: SellingPlanPriceAdjustmentValue): SellingPlanPriceAdjustment = {
    val __obj = js.Dynamic.literal(adjustmentValue = adjustmentValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SellingPlanPriceAdjustment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SellingPlanPriceAdjustment] (val x: Self) extends AnyVal {
    
    inline def setAdjustmentValue(value: SellingPlanPriceAdjustmentValue): Self = StObject.set(x, "adjustmentValue", value.asInstanceOf[js.Any])
    
    inline def setOrderCount(value: Double): Self = StObject.set(x, "orderCount", value.asInstanceOf[js.Any])
    
    inline def setOrderCountUndefined: Self = StObject.set(x, "orderCount", js.undefined)
  }
}
