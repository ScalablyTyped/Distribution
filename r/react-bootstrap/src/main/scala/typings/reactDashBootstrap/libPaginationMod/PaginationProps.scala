package typings.reactDashBootstrap.libPaginationMod

import typings.react.reactMod.HTMLProps
import typings.reactDashBootstrap.reactDashBootstrapMod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationProps extends HTMLProps[Pagination] {
  var bsSize: js.UndefOr[Sizes] = js.undefined
}

object PaginationProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[Pagination] = null, bsSize: Sizes = null): PaginationProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    __obj.asInstanceOf[PaginationProps]
  }
}

