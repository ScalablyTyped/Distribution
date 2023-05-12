package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SellingPlanCheckoutChargePercentageValue
  extends StObject
     with SellingPlanCheckoutChargeValue {
  
  var percentage: Double
}
object SellingPlanCheckoutChargePercentageValue {
  
  inline def apply(percentage: Double): SellingPlanCheckoutChargePercentageValue = {
    val __obj = js.Dynamic.literal(percentage = percentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SellingPlanCheckoutChargePercentageValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SellingPlanCheckoutChargePercentageValue] (val x: Self) extends AnyVal {
    
    inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
  }
}
