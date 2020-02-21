package typings.secp256k1.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "publicKeyTweakAdd")
@js.native
object publicKeyTweakAdd extends js.Object {
  def apply(publicKey: Uint8Array, tweak: Uint8Array): Uint8Array = js.native
  def apply(publicKey: Uint8Array, tweak: Uint8Array, compressed: Boolean): Uint8Array = js.native
}

