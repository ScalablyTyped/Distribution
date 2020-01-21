package typings.sipJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnonymous extends js.Object {
  var anonymous: js.UndefOr[Boolean] = js.undefined
  var outbound: js.UndefOr[Boolean] = js.undefined
}

object AnonAnonymous {
  @scala.inline
  def apply(anonymous: js.UndefOr[Boolean] = js.undefined, outbound: js.UndefOr[Boolean] = js.undefined): AnonAnonymous = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anonymous)) __obj.updateDynamic("anonymous")(anonymous.asInstanceOf[js.Any])
    if (!js.isUndefined(outbound)) __obj.updateDynamic("outbound")(outbound.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnonymous]
  }
}

