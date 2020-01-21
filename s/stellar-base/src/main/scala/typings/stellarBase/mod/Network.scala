package typings.stellarBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "Network")
@js.native
class Network protected () extends js.Object {
  def this(passphrase: String) = this()
  def networkId(): String = js.native
  def networkPassphrase(): String = js.native
}

/* static members */
@JSImport("stellar-base", "Network")
@js.native
object Network extends js.Object {
  def current(): Network = js.native
  def networkId(): String = js.native
  def networkPassphrase(): String = js.native
  def use(network: Network): Unit = js.native
  def usePublicNetwork(): Unit = js.native
  def useTestNetwork(): Unit = js.native
}

