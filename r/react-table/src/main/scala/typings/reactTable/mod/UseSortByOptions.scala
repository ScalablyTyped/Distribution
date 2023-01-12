package typings.reactTable.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  manualSortBy :boolean,   disableSortBy :boolean,   defaultCanSort :boolean,   disableMultiSort :boolean, isMultiSortEvent (e : react.react.MouseEvent<std.Element, react.react.NativeMouseEvent>): boolean,   maxMultiSortColCount :number,   disableSortRemove :boolean,   disabledMultiRemove :boolean, orderByFn (rows : std.Array<react-table.react-table.Row<D>>, sortFns : std.Array<react-table.react-table.OrderByFn<D>>, directions : std.Array<boolean>): std.Array<react-table.react-table.Row<D>>,   sortTypes :std.Record<string, react-table.react-table.SortByFn<D>>,   autoResetSortBy :boolean | undefined}> */
trait UseSortByOptions[D /* <: js.Object */] extends StObject {
  
  var autoResetSortBy: js.UndefOr[Boolean] = js.undefined
  
  var defaultCanSort: js.UndefOr[Boolean] = js.undefined
  
  var disableMultiSort: js.UndefOr[Boolean] = js.undefined
  
  var disableSortBy: js.UndefOr[Boolean] = js.undefined
  
  var disableSortRemove: js.UndefOr[Boolean] = js.undefined
  
  var disabledMultiRemove: js.UndefOr[Boolean] = js.undefined
  
  var isMultiSortEvent: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Boolean]] = js.undefined
  
  var manualSortBy: js.UndefOr[Boolean] = js.undefined
  
  var maxMultiSortColCount: js.UndefOr[Double] = js.undefined
  
  var orderByFn: js.UndefOr[
    js.Function3[
      /* rows */ js.Array[Row[D]], 
      /* sortFns */ js.Array[OrderByFn[D]], 
      /* directions */ js.Array[Boolean], 
      js.Array[Row[D]]
    ]
  ] = js.undefined
  
  var sortTypes: js.UndefOr[Record[String, SortByFn[D]]] = js.undefined
}
object UseSortByOptions {
  
  inline def apply[D /* <: js.Object */](): UseSortByOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseSortByOptions[D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UseSortByOptions[?], D /* <: js.Object */] (val x: Self & UseSortByOptions[D]) extends AnyVal {
    
    inline def setAutoResetSortBy(value: Boolean): Self = StObject.set(x, "autoResetSortBy", value.asInstanceOf[js.Any])
    
    inline def setAutoResetSortByUndefined: Self = StObject.set(x, "autoResetSortBy", js.undefined)
    
    inline def setDefaultCanSort(value: Boolean): Self = StObject.set(x, "defaultCanSort", value.asInstanceOf[js.Any])
    
    inline def setDefaultCanSortUndefined: Self = StObject.set(x, "defaultCanSort", js.undefined)
    
    inline def setDisableMultiSort(value: Boolean): Self = StObject.set(x, "disableMultiSort", value.asInstanceOf[js.Any])
    
    inline def setDisableMultiSortUndefined: Self = StObject.set(x, "disableMultiSort", js.undefined)
    
    inline def setDisableSortBy(value: Boolean): Self = StObject.set(x, "disableSortBy", value.asInstanceOf[js.Any])
    
    inline def setDisableSortByUndefined: Self = StObject.set(x, "disableSortBy", js.undefined)
    
    inline def setDisableSortRemove(value: Boolean): Self = StObject.set(x, "disableSortRemove", value.asInstanceOf[js.Any])
    
    inline def setDisableSortRemoveUndefined: Self = StObject.set(x, "disableSortRemove", js.undefined)
    
    inline def setDisabledMultiRemove(value: Boolean): Self = StObject.set(x, "disabledMultiRemove", value.asInstanceOf[js.Any])
    
    inline def setDisabledMultiRemoveUndefined: Self = StObject.set(x, "disabledMultiRemove", js.undefined)
    
    inline def setIsMultiSortEvent(value: /* e */ MouseEvent[Element, NativeMouseEvent] => Boolean): Self = StObject.set(x, "isMultiSortEvent", js.Any.fromFunction1(value))
    
    inline def setIsMultiSortEventUndefined: Self = StObject.set(x, "isMultiSortEvent", js.undefined)
    
    inline def setManualSortBy(value: Boolean): Self = StObject.set(x, "manualSortBy", value.asInstanceOf[js.Any])
    
    inline def setManualSortByUndefined: Self = StObject.set(x, "manualSortBy", js.undefined)
    
    inline def setMaxMultiSortColCount(value: Double): Self = StObject.set(x, "maxMultiSortColCount", value.asInstanceOf[js.Any])
    
    inline def setMaxMultiSortColCountUndefined: Self = StObject.set(x, "maxMultiSortColCount", js.undefined)
    
    inline def setOrderByFn(
      value: (/* rows */ js.Array[Row[D]], /* sortFns */ js.Array[OrderByFn[D]], /* directions */ js.Array[Boolean]) => js.Array[Row[D]]
    ): Self = StObject.set(x, "orderByFn", js.Any.fromFunction3(value))
    
    inline def setOrderByFnUndefined: Self = StObject.set(x, "orderByFn", js.undefined)
    
    inline def setSortTypes(value: Record[String, SortByFn[D]]): Self = StObject.set(x, "sortTypes", value.asInstanceOf[js.Any])
    
    inline def setSortTypesUndefined: Self = StObject.set(x, "sortTypes", js.undefined)
  }
}
