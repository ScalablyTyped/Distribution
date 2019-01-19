package typings
package stellarDashBaseLib.stellarDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "Network")
@js.native
class Network protected () extends js.Object {
  def this(passphrase: java.lang.String) = this()
  def networkId(): java.lang.String = js.native
  def networkPassphrase(): java.lang.String = js.native
}

@JSImport("stellar-base", "Network")
@js.native
object Network extends js.Object {
  def current(): stellarDashBaseLib.stellarDashBaseMod.Network = js.native
  def use(network: stellarDashBaseLib.stellarDashBaseMod.Network): scala.Unit = js.native
  def usePublicNetwork(): scala.Unit = js.native
  def useTestNetwork(): scala.Unit = js.native
}

