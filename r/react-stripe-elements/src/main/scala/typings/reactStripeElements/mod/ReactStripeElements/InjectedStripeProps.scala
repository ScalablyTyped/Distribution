package typings.reactStripeElements.mod.ReactStripeElements

import typings.stripeV3.stripe.elements.Elements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectedStripeProps extends js.Object {
  var elements: Elements | Null
  var stripe: StripeProps | Null
}

object InjectedStripeProps {
  @scala.inline
  def apply(elements: Elements = null, stripe: StripeProps = null): InjectedStripeProps = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], stripe = stripe.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectedStripeProps]
  }
}

