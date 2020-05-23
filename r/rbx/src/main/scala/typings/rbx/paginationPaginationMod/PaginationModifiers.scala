package typings.rbx.paginationPaginationMod

import typings.rbx.rbxStrings.centered
import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.right
import typings.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationModifiers extends js.Object {
  var align: js.UndefOr[centered | right] = js.undefined
  var rounded: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[small | medium | large] = js.undefined
}

object PaginationModifiers {
  @scala.inline
  def apply(
    align: centered | right = null,
    rounded: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large = null
  ): PaginationModifiers = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(rounded)) __obj.updateDynamic("rounded")(rounded.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationModifiers]
  }
}

