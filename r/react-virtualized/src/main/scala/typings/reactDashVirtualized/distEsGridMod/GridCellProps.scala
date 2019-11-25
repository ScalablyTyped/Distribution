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
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GridCellProps]
  }
}

