package typings.recurlyRecurlyJs.anon

import typings.recurlyRecurlyJs.libApplePayNativeMod.ApplePayLineItem
import typings.recurlyRecurlyJs.libApplePayNativeMod.ApplePayRecurringPaymentRequest
import typings.recurlyRecurlyJs.libApplePayNativeMod.ApplePaySelectionUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewLineItems
  extends StObject
     with ApplePaySelectionUpdate {
  
  /**
    * Updated line items for the payment request that results from the user’s selection.
    */
  var newLineItems: js.UndefOr[js.Array[ApplePayLineItem]] = js.undefined
  
  /**
    * The updated list of available shipping methods that results from the user's selection;
    */
  var newRecurringPaymentRequest: js.UndefOr[ApplePayRecurringPaymentRequest] = js.undefined
  
  /**
    * The new total that results from the user's selection.
    */
  var newTotal: js.UndefOr[ApplePayLineItem] = js.undefined
  
  /**
    * The new total cost that results from the user's selection.
    */
  var total: js.UndefOr[String] = js.undefined
}
object NewLineItems {
  
  inline def apply(): NewLineItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewLineItems]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NewLineItems] (val x: Self) extends AnyVal {
    
    inline def setNewLineItems(value: js.Array[ApplePayLineItem]): Self = StObject.set(x, "newLineItems", value.asInstanceOf[js.Any])
    
    inline def setNewLineItemsUndefined: Self = StObject.set(x, "newLineItems", js.undefined)
    
    inline def setNewLineItemsVarargs(value: ApplePayLineItem*): Self = StObject.set(x, "newLineItems", js.Array(value*))
    
    inline def setNewRecurringPaymentRequest(value: ApplePayRecurringPaymentRequest): Self = StObject.set(x, "newRecurringPaymentRequest", value.asInstanceOf[js.Any])
    
    inline def setNewRecurringPaymentRequestUndefined: Self = StObject.set(x, "newRecurringPaymentRequest", js.undefined)
    
    inline def setNewTotal(value: ApplePayLineItem): Self = StObject.set(x, "newTotal", value.asInstanceOf[js.Any])
    
    inline def setNewTotalUndefined: Self = StObject.set(x, "newTotal", js.undefined)
    
    inline def setTotal(value: String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
