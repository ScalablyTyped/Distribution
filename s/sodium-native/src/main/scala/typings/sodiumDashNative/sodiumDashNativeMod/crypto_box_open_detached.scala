package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_box_open_detached")
@js.native
object crypto_box_open_detached extends js.Object {
  def apply(
    message: Buffer,
    ciphertext: Buffer,
    mac: Buffer,
    nonce: Buffer,
    publicKey: Buffer,
    secretKey: Buffer
  ): Boolean = js.native
}

