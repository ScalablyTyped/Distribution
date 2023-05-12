package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PricingPercentageValue
  extends StObject
     with PricingValue {
  
  var percentage: Double
}
object PricingPercentageValue {
  
  inline def apply(percentage: Double): PricingPercentageValue = {
    val __obj = js.Dynamic.literal(percentage = percentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PricingPercentageValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PricingPercentageValue] (val x: Self) extends AnyVal {
    
    inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
  }
}
