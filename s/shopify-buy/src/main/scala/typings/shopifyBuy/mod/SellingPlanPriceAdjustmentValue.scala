package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.shopifyBuy.mod.SellingPlanFixedAmountPriceAdjustment
  - typings.shopifyBuy.mod.SellingPlanFixedPriceAdjustment
  - typings.shopifyBuy.mod.SellingPlanPercentagePriceAdjustment
*/
trait SellingPlanPriceAdjustmentValue extends StObject
object SellingPlanPriceAdjustmentValue {
  
  inline def SellingPlanFixedAmountPriceAdjustment(adjustmentAmount: MoneyV2): typings.shopifyBuy.mod.SellingPlanFixedAmountPriceAdjustment = {
    val __obj = js.Dynamic.literal(adjustmentAmount = adjustmentAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.shopifyBuy.mod.SellingPlanFixedAmountPriceAdjustment]
  }
  
  inline def SellingPlanFixedPriceAdjustment(price: MoneyV2): typings.shopifyBuy.mod.SellingPlanFixedPriceAdjustment = {
    val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.shopifyBuy.mod.SellingPlanFixedPriceAdjustment]
  }
  
  inline def SellingPlanPercentagePriceAdjustment(adjustmentPercentage: Double): typings.shopifyBuy.mod.SellingPlanPercentagePriceAdjustment = {
    val __obj = js.Dynamic.literal(adjustmentPercentage = adjustmentPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.shopifyBuy.mod.SellingPlanPercentagePriceAdjustment]
  }
}
