package typings.reactNativeSquareInAppPayments.mod.SQIPApplePay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-square-in-app-payments", "SQIPApplePay.requestApplePayNonce")
@js.native
object requestApplePayNonce extends js.Object {
  
  /**
    * Starts the Apple Pay payment authorization and returns a nonce based on the authorized Apple Pay payment token.
    * @platform IOS
    * @param applePayConfig - Configuration for Apple Pay
    * @param onApplePayNonceRequestSuccess - Invoked before Apple Pay sheet is closed. The success callback carries the generated nonce
    * @param onApplePayNonceRequestFailure - Invoked before Apple Pay sheet is closed. The failure callback carries information about the failure.
    * @param onApplePayComplete - Invoked when Apple Pay sheet is closed after success, failure, or cancellation.
    * @throws ex
    */
  def apply(
    applePayConfig: ApplePayConfig,
    onApplePayNonceRequestSuccess: ApplePayNonceRequestSuccessCallback,
    onApplePayNonceRequestFailure: ApplePayNonceRequestFailureCallback,
    onApplePayComplete: ApplePayCompleteCallback
  ): js.Promise[Unit] = js.native
}
