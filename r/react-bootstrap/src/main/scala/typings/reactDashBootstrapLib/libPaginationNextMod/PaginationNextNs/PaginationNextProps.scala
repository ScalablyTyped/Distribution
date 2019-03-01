package typings
package reactDashBootstrapLib.libPaginationNextMod.PaginationNextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationNextProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libPaginationNextMod.PaginationNext]

object PaginationNextProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libPaginationNextMod.PaginationNext] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined
  ): PaginationNextProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[PaginationNextProps]
  }
}

