package typings.stripeDashV3.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeStatic extends js.Object {
  var version: Double = js.native
  def apply(publicKey: String): Stripe = js.native
  def apply(publicKey: String, options: StripeOptions): Stripe = js.native
}

