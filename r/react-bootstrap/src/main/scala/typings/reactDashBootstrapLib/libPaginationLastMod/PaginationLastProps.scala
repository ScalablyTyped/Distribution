package typings
package reactDashBootstrapLib.libPaginationLastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationLastProps
  extends reactLib.reactMod.HTMLProps[PaginationLast]

object PaginationLastProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[PaginationLast] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined
  ): PaginationLastProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[PaginationLastProps]
  }
}

