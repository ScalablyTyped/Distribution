package typings.stellarDashBase.stellarDashBaseMod.OperationOptions

import typings.stellarDashBase.stellarDashBaseMod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePassiveSellOffer extends BaseOptions {
  var amount: String
  var buying: Asset
  var price: Double | String | js.Object
  var selling: Asset
}

object CreatePassiveSellOffer {
  @scala.inline
  def apply(
    amount: String,
    buying: Asset,
    price: Double | String | js.Object,
    selling: Asset,
    source: String = null
  ): CreatePassiveSellOffer = {
    val __obj = js.Dynamic.literal(amount = amount, buying = buying, price = price.asInstanceOf[js.Any], selling = selling)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[CreatePassiveSellOffer]
  }
}

