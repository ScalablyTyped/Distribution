package typings.secp256k1.mod

import typings.node.Buffer
import typings.secp256k1.AnonRecovery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "sign")
@js.native
object sign extends js.Object {
  def apply(message: Buffer, privateKey: Buffer): AnonRecovery = js.native
  def apply(message: Buffer, privateKey: Buffer, options: SignOptions): AnonRecovery = js.native
}

