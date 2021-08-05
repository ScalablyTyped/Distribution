package typings.reactBootstrapTableNext.mod

import typings.reactBootstrapTableNext.anon.CurrFilters
import typings.reactBootstrapTableNext.anon.CurrPage
import typings.reactBootstrapTableNext.anon.Props
import typings.reactBootstrapTableNext.anon.Selected
import typings.reactBootstrapTableNext.anon.StartEditing
import typings.reactBootstrapTableNext.anon.State
import typings.reactBootstrapTableNext.anon.StateSortColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapTableRef[T /* <: js.Object */] extends StObject {
  
  var cellEditContext: js.UndefOr[StartEditing] = js.undefined
  
  var filterContext: js.UndefOr[CurrFilters] = js.undefined
  
  var paginationContext: js.UndefOr[CurrPage] = js.undefined
  
  var rowExpandContext: js.UndefOr[State] = js.undefined
  
  var selectionContext: js.UndefOr[Selected] = js.undefined
  
  var sortContext: js.UndefOr[StateSortColumn[T]] = js.undefined
  
  var table: Props[T]
}
object BootstrapTableRef {
  
  inline def apply[T /* <: js.Object */](table: Props[T]): BootstrapTableRef[T] = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapTableRef[T]]
  }
  
  extension [Self <: BootstrapTableRef[?], T /* <: js.Object */](x: Self & BootstrapTableRef[T]) {
    
    inline def setCellEditContext(value: StartEditing): Self = StObject.set(x, "cellEditContext", value.asInstanceOf[js.Any])
    
    inline def setCellEditContextUndefined: Self = StObject.set(x, "cellEditContext", js.undefined)
    
    inline def setFilterContext(value: CurrFilters): Self = StObject.set(x, "filterContext", value.asInstanceOf[js.Any])
    
    inline def setFilterContextUndefined: Self = StObject.set(x, "filterContext", js.undefined)
    
    inline def setPaginationContext(value: CurrPage): Self = StObject.set(x, "paginationContext", value.asInstanceOf[js.Any])
    
    inline def setPaginationContextUndefined: Self = StObject.set(x, "paginationContext", js.undefined)
    
    inline def setRowExpandContext(value: State): Self = StObject.set(x, "rowExpandContext", value.asInstanceOf[js.Any])
    
    inline def setRowExpandContextUndefined: Self = StObject.set(x, "rowExpandContext", js.undefined)
    
    inline def setSelectionContext(value: Selected): Self = StObject.set(x, "selectionContext", value.asInstanceOf[js.Any])
    
    inline def setSelectionContextUndefined: Self = StObject.set(x, "selectionContext", js.undefined)
    
    inline def setSortContext(value: StateSortColumn[T]): Self = StObject.set(x, "sortContext", value.asInstanceOf[js.Any])
    
    inline def setSortContextUndefined: Self = StObject.set(x, "sortContext", js.undefined)
    
    inline def setTable(value: Props[T]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
  }
}
