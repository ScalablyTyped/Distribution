package typings.reactDatagrid.mod.ReactDataGrid

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellProps extends js.Object {
  /**
    * a class name for the cell
    */
  var className: String
  /**
    * the index of the column
    */
  var index: Double
  /**
    * the index of the row
    */
  var rowIndex: Double
  /**
    * a style for the cell
    */
  var style: CSSProperties
}

object CellProps {
  @scala.inline
  def apply(className: String, index: Double, rowIndex: Double, style: CSSProperties): CellProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellProps]
  }
}

