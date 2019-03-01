package typings
package reactDashBootstrapLib.libPaginationMod.PaginationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libPaginationMod.Pagination] {
  var bsSize: js.UndefOr[reactDashBootstrapLib.reactDashBootstrapMod.Sizes] = js.undefined
}

object PaginationProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libPaginationMod.Pagination] = null,
    bsSize: reactDashBootstrapLib.reactDashBootstrapMod.Sizes = null
  ): PaginationProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    __obj.asInstanceOf[PaginationProps]
  }
}

