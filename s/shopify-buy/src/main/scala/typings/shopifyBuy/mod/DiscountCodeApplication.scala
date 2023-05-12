package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscountCodeApplication
  extends StObject
     with DiscountApplication {
  
  var applicable: Boolean
  
  var code: String
}
object DiscountCodeApplication {
  
  inline def apply(
    allocationMethod: DiscountApplicationAllocationMethod,
    applicable: Boolean,
    code: String,
    targetSelection: DiscountApplicationTargetSelection,
    targetType: DiscountApplicationTargetType,
    value: PricingValue
  ): DiscountCodeApplication = {
    val __obj = js.Dynamic.literal(allocationMethod = allocationMethod.asInstanceOf[js.Any], applicable = applicable.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], targetSelection = targetSelection.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscountCodeApplication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiscountCodeApplication] (val x: Self) extends AnyVal {
    
    inline def setApplicable(value: Boolean): Self = StObject.set(x, "applicable", value.asInstanceOf[js.Any])
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
