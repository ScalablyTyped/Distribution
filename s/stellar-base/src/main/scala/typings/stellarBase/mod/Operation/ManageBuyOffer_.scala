package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.Asset
import typings.stellarBase.mod.OperationType.ManageBuyOffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManageBuyOffer_ extends BaseOperation[ManageBuyOffer] {
  var buyAmount: String = js.native
  var buying: Asset = js.native
  var offerId: String = js.native
  var price: String = js.native
  var selling: Asset = js.native
}

object ManageBuyOffer_ {
  @scala.inline
  def apply(
    buyAmount: String,
    buying: Asset,
    offerId: String,
    price: String,
    selling: Asset,
    `type`: ManageBuyOffer
  ): ManageBuyOffer_ = {
    val __obj = js.Dynamic.literal(buyAmount = buyAmount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], offerId = offerId.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageBuyOffer_]
  }
  @scala.inline
  implicit class ManageBuyOffer_Ops[Self <: ManageBuyOffer_] (val x: Self) extends AnyVal {
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
    def setBuyAmount(value: String): Self = this.set("buyAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuying(value: Asset): Self = this.set("buying", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfferId(value: String): Self = this.set("offerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrice(value: String): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelling(value: Asset): Self = this.set("selling", value.asInstanceOf[js.Any])
  }
  
}

