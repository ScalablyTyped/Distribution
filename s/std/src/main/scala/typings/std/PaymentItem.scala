package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentItem extends StObject {
  
  var amount: PaymentCurrencyAmount
  
  var label: java.lang.String
  
  var pending: js.UndefOr[scala.Boolean] = js.undefined
}
object PaymentItem {
  
  @scala.inline
  def apply(amount: PaymentCurrencyAmount, label: java.lang.String): PaymentItem = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentItem]
  }
  
  @scala.inline
  implicit class PaymentItemMutableBuilder[Self <: PaymentItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: PaymentCurrencyAmount): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: java.lang.String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPending(value: scala.Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
  }
}
