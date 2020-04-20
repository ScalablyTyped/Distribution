package typings.rbx

import typings.rbx.rbxStrings.`inline-block`
import typings.rbx.rbxStrings.`inline-flex`
import typings.rbx.rbxStrings.`inline`
import typings.rbx.rbxStrings.block
import typings.rbx.rbxStrings.flex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnly extends js.Object {
  var only: js.UndefOr[Boolean] = js.undefined
  var value: block | flex | `inline` | `inline-block` | `inline-flex`
}

object AnonOnly {
  @scala.inline
  def apply(
    value: block | flex | `inline` | `inline-block` | `inline-flex`,
    only: js.UndefOr[Boolean] = js.undefined
  ): AnonOnly = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnly]
  }
}

