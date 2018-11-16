package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Network")
@js.native
class Network protected () extends js.Object {
  def this(passphrase: java.lang.String) = this()
  def networkId(): java.lang.String = js.native
  def networkPassphrase(): java.lang.String = js.native
}

@JSImport("stellar-sdk", "Network")
@js.native
object Network extends js.Object {
  def current(): stellarDashSdkLib.stellarDashSdkMod.Network = js.native
  def use(network: stellarDashSdkLib.stellarDashSdkMod.Network): scala.Unit = js.native
  def usePublicNetwork(): scala.Unit = js.native
  def useTestNetwork(): scala.Unit = js.native
}

