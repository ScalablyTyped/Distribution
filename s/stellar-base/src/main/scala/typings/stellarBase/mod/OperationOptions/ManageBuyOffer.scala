package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManageBuyOffer extends BaseOptions {
  var buyAmount: String = js.native
  var buying: Asset = js.native
  var offerId: js.UndefOr[Double | String] = js.native
  var price: Double | String | js.Object = js.native
  var selling: Asset = js.native
}

object ManageBuyOffer {
  @scala.inline
  def apply(buyAmount: String, buying: Asset, price: Double | String | js.Object, selling: Asset): ManageBuyOffer = {
    val __obj = js.Dynamic.literal(buyAmount = buyAmount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageBuyOffer]
  }
  @scala.inline
  implicit class ManageBuyOfferOps[Self <: ManageBuyOffer] (val x: Self) extends AnyVal {
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
    def setPrice(value: Double | String | js.Object): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelling(value: Asset): Self = this.set("selling", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfferId(value: Double | String): Self = this.set("offerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferId: Self = this.set("offerId", js.undefined)
  }
  
}

