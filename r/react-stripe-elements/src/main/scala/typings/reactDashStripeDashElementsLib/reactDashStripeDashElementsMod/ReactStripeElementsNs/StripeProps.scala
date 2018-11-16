package typings
package reactDashStripeDashElementsLib.reactDashStripeDashElementsMod.ReactStripeElementsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeProps extends js.Object {
  var paymentRequest: js.Function1[
    /* options */ stripeDashV3Lib.stripeNs.paymentRequestNs.StripePaymentRequestOptions, 
    stripeDashV3Lib.stripeNs.paymentRequestNs.StripePaymentRequest
  ] = js.native
  def createSource(): stdLib.Promise[SourceResponse] = js.native
  def createSource(sourceData: SourceOptions): stdLib.Promise[SourceResponse] = js.native
  def createToken(): stdLib.Promise[PatchedTokenResponse] = js.native
  def createToken(options: TokenOptions): stdLib.Promise[PatchedTokenResponse] = js.native
}

