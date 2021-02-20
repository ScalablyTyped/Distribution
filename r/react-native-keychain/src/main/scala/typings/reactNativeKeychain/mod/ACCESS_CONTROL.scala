package typings.reactNativeKeychain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ACCESS_CONTROL extends StObject
@JSImport("react-native-keychain", "ACCESS_CONTROL")
@js.native
object ACCESS_CONTROL extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ACCESS_CONTROL with String] = js.native
  
  @js.native
  sealed trait APPLICATION_PASSWORD extends ACCESS_CONTROL
  /* "ApplicationPassword" */ val APPLICATION_PASSWORD: typings.reactNativeKeychain.mod.ACCESS_CONTROL.APPLICATION_PASSWORD with String = js.native
  
  @js.native
  sealed trait BIOMETRY_ANY extends ACCESS_CONTROL
  /* "BiometryAny" */ val BIOMETRY_ANY: typings.reactNativeKeychain.mod.ACCESS_CONTROL.BIOMETRY_ANY with String = js.native
  
  @js.native
  sealed trait BIOMETRY_ANY_OR_DEVICE_PASSCODE extends ACCESS_CONTROL
  /* "BiometryAnyOrDevicePasscode" */ val BIOMETRY_ANY_OR_DEVICE_PASSCODE: typings.reactNativeKeychain.mod.ACCESS_CONTROL.BIOMETRY_ANY_OR_DEVICE_PASSCODE with String = js.native
  
  @js.native
  sealed trait BIOMETRY_CURRENT_SET extends ACCESS_CONTROL
  /* "BiometryCurrentSet" */ val BIOMETRY_CURRENT_SET: typings.reactNativeKeychain.mod.ACCESS_CONTROL.BIOMETRY_CURRENT_SET with String = js.native
  
  @js.native
  sealed trait BIOMETRY_CURRENT_SET_OR_DEVICE_PASSCODE extends ACCESS_CONTROL
  /* "BiometryCurrentSetOrDevicePasscode" */ val BIOMETRY_CURRENT_SET_OR_DEVICE_PASSCODE: typings.reactNativeKeychain.mod.ACCESS_CONTROL.BIOMETRY_CURRENT_SET_OR_DEVICE_PASSCODE with String = js.native
  
  @js.native
  sealed trait DEVICE_PASSCODE extends ACCESS_CONTROL
  /* "DevicePasscode" */ val DEVICE_PASSCODE: typings.reactNativeKeychain.mod.ACCESS_CONTROL.DEVICE_PASSCODE with String = js.native
  
  @js.native
  sealed trait USER_PRESENCE extends ACCESS_CONTROL
  /* "UserPresence" */ val USER_PRESENCE: typings.reactNativeKeychain.mod.ACCESS_CONTROL.USER_PRESENCE with String = js.native
}
