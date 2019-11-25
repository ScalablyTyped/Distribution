package typings.stellarDashBase.stellarDashBaseMod.Operation

import typings.stellarDashBase.stellarDashBaseMod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManageBuyOffer
  extends BaseOperation[typings.stellarDashBase.stellarDashBaseMod.OperationType.ManageBuyOffer] {
  var buyAmount: String
  var buying: Asset
  var offerId: String
  var price: String
  var selling: Asset
}

object ManageBuyOffer {
  @scala.inline
  def apply(
    buyAmount: String,
    buying: Asset,
    offerId: String,
    price: String,
    selling: Asset,
    `type`: typings.stellarDashBase.stellarDashBaseMod.OperationType.ManageBuyOffer,
    source: String = null
  ): ManageBuyOffer = {
    val __obj = js.Dynamic.literal(buyAmount = buyAmount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], offerId = offerId.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageBuyOffer]
  }
}

@JSImport("stellar-base", "Operation.manageBuyOffer")
@js.native
object manageBuyOffer extends js.Object {
  def apply(options: typings.stellarDashBase.stellarDashBaseMod.OperationOptions.ManageBuyOffer): typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[ManageBuyOffer] = js.native
}

