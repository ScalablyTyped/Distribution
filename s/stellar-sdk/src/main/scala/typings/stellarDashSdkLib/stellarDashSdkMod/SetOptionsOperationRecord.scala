package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetOptionsOperationRecord extends BaseOperationRecord {
  var clear_flags: js.Array[
    stellarDashSdkLib.stellarDashSdkLibNumbers.`1` | stellarDashSdkLib.stellarDashSdkLibNumbers.`2`
  ] = js.native
  var clear_flags_s: js.Array[
    stellarDashSdkLib.stellarDashSdkLibStrings.auth_required_flag | stellarDashSdkLib.stellarDashSdkLibStrings.auth_revocable_flag
  ] = js.native
  var high_threshold: js.UndefOr[scala.Double] = js.native
  var home_domain: js.UndefOr[java.lang.String] = js.native
  var low_threshold: js.UndefOr[scala.Double] = js.native
  var master_key_weight: js.UndefOr[scala.Double] = js.native
  var med_threshold: js.UndefOr[scala.Double] = js.native
  var set_flags: js.Array[
    stellarDashSdkLib.stellarDashSdkLibNumbers.`1` | stellarDashSdkLib.stellarDashSdkLibNumbers.`2`
  ] = js.native
  var set_flags_s: js.Array[
    stellarDashSdkLib.stellarDashSdkLibStrings.auth_required_flag | stellarDashSdkLib.stellarDashSdkLibStrings.auth_revocable_flag
  ] = js.native
  var signer_key: js.UndefOr[java.lang.String] = js.native
  var signer_weight: js.UndefOr[scala.Double] = js.native
  @JSName("type")
  var type_SetOptionsOperationRecord: stellarDashSdkLib.stellarDashSdkLibStrings.set_options = js.native
}

