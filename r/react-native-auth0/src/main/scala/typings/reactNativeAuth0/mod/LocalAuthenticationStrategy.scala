package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LocalAuthenticationStrategy extends StObject
@JSImport("react-native-auth0", "LocalAuthenticationStrategy")
@js.native
object LocalAuthenticationStrategy extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LocalAuthenticationStrategy & Double] = js.native
  
  @js.native
  sealed trait deviceOwner
    extends StObject
       with LocalAuthenticationStrategy
  /* 2 */ val deviceOwner: typings.reactNativeAuth0.mod.LocalAuthenticationStrategy.deviceOwner & Double = js.native
  
  @js.native
  sealed trait deviceOwnerWithBiometrics
    extends StObject
       with LocalAuthenticationStrategy
  /* 1 */ val deviceOwnerWithBiometrics: typings.reactNativeAuth0.mod.LocalAuthenticationStrategy.deviceOwnerWithBiometrics & Double = js.native
}
