package typings.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisconnectifnecessary extends js.Object {
  var disconnect_if_necessary: js.UndefOr[Boolean] = js.undefined
}

object AnonDisconnectifnecessary {
  @scala.inline
  def apply(disconnect_if_necessary: js.UndefOr[Boolean] = js.undefined): AnonDisconnectifnecessary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disconnect_if_necessary)) __obj.updateDynamic("disconnect_if_necessary")(disconnect_if_necessary.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisconnectifnecessary]
  }
}

