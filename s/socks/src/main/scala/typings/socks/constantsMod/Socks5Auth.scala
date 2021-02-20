package typings.socks.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Socks5Auth extends StObject
@JSImport("socks/typings/common/constants", "Socks5Auth")
@js.native
object Socks5Auth extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Socks5Auth with Double] = js.native
  
  @js.native
  sealed trait GSSApi extends Socks5Auth
  /* 1 */ val GSSApi: typings.socks.constantsMod.Socks5Auth.GSSApi with Double = js.native
  
  @js.native
  sealed trait NoAuth extends Socks5Auth
  /* 0 */ val NoAuth: typings.socks.constantsMod.Socks5Auth.NoAuth with Double = js.native
  
  @js.native
  sealed trait UserPass extends Socks5Auth
  /* 2 */ val UserPass: typings.socks.constantsMod.Socks5Auth.UserPass with Double = js.native
}
