package typings.secp256k1.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "ecdsaRecover")
@js.native
object ecdsaRecover extends js.Object {
  def apply(signature: Uint8Array, recid: Double, message: Uint8Array): Uint8Array = js.native
  def apply(signature: Uint8Array, recid: Double, message: Uint8Array, compressed: Boolean): Uint8Array = js.native
}

