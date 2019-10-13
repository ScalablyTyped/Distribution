package typings.reactDashBootstrap.libPaginationLastMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationLastProps
  extends AllHTMLAttributes[PaginationLast]
     with ClassAttributes[PaginationLast]

object PaginationLastProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[PaginationLast] = null,
    ClassAttributes: ClassAttributes[PaginationLast] = null,
    disabled: js.UndefOr[Boolean] = js.undefined
  ): PaginationLastProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[PaginationLastProps]
  }
}

