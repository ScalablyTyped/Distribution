package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_secretbox_open_detached")
@js.native
object cryptoSecretboxOpenDetached extends js.Object {
  
  def apply(message: Buffer, ciphertext: Buffer, mac: Buffer, nonce: Buffer, secretKey: Buffer): Boolean = js.native
}
