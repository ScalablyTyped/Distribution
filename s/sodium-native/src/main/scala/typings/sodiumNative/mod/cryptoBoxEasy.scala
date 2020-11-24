package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_box_easy")
@js.native
object cryptoBoxEasy extends js.Object {
  
  def apply(ciphertext: Buffer, message: Buffer, nonce: Buffer, publicKey: Buffer, secretKey: Buffer): Unit = js.native
}
