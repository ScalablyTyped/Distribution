package typings.stellarDashBase.stellarDashBaseMod.OperationOptions

import typings.stellarDashBase.stellarDashBaseMod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathPayment extends BaseOptions {
  var destAmount: String
  var destAsset: Asset
  var destination: String
  var path: js.UndefOr[js.Array[Asset]] = js.undefined
  var sendAsset: Asset
  var sendMax: String
}

object PathPayment {
  @scala.inline
  def apply(
    destAmount: String,
    destAsset: Asset,
    destination: String,
    sendAsset: Asset,
    sendMax: String,
    path: js.Array[Asset] = null,
    source: String = null
  ): PathPayment = {
    val __obj = js.Dynamic.literal(destAmount = destAmount, destAsset = destAsset, destination = destination, sendAsset = sendAsset, sendMax = sendMax)
    if (path != null) __obj.updateDynamic("path")(path)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[PathPayment]
  }
}

