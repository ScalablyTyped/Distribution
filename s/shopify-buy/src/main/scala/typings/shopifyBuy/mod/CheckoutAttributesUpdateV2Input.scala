package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckoutAttributesUpdateV2Input extends StObject {
  
  var allowPartialAddresses: js.UndefOr[Boolean] = js.undefined
  
  var customAttributes: js.UndefOr[js.Array[AttributeInput]] = js.undefined
  
  var note: js.UndefOr[String] = js.undefined
}
object CheckoutAttributesUpdateV2Input {
  
  inline def apply(): CheckoutAttributesUpdateV2Input = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckoutAttributesUpdateV2Input]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckoutAttributesUpdateV2Input] (val x: Self) extends AnyVal {
    
    inline def setAllowPartialAddresses(value: Boolean): Self = StObject.set(x, "allowPartialAddresses", value.asInstanceOf[js.Any])
    
    inline def setAllowPartialAddressesUndefined: Self = StObject.set(x, "allowPartialAddresses", js.undefined)
    
    inline def setCustomAttributes(value: js.Array[AttributeInput]): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributesUndefined: Self = StObject.set(x, "customAttributes", js.undefined)
    
    inline def setCustomAttributesVarargs(value: AttributeInput*): Self = StObject.set(x, "customAttributes", js.Array(value*))
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
  }
}
