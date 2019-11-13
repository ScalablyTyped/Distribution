package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_sign_open")
@js.native
object crypto_sign_open extends js.Object {
  def apply(message: Buffer, signedMessage: Buffer, publicKey: Buffer): Boolean = js.native
}

