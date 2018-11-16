package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Asset")
@js.native
class Asset protected () extends js.Object {
  def this(code: java.lang.String, issuer: java.lang.String) = this()
  var code: java.lang.String = js.native
  var issuer: java.lang.String = js.native
  def equals(other: Asset): scala.Boolean = js.native
  def getAssetType(): stellarDashSdkLib.stellarDashSdkLibStrings.native | stellarDashSdkLib.stellarDashSdkLibStrings.credit_alphanum4 | stellarDashSdkLib.stellarDashSdkLibStrings.credit_alphanum12 = js.native
  def getCode(): java.lang.String = js.native
  def getIssuer(): java.lang.String = js.native
  def isNative(): scala.Boolean = js.native
  def toXDRObject(): stellarDashSdkLib.stellarDashSdkMod.xdrNs.Asset = js.native
}

@JSImport("stellar-sdk", "Asset")
@js.native
object Asset extends js.Object {
  def fromOperation(xdr: stellarDashSdkLib.stellarDashSdkMod.xdrNs.Asset): stellarDashSdkLib.stellarDashSdkMod.Asset = js.native
  def native(): stellarDashSdkLib.stellarDashSdkMod.Asset = js.native
}

