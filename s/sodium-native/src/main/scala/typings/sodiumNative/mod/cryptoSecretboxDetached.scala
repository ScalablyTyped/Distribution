package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_secretbox_detached")
@js.native
object cryptoSecretboxDetached extends js.Object {
  def apply(ciphertext: Buffer, mac: Buffer, message: Buffer, nonce: Buffer, secretKey: Buffer): Unit = js.native
}

