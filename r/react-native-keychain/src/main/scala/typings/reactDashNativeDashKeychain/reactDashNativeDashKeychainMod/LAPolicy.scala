package typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod

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
  
  /* "AuthenticationWithBiometrics" */ val BIOMETRICS: typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.LAPolicy.BIOMETRICS with String = js.native
  /* "AuthenticationWithBiometricsDevicePasscode" */ val DEVICE_PASSCODE_OR_BIOMETRICS: typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.LAPolicy.DEVICE_PASSCODE_OR_BIOMETRICS with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LAPolicy with String] = js.native
}

