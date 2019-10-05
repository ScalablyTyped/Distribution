package typings.secp256k1.secp256k1Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "privateKeyTweakAdd")
@js.native
object privateKeyTweakAdd extends js.Object {
  def apply(privateKey: Buffer, tweak: Buffer): Buffer = js.native
}

