package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_core_ed25519_scalar_sub")
@js.native
object cryptoCoreEd25519ScalarSub extends js.Object {
  def apply(z: Buffer, x: Buffer, y: Buffer): Unit = js.native
}

