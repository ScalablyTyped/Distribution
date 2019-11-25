package typings.stellarDashBase.stellarDashBaseMod.OperationOptions

import typings.stellarDashBase.stellarDashBaseMod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathPaymentStrictSend extends BaseOptions {
  var destAsset: Asset
  var destMin: String
  var destination: String
  var path: js.UndefOr[js.Array[Asset]] = js.undefined
  var sendAmount: String
  var sendAsset: Asset
}

object PathPaymentStrictSend {
  @scala.inline
  def apply(
    destAsset: Asset,
    destMin: String,
    destination: String,
    sendAmount: String,
    sendAsset: Asset,
    path: js.Array[Asset] = null,
    source: String = null
  ): PathPaymentStrictSend = {
    val __obj = js.Dynamic.literal(destAsset = destAsset.asInstanceOf[js.Any], destMin = destMin.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], sendAmount = sendAmount.asInstanceOf[js.Any], sendAsset = sendAsset.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPaymentStrictSend]
  }
}

