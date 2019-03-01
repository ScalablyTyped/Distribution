package typings
package reactDashVirtualizedLib.distEsTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableHeaderRowProps extends js.Object {
  var className: java.lang.String
  var columns: js.Array[reactLib.reactMod.ReactNs.ReactNode]
  var height: scala.Double
  var scrollbarWidth: scala.Double
  var style: reactLib.reactMod.ReactNs.CSSProperties
  var width: scala.Double
}

object TableHeaderRowProps {
  @scala.inline
  def apply(
    className: java.lang.String,
    columns: js.Array[reactLib.reactMod.ReactNs.ReactNode],
    height: scala.Double,
    scrollbarWidth: scala.Double,
    style: reactLib.reactMod.ReactNs.CSSProperties,
    width: scala.Double
  ): TableHeaderRowProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("className")(className)
    __obj.updateDynamic("columns")(columns)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("scrollbarWidth")(scrollbarWidth)
    __obj.updateDynamic("style")(style)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[TableHeaderRowProps]
  }
}

