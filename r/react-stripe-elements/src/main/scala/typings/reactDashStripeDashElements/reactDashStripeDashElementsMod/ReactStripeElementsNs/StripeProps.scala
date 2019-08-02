package typings.reactDashStripeDashElements.reactDashStripeDashElementsMod.ReactStripeElementsNs

import typings.stripeDashV3.stripeNs.CreatePaymentMethodOptions
import typings.stripeDashV3.stripeNs.HandleCardPaymentOptions
import typings.stripeDashV3.stripeNs.HandleCardSetupOptions
import typings.stripeDashV3.stripeNs.PaymentIntentResponse
import typings.stripeDashV3.stripeNs.PaymentMethodResponse
import typings.stripeDashV3.stripeNs.paymentMethodNs.paymentMethodType
import typings.stripeDashV3.stripeNs.paymentRequestNs.StripePaymentRequest
import typings.stripeDashV3.stripeNs.paymentRequestNs.StripePaymentRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeProps extends js.Object {
  var paymentRequest: js.Function1[/* options */ StripePaymentRequestOptions, StripePaymentRequest] = js.native
  def createPaymentMethod(paymentMethodType: paymentMethodType): js.Promise[PaymentMethodResponse] = js.native
  def createPaymentMethod(paymentMethodType: paymentMethodType, data: CreatePaymentMethodOptions): js.Promise[PaymentMethodResponse] = js.native
  def createSource(): js.Promise[SourceResponse] = js.native
  def createSource(sourceData: SourceOptions): js.Promise[SourceResponse] = js.native
  def createToken(): js.Promise[PatchedTokenResponse] = js.native
  def createToken(options: TokenOptions): js.Promise[PatchedTokenResponse] = js.native
  def handleCardPayment(clientSecret: String): js.Promise[PaymentIntentResponse] = js.native
  def handleCardPayment(clientSecret: String, options: HandleCardPaymentOptions): js.Promise[PaymentIntentResponse] = js.native
  def handleCardSetup(clientSecret: String): js.Promise[PaymentIntentResponse] = js.native
  def handleCardSetup(clientSecret: String, data: HandleCardSetupOptions): js.Promise[PaymentIntentResponse] = js.native
}

