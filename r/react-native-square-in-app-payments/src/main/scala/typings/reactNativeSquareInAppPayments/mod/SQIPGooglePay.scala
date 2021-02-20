package typings.reactNativeSquareInAppPayments.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SQIPGooglePay {
  
  @js.native
  sealed trait GooglePayEnvironment extends StObject
  @JSImport("react-native-square-in-app-payments", "SQIPGooglePay.GooglePayEnvironment")
  @js.native
  object GooglePayEnvironment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[GooglePayEnvironment with Double] = js.native
    
    /** Environment to be used when an app is granted access to the Google Pay production environment. */
    @js.native
    sealed trait EnvironmentProduction extends GooglePayEnvironment
    /* 1 */ val EnvironmentProduction: typings.reactNativeSquareInAppPayments.mod.SQIPGooglePay.GooglePayEnvironment.EnvironmentProduction with Double = js.native
    
    /** Environment to be used for development and testing an application before approval for production. */
    @js.native
    sealed trait EnvironmentTest extends GooglePayEnvironment
    /* 3 */ val EnvironmentTest: typings.reactNativeSquareInAppPayments.mod.SQIPGooglePay.GooglePayEnvironment.EnvironmentTest with Double = js.native
  }
  
  @js.native
  sealed trait GooglePayPriceStatus extends StObject
  // Types
  @JSImport("react-native-square-in-app-payments", "SQIPGooglePay.GooglePayPriceStatus")
  @js.native
  object GooglePayPriceStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[GooglePayPriceStatus with Double] = js.native
    
    /** Total price may adjust based on the details of the response, such as sales tax collected based on a billing address. */
    @js.native
    sealed trait TotalPriceStatusEstimated extends GooglePayPriceStatus
    /* 2 */ val TotalPriceStatusEstimated: typings.reactNativeSquareInAppPayments.mod.SQIPGooglePay.GooglePayPriceStatus.TotalPriceStatusEstimated with Double = js.native
    
    /** Total price will not change from the amount presented to the user. */
    @js.native
    sealed trait TotalPriceStatusFinal extends GooglePayPriceStatus
    /* 3 */ val TotalPriceStatusFinal: typings.reactNativeSquareInAppPayments.mod.SQIPGooglePay.GooglePayPriceStatus.TotalPriceStatusFinal with Double = js.native
    
    /** used for a capability check */
    @js.native
    sealed trait TotalPriceStatusNotCurrentlyKnown extends GooglePayPriceStatus
    /* 1 */ val TotalPriceStatusNotCurrentlyKnown: typings.reactNativeSquareInAppPayments.mod.SQIPGooglePay.GooglePayPriceStatus.TotalPriceStatusNotCurrentlyKnown with Double = js.native
  }
  
  /**
    * Returns true if the device supports Google Pay and the user has added at least one card that Square supports.
    * Square doesn't support all the brands apple pay supports.
    * @platform Android
    * @throws ex
    */
  @JSImport("react-native-square-in-app-payments", "SQIPGooglePay.canUseGooglePay")
  @js.native
  def canUseGooglePay(): js.Promise[Boolean] = js.native
  
  // Functions
  /**
    * Used to enable Google Pay in an Android app. Initialize React Native plugin for google pay.
    * This is a method called only once when React Native app is being initialized on an Android device.
    * @platform Android
    * @param squareLocationId - The Square Location ID from the developer portal.
    * @param environment - Specifies the Google Pay environment to run Google Pay in: Test or Production
    */
  @JSImport("react-native-square-in-app-payments", "SQIPGooglePay.initializeGooglePay")
  @js.native
  def initializeGooglePay(squareLocationId: String, environment: GooglePayEnvironment): js.Promise[Unit] = js.native
  
  /**
    * Starts the Google Pay payment authorization and returns a nonce based on the authorized Google Pay payment token.
    * @platform Android
    * @param googlePayConfig - Configuration for Google Pay
    * @param onGooglePayNonceRequestSuccess - Success callback invoked when a nonce is available.
    * @param onGooglePayNonceRequestFailure - Failure callback invoked when SDK failed to produce a nonce.
    * @param onGooglePayCanceled - Cancel callback invoked when user cancels payment authorization.
    * @throws ex
    */
  @JSImport("react-native-square-in-app-payments", "SQIPGooglePay.requestGooglePayNonce")
  @js.native
  def requestGooglePayNonce(
    googlePayConfig: GooglePayConfig,
    onGooglePayNonceRequestSuccess: GooglePayNonceRequestSuccessCallback,
    onGooglePayNonceRequestFailure: GooglePayNonceRequestFailureCallback,
    onGooglePayCanceled: GooglePayCancelCallback
  ): js.Promise[Unit] = js.native
  
  /**
    * Callback invoked when Google Pay payment authorization is canceled.
    * @platform Android
    */
  type GooglePayCancelCallback = js.Function0[Unit]
  
  /** Represents the Google Pay configuration. */
  @js.native
  trait GooglePayConfig extends StObject {
    
    /** ISO currency code of the payment amount. */
    var currencyCode: String = js.native
    
    /** The payment authorization amount as a string. */
    var price: String = js.native
    
    /** The status of the total price used */
    var priceStatus: GooglePayPriceStatus = js.native
  }
  object GooglePayConfig {
    
    @scala.inline
    def apply(currencyCode: String, price: String, priceStatus: GooglePayPriceStatus): GooglePayConfig = {
      val __obj = js.Dynamic.literal(currencyCode = currencyCode.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], priceStatus = priceStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[GooglePayConfig]
    }
    
    @scala.inline
    implicit class GooglePayConfigMutableBuilder[Self <: GooglePayConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriceStatus(value: GooglePayPriceStatus): Self = StObject.set(x, "priceStatus", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Callback invoked a card nonce could not be obtained.
    * @platform Android
    * @param error - Information about the cause of the error.
    */
  type GooglePayNonceRequestFailureCallback = js.Function1[/* error */ Error, Unit]
  
  // Callbacks
  /**
    * Callback invoked with cardDetails with Google Pay are available.
    * @platform Android
    * @param cardDetails - The non-confidential details of the card and a nonce.
    */
  type GooglePayNonceRequestSuccessCallback = js.Function1[/* cardDetails */ CardDetails, Unit]
}
