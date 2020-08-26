package typings.reactBootstrapTableNext.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactBootstrapTableNext.anon.Comparator
import typings.reactBootstrapTableNext.anon.DataField
import typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.asc
import typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableChangeState[T] extends js.Object {
  var cellEdit: DataField = js.native
  var data: js.Array[T] = js.native
  var filters: StringDictionary[Comparator] = js.native
  var page: Double = js.native
  var sizePerPage: Double = js.native
  var sortField: String = js.native
  var sortOrder: asc | desc = js.native
}

object TableChangeState {
  @scala.inline
  def apply[T](
    cellEdit: DataField,
    data: js.Array[T],
    filters: StringDictionary[Comparator],
    page: Double,
    sizePerPage: Double,
    sortField: String,
    sortOrder: asc | desc
  ): TableChangeState[T] = {
    val __obj = js.Dynamic.literal(cellEdit = cellEdit.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], sizePerPage = sizePerPage.asInstanceOf[js.Any], sortField = sortField.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableChangeState[T]]
  }
  @scala.inline
  implicit class TableChangeStateOps[Self <: TableChangeState[_], T] (val x: Self with TableChangeState[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCellEdit(value: DataField): Self = this.set("cellEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataVarargs(value: T*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[T]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilters(value: StringDictionary[Comparator]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizePerPage(value: Double): Self = this.set("sizePerPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortField(value: String): Self = this.set("sortField", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortOrder(value: asc | desc): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
  }
  
}

