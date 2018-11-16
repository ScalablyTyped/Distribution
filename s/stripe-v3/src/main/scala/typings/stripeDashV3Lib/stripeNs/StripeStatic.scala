package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeStatic extends js.Object {
  var version: scala.Double = js.native
  def apply(publicKey: java.lang.String): Stripe = js.native
  def apply(publicKey: java.lang.String, options: StripeOptions): Stripe = js.native
}

