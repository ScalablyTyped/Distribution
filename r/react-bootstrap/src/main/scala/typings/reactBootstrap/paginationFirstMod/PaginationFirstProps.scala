package typings.reactBootstrap.paginationFirstMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
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
    ClassAttributes: ClassAttributes[PaginationFirst] = null
  ): PaginationFirstProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    __obj.asInstanceOf[PaginationFirstProps]
  }
}

