package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.Asset
import typings.stellarBase.mod.OperationType.CreatePassiveSellOffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePassiveSellOffer_ extends BaseOperation[CreatePassiveSellOffer] {
  var amount: String = js.native
  var buying: Asset = js.native
  var price: String = js.native
  var selling: Asset = js.native
}

object CreatePassiveSellOffer_ {
  @scala.inline
  def apply(amount: String, buying: Asset, price: String, selling: Asset, `type`: CreatePassiveSellOffer): CreatePassiveSellOffer_ = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePassiveSellOffer_]
  }
  @scala.inline
  implicit class CreatePassiveSellOffer_Ops[Self <: CreatePassiveSellOffer_] (val x: Self) extends AnyVal {
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
    def setPrice(value: String): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelling(value: Asset): Self = this.set("selling", value.asInstanceOf[js.Any])
  }
  
}

