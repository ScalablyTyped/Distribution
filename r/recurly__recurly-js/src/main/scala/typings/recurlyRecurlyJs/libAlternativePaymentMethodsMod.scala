package typings.recurlyRecurlyJs

import org.scalablytyped.runtime.StringDictionary
import typings.recurlyRecurlyJs.libEmitterMod.Emitter
import typings.recurlyRecurlyJs.recurlyRecurlyJsBooleans.`false`
import typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.boleto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAlternativePaymentMethodsMod {
  
  trait AdyenAlternativePaymentMethodOptions extends StObject {
    
    /**
      * Additional Adyen Configuration.
      */
    var componentConfig: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * Indicate a test or a live environment.
      */
    var env: js.UndefOr[AdyenEnvironmentType] = js.undefined
    
    /**
      * A public key linked to your API credential, used for client-side authentication.
      */
    var publicKey: String
    
    /**
      * Show or hides a Pay Button for each payment method. Defaults to false.
      * When the button is disable you need to call the submit() function when the payment form is valid.
      */
    var showPayButton: js.UndefOr[`false`] = js.undefined
  }
  object AdyenAlternativePaymentMethodOptions {
    
    inline def apply(publicKey: String): AdyenAlternativePaymentMethodOptions = {
      val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdyenAlternativePaymentMethodOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdyenAlternativePaymentMethodOptions] (val x: Self) extends AnyVal {
      
      inline def setComponentConfig(value: StringDictionary[Any]): Self = StObject.set(x, "componentConfig", value.asInstanceOf[js.Any])
      
      inline def setComponentConfigUndefined: Self = StObject.set(x, "componentConfig", js.undefined)
      
      inline def setEnv(value: AdyenEnvironmentType): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setShowPayButton(value: `false`): Self = StObject.set(x, "showPayButton", value.asInstanceOf[js.Any])
      
      inline def setShowPayButtonUndefined: Self = StObject.set(x, "showPayButton", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.test
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.live
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.`live-au`
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.`live-us`
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.`live-apse`
  */
  trait AdyenEnvironmentType extends StObject
  object AdyenEnvironmentType {
    
    inline def live: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.live = "live".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.live]
    
    inline def `live-apse`: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.`live-apse` = "live-apse".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.`live-apse`]
    
    inline def `live-au`: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.`live-au` = "live-au".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.`live-au`]
    
    inline def `live-us`: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.`live-us` = "live-us".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.`live-us`]
    
    inline def test: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.test = "test".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.test]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.token
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.error
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.valid
  */
  trait AlternativePaymentMethodEvents extends StObject
  object AlternativePaymentMethodEvents {
    
    inline def error: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.error = "error".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.error]
    
    inline def token: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.token = "token".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.token]
    
    inline def valid: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.valid = "valid".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.valid]
  }
  
  trait AlternativePaymentMethodOptions extends StObject {
    
    /**
      * Adyen options.
      */
    var adyen: js.UndefOr[AdyenAlternativePaymentMethodOptions] = js.undefined
    
    /**
      * List of payment methods to be presented to the customer.
      */
    var allowedPaymentMethods: js.Array[AlternativePaymentMethodType]
    
    /**
      * The amount of the payment.
      */
    var amount: Double
    
    /**
      * List of payment methods to be hidden from the customer.
      */
    var blockedPaymentMethods: js.UndefOr[js.Array[AlternativePaymentMethodType]] = js.undefined
    
    /**
      * The platform where a payment transaction takes place.
      * This field can be used for filtering out payment methods that are only available on specific platforms.
      */
    var channel: js.UndefOr[ChannelType] = js.undefined
    
    /**
      * Css selector of the DOM Element where you want the payment method form to be rendered.
      */
    var containerSelector: String
    
    /**
      * The customer's country code.
      */
    var countryCode: String
    
    /**
      * The currency of the payment.
      */
    var currency: String
    
    /**
      * The customer's locale. This is used to set the language rendered in the UI.
      */
    var locale: js.UndefOr[String] = js.undefined
  }
  object AlternativePaymentMethodOptions {
    
    inline def apply(
      allowedPaymentMethods: js.Array[AlternativePaymentMethodType],
      amount: Double,
      containerSelector: String,
      countryCode: String,
      currency: String
    ): AlternativePaymentMethodOptions = {
      val __obj = js.Dynamic.literal(allowedPaymentMethods = allowedPaymentMethods.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], containerSelector = containerSelector.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlternativePaymentMethodOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AlternativePaymentMethodOptions] (val x: Self) extends AnyVal {
      
      inline def setAdyen(value: AdyenAlternativePaymentMethodOptions): Self = StObject.set(x, "adyen", value.asInstanceOf[js.Any])
      
      inline def setAdyenUndefined: Self = StObject.set(x, "adyen", js.undefined)
      
      inline def setAllowedPaymentMethods(value: js.Array[AlternativePaymentMethodType]): Self = StObject.set(x, "allowedPaymentMethods", value.asInstanceOf[js.Any])
      
      inline def setAllowedPaymentMethodsVarargs(value: AlternativePaymentMethodType*): Self = StObject.set(x, "allowedPaymentMethods", js.Array(value*))
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setBlockedPaymentMethods(value: js.Array[AlternativePaymentMethodType]): Self = StObject.set(x, "blockedPaymentMethods", value.asInstanceOf[js.Any])
      
      inline def setBlockedPaymentMethodsUndefined: Self = StObject.set(x, "blockedPaymentMethods", js.undefined)
      
      inline def setBlockedPaymentMethodsVarargs(value: AlternativePaymentMethodType*): Self = StObject.set(x, "blockedPaymentMethods", js.Array(value*))
      
      inline def setChannel(value: ChannelType): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setContainerSelector(value: String): Self = StObject.set(x, "containerSelector", value.asInstanceOf[js.Any])
      
      inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    }
  }
  
  type AlternativePaymentMethodType = boleto
  
  type AlternativePaymentMethods = js.Function0[AlternativePaymentMethodsInstance]
  
  @js.native
  trait AlternativePaymentMethodsInstance
    extends StObject
       with Emitter[AlternativePaymentMethodEvents] {
    
    /**
      * Some payment methods require additional action from the shopper such as: to scan a QR code,
      * to authenticate a payment with 3D Secure, or to log in to their bank's website to complete the payment.
      * Use this method handle these additional front-end actions.
      * The paymentResponse parameter can be obtained from the response of any API result which includes the transaction.actionResult.
      */
    def handleAction(paymentResponse: Any): js.Promise[Unit] = js.native
    
    /**
      * Start the PaymentMethods and render the components.
      */
    def start(data: AlternativePaymentMethodOptions): js.Promise[Unit] = js.native
    
    /**
      * Submit the customer payment information and produce a token.
      * Call this function only when the payment information provided by the customer is valid, by listening the 'valid' event.
      * The token can be retrieved through the 'token' event.
      */
    def submit(): js.Promise[Unit] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.iOS
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.Android
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.Web
  */
  trait ChannelType extends StObject
  object ChannelType {
    
    inline def Android: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.Android = "Android".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.Android]
    
    inline def Web: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.Web = "Web".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.Web]
    
    inline def iOS: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.iOS = "iOS".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.iOS]
  }
}
