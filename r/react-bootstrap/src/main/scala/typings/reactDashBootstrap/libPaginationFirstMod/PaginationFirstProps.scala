package typings.reactDashBootstrap.libPaginationFirstMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationFirstProps
  extends AllHTMLAttributes[PaginationFirst]
     with ClassAttributes[PaginationFirst]

object PaginationFirstProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[PaginationFirst] = null,
    ClassAttributes: ClassAttributes[PaginationFirst] = null,
    disabled: js.UndefOr[Boolean] = js.undefined
  ): PaginationFirstProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[PaginationFirstProps]
  }
}

