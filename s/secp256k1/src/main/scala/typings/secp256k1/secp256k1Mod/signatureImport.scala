package typings.secp256k1.secp256k1Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "signatureImport")
@js.native
object signatureImport extends js.Object {
  def apply(signature: Buffer): Buffer = js.native
}

