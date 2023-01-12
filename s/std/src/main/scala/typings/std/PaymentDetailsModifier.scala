package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentDetailsModifier extends StObject {
  
  /* standard dom */
  var additionalDisplayItems: js.UndefOr[js.Array[PaymentItem]] = js.undefined
  
  /* standard dom */
  var data: js.UndefOr[Any] = js.undefined
  
  /* standard dom */
  var supportedMethods: java.lang.String
  
  /* standard dom */
  var total: js.UndefOr[PaymentItem] = js.undefined
}
object PaymentDetailsModifier {
  
  inline def apply(supportedMethods: java.lang.String): PaymentDetailsModifier = {
    val __obj = js.Dynamic.literal(supportedMethods = supportedMethods.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentDetailsModifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentDetailsModifier] (val x: Self) extends AnyVal {
    
    inline def setAdditionalDisplayItems(value: js.Array[PaymentItem]): Self = StObject.set(x, "additionalDisplayItems", value.asInstanceOf[js.Any])
    
    inline def setAdditionalDisplayItemsUndefined: Self = StObject.set(x, "additionalDisplayItems", js.undefined)
    
    inline def setAdditionalDisplayItemsVarargs(value: PaymentItem*): Self = StObject.set(x, "additionalDisplayItems", js.Array(value*))
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setSupportedMethods(value: java.lang.String): Self = StObject.set(x, "supportedMethods", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: PaymentItem): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
