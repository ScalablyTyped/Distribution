package typings.reactNativeSquareInAppPayments.mod.SQIPGooglePay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-square-in-app-payments", "SQIPGooglePay.initializeGooglePay")
@js.native
object initializeGooglePay extends js.Object {
  
  // Functions
  /**
    * Used to enable Google Pay in an Android app. Initialize React Native plugin for google pay.
    * This is a method called only once when React Native app is being initialized on an Android device.
    * @platform Android
    * @param squareLocationId - The Square Location ID from the developer portal.
    * @param environment - Specifies the Google Pay environment to run Google Pay in: Test or Production
    */
  def apply(squareLocationId: String, environment: GooglePayEnvironment): js.Promise[Unit] = js.native
}
