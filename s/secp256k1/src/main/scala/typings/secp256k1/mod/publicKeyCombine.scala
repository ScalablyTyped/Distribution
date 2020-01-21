package typings.secp256k1.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "publicKeyCombine")
@js.native
object publicKeyCombine extends js.Object {
  def apply(publicKeys: js.Array[Buffer]): Buffer = js.native
  def apply(publicKeys: js.Array[Buffer], compressed: Boolean): Buffer = js.native
}

