package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Network")
@js.native
class Network protected ()
  extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Network {
  def this(passphrase: java.lang.String) = this()
}

@JSImport("stellar-sdk", "Network")
@js.native
object Network extends js.Object {
  def current(): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Network = js.native
  def use(network: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Network): scala.Unit = js.native
  def usePublicNetwork(): scala.Unit = js.native
  def useTestNetwork(): scala.Unit = js.native
}

