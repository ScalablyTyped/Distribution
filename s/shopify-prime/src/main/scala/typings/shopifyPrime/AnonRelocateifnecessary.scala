package typings.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRelocateifnecessary extends js.Object {
  var relocate_if_necessary: js.UndefOr[Boolean] = js.undefined
}

object AnonRelocateifnecessary {
  @scala.inline
  def apply(relocate_if_necessary: js.UndefOr[Boolean] = js.undefined): AnonRelocateifnecessary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(relocate_if_necessary)) __obj.updateDynamic("relocate_if_necessary")(relocate_if_necessary.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRelocateifnecessary]
  }
}

