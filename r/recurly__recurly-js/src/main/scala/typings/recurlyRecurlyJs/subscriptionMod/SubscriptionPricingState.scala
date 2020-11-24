package typings.recurlyRecurlyJs.subscriptionMod

import typings.recurlyRecurlyJs.anon.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionPricingState extends js.Object {
  
  var price: Base = js.native
}
object SubscriptionPricingState {
  
  @scala.inline
  def apply(price: Base): SubscriptionPricingState = {
    val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionPricingState]
  }
  
  @scala.inline
  implicit class SubscriptionPricingStateOps[Self <: SubscriptionPricingState] (val x: Self) extends AnyVal {
    
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
    def setPrice(value: Base): Self = this.set("price", value.asInstanceOf[js.Any])
  }
}
