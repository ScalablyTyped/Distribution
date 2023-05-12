package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CartInput extends StObject {
  
  var attributes: js.UndefOr[js.Array[AttributeInput]] = js.undefined
  
  var buyerIdentity: js.UndefOr[CartBuyerIdentityInput] = js.undefined
  
  var discountCodes: js.UndefOr[js.Array[String]] = js.undefined
  
  var lines: js.UndefOr[js.Array[CartLineInput]] = js.undefined
  
  var note: js.UndefOr[String] = js.undefined
}
object CartInput {
  
  inline def apply(): CartInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CartInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CartInput] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: js.Array[AttributeInput]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: AttributeInput*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setBuyerIdentity(value: CartBuyerIdentityInput): Self = StObject.set(x, "buyerIdentity", value.asInstanceOf[js.Any])
    
    inline def setBuyerIdentityUndefined: Self = StObject.set(x, "buyerIdentity", js.undefined)
    
    inline def setDiscountCodes(value: js.Array[String]): Self = StObject.set(x, "discountCodes", value.asInstanceOf[js.Any])
    
    inline def setDiscountCodesUndefined: Self = StObject.set(x, "discountCodes", js.undefined)
    
    inline def setDiscountCodesVarargs(value: String*): Self = StObject.set(x, "discountCodes", js.Array(value*))
    
    inline def setLines(value: js.Array[CartLineInput]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    inline def setLinesVarargs(value: CartLineInput*): Self = StObject.set(x, "lines", js.Array(value*))
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
  }
}
