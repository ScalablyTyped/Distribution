package typings.reactDashTable.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseGroupByInstanceProps[D /* <: js.Object */] extends js.Object {
  var preGroupedRows: js.Array[Row[D]]
  var rows: js.Array[Row[D]]
  def toggleGroupBy(columnId: IdType[D], toggle: Boolean): Unit
}

object UseGroupByInstanceProps {
  @scala.inline
  def apply[D /* <: js.Object */](
    preGroupedRows: js.Array[Row[D]],
    rows: js.Array[Row[D]],
    toggleGroupBy: (IdType[D], Boolean) => Unit
  ): UseGroupByInstanceProps[D] = {
    val __obj = js.Dynamic.literal(preGroupedRows = preGroupedRows.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], toggleGroupBy = js.Any.fromFunction2(toggleGroupBy))
  
    __obj.asInstanceOf[UseGroupByInstanceProps[D]]
  }
}

