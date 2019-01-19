package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Asset")
@js.native
class Asset protected ()
  extends stellarDashBaseLib.stellarDashBaseMod.Asset {
  def this(code: java.lang.String, issuer: java.lang.String) = this()
}

@JSImport("stellar-sdk", "Asset")
@js.native
object Asset extends js.Object {
  def fromOperation(xdr: stellarDashBaseLib.stellarDashBaseMod.xdrNs.Asset): stellarDashBaseLib.stellarDashBaseMod.Asset = js.native
  def native(): stellarDashBaseLib.stellarDashBaseMod.Asset = js.native
}

