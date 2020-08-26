package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.Int64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Price extends js.Object {
  var amount: Int64 = js.native
  var buying: typings.stellarBase.xdrMod.xdr.Asset = js.native
  var price: typings.stellarBase.xdrMod.xdr.Price = js.native
  var selling: typings.stellarBase.xdrMod.xdr.Asset = js.native
}

object Price {
  @scala.inline
  def apply(
    amount: Int64,
    buying: typings.stellarBase.xdrMod.xdr.Asset,
    price: typings.stellarBase.xdrMod.xdr.Price,
    selling: typings.stellarBase.xdrMod.xdr.Asset
  ): Price = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.asInstanceOf[Price]
  }
  @scala.inline
  implicit class PriceOps[Self <: Price] (val x: Self) extends AnyVal {
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
    def setAmount(value: Int64): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuying(value: typings.stellarBase.xdrMod.xdr.Asset): Self = this.set("buying", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrice(value: typings.stellarBase.xdrMod.xdr.Price): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelling(value: typings.stellarBase.xdrMod.xdr.Asset): Self = this.set("selling", value.asInstanceOf[js.Any])
  }
  
}

