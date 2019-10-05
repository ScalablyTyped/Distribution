package typings.secp256k1.secp256k1Mod

import typings.node.Buffer
import typings.secp256k1.Anon_Recovery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "sign")
@js.native
object sign extends js.Object {
  def apply(message: Buffer, privateKey: Buffer): Anon_Recovery = js.native
  def apply(message: Buffer, privateKey: Buffer, options: SignOptions): Anon_Recovery = js.native
}

