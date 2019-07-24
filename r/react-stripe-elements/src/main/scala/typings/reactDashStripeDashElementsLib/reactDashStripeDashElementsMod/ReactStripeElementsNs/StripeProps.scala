package typings
package reactDashStripeDashElementsLib.reactDashStripeDashElementsMod.ReactStripeElementsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeProps extends js.Object {
  var handleCardPayment: reactDashStripeDashElementsLib.Fn_ClientSecret = js.native
  var handleCardSetup: reactDashStripeDashElementsLib.Fn_ClientSecretData = js.native
  var paymentRequest: js.Function1[
    /* options */ stripeDashV3Lib.stripeNs.paymentRequestNs.StripePaymentRequestOptions, 
    stripeDashV3Lib.stripeNs.paymentRequestNs.StripePaymentRequest
  ] = js.native
  def createSource(): js.Promise[SourceResponse] = js.native
  def createSource(sourceData: SourceOptions): js.Promise[SourceResponse] = js.native
  def createToken(): js.Promise[PatchedTokenResponse] = js.native
  def createToken(options: TokenOptions): js.Promise[PatchedTokenResponse] = js.native
}

