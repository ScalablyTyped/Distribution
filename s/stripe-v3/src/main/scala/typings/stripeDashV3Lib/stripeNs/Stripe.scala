package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stripe extends js.Object {
  def confirmPaymentIntent(
    clientSecret: java.lang.String,
    data: stripeDashV3Lib.stripeNs.paymentIntentNs.PaymentIntentConfirmationData
  ): js.Promise[stripeDashV3Lib.stripeNs.paymentIntentNs.PaymentIntentResponse] = js.native
  def confirmPaymentIntent(
    clientSecret: java.lang.String,
    element: stripeDashV3Lib.stripeNs.elementsNs.Element,
    data: stripeDashV3Lib.stripeNs.paymentIntentNs.PaymentIntentConfirmationData
  ): js.Promise[stripeDashV3Lib.stripeNs.paymentIntentNs.PaymentIntentResponse] = js.native
  def createPaymentMethod(`type`: paymentMethodType, element: stripeDashV3Lib.stripeNs.elementsNs.Element): js.Promise[StripePaymentMethodResponse] = js.native
  def createPaymentMethod(
    `type`: paymentMethodType,
    element: stripeDashV3Lib.stripeNs.elementsNs.Element,
    data: StripePaymentMethodIncomplete
  ): js.Promise[StripePaymentMethodResponse] = js.native
  def createSource(element: stripeDashV3Lib.stripeNs.elementsNs.Element): js.Promise[SourceResponse] = js.native
  def createSource(element: stripeDashV3Lib.stripeNs.elementsNs.Element, options: stripeDashV3Lib.Anon_Owner): js.Promise[SourceResponse] = js.native
  def createSource(options: SourceOptions): js.Promise[SourceResponse] = js.native
  def createToken(element: stripeDashV3Lib.stripeNs.elementsNs.Element): js.Promise[TokenResponse] = js.native
  def createToken(element: stripeDashV3Lib.stripeNs.elementsNs.Element, options: TokenOptions): js.Promise[TokenResponse] = js.native
  @JSName("createToken")
  def createToken_bank_account(name: stripeDashV3Lib.stripeDashV3LibStrings.bank_account, options: BankAccountTokenOptions): js.Promise[TokenResponse] = js.native
  @JSName("createToken")
  def createToken_pii(name: stripeDashV3Lib.stripeDashV3LibStrings.pii, options: PiiTokenOptions): js.Promise[TokenResponse] = js.native
  def elements(): stripeDashV3Lib.stripeNs.elementsNs.Elements = js.native
  def elements(options: stripeDashV3Lib.stripeNs.elementsNs.ElementsCreateOptions): stripeDashV3Lib.stripeNs.elementsNs.Elements = js.native
  def handleCardAction(clientSecret: java.lang.String): js.Promise[stripeDashV3Lib.stripeNs.paymentIntentNs.PaymentIntentResponse] = js.native
  def handleCardPayment(clientSecret: java.lang.String): js.Promise[stripeDashV3Lib.stripeNs.paymentIntentNs.PaymentIntentResponse] = js.native
  def handleCardPayment(clientSecret: java.lang.String, data: stripeDashV3Lib.stripeNs.paymentIntentNs.CardPaymentData): js.Promise[stripeDashV3Lib.stripeNs.paymentIntentNs.PaymentIntentResponse] = js.native
  def handleCardPayment(clientSecret: java.lang.String, element: stripeDashV3Lib.stripeNs.elementsNs.Element): js.Promise[stripeDashV3Lib.stripeNs.paymentIntentNs.PaymentIntentResponse] = js.native
  def handleCardPayment(
    clientSecret: java.lang.String,
    element: stripeDashV3Lib.stripeNs.elementsNs.Element,
    data: stripeDashV3Lib.stripeNs.paymentIntentNs.CardPaymentData
  ): js.Promise[stripeDashV3Lib.stripeNs.paymentIntentNs.PaymentIntentResponse] = js.native
  def paymentRequest(options: stripeDashV3Lib.stripeNs.paymentRequestNs.StripePaymentRequestOptions): stripeDashV3Lib.stripeNs.paymentRequestNs.StripePaymentRequest = js.native
  def redirectToCheckout(options: StripeCheckoutOptions): js.Promise[StripeRedirectResponse] = js.native
  def retrievePaymentIntent(clientSecret: java.lang.String): js.Promise[stripeDashV3Lib.stripeNs.paymentIntentNs.PaymentIntentResponse] = js.native
  def retrieveSource(options: RetrieveSourceOptions): js.Promise[SourceResponse] = js.native
}

