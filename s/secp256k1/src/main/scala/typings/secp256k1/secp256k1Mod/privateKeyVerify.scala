package typings.secp256k1.secp256k1Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "privateKeyVerify")
@js.native
object privateKeyVerify extends js.Object {
  def apply(privateKey: Buffer): Boolean = js.native
}

