package typings.stripeDashV3.stripe

import typings.stripeDashV3.Anon_Owner
import typings.stripeDashV3.stripe.elements.Element
import typings.stripeDashV3.stripe.elements.Elements
import typings.stripeDashV3.stripe.elements.ElementsCreateOptions
import typings.stripeDashV3.stripe.paymentMethod.paymentMethodType
import typings.stripeDashV3.stripe.paymentRequest.StripePaymentRequest
import typings.stripeDashV3.stripe.paymentRequest.StripePaymentRequestOptions
import typings.stripeDashV3.stripeDashV3Strings.bank_account
import typings.stripeDashV3.stripeDashV3Strings.pii
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stripe extends js.Object {
  def confirmPaymentIntent(clientSecret: String): js.Promise[PaymentIntentResponse] = js.native
  def confirmPaymentIntent(clientSecret: String, element: Element): js.Promise[PaymentIntentResponse] = js.native
  def confirmPaymentIntent(clientSecret: String, element: Element, options: ConfirmPaymentIntentOptions): js.Promise[PaymentIntentResponse] = js.native
  def confirmPaymentIntent(clientSecret: String, options: ConfirmPaymentIntentWithoutElementsOptions): js.Promise[PaymentIntentResponse] = js.native
  def createPaymentMethod(`type`: paymentMethodType, element: Element): js.Promise[PaymentMethodResponse] = js.native
  def createPaymentMethod(`type`: paymentMethodType, element: Element, options: CreatePaymentMethodOptions): js.Promise[PaymentMethodResponse] = js.native
  def createSource(element: Element): js.Promise[SourceResponse] = js.native
  def createSource(element: Element, options: Anon_Owner): js.Promise[SourceResponse] = js.native
  def createSource(options: SourceOptions): js.Promise[SourceResponse] = js.native
  def createToken(element: Element): js.Promise[TokenResponse] = js.native
  def createToken(element: Element, options: TokenOptions): js.Promise[TokenResponse] = js.native
  @JSName("createToken")
  def createToken_bankaccount(name: bank_account, options: BankAccountTokenOptions): js.Promise[TokenResponse] = js.native
  @JSName("createToken")
  def createToken_pii(name: pii, options: PiiTokenOptions): js.Promise[TokenResponse] = js.native
  def elements(): Elements = js.native
  def elements(options: ElementsCreateOptions): Elements = js.native
  def handleCardAction(clientSecret: String): js.Promise[PaymentIntentResponse] = js.native
  def handleCardPayment(clientSecret: String): js.Promise[PaymentIntentResponse] = js.native
  def handleCardPayment(clientSecret: String, element: Element): js.Promise[PaymentIntentResponse] = js.native
  def handleCardPayment(clientSecret: String, element: Element, options: HandleCardPaymentOptions): js.Promise[PaymentIntentResponse] = js.native
  def handleCardPayment(clientSecret: String, options: HandleCardPaymentWithoutElementsOptions): js.Promise[PaymentIntentResponse] = js.native
  def handleCardSetup(clientSecret: String): js.Promise[SetupIntentResponse] = js.native
  def handleCardSetup(clientSecret: String, data: HandleCardSetupOptionsWithoutElementsOptions): js.Promise[SetupIntentResponse] = js.native
  def handleCardSetup(clientSecret: String, element: Element): js.Promise[SetupIntentResponse] = js.native
  def handleCardSetup(clientSecret: String, element: Element, data: HandleCardSetupOptions): js.Promise[SetupIntentResponse] = js.native
  def paymentRequest(options: StripePaymentRequestOptions): StripePaymentRequest = js.native
  // We use function overloading instead of a union here to ensure that redirectToCheckout can only be
  // called with either the server options or the client options - not a mix of both.
  def redirectToCheckout(options: StripeClientCheckoutOptions): js.Promise[StripeRedirectResponse] = js.native
  // tslint:disable-next-line unified-signatures
  def redirectToCheckout(options: StripeServerCheckoutOptions): js.Promise[StripeRedirectResponse] = js.native
  def retrievePaymentIntent(clientSecret: String): js.Promise[PaymentIntentResponse] = js.native
  def retrieveSource(options: RetrieveSourceOptions): js.Promise[SourceResponse] = js.native
}

