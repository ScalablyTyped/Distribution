package typings.reactDashBootstrap.libPaginationNextMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationNextProps extends HTMLProps[PaginationNext]

object PaginationNextProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[PaginationNext] = null, disabled: js.UndefOr[Boolean] = js.undefined): PaginationNextProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[PaginationNextProps]
  }
}

