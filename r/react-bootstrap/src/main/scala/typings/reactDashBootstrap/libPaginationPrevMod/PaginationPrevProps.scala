package typings.reactDashBootstrap.libPaginationPrevMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationPrevProps extends HTMLProps[PaginationPrev]

object PaginationPrevProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[PaginationPrev] = null, disabled: js.UndefOr[Boolean] = js.undefined): PaginationPrevProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[PaginationPrevProps]
  }
}

