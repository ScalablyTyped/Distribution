package typings
package reactDashBootstrapLib.libPaginationEllipsisMod.PaginationEllipsisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationEllipsisProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libPaginationEllipsisMod.PaginationEllipsis]

object PaginationEllipsisProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libPaginationEllipsisMod.PaginationEllipsis] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined
  ): PaginationEllipsisProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[PaginationEllipsisProps]
  }
}

