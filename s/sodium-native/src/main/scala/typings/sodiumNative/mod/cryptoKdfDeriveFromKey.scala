package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_kdf_derive_from_key")
@js.native
object cryptoKdfDeriveFromKey extends js.Object {
  
  def apply(subkey: Buffer, subkeyId: Double, context: Buffer, key: Buffer): Unit = js.native
}
