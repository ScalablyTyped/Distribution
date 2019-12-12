package typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod

import org.scalablytyped.runtime.TopLevel
import typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.LAPolicy.BIOMETRICS
import typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.LAPolicy.DEVICE_PASSCODE_OR_BIOMETRICS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LAPolicy extends js.Object

@JSImport("react-native-keychain", "LAPolicy")
@js.native
object LAPolicy extends js.Object {
  @js.native
  sealed trait BIOMETRICS extends LAPolicy
  
  @js.native
  sealed trait DEVICE_PASSCODE_OR_BIOMETRICS extends LAPolicy
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LAPolicy with String] = js.native
  /* "AuthenticationWithBiometrics" */ @js.native
  object BIOMETRICS extends TopLevel[BIOMETRICS with String]
  
  /* "AuthenticationWithBiometricsDevicePasscode" */ @js.native
  object DEVICE_PASSCODE_OR_BIOMETRICS extends TopLevel[DEVICE_PASSCODE_OR_BIOMETRICS with String]
  
}

