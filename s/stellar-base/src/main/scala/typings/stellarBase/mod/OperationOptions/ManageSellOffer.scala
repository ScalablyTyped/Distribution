package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManageSellOffer extends CreatePassiveSellOffer {
  var offerId: js.UndefOr[Double | String] = js.native
}

object ManageSellOffer {
  @scala.inline
  def apply(amount: String, buying: Asset, price: Double | String | js.Object, selling: Asset): ManageSellOffer = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageSellOffer]
  }
  @scala.inline
  implicit class ManageSellOfferOps[Self <: ManageSellOffer] (val x: Self) extends AnyVal {
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
    def setOfferId(value: Double | String): Self = this.set("offerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferId: Self = this.set("offerId", js.undefined)
  }
  
}

