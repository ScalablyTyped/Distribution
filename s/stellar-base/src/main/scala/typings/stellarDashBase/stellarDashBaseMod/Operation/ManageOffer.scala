package typings.stellarDashBase.stellarDashBaseMod.Operation

import typings.stellarDashBase.stellarDashBaseMod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManageOffer
  extends BaseOperation[typings.stellarDashBase.stellarDashBaseMod.OperationType.ManageOffer] {
  var amount: String
  var buying: Asset
  var offerId: String
  var price: String
  var selling: Asset
}

object ManageOffer {
  @scala.inline
  def apply(
    amount: String,
    buying: Asset,
    offerId: String,
    price: String,
    selling: Asset,
    `type`: typings.stellarDashBase.stellarDashBaseMod.OperationType.ManageOffer,
    source: String = null
  ): ManageOffer = {
    val __obj = js.Dynamic.literal(amount = amount, buying = buying, offerId = offerId, price = price, selling = selling)
    __obj.updateDynamic("type")(`type`)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[ManageOffer]
  }
}

@JSImport("stellar-base", "Operation.manageOffer")
@js.native
object manageOffer extends js.Object {
  def apply(options: typings.stellarDashBase.stellarDashBaseMod.OperationOptions.ManageOffer): typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[ManageOffer] = js.native
}

