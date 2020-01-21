package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.Asset
import typings.stellarBase.mod.OperationType.ManageBuyOffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManageBuyOffer_ extends BaseOperation[ManageBuyOffer] {
  var buyAmount: String
  var buying: Asset
  var offerId: String
  var price: String
  var selling: Asset
}

object ManageBuyOffer_ {
  @scala.inline
  def apply(
    buyAmount: String,
    buying: Asset,
    offerId: String,
    price: String,
    selling: Asset,
    `type`: ManageBuyOffer,
    source: String = null
  ): ManageBuyOffer_ = {
    val __obj = js.Dynamic.literal(buyAmount = buyAmount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], offerId = offerId.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageBuyOffer_]
  }
}

