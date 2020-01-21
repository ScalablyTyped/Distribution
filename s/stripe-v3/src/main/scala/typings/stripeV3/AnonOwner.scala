package typings.stripeV3

import typings.stripeV3.stripe.OwnerInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOwner extends js.Object {
  var owner: js.UndefOr[OwnerInfo] = js.undefined
}

object AnonOwner {
  @scala.inline
  def apply(owner: OwnerInfo = null): AnonOwner = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOwner]
  }
}

