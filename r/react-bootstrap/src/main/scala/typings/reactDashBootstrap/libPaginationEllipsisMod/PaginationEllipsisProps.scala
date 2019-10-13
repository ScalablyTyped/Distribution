package typings.reactDashBootstrap.libPaginationEllipsisMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationEllipsisProps
  extends AllHTMLAttributes[PaginationEllipsis]
     with ClassAttributes[PaginationEllipsis]

object PaginationEllipsisProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[PaginationEllipsis] = null,
    ClassAttributes: ClassAttributes[PaginationEllipsis] = null,
    disabled: js.UndefOr[Boolean] = js.undefined
  ): PaginationEllipsisProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[PaginationEllipsisProps]
  }
}

