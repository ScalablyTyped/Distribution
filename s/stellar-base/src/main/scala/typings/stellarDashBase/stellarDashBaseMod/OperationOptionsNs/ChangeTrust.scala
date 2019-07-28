package typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs

import typings.stellarDashBase.stellarDashBaseMod.Asset
import typings.stellarDashBase.stellarDashBaseMod._OperationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeTrust
  extends BaseOptions
     with _OperationOptions {
  var asset: Asset
  var limit: js.UndefOr[String] = js.undefined
}

object ChangeTrust {
  @scala.inline
  def apply(asset: Asset, limit: String = null, source: String = null): ChangeTrust = {
    val __obj = js.Dynamic.literal(asset = asset)
    if (limit != null) __obj.updateDynamic("limit")(limit)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[ChangeTrust]
  }
}

