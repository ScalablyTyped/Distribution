package typings.secp256k1.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "privateKeyTweakMul")
@js.native
object privateKeyTweakMul extends js.Object {
  def apply(privateKey: Buffer, tweak: Buffer): Buffer = js.native
}

