package typings.reactDashStripeDashElements

import typings.stripeDashV3.stripeNs.HandleCardPaymentOptions
import typings.stripeDashV3.stripeNs.HandleCardPaymentWithoutElementsOptions
import typings.stripeDashV3.stripeNs.PaymentIntentResponse
import typings.stripeDashV3.stripeNs.elementsNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_ClientSecret extends js.Object {
  def apply(clientSecret: String): js.Promise[PaymentIntentResponse] = js.native
  def apply(clientSecret: String, element: Element): js.Promise[PaymentIntentResponse] = js.native
  def apply(clientSecret: String, element: Element, options: HandleCardPaymentOptions): js.Promise[PaymentIntentResponse] = js.native
  def apply(clientSecret: String, options: HandleCardPaymentWithoutElementsOptions): js.Promise[PaymentIntentResponse] = js.native
}

