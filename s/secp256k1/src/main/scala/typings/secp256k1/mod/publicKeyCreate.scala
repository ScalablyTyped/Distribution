package typings.secp256k1.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("secp256k1", "publicKeyCreate")
@js.native
object publicKeyCreate extends js.Object {
  
  def apply(privateKey: Uint8Array): Uint8Array = js.native
  def apply(privateKey: Uint8Array, compressed: Boolean): Uint8Array = js.native
}
