package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutomaticDiscountApplication
  extends StObject
     with DiscountApplication {
  
  var title: String
}
object AutomaticDiscountApplication {
  
  inline def apply(
    allocationMethod: DiscountApplicationAllocationMethod,
    targetSelection: DiscountApplicationTargetSelection,
    targetType: DiscountApplicationTargetType,
    title: String,
    value: PricingValue
  ): AutomaticDiscountApplication = {
    val __obj = js.Dynamic.literal(allocationMethod = allocationMethod.asInstanceOf[js.Any], targetSelection = targetSelection.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomaticDiscountApplication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutomaticDiscountApplication] (val x: Self) extends AnyVal {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
