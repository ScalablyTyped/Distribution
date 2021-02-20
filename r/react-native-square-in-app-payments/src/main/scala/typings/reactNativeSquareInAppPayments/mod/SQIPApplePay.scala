package typings.reactNativeSquareInAppPayments.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SQIPApplePay {
  
  @js.native
  sealed trait ApplePayPaymentType extends StObject
  // Types
  @JSImport("react-native-square-in-app-payments", "SQIPApplePay.ApplePayPaymentType")
  @js.native
  object ApplePayPaymentType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ApplePayPaymentType with Double] = js.native
    
    /** A summary item representing the known, final cost. */
    @js.native
    sealed trait PaymentTypeFinal extends ApplePayPaymentType
    /* 2 */ val PaymentTypeFinal: typings.reactNativeSquareInAppPayments.mod.SQIPApplePay.ApplePayPaymentType.PaymentTypeFinal with Double = js.native
    
    /** A summary item representing an estimated or unknown cost. */
    @js.native
    sealed trait PaymentTypePending extends ApplePayPaymentType
    /* 1 */ val PaymentTypePending: typings.reactNativeSquareInAppPayments.mod.SQIPApplePay.ApplePayPaymentType.PaymentTypePending with Double = js.native
  }
  
  /**
    * Returns true if the device supports Apple Pay and the user has added at least one card that Square supports.
    * Not all brands supported by Apple Pay are supported by Square.
    * @platform IOS
    */
  @JSImport("react-native-square-in-app-payments", "SQIPApplePay.canUseApplePay")
  @js.native
  def canUseApplePay(): js.Promise[Boolean] = js.native
  
  /**
    * Notifies the native layer to close the Apple Pay sheet with success or failure status.
    * @platform IOS
    * @param isSuccess - Indicates success or failure.
    * @param [errorMessage] - The error message that Apple Pay displays in the native layer card entry view controller.
    * @throws ex
    */
  @JSImport("react-native-square-in-app-payments", "SQIPApplePay.completeApplePayAuthorization")
  @js.native
  def completeApplePayAuthorization(isSuccess: Boolean): js.Promise[Unit] = js.native
  @JSImport("react-native-square-in-app-payments", "SQIPApplePay.completeApplePayAuthorization")
  @js.native
  def completeApplePayAuthorization(isSuccess: Boolean, errorMessage: String): js.Promise[Unit] = js.native
  
  // Functions
  /**
    * Initializes the In-App Payments React Native plugin for Apple Pay.
    * This is a method called only once when React Native app is being initialized on an iOS device.
    * Call this method only on an iOS device and when your app is intended to support Apple Pay.
    * @platform IOS
    * @param applePayMerchantId - Registered Apple Pay merchant ID
    */
  @JSImport("react-native-square-in-app-payments", "SQIPApplePay.initializeApplePay")
  @js.native
  def initializeApplePay(applePayMerchantId: String): js.Promise[Unit] = js.native
  
  /**
    * Starts the Apple Pay payment authorization and returns a nonce based on the authorized Apple Pay payment token.
    * @platform IOS
    * @param applePayConfig - Configuration for Apple Pay
    * @param onApplePayNonceRequestSuccess - Invoked before Apple Pay sheet is closed. The success callback carries the generated nonce
    * @param onApplePayNonceRequestFailure - Invoked before Apple Pay sheet is closed. The failure callback carries information about the failure.
    * @param onApplePayComplete - Invoked when Apple Pay sheet is closed after success, failure, or cancellation.
    * @throws ex
    */
  @JSImport("react-native-square-in-app-payments", "SQIPApplePay.requestApplePayNonce")
  @js.native
  def requestApplePayNonce(
    applePayConfig: ApplePayConfig,
    onApplePayNonceRequestSuccess: ApplePayNonceRequestSuccessCallback,
    onApplePayNonceRequestFailure: ApplePayNonceRequestFailureCallback,
    onApplePayComplete: ApplePayCompleteCallback
  ): js.Promise[Unit] = js.native
  
  /**
    * Callback invoked when the native iOS Apple Pay payment authorization sheet is closed with success, failure, or cancellation.
    * This callback notifies caller widget when it should switch to other views.
    * @platform IOS
    */
  type ApplePayCompleteCallback = js.Function0[Unit]
  
  /** Represents the Apple Pay configuration. */
  @js.native
  trait ApplePayConfig extends StObject {
    
    /** The Apple Pay country code. */
    var countryCode: String = js.native
    
    /** ISO currency code of the payment amount. */
    var currencyCode: String = js.native
    
    /** Type of the payment summary item, PaymentTypeFinal for default */
    var paymentType: js.UndefOr[ApplePayPaymentType] = js.native
    
    /** The payment authorization amount as a string. */
    var price: String = js.native
    
    /** A label that displays the checkout summary in the Apple Pay view. */
    var summaryLabel: String = js.native
  }
  object ApplePayConfig {
    
    @scala.inline
    def apply(countryCode: String, currencyCode: String, price: String, summaryLabel: String): ApplePayConfig = {
      val __obj = js.Dynamic.literal(countryCode = countryCode.asInstanceOf[js.Any], currencyCode = currencyCode.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], summaryLabel = summaryLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplePayConfig]
    }
    
    @scala.inline
    implicit class ApplePayConfigMutableBuilder[Self <: ApplePayConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaymentType(value: ApplePayPaymentType): Self = StObject.set(x, "paymentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaymentTypeUndefined: Self = StObject.set(x, "paymentType", js.undefined)
      
      @scala.inline
      def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryLabel(value: String): Self = StObject.set(x, "summaryLabel", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Callback invoked when a card nonce cannot be generated from Apple Pay payment authorization card input values.
    * This callback is invoked before the native iOS Apple Pay payment authorization view controller is closed.
    * Call `completeApplePayAuthorization` with an error message to let the user modify input values and resubmit.
    * @platform IOS
    * @param error - Information about the error condition that prevented a nonce from being generated.
    */
  type ApplePayNonceRequestFailureCallback = js.Function1[/* error */ Error, Unit]
  
  // Callbacks
  /**
    * Callback invoked when Apple Pay card details are available
    * This is called before the Apple Pay payment authorization sheet is closed. Call `completeApplePayAuthorization` to close the apple pay sheet.
    * @platform IOS
    * @param cardDetails - The non-confidential details of the card and a nonce.
    */
  type ApplePayNonceRequestSuccessCallback = js.Function1[/* cardDetails */ CardDetails, Unit]
}
