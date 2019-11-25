package typings.reactDashStripeDashElements.reactDashStripeDashElementsMod.ReactStripeElements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectedStripeProps extends js.Object {
  var stripe: js.UndefOr[StripeProps] = js.undefined
}

object InjectedStripeProps {
  @scala.inline
  def apply(stripe: StripeProps = null): InjectedStripeProps = {
    val __obj = js.Dynamic.literal()
    if (stripe != null) __obj.updateDynamic("stripe")(stripe.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectedStripeProps]
  }
}

