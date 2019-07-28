package typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs

import typings.stellarDashBase.stellarDashBaseMod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.stellarDashBase.stellarDashBaseMod._OperationOptions because Already inherited */ trait ManageOffer extends CreatePassiveOffer {
  var offerId: js.UndefOr[Double | String] = js.undefined
}

object ManageOffer {
  @scala.inline
  def apply(
    amount: String,
    buying: Asset,
    price: Double | String | js.Object,
    selling: Asset,
    offerId: Double | String = null,
    source: String = null
  ): ManageOffer = {
    val __obj = js.Dynamic.literal(amount = amount, buying = buying, price = price.asInstanceOf[js.Any], selling = selling)
    if (offerId != null) __obj.updateDynamic("offerId")(offerId.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[ManageOffer]
  }
}

