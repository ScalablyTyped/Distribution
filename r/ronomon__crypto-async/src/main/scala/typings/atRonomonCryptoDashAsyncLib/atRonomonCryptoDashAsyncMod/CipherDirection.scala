package typings
package atRonomonCryptoDashAsyncLib.atRonomonCryptoDashAsyncMod

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
    extends atRonomonCryptoDashAsyncLib.atRonomonCryptoDashAsyncMod.CipherDirection
  
  @js.native
  sealed trait Encrypt
    extends atRonomonCryptoDashAsyncLib.atRonomonCryptoDashAsyncMod.CipherDirection
  
  val Decrypt: Decrypt with java.lang.String = js.native
  val Encrypt: Encrypt with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    atRonomonCryptoDashAsyncLib.atRonomonCryptoDashAsyncMod.CipherDirection with java.lang.String
  ] = js.native
}

