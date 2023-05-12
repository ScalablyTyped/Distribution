package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SellingPlanCheckoutCharge extends StObject {
  
  var `type`: SellingPlanCheckoutChargeType
  
  var value: SellingPlanCheckoutChargeValue
}
object SellingPlanCheckoutCharge {
  
  inline def apply(`type`: SellingPlanCheckoutChargeType, value: SellingPlanCheckoutChargeValue): SellingPlanCheckoutCharge = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SellingPlanCheckoutCharge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SellingPlanCheckoutCharge] (val x: Self) extends AnyVal {
    
    inline def setType(value: SellingPlanCheckoutChargeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: SellingPlanCheckoutChargeValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
