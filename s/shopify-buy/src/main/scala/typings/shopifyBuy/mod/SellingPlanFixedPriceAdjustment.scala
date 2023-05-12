package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SellingPlanFixedPriceAdjustment
  extends StObject
     with SellingPlanPriceAdjustmentValue {
  
  var price: MoneyV2
}
object SellingPlanFixedPriceAdjustment {
  
  inline def apply(price: MoneyV2): SellingPlanFixedPriceAdjustment = {
    val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any])
    __obj.asInstanceOf[SellingPlanFixedPriceAdjustment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SellingPlanFixedPriceAdjustment] (val x: Self) extends AnyVal {
    
    inline def setPrice(value: MoneyV2): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
  }
}
