package typings
package stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathPayment
  extends BaseOptions
     with stellarDashBaseLib.stellarDashBaseMod._OperationOptions {
  var destAmount: java.lang.String
  var destAsset: stellarDashBaseLib.stellarDashBaseMod.Asset
  var destination: java.lang.String
  var path: js.UndefOr[js.Array[stellarDashBaseLib.stellarDashBaseMod.Asset]] = js.undefined
  var sendAsset: stellarDashBaseLib.stellarDashBaseMod.Asset
  var sendMax: java.lang.String
}

object PathPayment {
  @scala.inline
  def apply(
    destAmount: java.lang.String,
    destAsset: stellarDashBaseLib.stellarDashBaseMod.Asset,
    destination: java.lang.String,
    sendAsset: stellarDashBaseLib.stellarDashBaseMod.Asset,
    sendMax: java.lang.String,
    path: js.Array[stellarDashBaseLib.stellarDashBaseMod.Asset] = null,
    source: java.lang.String = null
  ): PathPayment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destAmount")(destAmount)
    __obj.updateDynamic("destAsset")(destAsset)
    __obj.updateDynamic("destination")(destination)
    __obj.updateDynamic("sendAsset")(sendAsset)
    __obj.updateDynamic("sendMax")(sendMax)
    if (path != null) __obj.updateDynamic("path")(path)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[PathPayment]
  }
}

