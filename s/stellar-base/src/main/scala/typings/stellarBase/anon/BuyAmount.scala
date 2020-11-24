package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.Int64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuyAmount extends js.Object {
  
  var buyAmount: Int64 = js.native
  
  var buying: typings.stellarBase.xdrMod.xdr.Asset = js.native
  
  var offerId: Int64 = js.native
  
  var price: typings.stellarBase.xdrMod.xdr.Price = js.native
  
  var selling: typings.stellarBase.xdrMod.xdr.Asset = js.native
}
object BuyAmount {
  
  @scala.inline
  def apply(
    buyAmount: Int64,
    buying: typings.stellarBase.xdrMod.xdr.Asset,
    offerId: Int64,
    price: typings.stellarBase.xdrMod.xdr.Price,
    selling: typings.stellarBase.xdrMod.xdr.Asset
  ): BuyAmount = {
    val __obj = js.Dynamic.literal(buyAmount = buyAmount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], offerId = offerId.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuyAmount]
  }
  
  @scala.inline
  implicit class BuyAmountOps[Self <: BuyAmount] (val x: Self) extends AnyVal {
    
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
    def setBuyAmount(value: Int64): Self = this.set("buyAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuying(value: typings.stellarBase.xdrMod.xdr.Asset): Self = this.set("buying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferId(value: Int64): Self = this.set("offerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: typings.stellarBase.xdrMod.xdr.Price): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelling(value: typings.stellarBase.xdrMod.xdr.Asset): Self = this.set("selling", value.asInstanceOf[js.Any])
  }
}
