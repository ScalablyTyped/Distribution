package typings.stripeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSupported extends js.Object {
  var supported: js.UndefOr[Boolean] = js.undefined
}

object AnonSupported {
  @scala.inline
  def apply(supported: js.UndefOr[Boolean] = js.undefined): AnonSupported = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(supported)) __obj.updateDynamic("supported")(supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSupported]
  }
}

