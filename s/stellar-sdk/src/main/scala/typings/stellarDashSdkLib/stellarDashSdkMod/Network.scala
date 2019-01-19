package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Network")
@js.native
class Network protected ()
  extends stellarDashBaseLib.stellarDashBaseMod.Network {
  def this(passphrase: java.lang.String) = this()
}

@JSImport("stellar-sdk", "Network")
@js.native
object Network extends js.Object {
  def current(): stellarDashBaseLib.stellarDashBaseMod.Network = js.native
  def use(network: stellarDashBaseLib.stellarDashBaseMod.Network): scala.Unit = js.native
  def usePublicNetwork(): scala.Unit = js.native
  def useTestNetwork(): scala.Unit = js.native
}

