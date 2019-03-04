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
  def apply(configure: js.Function1[StripeCheckoutOptions, StripeCheckoutHandler]): StripeCheckoutStatic = {
    val __obj = js.Dynamic.literal(configure = configure)
  
    __obj.asInstanceOf[StripeCheckoutStatic]
  }
}

