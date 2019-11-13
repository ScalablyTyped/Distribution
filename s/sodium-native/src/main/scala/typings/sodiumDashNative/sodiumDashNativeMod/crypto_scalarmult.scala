package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_scalarmult")
@js.native
object crypto_scalarmult extends js.Object {
  def apply(sharedSecret: Buffer, secretKey: Buffer, remotePublicKey: Buffer): Unit = js.native
}

