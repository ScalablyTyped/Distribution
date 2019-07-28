package typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs

import typings.stellarDashBase.stellarDashBaseMod.Asset
import typings.stellarDashBase.stellarDashBaseMod._OperationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payment
  extends BaseOptions
     with _OperationOptions {
  var amount: String
  var asset: Asset
  var destination: String
}

object Payment {
  @scala.inline
  def apply(amount: String, asset: Asset, destination: String, source: String = null): Payment = {
    val __obj = js.Dynamic.literal(amount = amount, asset = asset, destination = destination)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[Payment]
  }
}

