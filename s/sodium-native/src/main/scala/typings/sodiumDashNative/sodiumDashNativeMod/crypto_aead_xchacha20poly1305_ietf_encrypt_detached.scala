package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_aead_xchacha20poly1305_ietf_encrypt_detached")
@js.native
object crypto_aead_xchacha20poly1305_ietf_encrypt_detached extends js.Object {
  def apply(
    ciphertext: Buffer,
    mac: Buffer,
    message: Buffer,
    ad: Null,
    nullValue: Null,
    npub: Buffer,
    key: Buffer
  ): Unit = js.native
  def apply(
    ciphertext: Buffer,
    mac: Buffer,
    message: Buffer,
    ad: Buffer,
    nullValue: Null,
    npub: Buffer,
    key: Buffer
  ): Unit = js.native
}

