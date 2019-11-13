package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_secretstream_xchacha20poly1305_init_push")
@js.native
object crypto_secretstream_xchacha20poly1305_init_push extends js.Object {
  def apply(state: Xchacha20poly1305State, header: Buffer, key: Buffer): Unit = js.native
}

