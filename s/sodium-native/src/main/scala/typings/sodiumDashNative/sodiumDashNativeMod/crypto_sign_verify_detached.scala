package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_sign_verify_detached")
@js.native
object crypto_sign_verify_detached extends js.Object {
  def apply(signature: Buffer, message: Buffer, publicKey: Buffer): Boolean = js.native
}

