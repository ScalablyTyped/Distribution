package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePassiveSellOffer extends BaseOptions {
  
  var amount: String = js.native
  
  var buying: Asset = js.native
  
  var price: Double | String | js.Object = js.native
  
  var selling: Asset = js.native
}
object CreatePassiveSellOffer {
  
  @scala.inline
  def apply(amount: String, buying: Asset, price: Double | String | js.Object, selling: Asset): CreatePassiveSellOffer = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePassiveSellOffer]
  }
  
  @scala.inline
  implicit class CreatePassiveSellOfferOps[Self <: CreatePassiveSellOffer] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: String): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuying(value: Asset): Self = this.set("buying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: Double | String | js.Object): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelling(value: Asset): Self = this.set("selling", value.asInstanceOf[js.Any])
  }
}
