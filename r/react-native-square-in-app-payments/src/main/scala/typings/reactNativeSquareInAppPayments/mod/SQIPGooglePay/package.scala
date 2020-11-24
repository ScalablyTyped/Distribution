package typings.reactNativeSquareInAppPayments.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object SQIPGooglePay {
  
  /**
    * Callback invoked when Google Pay payment authorization is canceled.
    * @platform Android
    */
  type GooglePayCancelCallback = js.Function0[scala.Unit]
  
  /**
    * Callback invoked a card nonce could not be obtained.
    * @platform Android
    * @param error - Information about the cause of the error.
    */
  type GooglePayNonceRequestFailureCallback = js.Function1[/* error */ typings.reactNativeSquareInAppPayments.mod.Error, scala.Unit]
  
  // Callbacks
  /**
    * Callback invoked with cardDetails with Google Pay are available.
    * @platform Android
    * @param cardDetails - The non-confidential details of the card and a nonce.
    */
  type GooglePayNonceRequestSuccessCallback = js.Function1[
    /* cardDetails */ typings.reactNativeSquareInAppPayments.mod.CardDetails, 
    scala.Unit
  ]
}
