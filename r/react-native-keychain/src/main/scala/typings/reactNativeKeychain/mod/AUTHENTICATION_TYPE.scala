package typings.reactNativeKeychain.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AUTHENTICATION_TYPE extends js.Object

@JSImport("react-native-keychain", "AUTHENTICATION_TYPE")
@js.native
object AUTHENTICATION_TYPE extends js.Object {
  @js.native
  sealed trait BIOMETRICS extends AUTHENTICATION_TYPE
  
  @js.native
  sealed trait DEVICE_PASSCODE_OR_BIOMETRICS extends AUTHENTICATION_TYPE
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AUTHENTICATION_TYPE with String] = js.native
  /* "AuthenticationWithBiometrics" */ @js.native
  object BIOMETRICS extends TopLevel[BIOMETRICS with String]
  
  /* "AuthenticationWithBiometricsDevicePasscode" */ @js.native
  object DEVICE_PASSCODE_OR_BIOMETRICS extends TopLevel[DEVICE_PASSCODE_OR_BIOMETRICS with String]
  
}

