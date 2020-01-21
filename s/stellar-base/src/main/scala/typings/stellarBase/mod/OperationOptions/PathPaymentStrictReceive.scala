package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathPaymentStrictReceive extends BaseOptions {
  var destAmount: String
  var destAsset: Asset
  var destination: String
  var path: js.UndefOr[js.Array[Asset]] = js.undefined
  var sendAsset: Asset
  var sendMax: String
}

object PathPaymentStrictReceive {
  @scala.inline
  def apply(
    destAmount: String,
    destAsset: Asset,
    destination: String,
    sendAsset: Asset,
    sendMax: String,
    path: js.Array[Asset] = null,
    source: String = null
  ): PathPaymentStrictReceive = {
    val __obj = js.Dynamic.literal(destAmount = destAmount.asInstanceOf[js.Any], destAsset = destAsset.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], sendAsset = sendAsset.asInstanceOf[js.Any], sendMax = sendMax.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPaymentStrictReceive]
  }
}

