package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_aead_xchacha20poly1305_ietf_encrypt")
@js.native
object cryptoAeadXchacha20poly1305IetfEncrypt extends js.Object {
  def apply(ciphertext: Buffer, message: Buffer, ad: Null, nullValue: Null, npub: Buffer, key: Buffer): Unit = js.native
  def apply(ciphertext: Buffer, message: Buffer, ad: Buffer, nullValue: Null, npub: Buffer, key: Buffer): Unit = js.native
}

