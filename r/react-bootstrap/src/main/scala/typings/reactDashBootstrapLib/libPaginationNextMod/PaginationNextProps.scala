package typings
package reactDashBootstrapLib.libPaginationNextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationNextProps
  extends reactLib.reactMod.HTMLProps[PaginationNext]

object PaginationNextProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[PaginationNext] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined
  ): PaginationNextProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[PaginationNextProps]
  }
}

