package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManualDiscountApplication
  extends StObject
     with DiscountApplication {
  
  var description: js.UndefOr[String] = js.undefined
  
  var title: String
}
object ManualDiscountApplication {
  
  inline def apply(
    allocationMethod: DiscountApplicationAllocationMethod,
    targetSelection: DiscountApplicationTargetSelection,
    targetType: DiscountApplicationTargetType,
    title: String,
    value: PricingValue
  ): ManualDiscountApplication = {
    val __obj = js.Dynamic.literal(allocationMethod = allocationMethod.asInstanceOf[js.Any], targetSelection = targetSelection.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManualDiscountApplication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManualDiscountApplication] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
