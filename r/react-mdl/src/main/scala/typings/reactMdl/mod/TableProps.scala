package typings.reactMdl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableProps extends UndecoratedTableProps {
  
  var onSelectionChanged: js.UndefOr[js.Function1[/* row */ js.Any, _]] = js.native
  
  var selectable: js.UndefOr[Boolean] = js.native
  
  var sortable: js.UndefOr[Boolean] = js.native
}
object TableProps {
  
  @scala.inline
  def apply(rows: js.Array[_]): TableProps = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableProps]
  }
  
  @scala.inline
  implicit class TablePropsMutableBuilder[Self <: TableProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnSelectionChanged(value: /* row */ js.Any => _): Self = StObject.set(x, "onSelectionChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectionChangedUndefined: Self = StObject.set(x, "onSelectionChanged", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    @scala.inline
    def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
  }
}
