package typings.reactNativeSquareInAppPayments.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SQIPErrorCodes extends StObject
@JSImport("react-native-square-in-app-payments", "SQIPErrorCodes")
@js.native
object SQIPErrorCodes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SQIPErrorCodes & String] = js.native
  
  /**
    * The result when the customer cancels the Square Buyer Verification flow before a card is successfully verified.
    * Returned by: `BuyerVerificationErrorCallback`
    */
  @js.native
  sealed trait CANCELED
    extends StObject
       with SQIPErrorCodes
  /* "canceled" */ val CANCELED: typings.reactNativeSquareInAppPayments.mod.SQIPErrorCodes.CANCELED & String = js.native
  
  /**
    * Square Buyer Verification SDK could not verify the provided card.
    * Returned by: `BuyerVerificationErrorCallback`
    */
  @js.native
  sealed trait FAILED
    extends StObject
       with SQIPErrorCodes
  /* "failed" */ val FAILED: typings.reactNativeSquareInAppPayments.mod.SQIPErrorCodes.FAILED & String = js.native
  
  /**
    * In-App Payments SDK could not connect to the network.
    * Returned by: `applePayNonceRequestFailureCallback`, `googlePayNonceRequestFailureCallback`
    */
  @js.native
  sealed trait NO_NETWORK
    extends StObject
       with SQIPErrorCodes
  /* "noNetwork" */ val NO_NETWORK: typings.reactNativeSquareInAppPayments.mod.SQIPErrorCodes.NO_NETWORK & String = js.native
  
  /**
    * The version of the Square Buyer Verification SDK used by this application is no longer supported.
    * Returned by: `BuyerVerificationErrorCallback`
    */
  @js.native
  sealed trait UNSUPPORTED_SDK_VERSION
    extends StObject
       with SQIPErrorCodes
  /* "unsupportedSDKVersion" */ val UNSUPPORTED_SDK_VERSION: typings.reactNativeSquareInAppPayments.mod.SQIPErrorCodes.UNSUPPORTED_SDK_VERSION & String = js.native
  
  /**
    * In-App Payments SDK was used in an unexpected or unsupported way.
    * Returned by all methods
    */
  @js.native
  sealed trait USAGE_ERROR
    extends StObject
       with SQIPErrorCodes
  /* "usageError" */ val USAGE_ERROR: typings.reactNativeSquareInAppPayments.mod.SQIPErrorCodes.USAGE_ERROR & String = js.native
}
