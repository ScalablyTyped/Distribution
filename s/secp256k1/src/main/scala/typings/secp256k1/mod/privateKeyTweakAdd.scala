package typings.secp256k1.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "privateKeyTweakAdd")
@js.native
object privateKeyTweakAdd extends js.Object {
  def apply(privateKey: Uint8Array, tweak: Uint8Array): Uint8Array = js.native
}

