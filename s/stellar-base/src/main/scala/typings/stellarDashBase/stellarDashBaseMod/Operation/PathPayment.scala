package typings.stellarDashBase.stellarDashBaseMod.Operation

import typings.stellarDashBase.stellarDashBaseMod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathPayment
  extends BaseOperation[typings.stellarDashBase.stellarDashBaseMod.OperationType.PathPayment] {
  var destAmount: String
  var destAsset: Asset
  var destination: String
  var path: js.Array[Asset]
  var sendAsset: Asset
  var sendMax: String
}

object PathPayment {
  @scala.inline
  def apply(
    destAmount: String,
    destAsset: Asset,
    destination: String,
    path: js.Array[Asset],
    sendAsset: Asset,
    sendMax: String,
    `type`: typings.stellarDashBase.stellarDashBaseMod.OperationType.PathPayment,
    source: String = null
  ): PathPayment = {
    val __obj = js.Dynamic.literal(destAmount = destAmount, destAsset = destAsset, destination = destination, path = path, sendAsset = sendAsset, sendMax = sendMax)
    __obj.updateDynamic("type")(`type`)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[PathPayment]
  }
}

@JSImport("stellar-base", "Operation.pathPayment")
@js.native
object pathPayment extends js.Object {
  def apply(options: typings.stellarDashBase.stellarDashBaseMod.OperationOptions.PathPayment): typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[PathPayment] = js.native
}

