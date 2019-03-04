package typings
package reactDashMdLib.libGridsGridListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HOCProps extends js.Object {
  var cellClassName: java.lang.String
  var cellStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var className: java.lang.String
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object HOCProps {
  @scala.inline
  def apply(
    cellClassName: java.lang.String,
    className: java.lang.String,
    cellStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): HOCProps = {
    val __obj = js.Dynamic.literal(cellClassName = cellClassName, className = className)
    if (cellStyle != null) __obj.updateDynamic("cellStyle")(cellStyle)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[HOCProps]
  }
}

