package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManageBuyOffer extends BaseOptions {
  var buyAmount: String
  var buying: Asset
  var offerId: js.UndefOr[Double | String] = js.undefined
  var price: Double | String | js.Object
  var selling: Asset
}

object ManageBuyOffer {
  @scala.inline
  def apply(
    buyAmount: String,
    buying: Asset,
    price: Double | String | js.Object,
    selling: Asset,
    offerId: Double | String = null,
    source: String = null
  ): ManageBuyOffer = {
    val __obj = js.Dynamic.literal(buyAmount = buyAmount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    if (offerId != null) __obj.updateDynamic("offerId")(offerId.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageBuyOffer]
  }
}

