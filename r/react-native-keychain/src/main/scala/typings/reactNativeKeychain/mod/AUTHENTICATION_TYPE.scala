package typings.reactNativeKeychain.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AUTHENTICATION_TYPE extends js.Object
@JSImport("react-native-keychain", "AUTHENTICATION_TYPE")
@js.native
object AUTHENTICATION_TYPE extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AUTHENTICATION_TYPE with String] = js.native
  
  @js.native
  sealed trait BIOMETRICS extends AUTHENTICATION_TYPE
  /* "AuthenticationWithBiometrics" */ @js.native
  object BIOMETRICS extends TopLevel[BIOMETRICS with String]
  
  @js.native
  sealed trait DEVICE_PASSCODE_OR_BIOMETRICS extends AUTHENTICATION_TYPE
  /* "AuthenticationWithBiometricsDevicePasscode" */ @js.native
  object DEVICE_PASSCODE_OR_BIOMETRICS extends TopLevel[DEVICE_PASSCODE_OR_BIOMETRICS with String]
}
