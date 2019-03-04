package typings
package reactDashVirtualizedLib.distEsGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridCellProps extends js.Object {
  var columnIndex: scala.Double
  var isScrolling: scala.Boolean
  var isVisible: scala.Boolean
  var key: java.lang.String
  var parent: reactDashVirtualizedLib.distEsCellMeasurerMod.MeasuredCellParent
  var rowIndex: scala.Double
  var style: reactLib.reactMod.ReactNs.CSSProperties
}

object GridCellProps {
  @scala.inline
  def apply(
    columnIndex: scala.Double,
    isScrolling: scala.Boolean,
    isVisible: scala.Boolean,
    key: java.lang.String,
    parent: reactDashVirtualizedLib.distEsCellMeasurerMod.MeasuredCellParent,
    rowIndex: scala.Double,
    style: reactLib.reactMod.ReactNs.CSSProperties
  ): GridCellProps = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex, isScrolling = isScrolling, isVisible = isVisible, key = key, parent = parent, rowIndex = rowIndex, style = style)
  
    __obj.asInstanceOf[GridCellProps]
  }
}

