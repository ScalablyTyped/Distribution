package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_secretstream_xchacha20poly1305_pull")
@js.native
object crypto_secretstream_xchacha20poly1305_pull extends js.Object {
  def apply(state: Xchacha20poly1305State, message: Buffer, tag: Buffer, ciphertext: Buffer): Unit = js.native
  def apply(state: Xchacha20poly1305State, message: Buffer, tag: Buffer, ciphertext: Buffer, ad: Buffer): Unit = js.native
}

