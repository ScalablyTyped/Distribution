package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.shopifyBuy.mod.MoneyV2
  - typings.shopifyBuy.mod.PricingPercentageValue
*/
trait PricingValue extends StObject
object PricingValue {
  
  inline def MoneyV2(amount: Double, currencyCode: CurrencyCode): typings.shopifyBuy.mod.MoneyV2 = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currencyCode = currencyCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.shopifyBuy.mod.MoneyV2]
  }
  
  inline def PricingPercentageValue(percentage: Double): typings.shopifyBuy.mod.PricingPercentageValue = {
    val __obj = js.Dynamic.literal(percentage = percentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.shopifyBuy.mod.PricingPercentageValue]
  }
}
