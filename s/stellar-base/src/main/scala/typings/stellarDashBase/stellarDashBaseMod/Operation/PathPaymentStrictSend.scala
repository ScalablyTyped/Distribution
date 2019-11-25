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
    val __obj = js.Dynamic.literal(destAsset = destAsset.asInstanceOf[js.Any], destMin = destMin.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sendAmount = sendAmount.asInstanceOf[js.Any], sendAsset = sendAsset.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPaymentStrictSend]
  }
}

@JSImport("stellar-base", "Operation.pathPaymentStrictSend")
@js.native
object pathPaymentStrictSend extends js.Object {
  def apply(options: typings.stellarDashBase.stellarDashBaseMod.OperationOptions.PathPaymentStrictSend): typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[PathPaymentStrictSend] = js.native
}

