package typings.secp256k1.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("secp256k1", "ecdh")
@js.native
object ecdh extends js.Object {
  
  def apply(publicKey: Uint8Array, privateKey: Uint8Array): Uint8Array = js.native
  def apply(publicKey: Uint8Array, privateKey: Uint8Array, opt: ecdhOptions): Uint8Array = js.native
}
