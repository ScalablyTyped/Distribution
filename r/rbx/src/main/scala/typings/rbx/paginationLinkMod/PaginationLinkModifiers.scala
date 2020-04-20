package typings.rbx.paginationLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationLinkModifiers extends js.Object {
  var current: js.UndefOr[Boolean] = js.undefined
}

object PaginationLinkModifiers {
  @scala.inline
  def apply(current: js.UndefOr[Boolean] = js.undefined): PaginationLinkModifiers = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(current)) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationLinkModifiers]
  }
}

