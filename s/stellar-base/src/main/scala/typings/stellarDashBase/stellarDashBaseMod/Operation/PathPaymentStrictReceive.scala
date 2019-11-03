package typings.stellarDashBase.stellarDashBaseMod.Operation

import typings.stellarDashBase.stellarDashBaseMod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathPaymentStrictReceive
  extends BaseOperation[
      typings.stellarDashBase.stellarDashBaseMod.OperationType.PathPaymentStrictReceive
    ] {
  var destAmount: String
  var destAsset: Asset
  var destination: String
  var path: js.Array[Asset]
  var sendAsset: Asset
  var sendMax: String
}

object PathPaymentStrictReceive {
  @scala.inline
  def apply(
    destAmount: String,
    destAsset: Asset,
    destination: String,
    path: js.Array[Asset],
    sendAsset: Asset,
    sendMax: String,
    `type`: typings.stellarDashBase.stellarDashBaseMod.OperationType.PathPaymentStrictReceive,
    source: String = null
  ): PathPaymentStrictReceive = {
    val __obj = js.Dynamic.literal(destAmount = destAmount, destAsset = destAsset, destination = destination, path = path, sendAsset = sendAsset, sendMax = sendMax)
    __obj.updateDynamic("type")(`type`)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[PathPaymentStrictReceive]
  }
}

@JSImport("stellar-base", "Operation.pathPaymentStrictReceive")
@js.native
object pathPaymentStrictReceive extends js.Object {
  def apply(options: typings.stellarDashBase.stellarDashBaseMod.OperationOptions.PathPaymentStrictReceive): typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[PathPaymentStrictReceive] = js.native
}

