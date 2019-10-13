package typings.reactDashBootstrap.libPaginationItemMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationItemProps
  extends AllHTMLAttributes[PaginationItem]
     with ClassAttributes[PaginationItem] {
  var active: js.UndefOr[Boolean] = js.undefined
}

object PaginationItemProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[PaginationItem] = null,
    ClassAttributes: ClassAttributes[PaginationItem] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined
  ): PaginationItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[PaginationItemProps]
  }
}

