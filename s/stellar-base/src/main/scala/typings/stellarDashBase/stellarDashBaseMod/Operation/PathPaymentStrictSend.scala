package typings.stellarDashBase.stellarDashBaseMod.Operation

import typings.stellarDashBase.stellarDashBaseMod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathPaymentStrictSend
  extends BaseOperation[typings.stellarDashBase.stellarDashBaseMod.OperationType.PathPaymentStrictSend] {
  var destAsset: Asset
  var destMin: String
  var destination: String
  var path: js.Array[Asset]
  var sendAmount: String
  var sendAsset: Asset
}

object PathPaymentStrictSend {
  @scala.inline
  def apply(
    destAsset: Asset,
    destMin: String,
    destination: String,
    path: js.Array[Asset],
    sendAmount: String,
    sendAsset: Asset,
    `type`: typings.stellarDashBase.stellarDashBaseMod.OperationType.PathPaymentStrictSend,
    source: String = null
  ): PathPaymentStrictSend = {
    val __obj = js.Dynamic.literal(destAsset = destAsset, destMin = destMin, destination = destination, path = path, sendAmount = sendAmount, sendAsset = sendAsset)
    __obj.updateDynamic("type")(`type`)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[PathPaymentStrictSend]
  }
}

@JSImport("stellar-base", "Operation.pathPaymentStrictSend")
@js.native
object pathPaymentStrictSend extends js.Object {
  def apply(options: typings.stellarDashBase.stellarDashBaseMod.OperationOptions.PathPaymentStrictSend): typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[PathPaymentStrictSend] = js.native
}

