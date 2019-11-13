package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_aead_xchacha20poly1305_ietf_decrypt")
@js.native
object crypto_aead_xchacha20poly1305_ietf_decrypt extends js.Object {
  def apply(message: Buffer, nullValue: Null, ciphertext: Buffer, ad: Null, npub: Buffer, key: Buffer): Unit = js.native
  def apply(message: Buffer, nullValue: Null, ciphertext: Buffer, ad: Buffer, npub: Buffer, key: Buffer): Unit = js.native
}

