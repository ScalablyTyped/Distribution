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
    val __obj = js.Dynamic.literal(destAsset = destAsset, destMin = destMin, destination = destination, sendAmount = sendAmount, sendAsset = sendAsset)
    if (path != null) __obj.updateDynamic("path")(path)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[PathPaymentStrictSend]
  }
}

