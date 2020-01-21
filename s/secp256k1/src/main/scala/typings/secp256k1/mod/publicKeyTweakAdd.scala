package typings.secp256k1.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "publicKeyTweakAdd")
@js.native
object publicKeyTweakAdd extends js.Object {
  def apply(publicKey: Buffer, tweak: Buffer): Buffer = js.native
  def apply(publicKey: Buffer, tweak: Buffer, compressed: Boolean): Buffer = js.native
}

