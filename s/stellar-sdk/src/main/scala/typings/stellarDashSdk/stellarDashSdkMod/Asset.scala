package typings.stellarDashSdk.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Asset")
@js.native
class Asset protected ()
  extends typings.stellarDashBase.stellarDashBaseMod.Asset {
  def this(code: String, issuer: String) = this()
}

/* static members */
@JSImport("stellar-sdk", "Asset")
@js.native
object Asset extends js.Object {
  def fromOperation(xdr: typings.stellarDashBase.stellarDashBaseMod.xdr.Asset): typings.stellarDashBase.stellarDashBaseMod.Asset = js.native
  def native(): typings.stellarDashBase.stellarDashBaseMod.Asset = js.native
}

