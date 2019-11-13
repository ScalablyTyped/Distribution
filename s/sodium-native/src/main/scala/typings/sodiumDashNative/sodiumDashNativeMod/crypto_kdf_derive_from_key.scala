package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_kdf_derive_from_key")
@js.native
object crypto_kdf_derive_from_key extends js.Object {
  def apply(subkey: Buffer, subkeyId: Double, context: Buffer, key: Buffer): Unit = js.native
}

