package typings.stellarDashBase.stellarDashBaseMod.Operation

import typings.stellarDashBase.stellarDashBaseMod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePassiveSellOffer
  extends BaseOperation[typings.stellarDashBase.stellarDashBaseMod.OperationType.CreatePassiveSellOffer] {
  var amount: String
  var buying: Asset
  var price: String
  var selling: Asset
}

object CreatePassiveSellOffer {
  @scala.inline
  def apply(
    amount: String,
    buying: Asset,
    price: String,
    selling: Asset,
    `type`: typings.stellarDashBase.stellarDashBaseMod.OperationType.CreatePassiveSellOffer,
    source: String = null
  ): CreatePassiveSellOffer = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePassiveSellOffer]
  }
}

@JSImport("stellar-base", "Operation.createPassiveSellOffer")
@js.native
object createPassiveSellOffer extends js.Object {
  def apply(options: typings.stellarDashBase.stellarDashBaseMod.OperationOptions.CreatePassiveSellOffer): typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[CreatePassiveSellOffer] = js.native
}

