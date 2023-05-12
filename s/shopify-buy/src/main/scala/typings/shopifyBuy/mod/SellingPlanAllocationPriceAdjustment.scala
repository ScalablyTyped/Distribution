package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SellingPlanAllocationPriceAdjustment extends StObject {
  
  var compareAtPrice: MoneyV2
  
  var perDeliveryPrice: MoneyV2
  
  var price: MoneyV2
  
  var unitPrice: js.UndefOr[MoneyV2] = js.undefined
}
object SellingPlanAllocationPriceAdjustment {
  
  inline def apply(compareAtPrice: MoneyV2, perDeliveryPrice: MoneyV2, price: MoneyV2): SellingPlanAllocationPriceAdjustment = {
    val __obj = js.Dynamic.literal(compareAtPrice = compareAtPrice.asInstanceOf[js.Any], perDeliveryPrice = perDeliveryPrice.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any])
    __obj.asInstanceOf[SellingPlanAllocationPriceAdjustment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SellingPlanAllocationPriceAdjustment] (val x: Self) extends AnyVal {
    
    inline def setCompareAtPrice(value: MoneyV2): Self = StObject.set(x, "compareAtPrice", value.asInstanceOf[js.Any])
    
    inline def setPerDeliveryPrice(value: MoneyV2): Self = StObject.set(x, "perDeliveryPrice", value.asInstanceOf[js.Any])
    
    inline def setPrice(value: MoneyV2): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setUnitPrice(value: MoneyV2): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    inline def setUnitPriceUndefined: Self = StObject.set(x, "unitPrice", js.undefined)
  }
}
