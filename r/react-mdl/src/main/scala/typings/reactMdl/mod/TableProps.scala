package typings.reactMdl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableProps
  extends StObject
     with UndecoratedTableProps {
  
  var onSelectionChanged: js.UndefOr[js.Function1[/* row */ Any, Any]] = js.undefined
  
  var selectable: js.UndefOr[Boolean] = js.undefined
  
  var sortable: js.UndefOr[Boolean] = js.undefined
}
object TableProps {
  
  inline def apply(rows: js.Array[Any]): TableProps = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableProps] (val x: Self) extends AnyVal {
    
    inline def setOnSelectionChanged(value: /* row */ Any => Any): Self = StObject.set(x, "onSelectionChanged", js.Any.fromFunction1(value))
    
    inline def setOnSelectionChangedUndefined: Self = StObject.set(x, "onSelectionChanged", js.undefined)
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
  }
}
