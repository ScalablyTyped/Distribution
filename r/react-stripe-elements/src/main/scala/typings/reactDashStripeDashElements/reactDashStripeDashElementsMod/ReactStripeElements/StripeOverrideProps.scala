package typings.reactDashStripeDashElements.reactDashStripeDashElementsMod.ReactStripeElements

import typings.stripeDashV3.stripe.CreatePaymentMethodOptions
import typings.stripeDashV3.stripe.HandleCardPaymentWithoutElementsOptions
import typings.stripeDashV3.stripe.HandleCardSetupOptions
import typings.stripeDashV3.stripe.PaymentIntentResponse
import typings.stripeDashV3.stripe.PaymentMethodData
import typings.stripeDashV3.stripe.PaymentMethodResponse
import typings.stripeDashV3.stripe.SetupIntentResponse
import typings.stripeDashV3.stripe.paymentMethod.paymentMethodType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeOverrideProps extends js.Object {
  def createPaymentMethod(data: PaymentMethodData): js.Promise[PaymentMethodResponse] = js.native
  def createPaymentMethod(paymentMethodType: paymentMethodType): js.Promise[PaymentMethodResponse] = js.native
  def createPaymentMethod(paymentMethodType: paymentMethodType, data: CreatePaymentMethodOptions): js.Promise[PaymentMethodResponse] = js.native
  def createPaymentMethod(paymentMethodType: paymentMethodType, element: HTMLStripeElement): js.Promise[PaymentMethodResponse] = js.native
  def createPaymentMethod(paymentMethodType: paymentMethodType, element: HTMLStripeElement, data: CreatePaymentMethodOptions): js.Promise[PaymentMethodResponse] = js.native
  def createSource(): js.Promise[SourceResponse] = js.native
  def createSource(sourceData: SourceOptions): js.Promise[SourceResponse] = js.native
  def createToken(): js.Promise[PatchedTokenResponse] = js.native
  def createToken(options: TokenOptions): js.Promise[PatchedTokenResponse] = js.native
  def handleCardPayment(clientSecret: String): js.Promise[PaymentIntentResponse] = js.native
  def handleCardPayment(clientSecret: String, options: HandleCardPaymentWithoutElementsOptions): js.Promise[PaymentIntentResponse] = js.native
  def handleCardSetup(clientSecret: String): js.Promise[SetupIntentResponse] = js.native
  def handleCardSetup(clientSecret: String, data: HandleCardSetupOptions): js.Promise[SetupIntentResponse] = js.native
}

