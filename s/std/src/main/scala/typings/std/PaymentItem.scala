package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentItem extends StObject {
  
  /* standard dom */
  var amount: PaymentCurrencyAmount
  
  /* standard dom */
  var label: java.lang.String
  
  /* standard dom */
  var pending: js.UndefOr[scala.Boolean] = js.undefined
}
object PaymentItem {
  
  inline def apply(amount: PaymentCurrencyAmount, label: java.lang.String): PaymentItem = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentItem] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: PaymentCurrencyAmount): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: java.lang.String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setPending(value: scala.Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    inline def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
  }
}
