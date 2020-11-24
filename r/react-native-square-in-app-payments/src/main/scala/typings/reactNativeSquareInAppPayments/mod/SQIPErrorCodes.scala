package typings.reactNativeSquareInAppPayments.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SQIPErrorCodes extends js.Object
@JSImport("react-native-square-in-app-payments", "SQIPErrorCodes")
@js.native
object SQIPErrorCodes extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SQIPErrorCodes with String] = js.native
  
  /**
    * The result when the customer cancels the Square Buyer Verification flow before a card is successfully verified.
    * Returned by: `BuyerVerificationErrorCallback`
    */
  @js.native
  sealed trait CANCELED extends SQIPErrorCodes
  /* "canceled" */ @js.native
  object CANCELED extends TopLevel[CANCELED with String]
  
  /**
    * Square Buyer Verification SDK could not verify the provided card.
    * Returned by: `BuyerVerificationErrorCallback`
    */
  @js.native
  sealed trait FAILED extends SQIPErrorCodes
  /* "failed" */ @js.native
  object FAILED extends TopLevel[FAILED with String]
  
  /**
    * In-App Payments SDK could not connect to the network.
    * Returned by: `applePayNonceRequestFailureCallback`, `googlePayNonceRequestFailureCallback`
    */
  @js.native
  sealed trait NO_NETWORK extends SQIPErrorCodes
  /* "noNetwork" */ @js.native
  object NO_NETWORK extends TopLevel[NO_NETWORK with String]
  
  /**
    * The version of the Square Buyer Verification SDK used by this application is no longer supported.
    * Returned by: `BuyerVerificationErrorCallback`
    */
  @js.native
  sealed trait UNSUPPORTED_SDK_VERSION extends SQIPErrorCodes
  /* "unsupportedSDKVersion" */ @js.native
  object UNSUPPORTED_SDK_VERSION extends TopLevel[UNSUPPORTED_SDK_VERSION with String]
  
  /**
    * In-App Payments SDK was used in an unexpected or unsupported way.
    * Returned by all methods
    */
  @js.native
  sealed trait USAGE_ERROR extends SQIPErrorCodes
  /* "usageError" */ @js.native
  object USAGE_ERROR extends TopLevel[USAGE_ERROR with String]
}
