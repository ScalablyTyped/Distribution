package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.Asset
import typings.stellarBase.mod.OperationType.PathPaymentStrictSend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathPaymentStrictSend_ extends BaseOperation[PathPaymentStrictSend] {
  var destAsset: Asset
  var destMin: String
  var destination: String
  var path: js.Array[Asset]
  var sendAmount: String
  var sendAsset: Asset
}

object PathPaymentStrictSend_ {
  @scala.inline
  def apply(
    destAsset: Asset,
    destMin: String,
    destination: String,
    path: js.Array[Asset],
    sendAmount: String,
    sendAsset: Asset,
    `type`: PathPaymentStrictSend,
    source: String = null
  ): PathPaymentStrictSend_ = {
    val __obj = js.Dynamic.literal(destAsset = destAsset.asInstanceOf[js.Any], destMin = destMin.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sendAmount = sendAmount.asInstanceOf[js.Any], sendAsset = sendAsset.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPaymentStrictSend_]
  }
}

