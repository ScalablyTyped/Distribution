package typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ACCESS_CONTROL extends js.Object

@JSImport("react-native-keychain", "ACCESS_CONTROL")
@js.native
object ACCESS_CONTROL extends js.Object {
  @js.native
  sealed trait APPLICATION_PASSWORD extends ACCESS_CONTROL
  
  @js.native
  sealed trait BIOMETRY_ANY extends ACCESS_CONTROL
  
  @js.native
  sealed trait BIOMETRY_ANY_OR_DEVICE_PASSCODE extends ACCESS_CONTROL
  
  @js.native
  sealed trait BIOMETRY_CURRENT_SET extends ACCESS_CONTROL
  
  @js.native
  sealed trait BIOMETRY_CURRENT_SET_OR_DEVICE_PASSCODE extends ACCESS_CONTROL
  
  @js.native
  sealed trait DEVICE_PASSCODE extends ACCESS_CONTROL
  
  @js.native
  sealed trait USER_PRESENCE extends ACCESS_CONTROL
  
  /* "ApplicationPassword" */ val APPLICATION_PASSWORD: typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.ACCESS_CONTROL.APPLICATION_PASSWORD with String = js.native
  /* "BiometryAny" */ val BIOMETRY_ANY: typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.ACCESS_CONTROL.BIOMETRY_ANY with String = js.native
  /* "BiometryAnyOrDevicePasscode" */ val BIOMETRY_ANY_OR_DEVICE_PASSCODE: typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.ACCESS_CONTROL.BIOMETRY_ANY_OR_DEVICE_PASSCODE with String = js.native
  /* "BiometryCurrentSet" */ val BIOMETRY_CURRENT_SET: typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.ACCESS_CONTROL.BIOMETRY_CURRENT_SET with String = js.native
  /* "BiometryCurrentSetOrDevicePasscode" */ val BIOMETRY_CURRENT_SET_OR_DEVICE_PASSCODE: typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.ACCESS_CONTROL.BIOMETRY_CURRENT_SET_OR_DEVICE_PASSCODE with String = js.native
  /* "DevicePasscode" */ val DEVICE_PASSCODE: typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.ACCESS_CONTROL.DEVICE_PASSCODE with String = js.native
  /* "UserPresence" */ val USER_PRESENCE: typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.ACCESS_CONTROL.USER_PRESENCE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ACCESS_CONTROL with String] = js.native
}

