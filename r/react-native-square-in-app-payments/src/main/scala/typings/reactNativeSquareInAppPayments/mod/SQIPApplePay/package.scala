package typings.reactNativeSquareInAppPayments.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object SQIPApplePay {
  
  /**
    * Callback invoked when the native iOS Apple Pay payment authorization sheet is closed with success, failure, or cancellation.
    * This callback notifies caller widget when it should switch to other views.
    * @platform IOS
    */
  type ApplePayCompleteCallback = js.Function0[scala.Unit]
  
  /**
    * Callback invoked when a card nonce cannot be generated from Apple Pay payment authorization card input values.
    * This callback is invoked before the native iOS Apple Pay payment authorization view controller is closed.
    * Call `completeApplePayAuthorization` with an error message to let the user modify input values and resubmit.
    * @platform IOS
    * @param error - Information about the error condition that prevented a nonce from being generated.
    */
  type ApplePayNonceRequestFailureCallback = js.Function1[/* error */ typings.reactNativeSquareInAppPayments.mod.Error, scala.Unit]
  
  // Callbacks
  /**
    * Callback invoked when Apple Pay card details are available
    * This is called before the Apple Pay payment authorization sheet is closed. Call `completeApplePayAuthorization` to close the apple pay sheet.
    * @platform IOS
    * @param cardDetails - The non-confidential details of the card and a nonce.
    */
  type ApplePayNonceRequestSuccessCallback = js.Function1[
    /* cardDetails */ typings.reactNativeSquareInAppPayments.mod.CardDetails, 
    scala.Unit
  ]
}
