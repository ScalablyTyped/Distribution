package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_stream")
@js.native
object cryptoStream extends js.Object {
  
  def apply(ciphertext: Buffer, nonce: Buffer, key: Buffer): Unit = js.native
}
