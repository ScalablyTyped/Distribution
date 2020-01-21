package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_scalarmult_base")
@js.native
object cryptoScalarmultBase extends js.Object {
  def apply(publicKey: Buffer, secretKey: Buffer): Unit = js.native
}

