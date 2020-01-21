package typings.secp256k1.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "publicKeyConvert")
@js.native
object publicKeyConvert extends js.Object {
  def apply(publicKey: Buffer): Buffer = js.native
  def apply(publicKey: Buffer, compressed: Boolean): Buffer = js.native
}

