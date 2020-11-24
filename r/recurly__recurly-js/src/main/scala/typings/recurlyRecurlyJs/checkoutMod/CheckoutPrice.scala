package typings.recurlyRecurlyJs.checkoutMod

import typings.recurlyRecurlyJs.anon.Adjustments
import typings.recurlyRecurlyJs.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckoutPrice extends js.Object {
  
  var currency: Code = js.native
  
  var next: Adjustments = js.native
  
  var now: Adjustments = js.native
  
  var taxes: js.Array[CheckoutPricingStateTax] = js.native
}
object CheckoutPrice {
  
  @scala.inline
  def apply(currency: Code, next: Adjustments, now: Adjustments, taxes: js.Array[CheckoutPricingStateTax]): CheckoutPrice = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], taxes = taxes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckoutPrice]
  }
  
  @scala.inline
  implicit class CheckoutPriceOps[Self <: CheckoutPrice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCurrency(value: Code): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: Adjustments): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNow(value: Adjustments): Self = this.set("now", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxesVarargs(value: CheckoutPricingStateTax*): Self = this.set("taxes", js.Array(value :_*))
    
    @scala.inline
    def setTaxes(value: js.Array[CheckoutPricingStateTax]): Self = this.set("taxes", value.asInstanceOf[js.Any])
  }
}
