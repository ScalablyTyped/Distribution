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
    ClassAttributes: ClassAttributes[PaginationLast] = null
  ): PaginationLastProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    __obj.asInstanceOf[PaginationLastProps]
  }
}

