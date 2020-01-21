package typings.secp256k1.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "privateKeyExport")
@js.native
object privateKeyExport extends js.Object {
  def apply(privateKey: Buffer): Buffer = js.native
  def apply(privateKey: Buffer, compressed: Boolean): Buffer = js.native
}

