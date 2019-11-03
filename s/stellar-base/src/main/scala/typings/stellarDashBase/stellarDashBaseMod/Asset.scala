package typings.stellarDashBase.stellarDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "Asset")
@js.native
class Asset protected () extends js.Object {
  def this(code: String) = this()
  def this(code: String, issuer: String) = this()
  var code: String = js.native
  var issuer: String = js.native
  def equals(other: Asset): Boolean = js.native
  def getAssetType(): AssetType = js.native
  def getCode(): String = js.native
  def getIssuer(): String = js.native
  def isNative(): Boolean = js.native
  def toXDRObject(): typings.stellarDashBase.stellarDashBaseMod.xdr.Asset = js.native
}

/* static members */
@JSImport("stellar-base", "Asset")
@js.native
object Asset extends js.Object {
  def fromOperation(xdr: typings.stellarDashBase.stellarDashBaseMod.xdr.Asset): Asset = js.native
  def native(): Asset = js.native
}

