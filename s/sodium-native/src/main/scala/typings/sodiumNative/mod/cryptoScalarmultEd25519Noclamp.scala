package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_scalarmult_ed25519_noclamp")
@js.native
object cryptoScalarmultEd25519Noclamp extends js.Object {
  def apply(q: Buffer, n: Buffer, p: Buffer): Unit = js.native
}

