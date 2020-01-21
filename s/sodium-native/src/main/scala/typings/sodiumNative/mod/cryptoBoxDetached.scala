package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_box_detached")
@js.native
object cryptoBoxDetached extends js.Object {
  def apply(
    ciphertext: Buffer,
    mac: Buffer,
    message: Buffer,
    nonce: Buffer,
    publicKey: Buffer,
    secretKey: Buffer
  ): Unit = js.native
}

