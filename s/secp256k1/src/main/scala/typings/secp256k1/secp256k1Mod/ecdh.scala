package typings.secp256k1.secp256k1Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "ecdh")
@js.native
object ecdh extends js.Object {
  def apply(publicKey: Buffer, privateKey: Buffer): Buffer = js.native
}

