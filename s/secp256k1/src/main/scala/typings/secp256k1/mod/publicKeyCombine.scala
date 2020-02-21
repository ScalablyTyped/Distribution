package typings.secp256k1.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "publicKeyCombine")
@js.native
object publicKeyCombine extends js.Object {
  def apply(publicKeys: js.Array[Uint8Array]): Uint8Array = js.native
  def apply(publicKeys: js.Array[Uint8Array], compressed: Boolean): Uint8Array = js.native
}

