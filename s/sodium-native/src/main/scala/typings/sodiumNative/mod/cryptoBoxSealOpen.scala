package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_box_seal_open")
@js.native
object cryptoBoxSealOpen extends js.Object {
  def apply(message: Buffer, ciphertext: Buffer, publicKey: Buffer, secretKey: Buffer): Unit = js.native
}

