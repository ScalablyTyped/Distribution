package typings.stellarDashSdk.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Network")
@js.native
class Network protected ()
  extends typings.stellarDashBase.stellarDashBaseMod.Network {
  def this(passphrase: String) = this()
}

/* static members */
@JSImport("stellar-sdk", "Network")
@js.native
object Network extends js.Object {
  def current(): typings.stellarDashBase.stellarDashBaseMod.Network = js.native
  def use(network: typings.stellarDashBase.stellarDashBaseMod.Network): Unit = js.native
  def usePublicNetwork(): Unit = js.native
  def useTestNetwork(): Unit = js.native
}

