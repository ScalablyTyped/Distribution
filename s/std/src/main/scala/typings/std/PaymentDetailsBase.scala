package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentDetailsBase extends StObject {
  
  /* standard dom */
  var displayItems: js.UndefOr[js.Array[PaymentItem]] = js.undefined
  
  /* standard dom */
  var modifiers: js.UndefOr[js.Array[PaymentDetailsModifier]] = js.undefined
}
object PaymentDetailsBase {
  
  inline def apply(): PaymentDetailsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentDetailsBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentDetailsBase] (val x: Self) extends AnyVal {
    
    inline def setDisplayItems(value: js.Array[PaymentItem]): Self = StObject.set(x, "displayItems", value.asInstanceOf[js.Any])
    
    inline def setDisplayItemsUndefined: Self = StObject.set(x, "displayItems", js.undefined)
    
    inline def setDisplayItemsVarargs(value: PaymentItem*): Self = StObject.set(x, "displayItems", js.Array(value*))
    
    inline def setModifiers(value: js.Array[PaymentDetailsModifier]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setModifiersVarargs(value: PaymentDetailsModifier*): Self = StObject.set(x, "modifiers", js.Array(value*))
  }
}
