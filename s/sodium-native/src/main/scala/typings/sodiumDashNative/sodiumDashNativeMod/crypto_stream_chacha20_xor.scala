package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_stream_chacha20_xor")
@js.native
object crypto_stream_chacha20_xor extends js.Object {
  def apply(ciphertext: Buffer, message: Buffer, nonce: Buffer, key: Buffer): Unit = js.native
}

