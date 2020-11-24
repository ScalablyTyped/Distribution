package typings.recurlyRecurlyJs.recurlyMod

import typings.recurlyRecurlyJs.`3dSecureMod`.Risk
import typings.recurlyRecurlyJs.adyenMod.Adyen
import typings.recurlyRecurlyJs.adyenMod.AdyenInstance
import typings.recurlyRecurlyJs.adyenMod.AdyenOptions
import typings.recurlyRecurlyJs.anon.ThreeDSecure
import typings.recurlyRecurlyJs.applePayMod.ApplePay
import typings.recurlyRecurlyJs.applePayMod.ApplePayConfig
import typings.recurlyRecurlyJs.applePayMod.ApplePayInstance
import typings.recurlyRecurlyJs.bankAccountMod.BankAccount
import typings.recurlyRecurlyJs.configureMod.Configure
import typings.recurlyRecurlyJs.configureMod.RecurlyOptions
import typings.recurlyRecurlyJs.elementsMod.Elements
import typings.recurlyRecurlyJs.elementsMod.ElementsInstance
import typings.recurlyRecurlyJs.emitterMod.Emitter
import typings.recurlyRecurlyJs.giftCardMod.Done
import typings.recurlyRecurlyJs.giftCardMod.GiftCard
import typings.recurlyRecurlyJs.giftCardMod.GiftCardOptions
import typings.recurlyRecurlyJs.paypalMod.PayPal
import typings.recurlyRecurlyJs.paypalMod.PayPalConfig
import typings.recurlyRecurlyJs.paypalMod.PayPalInstance
import typings.recurlyRecurlyJs.tokenMod.CustomerData
import typings.recurlyRecurlyJs.tokenMod.Token
import typings.recurlyRecurlyJs.tokenMod.TokenHandler
import typings.recurlyRecurlyJs.validateMod.Validate
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Recurly extends Emitter[RecurlyEvent] {
  
  def Adyen(): AdyenInstance = js.native
  def Adyen(adyenOptions: AdyenOptions): AdyenInstance = js.native
  @JSName("Adyen")
  var Adyen_Original: Adyen = js.native
  
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
  var Pricing: typings.recurlyRecurlyJs.pricingMod.Pricing = js.native
  
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
  
  def token(elements: ElementsInstance, second: CustomerData, third: TokenHandler): Unit = js.native
  /**
    * Recurly.js works with tokens, which represent secure and temporary storage for your customer’s sensitive billing
    * information. They are stored directly on Recurly servers to reduce your PCI exposure.
    *
    * When your customers submit your billing form, you’ll need to interrupt the submit and ask Recurly.js to create a
    * token from the form.
    *
    * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#getting-a-token|Token}
    */
  def token(elements: ElementsInstance, second: HTMLFormElement, third: TokenHandler): Unit = js.native
  def token(form: CustomerData, second: TokenHandler): Unit = js.native
  /**
    * Recurly.js works with tokens, which represent secure and temporary storage for your customer’s sensitive billing
    * information. They are stored directly on Recurly servers to reduce your PCI exposure.
    *
    * When your customers submit your billing form, you’ll need to interrupt the submit and ask Recurly.js to create a
    * token from the form.
    *
    * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#getting-a-token|Token}
    */
  def token(form: HTMLFormElement, second: TokenHandler): Unit = js.native
  /**
    * Recurly.js works with tokens, which represent secure and temporary storage for your customer’s sensitive billing
    * information. They are stored directly on Recurly servers to reduce your PCI exposure.
    *
    * When your customers submit your billing form, you’ll need to interrupt the submit and ask Recurly.js to create a
    * token from the form.
    *
    * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#getting-a-token|Token}
    */
  @JSName("token")
  var token_Original: Token = js.native
  
  /**
    * Recurly.js bundles a few helpful methods for validating payment information prior to processing. These methods are
    * used when generating tokens, but you can also use them to enhance your form validations and checkout flow.
    *
    * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#validation|Validation}
    */
  var validate: Validate = js.native
}
