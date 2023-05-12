package typings.recurlyRecurlyJs.libApplePayNativeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplePayLineItem extends StObject {
  
  /**
    * A required value that’s the monetary amount of the line item.
    */
  var amount: String
  
  /**
    * A required value that’s a short, localized description of the line item.
    */
  var label: String
  
  /**
    * The time that the payment occurs as part of a successful transaction.
    */
  var paymentTiming: js.UndefOr[ApplePayPaymentTiming] = js.undefined
  
  /**
    * The date of the final payment.
    */
  var recurringPaymentEndDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The number of interval units that make up the total payment interval.
    */
  var recurringPaymentIntervalCount: js.UndefOr[Double] = js.undefined
  
  /**
    * The amount of time — in calendar units, such as day, month, or year — that represents a fraction of the total payment interval.
    */
  var recurringPaymentIntervalUnit: js.UndefOr[ApplePayRecurringPaymentDateUnit] = js.undefined
  
  /**
    * The date of the first payment.
    */
  var recurringPaymentStartDate: js.UndefOr[js.Date] = js.undefined
}
object ApplePayLineItem {
  
  inline def apply(amount: String, label: String): ApplePayLineItem = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayLineItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplePayLineItem] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setPaymentTiming(value: ApplePayPaymentTiming): Self = StObject.set(x, "paymentTiming", value.asInstanceOf[js.Any])
    
    inline def setPaymentTimingUndefined: Self = StObject.set(x, "paymentTiming", js.undefined)
    
    inline def setRecurringPaymentEndDate(value: js.Date): Self = StObject.set(x, "recurringPaymentEndDate", value.asInstanceOf[js.Any])
    
    inline def setRecurringPaymentEndDateUndefined: Self = StObject.set(x, "recurringPaymentEndDate", js.undefined)
    
    inline def setRecurringPaymentIntervalCount(value: Double): Self = StObject.set(x, "recurringPaymentIntervalCount", value.asInstanceOf[js.Any])
    
    inline def setRecurringPaymentIntervalCountUndefined: Self = StObject.set(x, "recurringPaymentIntervalCount", js.undefined)
    
    inline def setRecurringPaymentIntervalUnit(value: ApplePayRecurringPaymentDateUnit): Self = StObject.set(x, "recurringPaymentIntervalUnit", value.asInstanceOf[js.Any])
    
    inline def setRecurringPaymentIntervalUnitUndefined: Self = StObject.set(x, "recurringPaymentIntervalUnit", js.undefined)
    
    inline def setRecurringPaymentStartDate(value: js.Date): Self = StObject.set(x, "recurringPaymentStartDate", value.asInstanceOf[js.Any])
    
    inline def setRecurringPaymentStartDateUndefined: Self = StObject.set(x, "recurringPaymentStartDate", js.undefined)
  }
}
