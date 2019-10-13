package typings.reactDashBootstrap.libPaginationPrevMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationPrevProps
  extends AllHTMLAttributes[PaginationPrev]
     with ClassAttributes[PaginationPrev]

object PaginationPrevProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[PaginationPrev] = null,
    ClassAttributes: ClassAttributes[PaginationPrev] = null,
    disabled: js.UndefOr[Boolean] = js.undefined
  ): PaginationPrevProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[PaginationPrevProps]
  }
}

