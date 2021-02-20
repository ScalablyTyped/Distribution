package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnSortEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  
  var multiColumnSort: Boolean = js.native
  
  var sortAsc: Boolean = js.native
  
  // Single column returned
  var sortCol: js.UndefOr[Column[T]] = js.native
  
  // Multiple columns returned
  var sortCols: js.UndefOr[js.Array[SortColumn[T]]] = js.native
}
object OnSortEventArgs {
  
  @scala.inline
  def apply[T /* <: SlickData */](grid: Grid[T], multiColumnSort: Boolean, sortAsc: Boolean): OnSortEventArgs[T] = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], multiColumnSort = multiColumnSort.asInstanceOf[js.Any], sortAsc = sortAsc.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSortEventArgs[T]]
  }
  
  @scala.inline
  implicit class OnSortEventArgsMutableBuilder[Self <: OnSortEventArgs[_], T /* <: SlickData */] (val x: Self with OnSortEventArgs[T]) extends AnyVal {
    
    @scala.inline
    def setMultiColumnSort(value: Boolean): Self = StObject.set(x, "multiColumnSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortAsc(value: Boolean): Self = StObject.set(x, "sortAsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortCol(value: Column[T]): Self = StObject.set(x, "sortCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortColUndefined: Self = StObject.set(x, "sortCol", js.undefined)
    
    @scala.inline
    def setSortCols(value: js.Array[SortColumn[T]]): Self = StObject.set(x, "sortCols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortColsUndefined: Self = StObject.set(x, "sortCols", js.undefined)
    
    @scala.inline
    def setSortColsVarargs(value: SortColumn[T]*): Self = StObject.set(x, "sortCols", js.Array(value :_*))
  }
}
