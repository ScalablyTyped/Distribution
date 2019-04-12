package typings
package socksLib.typingsCommonConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Socks5Auth extends js.Object

@JSImport("socks/typings/common/constants", "Socks5Auth")
@js.native
object Socks5Auth extends js.Object {
  @js.native
  sealed trait GSSApi
    extends socksLib.typingsCommonConstantsMod.Socks5Auth
  
  @js.native
  sealed trait NoAuth
    extends socksLib.typingsCommonConstantsMod.Socks5Auth
  
  @js.native
  sealed trait UserPass
    extends socksLib.typingsCommonConstantsMod.Socks5Auth
  
  /* 1 */ val GSSApi: GSSApi with scala.Double = js.native
  /* 0 */ val NoAuth: NoAuth with scala.Double = js.native
  /* 2 */ val UserPass: UserPass with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[socksLib.typingsCommonConstantsMod.Socks5Auth with scala.Double] = js.native
}

