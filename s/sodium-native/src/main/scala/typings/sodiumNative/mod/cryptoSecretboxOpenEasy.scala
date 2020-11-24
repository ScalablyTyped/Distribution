package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_secretbox_open_easy")
@js.native
object cryptoSecretboxOpenEasy extends js.Object {
  
  def apply(message: Buffer, ciphertext: Buffer, nonce: Buffer, secretKey: Buffer): Boolean = js.native
}
