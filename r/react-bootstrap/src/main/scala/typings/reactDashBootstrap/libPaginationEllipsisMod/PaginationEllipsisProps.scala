package typings.reactDashBootstrap.libPaginationEllipsisMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationEllipsisProps extends HTMLProps[PaginationEllipsis]

object PaginationEllipsisProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[PaginationEllipsis] = null, disabled: js.UndefOr[Boolean] = js.undefined): PaginationEllipsisProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[PaginationEllipsisProps]
  }
}

