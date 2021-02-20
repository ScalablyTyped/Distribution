package typings.shopifyBuy.ShopifyBuy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineItemToAdd extends StObject {
  
  var customAttributes: js.UndefOr[js.Array[CustomAttribute]] = js.native
  
  var quantity: Double = js.native
  
  var variantId: String | Double = js.native
}
object LineItemToAdd {
  
  @scala.inline
  def apply(quantity: Double, variantId: String | Double): LineItemToAdd = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any], variantId = variantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineItemToAdd]
  }
  
  @scala.inline
  implicit class LineItemToAddMutableBuilder[Self <: LineItemToAdd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomAttributes(value: js.Array[CustomAttribute]): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAttributesUndefined: Self = StObject.set(x, "customAttributes", js.undefined)
    
    @scala.inline
    def setCustomAttributesVarargs(value: CustomAttribute*): Self = StObject.set(x, "customAttributes", js.Array(value :_*))
    
    @scala.inline
    def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantId(value: String | Double): Self = StObject.set(x, "variantId", value.asInstanceOf[js.Any])
  }
}
