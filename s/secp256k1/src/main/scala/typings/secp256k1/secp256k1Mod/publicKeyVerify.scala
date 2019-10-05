package typings.secp256k1.secp256k1Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "publicKeyVerify")
@js.native
object publicKeyVerify extends js.Object {
  def apply(publicKey: Buffer): Boolean = js.native
}

