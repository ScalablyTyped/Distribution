package typings.reactVirtualized.esTableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableRowProps extends StObject {
  
  var className: String
  
  var columns: js.Array[js.Any]
  
  var index: Double
  
  var isScrolling: Boolean
  
  var key: String
  
  var onRowClick: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.undefined
  
  var onRowDoubleClick: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.undefined
  
  var onRowMouseOut: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.undefined
  
  var onRowMouseOver: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.undefined
  
  var onRowRightClick: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.undefined
  
  var rowData: js.Any
  
  var style: js.Any
}
object TableRowProps {
  
  inline def apply(
    className: String,
    columns: js.Array[js.Any],
    index: Double,
    isScrolling: Boolean,
    key: String,
    rowData: js.Any,
    style: js.Any
  ): TableRowProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRowProps]
  }
  
  extension [Self <: TableRowProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setColumns(value: js.Array[js.Any]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: js.Any*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOnRowClick(value: /* params */ RowMouseEventHandlerParams => Unit): Self = StObject.set(x, "onRowClick", js.Any.fromFunction1(value))
    
    inline def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
    
    inline def setOnRowDoubleClick(value: /* params */ RowMouseEventHandlerParams => Unit): Self = StObject.set(x, "onRowDoubleClick", js.Any.fromFunction1(value))
    
    inline def setOnRowDoubleClickUndefined: Self = StObject.set(x, "onRowDoubleClick", js.undefined)
    
    inline def setOnRowMouseOut(value: /* params */ RowMouseEventHandlerParams => Unit): Self = StObject.set(x, "onRowMouseOut", js.Any.fromFunction1(value))
    
    inline def setOnRowMouseOutUndefined: Self = StObject.set(x, "onRowMouseOut", js.undefined)
    
    inline def setOnRowMouseOver(value: /* params */ RowMouseEventHandlerParams => Unit): Self = StObject.set(x, "onRowMouseOver", js.Any.fromFunction1(value))
    
    inline def setOnRowMouseOverUndefined: Self = StObject.set(x, "onRowMouseOver", js.undefined)
    
    inline def setOnRowRightClick(value: /* params */ RowMouseEventHandlerParams => Unit): Self = StObject.set(x, "onRowRightClick", js.Any.fromFunction1(value))
    
    inline def setOnRowRightClickUndefined: Self = StObject.set(x, "onRowRightClick", js.undefined)
    
    inline def setRowData(value: js.Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
