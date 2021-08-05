package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentDetailsBase extends StObject {
  
  var displayItems: js.UndefOr[js.Array[PaymentItem]] = js.undefined
  
  var modifiers: js.UndefOr[js.Array[PaymentDetailsModifier]] = js.undefined
  
  var shippingOptions: js.UndefOr[js.Array[PaymentShippingOption]] = js.undefined
}
object PaymentDetailsBase {
  
  inline def apply(): PaymentDetailsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentDetailsBase]
  }
  
  extension [Self <: PaymentDetailsBase](x: Self) {
    
    inline def setDisplayItems(value: js.Array[PaymentItem]): Self = StObject.set(x, "displayItems", value.asInstanceOf[js.Any])
    
    inline def setDisplayItemsUndefined: Self = StObject.set(x, "displayItems", js.undefined)
    
    inline def setDisplayItemsVarargs(value: PaymentItem*): Self = StObject.set(x, "displayItems", js.Array(value :_*))
    
    inline def setModifiers(value: js.Array[PaymentDetailsModifier]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setModifiersVarargs(value: PaymentDetailsModifier*): Self = StObject.set(x, "modifiers", js.Array(value :_*))
    
    inline def setShippingOptions(value: js.Array[PaymentShippingOption]): Self = StObject.set(x, "shippingOptions", value.asInstanceOf[js.Any])
    
    inline def setShippingOptionsUndefined: Self = StObject.set(x, "shippingOptions", js.undefined)
    
    inline def setShippingOptionsVarargs(value: PaymentShippingOption*): Self = StObject.set(x, "shippingOptions", js.Array(value :_*))
  }
}
