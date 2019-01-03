package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Asset")
@js.native
class Asset protected ()
  extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Asset {
  def this(code: java.lang.String, issuer: java.lang.String) = this()
}

@JSImport("stellar-sdk", "Asset")
@js.native
object Asset extends js.Object {
  def fromOperation(xdr: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Asset): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Asset = js.native
  def native(): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Asset = js.native
}

