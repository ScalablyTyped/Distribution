package typings.secp256k1.secp256k1Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "verify")
@js.native
object verify extends js.Object {
  def apply(message: Buffer, signature: Buffer, publicKey: Buffer): Boolean = js.native
}

