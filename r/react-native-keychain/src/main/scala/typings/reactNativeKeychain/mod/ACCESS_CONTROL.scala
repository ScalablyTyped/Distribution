package typings.reactNativeKeychain.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ACCESS_CONTROL extends js.Object
@JSImport("react-native-keychain", "ACCESS_CONTROL")
@js.native
object ACCESS_CONTROL extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ACCESS_CONTROL with String] = js.native
  
  @js.native
  sealed trait APPLICATION_PASSWORD extends ACCESS_CONTROL
  /* "ApplicationPassword" */ @js.native
  object APPLICATION_PASSWORD extends TopLevel[APPLICATION_PASSWORD with String]
  
  @js.native
  sealed trait BIOMETRY_ANY extends ACCESS_CONTROL
  /* "BiometryAny" */ @js.native
  object BIOMETRY_ANY extends TopLevel[BIOMETRY_ANY with String]
  
  @js.native
  sealed trait BIOMETRY_ANY_OR_DEVICE_PASSCODE extends ACCESS_CONTROL
  /* "BiometryAnyOrDevicePasscode" */ @js.native
  object BIOMETRY_ANY_OR_DEVICE_PASSCODE extends TopLevel[BIOMETRY_ANY_OR_DEVICE_PASSCODE with String]
  
  @js.native
  sealed trait BIOMETRY_CURRENT_SET extends ACCESS_CONTROL
  /* "BiometryCurrentSet" */ @js.native
  object BIOMETRY_CURRENT_SET extends TopLevel[BIOMETRY_CURRENT_SET with String]
  
  @js.native
  sealed trait BIOMETRY_CURRENT_SET_OR_DEVICE_PASSCODE extends ACCESS_CONTROL
  /* "BiometryCurrentSetOrDevicePasscode" */ @js.native
  object BIOMETRY_CURRENT_SET_OR_DEVICE_PASSCODE extends TopLevel[BIOMETRY_CURRENT_SET_OR_DEVICE_PASSCODE with String]
  
  @js.native
  sealed trait DEVICE_PASSCODE extends ACCESS_CONTROL
  /* "DevicePasscode" */ @js.native
  object DEVICE_PASSCODE extends TopLevel[DEVICE_PASSCODE with String]
  
  @js.native
  sealed trait USER_PRESENCE extends ACCESS_CONTROL
  /* "UserPresence" */ @js.native
  object USER_PRESENCE extends TopLevel[USER_PRESENCE with String]
}
