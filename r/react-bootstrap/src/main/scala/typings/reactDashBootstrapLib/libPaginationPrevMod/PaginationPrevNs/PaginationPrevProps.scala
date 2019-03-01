package typings
package reactDashBootstrapLib.libPaginationPrevMod.PaginationPrevNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationPrevProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libPaginationPrevMod.PaginationPrev]

object PaginationPrevProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libPaginationPrevMod.PaginationPrev] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined
  ): PaginationPrevProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[PaginationPrevProps]
  }
}

