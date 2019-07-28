package typings.socks.typingsCommonConstantsMod

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
  
  /* 1 */ val GSSApi: typings.socks.typingsCommonConstantsMod.Socks5Auth.GSSApi with Double = js.native
  /* 0 */ val NoAuth: typings.socks.typingsCommonConstantsMod.Socks5Auth.NoAuth with Double = js.native
  /* 2 */ val UserPass: typings.socks.typingsCommonConstantsMod.Socks5Auth.UserPass with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Socks5Auth with Double] = js.native
}

