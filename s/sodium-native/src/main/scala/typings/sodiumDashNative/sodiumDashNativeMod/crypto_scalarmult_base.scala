package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_scalarmult_base")
@js.native
object crypto_scalarmult_base extends js.Object {
  def apply(publicKey: Buffer, secretKey: Buffer): Unit = js.native
}

