package typings.stellarSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Network")
@js.native
class Network protected ()
  extends typings.stellarBase.mod.Network {
  def this(passphrase: String) = this()
}

/* static members */
@JSImport("stellar-sdk", "Network")
@js.native
object Network extends js.Object {
  def current(): typings.stellarBase.mod.Network = js.native
  def networkId(): String = js.native
  def networkPassphrase(): String = js.native
  def use(network: typings.stellarBase.mod.Network): Unit = js.native
  def usePublicNetwork(): Unit = js.native
  def useTestNetwork(): Unit = js.native
}

