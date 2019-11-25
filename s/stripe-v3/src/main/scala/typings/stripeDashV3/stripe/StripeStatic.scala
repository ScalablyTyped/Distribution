package typings.stripeDashV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeStatic extends js.Object {
  var version: Double = js.native
  def apply(publicKey: String): typings.stripeDashV3.stripe.Stripe = js.native
  def apply(publicKey: String, options: StripeOptions): typings.stripeDashV3.stripe.Stripe = js.native
}

