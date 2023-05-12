package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SellingPlan
  extends StObject
     with Node {
  
  var checkoutCharge: SellingPlanCheckoutCharge
  
  var description: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var options: js.Array[SellingPlanOption]
  
  var priceAdjustments: js.Array[SellingPlanPriceAdjustment]
  
  var recurringDeliveries: Boolean
}
object SellingPlan {
  
  inline def apply(
    checkoutCharge: SellingPlanCheckoutCharge,
    id: ID,
    name: String,
    options: js.Array[SellingPlanOption],
    priceAdjustments: js.Array[SellingPlanPriceAdjustment],
    recurringDeliveries: Boolean
  ): SellingPlan = {
    val __obj = js.Dynamic.literal(checkoutCharge = checkoutCharge.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], priceAdjustments = priceAdjustments.asInstanceOf[js.Any], recurringDeliveries = recurringDeliveries.asInstanceOf[js.Any])
    __obj.asInstanceOf[SellingPlan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SellingPlan] (val x: Self) extends AnyVal {
    
    inline def setCheckoutCharge(value: SellingPlanCheckoutCharge): Self = StObject.set(x, "checkoutCharge", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: js.Array[SellingPlanOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: SellingPlanOption*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setPriceAdjustments(value: js.Array[SellingPlanPriceAdjustment]): Self = StObject.set(x, "priceAdjustments", value.asInstanceOf[js.Any])
    
    inline def setPriceAdjustmentsVarargs(value: SellingPlanPriceAdjustment*): Self = StObject.set(x, "priceAdjustments", js.Array(value*))
    
    inline def setRecurringDeliveries(value: Boolean): Self = StObject.set(x, "recurringDeliveries", value.asInstanceOf[js.Any])
  }
}
