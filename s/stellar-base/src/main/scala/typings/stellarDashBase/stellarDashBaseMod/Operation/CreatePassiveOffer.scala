package typings.stellarDashBase.stellarDashBaseMod.Operation

import typings.stellarDashBase.stellarDashBaseMod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePassiveOffer
  extends BaseOperation[typings.stellarDashBase.stellarDashBaseMod.OperationType.CreatePassiveOffer] {
  var amount: String
  var buying: Asset
  var price: String
  var selling: Asset
}

object CreatePassiveOffer {
  @scala.inline
  def apply(
    amount: String,
    buying: Asset,
    price: String,
    selling: Asset,
    `type`: typings.stellarDashBase.stellarDashBaseMod.OperationType.CreatePassiveOffer,
    source: String = null
  ): CreatePassiveOffer = {
    val __obj = js.Dynamic.literal(amount = amount, buying = buying, price = price, selling = selling)
    __obj.updateDynamic("type")(`type`)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[CreatePassiveOffer]
  }
}

@JSImport("stellar-base", "Operation.createPassiveOffer")
@js.native
object createPassiveOffer extends js.Object {
  def apply(options: typings.stellarDashBase.stellarDashBaseMod.OperationOptions.CreatePassiveOffer): typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[CreatePassiveOffer] = js.native
}

