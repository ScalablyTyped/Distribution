package typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ACCESS_CONTROL with String] = js.native
  /* "ApplicationPassword" */ @js.native
  object APPLICATION_PASSWORD extends TopLevel[APPLICATION_PASSWORD with String]
  
  /* "BiometryAny" */ @js.native
  object BIOMETRY_ANY extends TopLevel[BIOMETRY_ANY with String]
  
  /* "BiometryAnyOrDevicePasscode" */ @js.native
  object BIOMETRY_ANY_OR_DEVICE_PASSCODE extends TopLevel[BIOMETRY_ANY_OR_DEVICE_PASSCODE with String]
  
  /* "BiometryCurrentSet" */ @js.native
  object BIOMETRY_CURRENT_SET extends TopLevel[BIOMETRY_CURRENT_SET with String]
  
  /* "BiometryCurrentSetOrDevicePasscode" */ @js.native
  object BIOMETRY_CURRENT_SET_OR_DEVICE_PASSCODE extends TopLevel[BIOMETRY_CURRENT_SET_OR_DEVICE_PASSCODE with String]
  
  /* "DevicePasscode" */ @js.native
  object DEVICE_PASSCODE extends TopLevel[DEVICE_PASSCODE with String]
  
  /* "UserPresence" */ @js.native
  object USER_PRESENCE extends TopLevel[USER_PRESENCE with String]
  
}

