package typings.reactNativeSquareInAppPayments.mod.SQIPApplePay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-square-in-app-payments", "SQIPApplePay.initializeApplePay")
@js.native
object initializeApplePay extends js.Object {
  
  // Functions
  /**
    * Initializes the In-App Payments React Native plugin for Apple Pay.
    * This is a method called only once when React Native app is being initialized on an iOS device.
    * Call this method only on an iOS device and when your app is intended to support Apple Pay.
    * @platform IOS
    * @param applePayMerchantId - Registered Apple Pay merchant ID
    */
  def apply(applePayMerchantId: String): js.Promise[Unit] = js.native
}
