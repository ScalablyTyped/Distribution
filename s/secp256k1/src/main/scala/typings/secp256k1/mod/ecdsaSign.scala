package typings.secp256k1.mod

import typings.secp256k1.anon.Recid
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("secp256k1", "ecdsaSign")
@js.native
object ecdsaSign extends js.Object {
  
  def apply(message: Uint8Array, privateKey: Uint8Array): Recid = js.native
  def apply(message: Uint8Array, privateKey: Uint8Array, options: SignOptions): Recid = js.native
}
