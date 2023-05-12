package typings.recurlyRecurlyJs

import org.scalablytyped.runtime.StringDictionary
import typings.recurlyRecurlyJs.anon.OnPaymentDataChanged
import typings.recurlyRecurlyJs.libEmitterMod.Emitter
import typings.recurlyRecurlyJs.libGooglePayNativeMod.GooglePayPaymentDataError
import typings.recurlyRecurlyJs.libGooglePayNativeMod.GooglePayPaymentDataRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGooglePayMod {
  
  type GooglePay = js.Function1[/* options */ GooglePayOptions, Emitter[GooglePayEvent]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.token
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.error
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.ready
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.paymentAuthorized
  */
  trait GooglePayEvent extends StObject
  object GooglePayEvent {
    
    inline def error: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.error = "error".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.error]
    
    inline def paymentAuthorized: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.paymentAuthorized = "paymentAuthorized".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.paymentAuthorized]
    
    inline def ready: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.ready = "ready".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.ready]
    
    inline def token: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.token = "token".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.token]
  }
  
  trait GooglePayOptions extends StObject {
    
    /**
      * Requires the user to accept providing the full billing address.
      */
    var billingAddressRequired: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The object to configure the Google Pay payment button.
      * See https://developers.google.com/pay/api/web/reference/request-objects#ButtonOptions for options supported.
      *
      */
    var buttonOptions: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * Callbacks for the events emitted by the payment session when dynamic price updates are requested.
      */
    var callbacks: js.UndefOr[OnPaymentDataChanged] = js.undefined
    
    /**
      * Your ISO 3166 country code (ex: ‘US’). This is your country code as the merchant.
      * Required unless paymentData.transactionInfo.countryCode is used.
      */
    var country: js.UndefOr[String] = js.undefined
    
    /**
      * ISO 4217 purchase currency (ex: ‘USD’).
      * Required unless paymentData.transactionInfo.currencyCode is used.
      */
    var currency: js.UndefOr[String] = js.undefined
    
    /**
      * Specify which Payment Gateway in Recurly must handle the payment.
      */
    var gatewayCode: js.UndefOr[String] = js.undefined
    
    /**
      * The Google merchant business name registered with the Google Pay and Wallet Console.
      */
    var googleBusinessName: js.UndefOr[String] = js.undefined
    
    /**
      * The Google merchant identifier issued after registration with the Google Pay and Wallet Console.
      * Required unless paymentData.merchantInfo.merchantId is used.
      */
    var googleMerchantId: js.UndefOr[String] = js.undefined
    
    /**
      * Specify configuration for Google Pay API.
      */
    var paymentDataRequest: js.UndefOr[GooglePayPaymentDataRequest] = js.undefined
    
    /**
      * Requires the user to accept providing the full billing address.
      * @deprecated use billingAddressRequired
      */
    var requireBillingAddress: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Total cost to display in the Google Pay payment sheet.
      * Required unless paymentData.transactionInfo.totalPrice is used.
      */
    var total: js.UndefOr[String] = js.undefined
  }
  object GooglePayOptions {
    
    inline def apply(): GooglePayOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GooglePayOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GooglePayOptions] (val x: Self) extends AnyVal {
      
      inline def setBillingAddressRequired(value: Boolean): Self = StObject.set(x, "billingAddressRequired", value.asInstanceOf[js.Any])
      
      inline def setBillingAddressRequiredUndefined: Self = StObject.set(x, "billingAddressRequired", js.undefined)
      
      inline def setButtonOptions(value: StringDictionary[Any]): Self = StObject.set(x, "buttonOptions", value.asInstanceOf[js.Any])
      
      inline def setButtonOptionsUndefined: Self = StObject.set(x, "buttonOptions", js.undefined)
      
      inline def setCallbacks(value: OnPaymentDataChanged): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setGatewayCode(value: String): Self = StObject.set(x, "gatewayCode", value.asInstanceOf[js.Any])
      
      inline def setGatewayCodeUndefined: Self = StObject.set(x, "gatewayCode", js.undefined)
      
      inline def setGoogleBusinessName(value: String): Self = StObject.set(x, "googleBusinessName", value.asInstanceOf[js.Any])
      
      inline def setGoogleBusinessNameUndefined: Self = StObject.set(x, "googleBusinessName", js.undefined)
      
      inline def setGoogleMerchantId(value: String): Self = StObject.set(x, "googleMerchantId", value.asInstanceOf[js.Any])
      
      inline def setGoogleMerchantIdUndefined: Self = StObject.set(x, "googleMerchantId", js.undefined)
      
      inline def setPaymentDataRequest(value: GooglePayPaymentDataRequest): Self = StObject.set(x, "paymentDataRequest", value.asInstanceOf[js.Any])
      
      inline def setPaymentDataRequestUndefined: Self = StObject.set(x, "paymentDataRequest", js.undefined)
      
      inline def setRequireBillingAddress(value: Boolean): Self = StObject.set(x, "requireBillingAddress", value.asInstanceOf[js.Any])
      
      inline def setRequireBillingAddressUndefined: Self = StObject.set(x, "requireBillingAddress", js.undefined)
      
      inline def setTotal(value: String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
  
  trait GooglePayPaymentAuthorizationResult extends StObject {
    
    /**
      * The error to be rendered in the payment sheet for the user when it's necessary to retry the payment.
      */
    var error: GooglePayPaymentDataError
  }
  object GooglePayPaymentAuthorizationResult {
    
    inline def apply(error: GooglePayPaymentDataError): GooglePayPaymentAuthorizationResult = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[GooglePayPaymentAuthorizationResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GooglePayPaymentAuthorizationResult] (val x: Self) extends AnyVal {
      
      inline def setError(value: GooglePayPaymentDataError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
}
