package typings.shippo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomsInvoicedCharges extends StObject {
  
  var currency: String
  
  var other_fees: js.UndefOr[/* template literal string: ${number} */ String] = js.undefined
  
  var total_duties: js.UndefOr[/* template literal string: ${number} */ String] = js.undefined
  
  var total_shipping: js.UndefOr[/* template literal string: ${number} */ String] = js.undefined
  
  var total_taxes: js.UndefOr[/* template literal string: ${number} */ String] = js.undefined
}
object CustomsInvoicedCharges {
  
  inline def apply(currency: String): CustomsInvoicedCharges = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomsInvoicedCharges]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomsInvoicedCharges] (val x: Self) extends AnyVal {
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setOther_fees(value: /* template literal string: ${number} */ String): Self = StObject.set(x, "other_fees", value.asInstanceOf[js.Any])
    
    inline def setOther_feesUndefined: Self = StObject.set(x, "other_fees", js.undefined)
    
    inline def setTotal_duties(value: /* template literal string: ${number} */ String): Self = StObject.set(x, "total_duties", value.asInstanceOf[js.Any])
    
    inline def setTotal_dutiesUndefined: Self = StObject.set(x, "total_duties", js.undefined)
    
    inline def setTotal_shipping(value: /* template literal string: ${number} */ String): Self = StObject.set(x, "total_shipping", value.asInstanceOf[js.Any])
    
    inline def setTotal_shippingUndefined: Self = StObject.set(x, "total_shipping", js.undefined)
    
    inline def setTotal_taxes(value: /* template literal string: ${number} */ String): Self = StObject.set(x, "total_taxes", value.asInstanceOf[js.Any])
    
    inline def setTotal_taxesUndefined: Self = StObject.set(x, "total_taxes", js.undefined)
  }
}
