package typings
package reactDashDatagridLib.reactDashDatagridMod.ReactDataGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellProps extends js.Object {
  /**
    * a class name for the cell
    */
  var className: java.lang.String
  /**
    * the index of the column
    */
  var index: scala.Double
  /**
    * the index of the row
    */
  var rowIndex: scala.Double
  /**
    * a style for the cell
    */
  var style: reactLib.reactMod.ReactNs.CSSProperties
}

object CellProps {
  @scala.inline
  def apply(
    className: java.lang.String,
    index: scala.Double,
    rowIndex: scala.Double,
    style: reactLib.reactMod.ReactNs.CSSProperties
  ): CellProps = {
    val __obj = js.Dynamic.literal(className = className, index = index, rowIndex = rowIndex, style = style)
  
    __obj.asInstanceOf[CellProps]
  }
}

