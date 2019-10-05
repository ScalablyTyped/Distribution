package typings.reactDashDatagrid.reactDashDatagridMod.ReactDataGrid

import typings.react.reactMod.CSSProperties
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
    val __obj = js.Dynamic.literal(className = className, index = index, rowIndex = rowIndex, style = style)
  
    __obj.asInstanceOf[CellProps]
  }
}

