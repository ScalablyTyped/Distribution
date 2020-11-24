package typings.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeInput extends js.Object {
  
  var id: js.UndefOr[String | Double] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var quantity: js.UndefOr[Double] = js.native
  
  var value: js.UndefOr[String] = js.native
  
  var variantId: js.UndefOr[String] = js.native
}
object AttributeInput {
  
  @scala.inline
  def apply(): AttributeInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeInput]
  }
  
  @scala.inline
  implicit class AttributeInputOps[Self <: AttributeInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setVariantId(value: String): Self = this.set("variantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariantId: Self = this.set("variantId", js.undefined)
  }
}
