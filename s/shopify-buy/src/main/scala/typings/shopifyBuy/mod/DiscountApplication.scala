package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscountApplication extends StObject {
  
  var allocationMethod: DiscountApplicationAllocationMethod
  
  var targetSelection: DiscountApplicationTargetSelection
  
  var targetType: DiscountApplicationTargetType
  
  var value: PricingValue
}
object DiscountApplication {
  
  inline def apply(
    allocationMethod: DiscountApplicationAllocationMethod,
    targetSelection: DiscountApplicationTargetSelection,
    targetType: DiscountApplicationTargetType,
    value: PricingValue
  ): DiscountApplication = {
    val __obj = js.Dynamic.literal(allocationMethod = allocationMethod.asInstanceOf[js.Any], targetSelection = targetSelection.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscountApplication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiscountApplication] (val x: Self) extends AnyVal {
    
    inline def setAllocationMethod(value: DiscountApplicationAllocationMethod): Self = StObject.set(x, "allocationMethod", value.asInstanceOf[js.Any])
    
    inline def setTargetSelection(value: DiscountApplicationTargetSelection): Self = StObject.set(x, "targetSelection", value.asInstanceOf[js.Any])
    
    inline def setTargetType(value: DiscountApplicationTargetType): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
    
    inline def setValue(value: PricingValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
