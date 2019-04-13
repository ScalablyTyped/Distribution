package typings
package reactDashVirtualizedLib.distEsTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableHeaderRowProps extends js.Object {
  var className: java.lang.String
  var columns: js.Array[reactLib.reactMod.ReactNode]
  var height: scala.Double
  var scrollbarWidth: scala.Double
  var style: reactLib.reactMod.CSSProperties
  var width: scala.Double
}

object TableHeaderRowProps {
  @scala.inline
  def apply(
    className: java.lang.String,
    columns: js.Array[reactLib.reactMod.ReactNode],
    height: scala.Double,
    scrollbarWidth: scala.Double,
    style: reactLib.reactMod.CSSProperties,
    width: scala.Double
  ): TableHeaderRowProps = {
    val __obj = js.Dynamic.literal(className = className, columns = columns, height = height, scrollbarWidth = scrollbarWidth, style = style, width = width)
  
    __obj.asInstanceOf[TableHeaderRowProps]
  }
}

