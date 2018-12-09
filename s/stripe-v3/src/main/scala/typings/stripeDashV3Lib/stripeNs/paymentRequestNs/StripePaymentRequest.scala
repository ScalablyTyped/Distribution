package typings
package stripeDashV3Lib.stripeNs.paymentRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripePaymentRequest extends js.Object {
  def canMakePayment(): js.Promise[stripeDashV3Lib.Anon_ApplePay | scala.Null] = js.native
  @JSName("on")
  def on_cancel(event: stripeDashV3Lib.stripeDashV3LibStrings.cancel, handler: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_shippingaddresschange(
    event: stripeDashV3Lib.stripeDashV3LibStrings.shippingaddresschange,
    handler: js.Function1[/* response */ stripeDashV3Lib.Anon_ShippingAddress, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_shippingoptionchange(
    event: stripeDashV3Lib.stripeDashV3LibStrings.shippingoptionchange,
    handler: js.Function1[/* response */ stripeDashV3Lib.Anon_UpdateWith, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_source(
    event: stripeDashV3Lib.stripeDashV3LibStrings.source,
    handler: js.Function1[/* response */ StripeSourcePaymentResponse, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_token(
    event: stripeDashV3Lib.stripeDashV3LibStrings.token,
    handler: js.Function1[/* response */ StripeTokenPaymentResponse, scala.Unit]
  ): scala.Unit = js.native
  def show(): scala.Unit = js.native
  def update(options: StripePaymentRequestUpdateOptions): scala.Unit = js.native
}

