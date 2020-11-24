package typings.reactVirtualized.esTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableRowProps extends js.Object {
  
  var className: String = js.native
  
  var columns: js.Array[_] = js.native
  
  var index: Double = js.native
  
  var isScrolling: Boolean = js.native
  
  var key: String = js.native
  
  var onRowClick: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.native
  
  var onRowDoubleClick: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.native
  
  var onRowMouseOut: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.native
  
  var onRowMouseOver: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.native
  
  var onRowRightClick: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.native
  
  var rowData: js.Any = js.native
  
  var style: js.Any = js.native
}
object TableRowProps {
  
  @scala.inline
  def apply(
    className: String,
    columns: js.Array[_],
    index: Double,
    isScrolling: Boolean,
    key: String,
    rowData: js.Any,
    style: js.Any
  ): TableRowProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRowProps]
  }
  
  @scala.inline
  implicit class TableRowPropsOps[Self <: TableRowProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: js.Any*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[_]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsScrolling(value: Boolean): Self = this.set("isScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowData(value: js.Any): Self = this.set("rowData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRowClick(value: /* params */ RowMouseEventHandlerParams => Unit): Self = this.set("onRowClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowClick: Self = this.set("onRowClick", js.undefined)
    
    @scala.inline
    def setOnRowDoubleClick(value: /* params */ RowMouseEventHandlerParams => Unit): Self = this.set("onRowDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowDoubleClick: Self = this.set("onRowDoubleClick", js.undefined)
    
    @scala.inline
    def setOnRowMouseOut(value: /* params */ RowMouseEventHandlerParams => Unit): Self = this.set("onRowMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowMouseOut: Self = this.set("onRowMouseOut", js.undefined)
    
    @scala.inline
    def setOnRowMouseOver(value: /* params */ RowMouseEventHandlerParams => Unit): Self = this.set("onRowMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowMouseOver: Self = this.set("onRowMouseOver", js.undefined)
    
    @scala.inline
    def setOnRowRightClick(value: /* params */ RowMouseEventHandlerParams => Unit): Self = this.set("onRowRightClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowRightClick: Self = this.set("onRowRightClick", js.undefined)
  }
}
