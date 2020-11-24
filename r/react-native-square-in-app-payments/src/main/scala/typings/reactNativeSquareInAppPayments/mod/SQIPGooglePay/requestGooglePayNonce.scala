package typings.reactNativeSquareInAppPayments.mod.SQIPGooglePay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-square-in-app-payments", "SQIPGooglePay.requestGooglePayNonce")
@js.native
object requestGooglePayNonce extends js.Object {
  
  /**
    * Starts the Google Pay payment authorization and returns a nonce based on the authorized Google Pay payment token.
    * @platform Android
    * @param googlePayConfig - Configuration for Google Pay
    * @param onGooglePayNonceRequestSuccess - Success callback invoked when a nonce is available.
    * @param onGooglePayNonceRequestFailure - Failure callback invoked when SDK failed to produce a nonce.
    * @param onGooglePayCanceled - Cancel callback invoked when user cancels payment authorization.
    * @throws ex
    */
  def apply(
    googlePayConfig: GooglePayConfig,
    onGooglePayNonceRequestSuccess: GooglePayNonceRequestSuccessCallback,
    onGooglePayNonceRequestFailure: GooglePayNonceRequestFailureCallback,
    onGooglePayCanceled: GooglePayCancelCallback
  ): js.Promise[Unit] = js.native
}
