package typings.reactBootstrapTable2Toolkit.mod

import typings.react.mod.global.JSX.Element
import typings.reactBootstrapTableNext.mod.ColumnDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableToolkitProps[T /* <: js.Object */] extends js.Object {
  var bootstrap4: js.UndefOr[Boolean] = js.native
  var columns: js.Array[ColumnDescription[T, _]] = js.native
  var data: js.Array[T] = js.native
  var exportCSV: js.UndefOr[Boolean | CSVProps] = js.native
  var keyField: /* keyof T */ String = js.native
  var ref: js.UndefOr[js.Any] = js.native
  var search: js.UndefOr[TableSearchProps[T] | Boolean] = js.native
  def children(props: ToolkitContextType): Element = js.native
}

object TableToolkitProps {
  @scala.inline
  def apply[/* <: js.Object */ T](
    children: ToolkitContextType => Element,
    columns: js.Array[ColumnDescription[T, _]],
    data: js.Array[T],
    keyField: /* keyof T */ String
  ): TableToolkitProps[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keyField = keyField.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableToolkitProps[T]]
  }
  @scala.inline
  implicit class TableToolkitPropsOps[Self <: TableToolkitProps[_], /* <: js.Object */ T] (val x: Self with TableToolkitProps[T]) extends AnyVal {
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
    def setChildren(value: ToolkitContextType => Element): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setColumnsVarargs(value: (ColumnDescription[T, js.Any])*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[ColumnDescription[T, _]]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataVarargs(value: T*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[T]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyField(value: /* keyof T */ String): Self = this.set("keyField", value.asInstanceOf[js.Any])
    @scala.inline
    def setBootstrap4(value: Boolean): Self = this.set("bootstrap4", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBootstrap4: Self = this.set("bootstrap4", js.undefined)
    @scala.inline
    def setExportCSV(value: Boolean | CSVProps): Self = this.set("exportCSV", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportCSV: Self = this.set("exportCSV", js.undefined)
    @scala.inline
    def setRef(value: js.Any): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setSearch(value: TableSearchProps[T] | Boolean): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
  }
  
}

