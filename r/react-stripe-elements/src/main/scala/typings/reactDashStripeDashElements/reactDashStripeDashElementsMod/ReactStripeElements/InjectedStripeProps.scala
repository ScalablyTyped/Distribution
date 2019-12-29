package typings.reactDashStripeDashElements.reactDashStripeDashElementsMod.ReactStripeElements

import typings.stripeDashV3.stripe.elements.Elements
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
    val __obj = js.Dynamic.literal()
    if (elements != null) __obj.updateDynamic("elements")(elements.asInstanceOf[js.Any])
    if (stripe != null) __obj.updateDynamic("stripe")(stripe.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectedStripeProps]
  }
}

