package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_scalarmult")
@js.native
object cryptoScalarmult extends js.Object {
  def apply(sharedSecret: Buffer, secretKey: Buffer, remotePublicKey: Buffer): Unit = js.native
}

