package typings.reactStripeElements.mod.ReactStripeElements

import typings.stripeV3.stripe.BankAccountTokenOptions
import typings.stripeV3.stripe.CreatePaymentMethodOptions
import typings.stripeV3.stripe.HandleCardPaymentWithoutElementsOptions
import typings.stripeV3.stripe.HandleCardSetupOptions
import typings.stripeV3.stripe.PaymentIntentResponse
import typings.stripeV3.stripe.PaymentMethodData
import typings.stripeV3.stripe.PaymentMethodResponse
import typings.stripeV3.stripe.RetrieveSourceOptions
import typings.stripeV3.stripe.SetupIntentResponse
import typings.stripeV3.stripe.StripeClientCheckoutOptions
import typings.stripeV3.stripe.StripeRedirectResponse
import typings.stripeV3.stripe.elements.Element
import typings.stripeV3.stripe.elements.Elements
import typings.stripeV3.stripe.paymentMethod.paymentMethodType
import typings.stripeV3.stripe.paymentRequest.StripePaymentRequest
import typings.stripeV3.stripe.paymentRequest.StripePaymentRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<stripe-v3.stripe.Stripe, keyof react-stripe-elements.react-stripe-elements.ReactStripeElements.StripeOverrideProps> */
/* Inlined parent react-stripe-elements.react-stripe-elements.ReactStripeElements.StripeOverrideProps */
@js.native
trait StripeProps extends js.Object {
  var confirmCardPayment: js.Function1[/* clientSecret */ String, js.Promise[PaymentIntentResponse]] = js.native
  var confirmCardSetup: js.Function1[/* clientSecret */ String, js.Promise[SetupIntentResponse]] = js.native
  var confirmPaymentIntent: js.Function2[/* clientSecret */ String, /* element */ Element, js.Promise[PaymentIntentResponse]] = js.native
  var confirmSepaDebitPayment: js.Function1[/* clientSecret */ String, js.Promise[PaymentIntentResponse]] = js.native
  var confirmSepaDebitSetup: js.Function1[/* clientSecret */ String, js.Promise[SetupIntentResponse]] = js.native
  var elements: js.Function0[Elements] = js.native
  var handleCardAction: js.Function1[/* clientSecret */ String, js.Promise[PaymentIntentResponse]] = js.native
  var paymentRequest: js.Function1[/* options */ StripePaymentRequestOptions, StripePaymentRequest] = js.native
  var redirectToCheckout: js.Function1[/* options */ StripeClientCheckoutOptions, js.Promise[StripeRedirectResponse]] = js.native
  var retrievePaymentIntent: js.Function1[/* clientSecret */ String, js.Promise[PaymentIntentResponse]] = js.native
  var retrieveSetupIntent: js.Function1[/* clientSecret */ String, js.Promise[SetupIntentResponse]] = js.native
  var retrieveSource: js.Function1[
    /* options */ RetrieveSourceOptions, 
    js.Promise[typings.stripeV3.stripe.SourceResponse]
  ] = js.native
  def createPaymentMethod(data: PaymentMethodData): js.Promise[PaymentMethodResponse] = js.native
  def createPaymentMethod(paymentMethodType: paymentMethodType): js.Promise[PaymentMethodResponse] = js.native
  def createPaymentMethod(paymentMethodType: paymentMethodType, data: CreatePaymentMethodOptions): js.Promise[PaymentMethodResponse] = js.native
  def createPaymentMethod(paymentMethodType: paymentMethodType, element: HTMLStripeElement): js.Promise[PaymentMethodResponse] = js.native
  def createPaymentMethod(paymentMethodType: paymentMethodType, element: HTMLStripeElement, data: CreatePaymentMethodOptions): js.Promise[PaymentMethodResponse] = js.native
  def createSource(): js.Promise[SourceResponse] = js.native
  def createSource(sourceData: SourceOptions): js.Promise[SourceResponse] = js.native
  /*
    * react-stripe-elements let's you use the same createToken function
    * with either credit card or bank account options
    * which one to choose depends solely on the inferred elements and can't be expressed in TypeScript
    */
  def createToken(): js.Promise[TokenResponse] = js.native
  def createToken(options: TokenOptions): js.Promise[TokenResponse] = js.native
  def createToken(options: BankAccountTokenOptions): js.Promise[TokenResponse] = js.native
  def handleCardPayment(clientSecret: String): js.Promise[PaymentIntentResponse] = js.native
  def handleCardPayment(clientSecret: String, options: HandleCardPaymentWithoutElementsOptions): js.Promise[PaymentIntentResponse] = js.native
  def handleCardSetup(clientSecret: String): js.Promise[SetupIntentResponse] = js.native
  def handleCardSetup(clientSecret: String, data: HandleCardSetupOptions): js.Promise[SetupIntentResponse] = js.native
}

