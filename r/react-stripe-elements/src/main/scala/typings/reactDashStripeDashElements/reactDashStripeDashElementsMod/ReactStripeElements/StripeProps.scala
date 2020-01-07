package typings.reactDashStripeDashElements.reactDashStripeDashElementsMod.ReactStripeElements

import typings.stripeDashV3.stripe.ConfirmCardPaymentData
import typings.stripeDashV3.stripe.ConfirmCardSetupData
import typings.stripeDashV3.stripe.CreatePaymentMethodOptions
import typings.stripeDashV3.stripe.HandleCardPaymentWithoutElementsOptions
import typings.stripeDashV3.stripe.HandleCardSetupOptions
import typings.stripeDashV3.stripe.PaymentIntentResponse
import typings.stripeDashV3.stripe.PaymentMethodData
import typings.stripeDashV3.stripe.PaymentMethodResponse
import typings.stripeDashV3.stripe.SetupIntentResponse
import typings.stripeDashV3.stripe.paymentMethod.paymentMethodType
import typings.stripeDashV3.stripe.paymentRequest.StripePaymentRequest
import typings.stripeDashV3.stripe.paymentRequest.StripePaymentRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeProps extends js.Object {
  var paymentRequest: js.Function1[/* options */ StripePaymentRequestOptions, StripePaymentRequest] = js.native
  def confirmCardPayment(clientSecret: String): js.Promise[PaymentIntentResponse] = js.native
  def confirmCardPayment(clientSecret: String, data: ConfirmCardPaymentData): js.Promise[PaymentIntentResponse] = js.native
  def confirmCardSetup(clientSecret: String): js.Promise[SetupIntentResponse] = js.native
  def confirmCardSetup(clientSecret: String, data: ConfirmCardSetupData): js.Promise[SetupIntentResponse] = js.native
  def createPaymentMethod(data: PaymentMethodData): js.Promise[PaymentMethodResponse] = js.native
  def createPaymentMethod(paymentMethodType: paymentMethodType): js.Promise[PaymentMethodResponse] = js.native
  def createPaymentMethod(paymentMethodType: paymentMethodType, data: CreatePaymentMethodOptions): js.Promise[PaymentMethodResponse] = js.native
  def createPaymentMethod(paymentMethodType: paymentMethodType, element: HTMLStripeElement): js.Promise[PaymentMethodResponse] = js.native
  def createPaymentMethod(paymentMethodType: paymentMethodType, element: HTMLStripeElement, data: CreatePaymentMethodOptions): js.Promise[PaymentMethodResponse] = js.native
  def createSource(): js.Promise[SourceResponse] = js.native
  def createSource(sourceData: SourceOptions): js.Promise[SourceResponse] = js.native
  def createToken(): js.Promise[PatchedTokenResponse] = js.native
  def createToken(options: TokenOptions): js.Promise[PatchedTokenResponse] = js.native
  /**
    * Use `stripe.handleCardAction` in the Payment Intents API manual confirmation flow
    * to handle a PaymentIntent with the requires_action status.
    * It will throw an error if the PaymentIntent has a different status.
    */
  def handleCardAction(clientSecret: String): js.Promise[PaymentIntentResponse] = js.native
  def handleCardPayment(clientSecret: String): js.Promise[PaymentIntentResponse] = js.native
  def handleCardPayment(clientSecret: String, options: HandleCardPaymentWithoutElementsOptions): js.Promise[PaymentIntentResponse] = js.native
  def handleCardSetup(clientSecret: String): js.Promise[SetupIntentResponse] = js.native
  def handleCardSetup(clientSecret: String, data: HandleCardSetupOptions): js.Promise[SetupIntentResponse] = js.native
}

