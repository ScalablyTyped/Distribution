package typings.socks.typingsCommonConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Socks5Auth extends StObject
@JSImport("socks/typings/common/constants", "Socks5Auth")
@js.native
object Socks5Auth extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Socks5Auth & Double] = js.native
  
  @js.native
  sealed trait GSSApi
    extends StObject
       with Socks5Auth
  /* 1 */ val GSSApi: typings.socks.typingsCommonConstantsMod.Socks5Auth.GSSApi & Double = js.native
  
  @js.native
  sealed trait NoAuth
    extends StObject
       with Socks5Auth
  /* 0 */ val NoAuth: typings.socks.typingsCommonConstantsMod.Socks5Auth.NoAuth & Double = js.native
  
  @js.native
  sealed trait UserPass
    extends StObject
       with Socks5Auth
  /* 2 */ val UserPass: typings.socks.typingsCommonConstantsMod.Socks5Auth.UserPass & Double = js.native
}
