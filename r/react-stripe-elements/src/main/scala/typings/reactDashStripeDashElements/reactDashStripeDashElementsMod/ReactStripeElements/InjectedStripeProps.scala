package typings.reactDashStripeDashElements.reactDashStripeDashElementsMod.ReactStripeElements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectedStripeProps extends js.Object {
  var elements: typings.stripeDashV3.stripe.elements.Elements | Null
  var stripe: StripeProps | Null
}

object InjectedStripeProps {
  @scala.inline
  def apply(elements: typings.stripeDashV3.stripe.elements.Elements = null, stripe: StripeProps = null): InjectedStripeProps = {
    val __obj = js.Dynamic.literal()
    if (elements != null) __obj.updateDynamic("elements")(elements.asInstanceOf[js.Any])
    if (stripe != null) __obj.updateDynamic("stripe")(stripe.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectedStripeProps]
  }
}

