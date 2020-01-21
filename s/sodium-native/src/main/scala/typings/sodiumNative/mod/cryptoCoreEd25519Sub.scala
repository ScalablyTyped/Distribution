package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_core_ed25519_sub")
@js.native
object cryptoCoreEd25519Sub extends js.Object {
  def apply(r: Buffer, p: Buffer, q: Buffer): Unit = js.native
}

