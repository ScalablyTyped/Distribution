package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_secretstream_xchacha20poly1305_push")
@js.native
object cryptoSecretstreamXchacha20poly1305Push extends js.Object {
  def apply(state: Xchacha20poly1305State, ciphertext: Buffer, message: Buffer, ad: Null, tag: Buffer): Unit = js.native
  def apply(state: Xchacha20poly1305State, ciphertext: Buffer, message: Buffer, ad: Buffer, tag: Buffer): Unit = js.native
}

