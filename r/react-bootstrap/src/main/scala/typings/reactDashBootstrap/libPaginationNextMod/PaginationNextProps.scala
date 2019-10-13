package typings.reactDashBootstrap.libPaginationNextMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationNextProps
  extends AllHTMLAttributes[PaginationNext]
     with ClassAttributes[PaginationNext]

object PaginationNextProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[PaginationNext] = null,
    ClassAttributes: ClassAttributes[PaginationNext] = null,
    disabled: js.UndefOr[Boolean] = js.undefined
  ): PaginationNextProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[PaginationNextProps]
  }
}

