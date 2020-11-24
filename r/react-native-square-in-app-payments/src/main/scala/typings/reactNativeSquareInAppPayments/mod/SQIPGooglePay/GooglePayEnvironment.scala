package typings.reactNativeSquareInAppPayments.mod.SQIPGooglePay

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GooglePayEnvironment extends js.Object
@JSImport("react-native-square-in-app-payments", "SQIPGooglePay.GooglePayEnvironment")
@js.native
object GooglePayEnvironment extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GooglePayEnvironment with Double] = js.native
  
  /** Environment to be used when an app is granted access to the Google Pay production environment. */
  @js.native
  sealed trait EnvironmentProduction extends GooglePayEnvironment
  /* 1 */ @js.native
  object EnvironmentProduction extends TopLevel[EnvironmentProduction with Double]
  
  /** Environment to be used for development and testing an application before approval for production. */
  @js.native
  sealed trait EnvironmentTest extends GooglePayEnvironment
  /* 3 */ @js.native
  object EnvironmentTest extends TopLevel[EnvironmentTest with Double]
}
