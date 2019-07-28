package typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs

import typings.stellarDashBase.stellarDashBaseMod.Asset
import typings.stellarDashBase.stellarDashBaseMod._OperationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePassiveOffer
  extends BaseOptions
     with _OperationOptions {
  var amount: String
  var buying: Asset
  var price: Double | String | js.Object
  var selling: Asset
}

object CreatePassiveOffer {
  @scala.inline
  def apply(
    amount: String,
    buying: Asset,
    price: Double | String | js.Object,
    selling: Asset,
    source: String = null
  ): CreatePassiveOffer = {
    val __obj = js.Dynamic.literal(amount = amount, buying = buying, price = price.asInstanceOf[js.Any], selling = selling)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[CreatePassiveOffer]
  }
}

