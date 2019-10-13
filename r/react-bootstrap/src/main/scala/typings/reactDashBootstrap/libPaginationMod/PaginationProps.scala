package typings.reactDashBootstrap.libPaginationMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.reactDashBootstrap.reactDashBootstrapMod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationProps
  extends AllHTMLAttributes[Pagination]
     with ClassAttributes[Pagination] {
  var bsSize: js.UndefOr[Sizes] = js.undefined
}

object PaginationProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Pagination] = null,
    ClassAttributes: ClassAttributes[Pagination] = null,
    bsSize: Sizes = null
  ): PaginationProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    __obj.asInstanceOf[PaginationProps]
  }
}

