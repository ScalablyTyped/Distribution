package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeTrust extends BaseOptions {
  var asset: Asset
  var limit: js.UndefOr[String] = js.undefined
}

object ChangeTrust {
  @scala.inline
  def apply(asset: Asset, limit: String = null, source: String = null): ChangeTrust = {
    val __obj = js.Dynamic.literal(asset = asset.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeTrust]
  }
}

