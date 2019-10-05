package typings.secp256k1.secp256k1Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "privateKeyImport")
@js.native
object privateKeyImport extends js.Object {
  def apply(privateKey: Buffer): Buffer = js.native
}

