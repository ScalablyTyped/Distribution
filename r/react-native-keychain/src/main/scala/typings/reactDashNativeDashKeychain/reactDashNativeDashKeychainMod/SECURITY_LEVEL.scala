package typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SECURITY_LEVEL extends js.Object

@JSImport("react-native-keychain", "SECURITY_LEVEL")
@js.native
object SECURITY_LEVEL extends js.Object {
  @js.native
  sealed trait ANY extends SECURITY_LEVEL
  
  @js.native
  sealed trait SECURE_HARDWARE extends SECURITY_LEVEL
  
  @js.native
  sealed trait SECURE_SOFTWARE extends SECURITY_LEVEL
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SECURITY_LEVEL with Double] = js.native
  /* 2 */ @js.native
  object ANY extends TopLevel[ANY with Double]
  
  /* 1 */ @js.native
  object SECURE_HARDWARE extends TopLevel[SECURE_HARDWARE with Double]
  
  /* 0 */ @js.native
  object SECURE_SOFTWARE extends TopLevel[SECURE_SOFTWARE with Double]
  
}

