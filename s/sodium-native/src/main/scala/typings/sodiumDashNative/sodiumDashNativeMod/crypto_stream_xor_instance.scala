package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_stream_xor_instance")
@js.native
object crypto_stream_xor_instance extends js.Object {
  def apply(nonce: Buffer, key: Buffer): CryptoStreamChacha20XorWrap = js.native
}

