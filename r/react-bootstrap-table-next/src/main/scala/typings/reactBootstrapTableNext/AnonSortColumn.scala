package typings.reactBootstrapTableNext

import typings.reactBootstrapTableNext.mod.ColumnDescription
import typings.reactBootstrapTableNext.mod.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSortColumn[T /* <: js.Object */] extends js.Object {
  var sortColumn: ColumnDescription[T, _]
  var sortOrder: SortOrder
}

object AnonSortColumn {
  @scala.inline
  def apply[T /* <: js.Object */](sortColumn: ColumnDescription[T, _], sortOrder: SortOrder): AnonSortColumn[T] = {
    val __obj = js.Dynamic.literal(sortColumn = sortColumn.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSortColumn[T]]
  }
}

