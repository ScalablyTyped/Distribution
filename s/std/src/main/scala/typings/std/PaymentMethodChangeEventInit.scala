package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentMethodChangeEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var methodDetails: js.UndefOr[Any] = js.undefined
  
  /* standard dom */
  var methodName: js.UndefOr[java.lang.String] = js.undefined
}
object PaymentMethodChangeEventInit {
  
  inline def apply(): PaymentMethodChangeEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentMethodChangeEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentMethodChangeEventInit] (val x: Self) extends AnyVal {
    
    inline def setMethodDetails(value: Any): Self = StObject.set(x, "methodDetails", value.asInstanceOf[js.Any])
    
    inline def setMethodDetailsUndefined: Self = StObject.set(x, "methodDetails", js.undefined)
    
    inline def setMethodName(value: java.lang.String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    
    inline def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
  }
}
