package typings.shopifyPrime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disconnectifnecessary extends js.Object {
  var disconnect_if_necessary: js.UndefOr[Boolean] = js.undefined
}

object Disconnectifnecessary {
  @scala.inline
  def apply(disconnect_if_necessary: js.UndefOr[Boolean] = js.undefined): Disconnectifnecessary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disconnect_if_necessary)) __obj.updateDynamic("disconnect_if_necessary")(disconnect_if_necessary.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disconnectifnecessary]
  }
}

