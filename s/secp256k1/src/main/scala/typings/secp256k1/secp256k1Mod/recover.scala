package typings.secp256k1.secp256k1Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "recover")
@js.native
object recover extends js.Object {
  def apply(message: Buffer, signature: Buffer, recovery: Double): Buffer = js.native
  def apply(message: Buffer, signature: Buffer, recovery: Double, compressed: Boolean): Buffer = js.native
}

