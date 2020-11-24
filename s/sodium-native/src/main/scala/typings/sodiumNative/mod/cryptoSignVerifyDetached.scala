package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_sign_verify_detached")
@js.native
object cryptoSignVerifyDetached extends js.Object {
  
  def apply(signature: Buffer, message: Buffer, publicKey: Buffer): Boolean = js.native
}
