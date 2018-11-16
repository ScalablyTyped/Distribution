package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathPaymentOperationRecord extends BaseOperationRecord {
  var amount: java.lang.String = js.native
  var asset_code: js.UndefOr[java.lang.String] = js.native
  var asset_issuer: js.UndefOr[java.lang.String] = js.native
  var asset_type: java.lang.String = js.native
  var from: java.lang.String = js.native
  var source_amount: java.lang.String = js.native
  var source_asset_code: js.UndefOr[java.lang.String] = js.native
  var source_asset_issuer: js.UndefOr[java.lang.String] = js.native
  var source_asset_type: java.lang.String = js.native
  var source_max: java.lang.String = js.native
  var to: java.lang.String = js.native
  @JSName("type")
  var type_PathPaymentOperationRecord: stellarDashSdkLib.stellarDashSdkLibStrings.path_payment = js.native
}

