package typings
package reactDashStripeDashElementsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_ClientSecret extends js.Object {
  def apply(clientSecret: java.lang.String): js.Promise[stripeDashV3Lib.stripeNs.PaymentIntentResponse] = js.native
  def apply(clientSecret: java.lang.String, element: stripeDashV3Lib.stripeNs.elementsNs.Element): js.Promise[stripeDashV3Lib.stripeNs.PaymentIntentResponse] = js.native
  def apply(
    clientSecret: java.lang.String,
    element: stripeDashV3Lib.stripeNs.elementsNs.Element,
    options: stripeDashV3Lib.stripeNs.HandleCardPaymentOptions
  ): js.Promise[stripeDashV3Lib.stripeNs.PaymentIntentResponse] = js.native
  def apply(
    clientSecret: java.lang.String,
    options: stripeDashV3Lib.stripeNs.HandleCardPaymentWithoutElementsOptions
  ): js.Promise[stripeDashV3Lib.stripeNs.PaymentIntentResponse] = js.native
}

