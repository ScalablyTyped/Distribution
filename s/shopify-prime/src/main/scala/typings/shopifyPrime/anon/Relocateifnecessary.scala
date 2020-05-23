package typings.shopifyPrime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relocateifnecessary extends js.Object {
  var relocate_if_necessary: js.UndefOr[Boolean] = js.undefined
}

object Relocateifnecessary {
  @scala.inline
  def apply(relocate_if_necessary: js.UndefOr[Boolean] = js.undefined): Relocateifnecessary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(relocate_if_necessary)) __obj.updateDynamic("relocate_if_necessary")(relocate_if_necessary.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relocateifnecessary]
  }
}

