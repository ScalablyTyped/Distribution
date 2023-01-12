package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  defaultCanSort :boolean,   disableSortBy :boolean,   sortDescFirst :boolean,   sortInverted :boolean,   sortType :react-table.react-table.SortByFn<D> | react-table.react-table.DefaultSortTypes | string}> */
trait UseSortByColumnOptions[D /* <: js.Object */] extends StObject {
  
  var defaultCanSort: js.UndefOr[Boolean] = js.undefined
  
  var disableSortBy: js.UndefOr[Boolean] = js.undefined
  
  var sortDescFirst: js.UndefOr[Boolean] = js.undefined
  
  var sortInverted: js.UndefOr[Boolean] = js.undefined
  
  var sortType: js.UndefOr[SortByFn[D] | DefaultSortTypes | String] = js.undefined
}
object UseSortByColumnOptions {
  
  inline def apply[D /* <: js.Object */](): UseSortByColumnOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseSortByColumnOptions[D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UseSortByColumnOptions[?], D /* <: js.Object */] (val x: Self & UseSortByColumnOptions[D]) extends AnyVal {
    
    inline def setDefaultCanSort(value: Boolean): Self = StObject.set(x, "defaultCanSort", value.asInstanceOf[js.Any])
    
    inline def setDefaultCanSortUndefined: Self = StObject.set(x, "defaultCanSort", js.undefined)
    
    inline def setDisableSortBy(value: Boolean): Self = StObject.set(x, "disableSortBy", value.asInstanceOf[js.Any])
    
    inline def setDisableSortByUndefined: Self = StObject.set(x, "disableSortBy", js.undefined)
    
    inline def setSortDescFirst(value: Boolean): Self = StObject.set(x, "sortDescFirst", value.asInstanceOf[js.Any])
    
    inline def setSortDescFirstUndefined: Self = StObject.set(x, "sortDescFirst", js.undefined)
    
    inline def setSortInverted(value: Boolean): Self = StObject.set(x, "sortInverted", value.asInstanceOf[js.Any])
    
    inline def setSortInvertedUndefined: Self = StObject.set(x, "sortInverted", js.undefined)
    
    inline def setSortType(value: SortByFn[D] | DefaultSortTypes | String): Self = StObject.set(x, "sortType", value.asInstanceOf[js.Any])
    
    inline def setSortTypeFunction4(
      value: (/* rowA */ Row[D], /* rowB */ Row[D], /* columnId */ IdType[D], /* desc */ js.UndefOr[Boolean]) => Double
    ): Self = StObject.set(x, "sortType", js.Any.fromFunction4(value))
    
    inline def setSortTypeUndefined: Self = StObject.set(x, "sortType", js.undefined)
  }
}
