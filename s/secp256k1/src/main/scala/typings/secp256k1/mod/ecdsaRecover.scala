package typings.secp256k1.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "ecdsaRecover")
@js.native
object ecdsaRecover extends js.Object {
  def apply(message: Uint8Array, signature: Uint8Array, recovery: Double): Uint8Array = js.native
  def apply(message: Uint8Array, signature: Uint8Array, recovery: Double, compressed: Boolean): Uint8Array = js.native
}

