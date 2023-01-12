package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentMethodData extends StObject {
  
  /* standard dom */
  var data: js.UndefOr[Any] = js.undefined
  
  /* standard dom */
  var supportedMethods: java.lang.String
}
object PaymentMethodData {
  
  inline def apply(supportedMethods: java.lang.String): PaymentMethodData = {
    val __obj = js.Dynamic.literal(supportedMethods = supportedMethods.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentMethodData] (val x: Self) extends AnyVal {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setSupportedMethods(value: java.lang.String): Self = StObject.set(x, "supportedMethods", value.asInstanceOf[js.Any])
  }
}
