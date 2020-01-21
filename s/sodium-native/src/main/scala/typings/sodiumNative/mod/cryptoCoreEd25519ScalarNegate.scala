package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_core_ed25519_scalar_negate")
@js.native
object cryptoCoreEd25519ScalarNegate extends js.Object {
  def apply(neg: Buffer, s: Buffer): Unit = js.native
}

