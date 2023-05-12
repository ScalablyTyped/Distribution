package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductPriceRange extends StObject {
  
  var maxVariantPrice: MoneyV2
  
  var minVariantPrice: MoneyV2
}
object ProductPriceRange {
  
  inline def apply(maxVariantPrice: MoneyV2, minVariantPrice: MoneyV2): ProductPriceRange = {
    val __obj = js.Dynamic.literal(maxVariantPrice = maxVariantPrice.asInstanceOf[js.Any], minVariantPrice = minVariantPrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductPriceRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductPriceRange] (val x: Self) extends AnyVal {
    
    inline def setMaxVariantPrice(value: MoneyV2): Self = StObject.set(x, "maxVariantPrice", value.asInstanceOf[js.Any])
    
    inline def setMinVariantPrice(value: MoneyV2): Self = StObject.set(x, "minVariantPrice", value.asInstanceOf[js.Any])
  }
}
