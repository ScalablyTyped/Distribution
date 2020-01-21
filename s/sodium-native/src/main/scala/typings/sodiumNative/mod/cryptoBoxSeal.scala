package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_box_seal")
@js.native
object cryptoBoxSeal extends js.Object {
  def apply(ciphertext: Buffer, message: Buffer, publicKey: Buffer): Unit = js.native
}

