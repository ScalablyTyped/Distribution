package typings
package stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathPayment extends BaseOptions {
  var destAmount: java.lang.String
  var destAsset: stellarDashBaseLib.stellarDashBaseMod.Asset
  var destination: java.lang.String
  var path: js.UndefOr[js.Array[stellarDashBaseLib.stellarDashBaseMod.Asset]] = js.undefined
  var sendAsset: stellarDashBaseLib.stellarDashBaseMod.Asset
  var sendMax: java.lang.String
}

