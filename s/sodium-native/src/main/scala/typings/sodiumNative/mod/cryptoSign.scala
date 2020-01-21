package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_sign")
@js.native
object cryptoSign extends js.Object {
  def apply(signedMessage: Buffer, message: Buffer, secretKey: Buffer): Unit = js.native
}

