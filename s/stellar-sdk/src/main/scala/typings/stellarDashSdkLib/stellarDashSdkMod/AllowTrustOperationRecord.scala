package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowTrustOperationRecord extends BaseOperationRecord {
  var asset_code: java.lang.String = js.native
  var asset_issuer: java.lang.String = js.native
  var asset_type: java.lang.String = js.native
  var authorize: scala.Boolean = js.native
  var trustee: java.lang.String = js.native
  var trustor: java.lang.String = js.native
  @JSName("type")
  var type_AllowTrustOperationRecord: stellarDashSdkLib.stellarDashSdkLibStrings.allow_trust = js.native
}

