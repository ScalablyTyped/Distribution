package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_secretbox_open_easy")
@js.native
object crypto_secretbox_open_easy extends js.Object {
  def apply(message: Buffer, ciphertext: Buffer, nonce: Buffer, secretKey: Buffer): Boolean = js.native
}

