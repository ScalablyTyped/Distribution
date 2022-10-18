package typings.socks.typingsCommonConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Socks5Auth extends StObject
@JSImport("socks/typings/common/constants", "Socks5Auth")
@js.native
object Socks5Auth extends StObject {
  
  @js.native
  sealed trait GSSApi
    extends StObject
       with Socks5Auth
  
  @js.native
  sealed trait NoAuth
    extends StObject
       with Socks5Auth
  
  @js.native
  sealed trait UserPass
    extends StObject
       with Socks5Auth
}
