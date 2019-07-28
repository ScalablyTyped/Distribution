package typings.reactDashBootstrap.libPaginationFirstMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationFirstProps extends HTMLProps[PaginationFirst]

object PaginationFirstProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[PaginationFirst] = null, disabled: js.UndefOr[Boolean] = js.undefined): PaginationFirstProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[PaginationFirstProps]
  }
}

