package typings
package stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeTrust
  extends BaseOptions
     with stellarDashBaseLib.stellarDashBaseMod._OperationOptions {
  var asset: stellarDashBaseLib.stellarDashBaseMod.Asset
  var limit: js.UndefOr[java.lang.String] = js.undefined
}

object ChangeTrust {
  @scala.inline
  def apply(
    asset: stellarDashBaseLib.stellarDashBaseMod.Asset,
    limit: java.lang.String = null,
    source: java.lang.String = null
  ): ChangeTrust = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asset")(asset)
    if (limit != null) __obj.updateDynamic("limit")(limit)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[ChangeTrust]
  }
}

