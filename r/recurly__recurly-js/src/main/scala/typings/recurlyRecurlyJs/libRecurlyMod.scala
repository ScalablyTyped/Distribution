package typings.recurlyRecurlyJs

import typings.recurlyRecurlyJs.anon.ThreeDSecure
import typings.recurlyRecurlyJs.lib3dSecureMod.Risk
import typings.recurlyRecurlyJs.libAdyenMod.Adyen
import typings.recurlyRecurlyJs.libAdyenMod.AdyenInstance
import typings.recurlyRecurlyJs.libAdyenMod.AdyenOptions
import typings.recurlyRecurlyJs.libAlternativePaymentMethodsMod.AlternativePaymentMethods
import typings.recurlyRecurlyJs.libAlternativePaymentMethodsMod.AlternativePaymentMethodsInstance
import typings.recurlyRecurlyJs.libApplePayMod.ApplePay
import typings.recurlyRecurlyJs.libApplePayMod.ApplePayConfig
import typings.recurlyRecurlyJs.libApplePayMod.ApplePayInstance
import typings.recurlyRecurlyJs.libBankAccountMod.BankAccount
import typings.recurlyRecurlyJs.libBankRedirectMod.BankRedirect
import typings.recurlyRecurlyJs.libBankRedirectMod.BankRedirectInstance
import typings.recurlyRecurlyJs.libConfigureMod.Configure
import typings.recurlyRecurlyJs.libConfigureMod.RecurlyOptions
import typings.recurlyRecurlyJs.libElementsMod.Elements
import typings.recurlyRecurlyJs.libElementsMod.ElementsInstance
import typings.recurlyRecurlyJs.libEmitterMod.Emitter
import typings.recurlyRecurlyJs.libGiftCardMod.Done
import typings.recurlyRecurlyJs.libGiftCardMod.GiftCard
import typings.recurlyRecurlyJs.libGiftCardMod.GiftCardOptions
import typings.recurlyRecurlyJs.libGooglePayMod.GooglePay
import typings.recurlyRecurlyJs.libGooglePayMod.GooglePayEvent
import typings.recurlyRecurlyJs.libGooglePayMod.GooglePayOptions
import typings.recurlyRecurlyJs.libPaypalMod.PayPal
import typings.recurlyRecurlyJs.libPaypalMod.PayPalConfig
import typings.recurlyRecurlyJs.libPaypalMod.PayPalInstance
import typings.recurlyRecurlyJs.libTokenMod.Token
import typings.recurlyRecurlyJs.libValidateMod.Validate
import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRecurlyMod {
  
  @js.native
  trait Recurly
    extends StObject
       with Emitter[RecurlyEvent] {
    
    def Adyen(): AdyenInstance = js.native
    def Adyen(adyenOptions: AdyenOptions): AdyenInstance = js.native
    @JSName("Adyen")
    var Adyen_Original: Adyen = js.native
    
    /**
      * Pay with Alternative Payment Methods.
      *
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html}
      */
    def AlternativePaymentMethods(): AlternativePaymentMethodsInstance = js.native
    /**
      * Pay with Alternative Payment Methods.
      *
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html}
      */
    @JSName("AlternativePaymentMethods")
    var AlternativePaymentMethods_Original: AlternativePaymentMethods = js.native
    
    /**
      * Use Recurly.js to process Apple Pay transactions.
      *
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#apple-pay|ApplePay}
      */
    def ApplePay(config: ApplePayConfig): ApplePayInstance = js.native
    /**
      * Use Recurly.js to process Apple Pay transactions.
      *
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#apple-pay|ApplePay}
      */
    @JSName("ApplePay")
    var ApplePay_Original: ApplePay = js.native
    
    /**
      * Use Recurly.js to process Adyen Redirect Payments.
      *
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#adyen-token|BankRedirect}
      */
    def BankRedirect(): BankRedirectInstance = js.native
    /**
      * Use Recurly.js to process Adyen Redirect Payments.
      *
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#adyen-token|BankRedirect}
      */
    @JSName("BankRedirect")
    var BankRedirect_Original: BankRedirect = js.native
    
    /**
      * Elements allow sensitive customer payment information to be securely accepted via iframes.
      * They are controlled in groups by an Elements instance.
      *
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#elements|Elements}
      */
    def Elements(): ElementsInstance = js.native
    /**
      * Elements allow sensitive customer payment information to be securely accepted via iframes.
      * They are controlled in groups by an Elements instance.
      *
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#elements|Elements}
      */
    @JSName("Elements")
    var Elements_Original: Elements = js.native
    
    /**
      * Use Recurly.js to process Google Pay transactions.
      *
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#google-pay|GooglePay}
      */
    def GooglePay(options: GooglePayOptions): Emitter[GooglePayEvent] = js.native
    /**
      * Use Recurly.js to process Google Pay transactions.
      *
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#google-pay|GooglePay}
      */
    @JSName("GooglePay")
    var GooglePay_Original: GooglePay = js.native
    
    /**
      * Use Recurly to process PayPal transactions using PayPal Business or Braintree.
      *
      * A PayPal transaction is handled entirely within the PayPal checkout flow in a new window.
      * Your customer will authorize a transaction within PayPal. Recurly will then record the authorization and return a
      * Recurly token to you as it does for other payment methods.
      *
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#paypal|PayPal}
      */
    def PayPal(): PayPalInstance = js.native
    def PayPal(config: PayPalConfig): PayPalInstance = js.native
    /**
      * Use Recurly to process PayPal transactions using PayPal Business or Braintree.
      *
      * A PayPal transaction is handled entirely within the PayPal checkout flow in a new window.
      * Your customer will authorize a transaction within PayPal. Recurly will then record the authorization and return a
      * Recurly token to you as it does for other payment methods.
      *
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#paypal|PayPal}
      */
    @JSName("PayPal")
    var PayPal_Original: PayPal = js.native
    
    /**
      * Recurly automates complicated subscriptions, with many factors influencing the total price at checkout. With this
      * in mind, Recurly.js provides a robust `recurly.Pricing.Checkout` class designed to make determining the actual
      * checkout costs as simple and flexible as possible.
      *
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#pricing|Pricing}
      */
    var Pricing: typings.recurlyRecurlyJs.libPricingMod.Pricing = js.native
    
    /**
      * Strong customer authentication for your users.
      *
      * Recurly.js provides a set of utilities that allow you to support 3-D Secure authentication on your checkout page
      * seamlessly. For more information on 3-D Secure, see our
      * {@link https://docs.recurly.com/docs/revised-payment-services-directive-psd2|Introduction to Strong Customer Authentication}
      *
      * Recurly’s support for 3-D Secure utilizes both Recurly.js and our API. For a complete guide to this integration and
      * get started, start with our
      * {@link https://docs.recurly.com/docs/revised-payment-services-directive-psd2|Strong Customer Authentication (SCA) Integration Guide}
      *
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#3d-secure|3D-Secure}
      */
    def Risk(): ThreeDSecure = js.native
    /**
      * Strong customer authentication for your users.
      *
      * Recurly.js provides a set of utilities that allow you to support 3-D Secure authentication on your checkout page
      * seamlessly. For more information on 3-D Secure, see our
      * {@link https://docs.recurly.com/docs/revised-payment-services-directive-psd2|Introduction to Strong Customer Authentication}
      *
      * Recurly’s support for 3-D Secure utilizes both Recurly.js and our API. For a complete guide to this integration and
      * get started, start with our
      * {@link https://docs.recurly.com/docs/revised-payment-services-directive-psd2|Strong Customer Authentication (SCA) Integration Guide}
      *
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#3d-secure|3D-Secure}
      */
    @JSName("Risk")
    var Risk_Original: Risk = js.native
    
    /**
      * Tokenize your users’ bank account information.
      *
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#us-bank-accounts|US Bank Accounts}
      */
    var bankAccount: BankAccount = js.native
    
    def configure(recurlyConfig: String): Unit = js.native
    /**
      * This identifies your site to Recurly servers.
      *
      * You can find your public key in the {@link https://app.recurly.com/go/developer/api_access|API Access section}
      * of your admin app.
      *
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#configure|Configure}
      */
    def configure(recurlyConfig: RecurlyOptions): Unit = js.native
    /**
      * This identifies your site to Recurly servers.
      *
      * You can find your public key in the {@link https://app.recurly.com/go/developer/api_access|API Access section}
      * of your admin app.
      *
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#configure|Configure}
      */
    @JSName("configure")
    var configure_Original: Configure = js.native
    
    def giftCard(giftCardOptions: GiftCardOptions, done: Done): Unit = js.native
    @JSName("giftCard")
    var giftCard_Original: GiftCard = js.native
    
    /**
      * Triggered once Recurly has fully been initialized after configuring.the instance.
      */
    def ready(): Unit = js.native
    def ready(cb: VoidFunction): Unit = js.native
    
    /**
      * Recurly.js works with tokens, which represent secure and temporary storage for your customer’s sensitive billing
      * information. They are stored directly on Recurly servers to reduce your PCI exposure.
      *
      * When your customers submit your billing form, you’ll need to interrupt the submit and ask Recurly.js to create a
      * token from the form.
      *
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#getting-a-token|Token}
      */
    var token: Token = js.native
    
    /**
      * Recurly.js bundles a few helpful methods for validating payment information prior to processing. These methods are
      * used when generating tokens, but you can also use them to enhance your form validations and checkout flow.
      *
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#validation|Validation}
      */
    var validate: Validate = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.change
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.fieldColonsubmit
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.error
  */
  trait RecurlyEvent extends StObject
  object RecurlyEvent {
    
    inline def change: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.change = "change".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.change]
    
    inline def error: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.error = "error".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.error]
    
    inline def fieldColonsubmit: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.fieldColonsubmit = "field:submit".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.fieldColonsubmit]
  }
}
