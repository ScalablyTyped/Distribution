package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentDetailsModifier extends StObject {
  
  var additionalDisplayItems: js.UndefOr[js.Array[PaymentItem]] = js.undefined
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var supportedMethods: java.lang.String | js.Array[java.lang.String]
  
  var total: js.UndefOr[PaymentItem] = js.undefined
}
object PaymentDetailsModifier {
  
  inline def apply(supportedMethods: java.lang.String | js.Array[java.lang.String]): PaymentDetailsModifier = {
    val __obj = js.Dynamic.literal(supportedMethods = supportedMethods.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentDetailsModifier]
  }
  
  extension [Self <: PaymentDetailsModifier](x: Self) {
    
    inline def setAdditionalDisplayItems(value: js.Array[PaymentItem]): Self = StObject.set(x, "additionalDisplayItems", value.asInstanceOf[js.Any])
    
    inline def setAdditionalDisplayItemsUndefined: Self = StObject.set(x, "additionalDisplayItems", js.undefined)
    
    inline def setAdditionalDisplayItemsVarargs(value: PaymentItem*): Self = StObject.set(x, "additionalDisplayItems", js.Array(value :_*))
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setSupportedMethods(value: java.lang.String | js.Array[java.lang.String]): Self = StObject.set(x, "supportedMethods", value.asInstanceOf[js.Any])
    
    inline def setSupportedMethodsVarargs(value: java.lang.String*): Self = StObject.set(x, "supportedMethods", js.Array(value :_*))
    
    inline def setTotal(value: PaymentItem): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
