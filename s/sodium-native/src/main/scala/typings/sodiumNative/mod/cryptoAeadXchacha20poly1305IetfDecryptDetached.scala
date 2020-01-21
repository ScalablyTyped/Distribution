package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_aead_xchacha20poly1305_ietf_decrypt_detached")
@js.native
object cryptoAeadXchacha20poly1305IetfDecryptDetached extends js.Object {
  def apply(
    message: Buffer,
    nullValue: Null,
    ciphertext: Buffer,
    mac: Buffer,
    ad: Null,
    npub: Buffer,
    key: Buffer
  ): Unit = js.native
  def apply(
    message: Buffer,
    nullValue: Null,
    ciphertext: Buffer,
    mac: Buffer,
    ad: Buffer,
    npub: Buffer,
    key: Buffer
  ): Unit = js.native
}

