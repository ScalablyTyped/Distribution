package typings.recurlyRecurlyJs.subscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionPricingStateTax extends js.Object {
  
  var rate: String = js.native
  
  var region: String = js.native
  
  var tax_type: String = js.native
}
object SubscriptionPricingStateTax {
  
  @scala.inline
  def apply(rate: String, region: String, tax_type: String): SubscriptionPricingStateTax = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], tax_type = tax_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionPricingStateTax]
  }
  
  @scala.inline
  implicit class SubscriptionPricingStateTaxOps[Self <: SubscriptionPricingStateTax] (val x: Self) extends AnyVal {
    
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
    def setRate(value: String): Self = this.set("rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTax_type(value: String): Self = this.set("tax_type", value.asInstanceOf[js.Any])
  }
}
