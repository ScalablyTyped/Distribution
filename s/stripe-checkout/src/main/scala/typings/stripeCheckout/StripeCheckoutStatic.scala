package typings.stripeCheckout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeCheckoutStatic extends js.Object {
  def configure(options: StripeCheckoutOptions): StripeCheckoutHandler = js.native
}

object StripeCheckoutStatic {
  @scala.inline
  def apply(configure: StripeCheckoutOptions => StripeCheckoutHandler): StripeCheckoutStatic = {
    val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure))
    __obj.asInstanceOf[StripeCheckoutStatic]
  }
  @scala.inline
  implicit class StripeCheckoutStaticOps[Self <: StripeCheckoutStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfigure(value: StripeCheckoutOptions => StripeCheckoutHandler): Self = this.set("configure", js.Any.fromFunction1(value))
  }
  
}

