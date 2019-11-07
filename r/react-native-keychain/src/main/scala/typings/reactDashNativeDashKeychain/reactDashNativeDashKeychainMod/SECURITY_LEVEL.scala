package typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod

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
  
  /* 2 */ val ANY: typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.SECURITY_LEVEL.ANY with Double = js.native
  /* 1 */ val SECURE_HARDWARE: typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.SECURITY_LEVEL.SECURE_HARDWARE with Double = js.native
  /* 0 */ val SECURE_SOFTWARE: typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.SECURITY_LEVEL.SECURE_SOFTWARE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SECURITY_LEVEL with Double] = js.native
}

