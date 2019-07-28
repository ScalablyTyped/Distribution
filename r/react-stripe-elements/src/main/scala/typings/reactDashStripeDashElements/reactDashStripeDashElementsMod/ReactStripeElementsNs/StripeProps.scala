package typings.reactDashStripeDashElements.reactDashStripeDashElementsMod.ReactStripeElementsNs

import typings.reactDashStripeDashElements.Fn_ClientSecret
import typings.reactDashStripeDashElements.Fn_ClientSecretData
import typings.stripeDashV3.stripeNs.paymentRequestNs.StripePaymentRequest
import typings.stripeDashV3.stripeNs.paymentRequestNs.StripePaymentRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeProps extends js.Object {
  var handleCardPayment: Fn_ClientSecret = js.native
  var handleCardSetup: Fn_ClientSecretData = js.native
  var paymentRequest: js.Function1[/* options */ StripePaymentRequestOptions, StripePaymentRequest] = js.native
  def createSource(): js.Promise[SourceResponse] = js.native
  def createSource(sourceData: SourceOptions): js.Promise[SourceResponse] = js.native
  def createToken(): js.Promise[PatchedTokenResponse] = js.native
  def createToken(options: TokenOptions): js.Promise[PatchedTokenResponse] = js.native
}

