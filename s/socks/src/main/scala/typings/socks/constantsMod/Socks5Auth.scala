package typings.socks.constantsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Socks5Auth extends js.Object

@JSImport("socks/typings/common/constants", "Socks5Auth")
@js.native
object Socks5Auth extends js.Object {
  @js.native
  sealed trait GSSApi extends Socks5Auth
  
  @js.native
  sealed trait NoAuth extends Socks5Auth
  
  @js.native
  sealed trait UserPass extends Socks5Auth
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Socks5Auth with Double] = js.native
  /* 1 */ @js.native
  object GSSApi extends TopLevel[GSSApi with Double]
  
  /* 0 */ @js.native
  object NoAuth extends TopLevel[NoAuth with Double]
  
  /* 2 */ @js.native
  object UserPass extends TopLevel[UserPass with Double]
  
}

