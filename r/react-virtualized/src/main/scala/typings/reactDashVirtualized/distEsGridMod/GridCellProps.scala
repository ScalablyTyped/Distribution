package typings.reactDashVirtualized.distEsGridMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Component
import typings.reactDashVirtualized.distEsCellMeasurerMod.MeasuredCellParent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridCellProps extends js.Object {
  var columnIndex: Double
  var isScrolling: Boolean
  var isVisible: Boolean
  var key: String
  var parent: (Component[GridCoreProps, js.Object, _]) with MeasuredCellParent
  var rowIndex: Double
  var style: CSSProperties
}

object GridCellProps {
  @scala.inline
  def apply(
    columnIndex: Double,
    isScrolling: Boolean,
    isVisible: Boolean,
    key: String,
    parent: (Component[GridCoreProps, js.Object, _]) with MeasuredCellParent,
    rowIndex: Double,
    style: CSSProperties
  ): GridCellProps = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex, isScrolling = isScrolling, isVisible = isVisible, key = key, parent = parent, rowIndex = rowIndex, style = style)
  
    __obj.asInstanceOf[GridCellProps]
  }
}

