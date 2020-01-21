package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.Asset
import typings.stellarBase.mod.OperationType.CreatePassiveSellOffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePassiveSellOffer_ extends BaseOperation[CreatePassiveSellOffer] {
  var amount: String
  var buying: Asset
  var price: String
  var selling: Asset
}

object CreatePassiveSellOffer_ {
  @scala.inline
  def apply(
    amount: String,
    buying: Asset,
    price: String,
    selling: Asset,
    `type`: CreatePassiveSellOffer,
    source: String = null
  ): CreatePassiveSellOffer_ = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePassiveSellOffer_]
  }
}

