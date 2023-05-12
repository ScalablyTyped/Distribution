package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SellingPlanPercentagePriceAdjustment
  extends StObject
     with SellingPlanPriceAdjustmentValue {
  
  var adjustmentPercentage: Double
}
object SellingPlanPercentagePriceAdjustment {
  
  inline def apply(adjustmentPercentage: Double): SellingPlanPercentagePriceAdjustment = {
    val __obj = js.Dynamic.literal(adjustmentPercentage = adjustmentPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SellingPlanPercentagePriceAdjustment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SellingPlanPercentagePriceAdjustment] (val x: Self) extends AnyVal {
    
    inline def setAdjustmentPercentage(value: Double): Self = StObject.set(x, "adjustmentPercentage", value.asInstanceOf[js.Any])
  }
}
