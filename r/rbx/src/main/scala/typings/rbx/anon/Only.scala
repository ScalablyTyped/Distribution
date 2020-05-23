package typings.rbx.anon

import typings.rbx.rbxStrings.`inline-block`
import typings.rbx.rbxStrings.`inline-flex`
import typings.rbx.rbxStrings.`inline`
import typings.rbx.rbxStrings.block
import typings.rbx.rbxStrings.flex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Only extends js.Object {
  var only: js.UndefOr[Boolean] = js.undefined
  var value: block | flex | `inline` | `inline-block` | `inline-flex`
}

object Only {
  @scala.inline
  def apply(
    value: block | flex | `inline` | `inline-block` | `inline-flex`,
    only: js.UndefOr[Boolean] = js.undefined
  ): Only = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Only]
  }
}

