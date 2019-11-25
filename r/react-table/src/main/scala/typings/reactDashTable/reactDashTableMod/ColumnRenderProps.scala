package typings.reactDashTable.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnRenderProps[D] extends js.Object {
  /** The column. */
  var column: Column[D]
  /** Sorted data. */
  var data: js.Array[D]
}

object ColumnRenderProps {
  @scala.inline
  def apply[D](column: Column[D], data: js.Array[D]): ColumnRenderProps[D] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ColumnRenderProps[D]]
  }
}

