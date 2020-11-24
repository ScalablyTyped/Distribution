package typings.reactNativeSquareInAppPayments.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object SQIPCardEntry {
  
  /**
    * Callback invoked when Buyer Verification flow fails.
    */
  type BuyerVerificationErrorCallback = js.Function0[scala.Unit]
  
  /**
    * Callback invoked when Buyer Verification flow succeeds.
    * @param buyerVerificationDetails
    */
  type BuyerVerificationSuccessCallback = js.Function1[
    /* buyerVerificationDetails */ typings.reactNativeSquareInAppPayments.mod.SQIPCardEntry.BuyerVerificationDetails, 
    scala.Unit
  ]
  
  /**
    * Callback invoked when card entry canceled and has been closed.
    * Do not call completeCardEntry because the operation is complete and the card entry form is closed.
    */
  type CardEntryCancelCallback = js.Function0[scala.Unit]
  
  /**
    * Callback invoked when card entry is completed and has been closed.
    */
  type CardEntryCompleteCallback = js.Function0[scala.Unit]
  
  // Callbacks
  /**
    * Callback invoked when card entry is returned successfully with card details.
    * @param cardDetails - The results of a successful card entry
    */
  type CardEntryNonceRequestSuccessCallback = js.Function1[
    /* cardDetails */ typings.reactNativeSquareInAppPayments.mod.CardDetails, 
    scala.Unit
  ]
  
  type KeyboardAppearance = typings.reactNativeSquareInAppPayments.reactNativeSquareInAppPaymentsStrings.Light | java.lang.String
}
