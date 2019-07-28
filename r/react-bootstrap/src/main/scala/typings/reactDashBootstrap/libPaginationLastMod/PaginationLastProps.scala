package typings.reactDashBootstrap.libPaginationLastMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationLastProps extends HTMLProps[PaginationLast]

object PaginationLastProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[PaginationLast] = null, disabled: js.UndefOr[Boolean] = js.undefined): PaginationLastProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[PaginationLastProps]
  }
}

