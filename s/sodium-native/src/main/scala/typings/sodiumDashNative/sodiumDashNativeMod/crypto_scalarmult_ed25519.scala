package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_scalarmult_ed25519")
@js.native
object crypto_scalarmult_ed25519 extends js.Object {
  def apply(q: Buffer, n: Buffer, p: Buffer): Unit = js.native
}

