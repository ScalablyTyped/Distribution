package typings.secp256k1.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("secp256k1", "ecdsaVerify")
@js.native
object ecdsaVerify extends js.Object {
  
  def apply(signature: Uint8Array, message: Uint8Array, publicKey: Uint8Array): Boolean = js.native
}
