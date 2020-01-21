package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_kdf_keygen")
@js.native
object cryptoKdfKeygen extends js.Object {
  def apply(key: Buffer): Unit = js.native
}

