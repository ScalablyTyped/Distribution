package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_stream_xor")
@js.native
object cryptoStreamXor extends js.Object {
  def apply(ciphertext: Buffer, message: Buffer, nonce: Buffer, key: Buffer): Unit = js.native
}

