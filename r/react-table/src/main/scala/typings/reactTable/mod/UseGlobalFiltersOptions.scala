package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  globalFilter :(rows : std.Array<react-table.react-table.Row<D>>, columnIds : std.Array<react-table.react-table.IdType<D>>, filterValue : any): std.Array<react-table.react-table.Row<D>> | string,   manualGlobalFilter :boolean,   filterTypes :react-table.react-table.FilterTypes<D>,   autoResetGlobalFilter :boolean | undefined,   disableGlobalFilter :boolean | undefined}> */
trait UseGlobalFiltersOptions[D /* <: js.Object */] extends StObject {
  
  var autoResetGlobalFilter: js.UndefOr[Boolean] = js.undefined
  
  var disableGlobalFilter: js.UndefOr[Boolean] = js.undefined
  
  var filterTypes: js.UndefOr[FilterTypes[D]] = js.undefined
  
  var globalFilter: js.UndefOr[
    (js.Function3[
      /* rows */ js.Array[Row[D]], 
      /* columnIds */ js.Array[IdType[D]], 
      /* filterValue */ Any, 
      js.Array[Row[D]]
    ]) | String
  ] = js.undefined
  
  var manualGlobalFilter: js.UndefOr[Boolean] = js.undefined
}
object UseGlobalFiltersOptions {
  
  inline def apply[D /* <: js.Object */](): UseGlobalFiltersOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseGlobalFiltersOptions[D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UseGlobalFiltersOptions[?], D /* <: js.Object */] (val x: Self & UseGlobalFiltersOptions[D]) extends AnyVal {
    
    inline def setAutoResetGlobalFilter(value: Boolean): Self = StObject.set(x, "autoResetGlobalFilter", value.asInstanceOf[js.Any])
    
    inline def setAutoResetGlobalFilterUndefined: Self = StObject.set(x, "autoResetGlobalFilter", js.undefined)
    
    inline def setDisableGlobalFilter(value: Boolean): Self = StObject.set(x, "disableGlobalFilter", value.asInstanceOf[js.Any])
    
    inline def setDisableGlobalFilterUndefined: Self = StObject.set(x, "disableGlobalFilter", js.undefined)
    
    inline def setFilterTypes(value: FilterTypes[D]): Self = StObject.set(x, "filterTypes", value.asInstanceOf[js.Any])
    
    inline def setFilterTypesUndefined: Self = StObject.set(x, "filterTypes", js.undefined)
    
    inline def setGlobalFilter(
      value: (js.Function3[
          /* rows */ js.Array[Row[D]], 
          /* columnIds */ js.Array[IdType[D]], 
          /* filterValue */ Any, 
          js.Array[Row[D]]
        ]) | String
    ): Self = StObject.set(x, "globalFilter", value.asInstanceOf[js.Any])
    
    inline def setGlobalFilterFunction3(
      value: (/* rows */ js.Array[Row[D]], /* columnIds */ js.Array[IdType[D]], /* filterValue */ Any) => js.Array[Row[D]]
    ): Self = StObject.set(x, "globalFilter", js.Any.fromFunction3(value))
    
    inline def setGlobalFilterUndefined: Self = StObject.set(x, "globalFilter", js.undefined)
    
    inline def setManualGlobalFilter(value: Boolean): Self = StObject.set(x, "manualGlobalFilter", value.asInstanceOf[js.Any])
    
    inline def setManualGlobalFilterUndefined: Self = StObject.set(x, "manualGlobalFilter", js.undefined)
  }
}
