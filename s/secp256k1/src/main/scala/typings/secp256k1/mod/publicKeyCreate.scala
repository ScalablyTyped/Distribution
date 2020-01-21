package typings.secp256k1.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "publicKeyCreate")
@js.native
object publicKeyCreate extends js.Object {
  def apply(privateKey: Buffer): Buffer = js.native
  def apply(privateKey: Buffer, compressed: Boolean): Buffer = js.native
}

