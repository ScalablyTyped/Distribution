package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentDetailsUpdate
  extends StObject
     with PaymentDetailsBase {
  
  var error: js.UndefOr[java.lang.String] = js.undefined
  
  var total: js.UndefOr[PaymentItem] = js.undefined
}
object PaymentDetailsUpdate {
  
  @scala.inline
  def apply(): PaymentDetailsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentDetailsUpdate]
  }
  
  @scala.inline
  implicit class PaymentDetailsUpdateMutableBuilder[Self <: PaymentDetailsUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: java.lang.String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setTotal(value: PaymentItem): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
