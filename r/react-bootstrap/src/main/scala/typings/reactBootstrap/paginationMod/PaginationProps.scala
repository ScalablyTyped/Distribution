package typings.reactBootstrap.paginationMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactBootstrap.mod.Sizes
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
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationProps]
  }
}

