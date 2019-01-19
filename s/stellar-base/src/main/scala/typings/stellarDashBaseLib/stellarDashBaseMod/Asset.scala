package typings
package stellarDashBaseLib.stellarDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "Asset")
@js.native
class Asset protected () extends js.Object {
  def this(code: java.lang.String, issuer: java.lang.String) = this()
  var code: java.lang.String = js.native
  var issuer: java.lang.String = js.native
  def equals(other: Asset): scala.Boolean = js.native
  def getAssetType(): AssetType = js.native
  def getCode(): java.lang.String = js.native
  def getIssuer(): java.lang.String = js.native
  def isNative(): scala.Boolean = js.native
  def toXDRObject(): stellarDashBaseLib.stellarDashBaseMod.xdrNs.Asset = js.native
}

@JSImport("stellar-base", "Asset")
@js.native
object Asset extends js.Object {
  def fromOperation(xdr: stellarDashBaseLib.stellarDashBaseMod.xdrNs.Asset): stellarDashBaseLib.stellarDashBaseMod.Asset = js.native
  def native(): stellarDashBaseLib.stellarDashBaseMod.Asset = js.native
}

