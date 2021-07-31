package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentDetailsInit
  extends StObject
     with PaymentDetailsBase {
  
  var id: js.UndefOr[java.lang.String] = js.undefined
  
  var total: PaymentItem
}
object PaymentDetailsInit {
  
  @scala.inline
  def apply(total: PaymentItem): PaymentDetailsInit = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentDetailsInit]
  }
  
  @scala.inline
  implicit class PaymentDetailsInitMutableBuilder[Self <: PaymentDetailsInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setTotal(value: PaymentItem): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
