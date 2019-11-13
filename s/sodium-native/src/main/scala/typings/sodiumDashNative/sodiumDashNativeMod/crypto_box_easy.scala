package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_box_easy")
@js.native
object crypto_box_easy extends js.Object {
  def apply(ciphertext: Buffer, message: Buffer, nonce: Buffer, publicKey: Buffer, secretKey: Buffer): Unit = js.native
}

