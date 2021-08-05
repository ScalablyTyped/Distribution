package typings.shopifyBuy.ShopifyBuy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  var quantity: Double
  
  var variant: ProductVariant
}
object Item {
  
  inline def apply(quantity: Double, variant: ProductVariant): Item = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  extension [Self <: Item](x: Self) {
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setVariant(value: ProductVariant): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
  }
}
