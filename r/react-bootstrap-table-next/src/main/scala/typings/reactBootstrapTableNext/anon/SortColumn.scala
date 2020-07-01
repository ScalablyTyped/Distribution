package typings.reactBootstrapTableNext.anon

import typings.reactBootstrapTableNext.mod.ColumnDescription
import typings.reactBootstrapTableNext.mod.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortColumn[T /* <: js.Object */] extends js.Object {
  var sortColumn: ColumnDescription[T, _]
  var sortOrder: SortOrder
}

object SortColumn {
  @scala.inline
  def apply[/* <: js.Object */ T](sortColumn: ColumnDescription[T, _], sortOrder: SortOrder): SortColumn[T] = {
    val __obj = js.Dynamic.literal(sortColumn = sortColumn.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortColumn[T]]
  }
}

