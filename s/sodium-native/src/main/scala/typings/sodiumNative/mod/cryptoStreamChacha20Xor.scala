package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_stream_chacha20_xor")
@js.native
object cryptoStreamChacha20Xor extends js.Object {
  
  def apply(ciphertext: Buffer, message: Buffer, nonce: Buffer, key: Buffer): Unit = js.native
}
