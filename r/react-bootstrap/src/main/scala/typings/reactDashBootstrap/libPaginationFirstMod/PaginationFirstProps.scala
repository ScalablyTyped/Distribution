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
    ClassAttributes: ClassAttributes[PaginationFirst] = null
  ): PaginationFirstProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    __obj.asInstanceOf[PaginationFirstProps]
  }
}

