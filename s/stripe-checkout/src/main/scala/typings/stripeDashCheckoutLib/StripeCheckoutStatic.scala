package typings
package stripeDashCheckoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeCheckoutStatic extends js.Object {
  def configure(options: StripeCheckoutOptions): StripeCheckoutHandler
}

object StripeCheckoutStatic {
  @scala.inline
  def apply(configure: StripeCheckoutOptions => StripeCheckoutHandler): StripeCheckoutStatic = {
    val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure))
  
    __obj.asInstanceOf[StripeCheckoutStatic]
  }
}

