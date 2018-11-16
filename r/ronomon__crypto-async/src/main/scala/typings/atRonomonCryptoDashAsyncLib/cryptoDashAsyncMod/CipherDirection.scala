package typings
package atRonomonCryptoDashAsyncLib.cryptoDashAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CipherDirection extends js.Object

@JSImport("@ronomon/crypto-async", "CipherDirection")
@js.native
object CipherDirection extends js.Object {
  @js.native
  sealed trait Decrypt
    extends atRonomonCryptoDashAsyncLib.cryptoDashAsyncMod.CipherDirection
  
  @js.native
  sealed trait Encrypt
    extends atRonomonCryptoDashAsyncLib.cryptoDashAsyncMod.CipherDirection
  
  val Decrypt: Decrypt with java.lang.String = js.native
  val Encrypt: Encrypt with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    atRonomonCryptoDashAsyncLib.cryptoDashAsyncMod.CipherDirection with java.lang.String
  ] = js.native
}

