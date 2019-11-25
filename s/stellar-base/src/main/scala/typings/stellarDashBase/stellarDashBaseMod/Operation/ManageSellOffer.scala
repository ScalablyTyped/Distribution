package typings.stellarDashBase.stellarDashBaseMod.Operation

import typings.stellarDashBase.stellarDashBaseMod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManageSellOffer
  extends BaseOperation[typings.stellarDashBase.stellarDashBaseMod.OperationType.ManageSellOffer] {
  var amount: String
  var buying: Asset
  var offerId: String
  var price: String
  var selling: Asset
}

object ManageSellOffer {
  @scala.inline
  def apply(
    amount: String,
    buying: Asset,
    offerId: String,
    price: String,
    selling: Asset,
    `type`: typings.stellarDashBase.stellarDashBaseMod.OperationType.ManageSellOffer,
    source: String = null
  ): ManageSellOffer = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], offerId = offerId.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageSellOffer]
  }
}

@JSImport("stellar-base", "Operation.manageSellOffer")
@js.native
object manageSellOffer extends js.Object {
  def apply(options: typings.stellarDashBase.stellarDashBaseMod.OperationOptions.ManageSellOffer): typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[ManageSellOffer] = js.native
}

