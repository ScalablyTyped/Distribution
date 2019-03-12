package typings
package reactDashStripeDashElementsLib.reactDashStripeDashElementsMod.ReactStripeElementsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeProps extends js.Object {
  @JSName("paymentRequest")
  var paymentRequest_Original: js.Function1[
    /* options */ stripeDashV3Lib.stripeNs.paymentRequestNs.StripePaymentRequestOptions, 
    stripeDashV3Lib.stripeNs.paymentRequestNs.StripePaymentRequest
  ] = js.native
  def createSource(): js.Promise[SourceResponse] = js.native
  def createSource(sourceData: SourceOptions): js.Promise[SourceResponse] = js.native
  def createToken(): js.Promise[PatchedTokenResponse] = js.native
  def createToken(options: TokenOptions): js.Promise[PatchedTokenResponse] = js.native
  def paymentRequest(options: stripeDashV3Lib.stripeNs.paymentRequestNs.StripePaymentRequestOptions): stripeDashV3Lib.stripeNs.paymentRequestNs.StripePaymentRequest = js.native
}

