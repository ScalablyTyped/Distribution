package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  globalFilter :(rows : std.Array<react-table.react-table.Row<D>>, columnIds : std.Array<react-table.react-table.IdType<D>>, filterValue : any): std.Array<react-table.react-table.Row<D>> | string,   manualGlobalFilter :boolean,   filterTypes :react-table.react-table.FilterTypes<D>,   autoResetGlobalFilter :boolean | undefined,   disableGlobalFilter :boolean | undefined}> */
@js.native
trait UseGlobalFiltersOptions[D /* <: js.Object */] extends StObject {
  
  var autoResetGlobalFilter: js.UndefOr[Boolean] = js.native
  
  var disableGlobalFilter: js.UndefOr[Boolean] = js.native
  
  var filterTypes: js.UndefOr[FilterTypes[D]] = js.native
  
  var globalFilter: js.UndefOr[
    (js.Function3[
      /* rows */ js.Array[Row[D]], 
      /* columnIds */ js.Array[IdType[D]], 
      /* filterValue */ js.Any, 
      js.Array[Row[D]]
    ]) | String
  ] = js.native
  
  var manualGlobalFilter: js.UndefOr[Boolean] = js.native
}
object UseGlobalFiltersOptions {
  
  @scala.inline
  def apply[D /* <: js.Object */](): UseGlobalFiltersOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseGlobalFiltersOptions[D]]
  }
  
  @scala.inline
  implicit class UseGlobalFiltersOptionsMutableBuilder[Self <: UseGlobalFiltersOptions[_], D /* <: js.Object */] (val x: Self with UseGlobalFiltersOptions[D]) extends AnyVal {
    
    @scala.inline
    def setAutoResetGlobalFilter(value: Boolean): Self = StObject.set(x, "autoResetGlobalFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoResetGlobalFilterUndefined: Self = StObject.set(x, "autoResetGlobalFilter", js.undefined)
    
    @scala.inline
    def setDisableGlobalFilter(value: Boolean): Self = StObject.set(x, "disableGlobalFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableGlobalFilterUndefined: Self = StObject.set(x, "disableGlobalFilter", js.undefined)
    
    @scala.inline
    def setFilterTypes(value: FilterTypes[D]): Self = StObject.set(x, "filterTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterTypesUndefined: Self = StObject.set(x, "filterTypes", js.undefined)
    
    @scala.inline
    def setGlobalFilter(
      value: (js.Function3[
          /* rows */ js.Array[Row[D]], 
          /* columnIds */ js.Array[IdType[D]], 
          /* filterValue */ js.Any, 
          js.Array[Row[D]]
        ]) | String
    ): Self = StObject.set(x, "globalFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalFilterFunction3(
      value: (/* rows */ js.Array[Row[D]], /* columnIds */ js.Array[IdType[D]], /* filterValue */ js.Any) => js.Array[Row[D]]
    ): Self = StObject.set(x, "globalFilter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGlobalFilterUndefined: Self = StObject.set(x, "globalFilter", js.undefined)
    
    @scala.inline
    def setManualGlobalFilter(value: Boolean): Self = StObject.set(x, "manualGlobalFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualGlobalFilterUndefined: Self = StObject.set(x, "manualGlobalFilter", js.undefined)
  }
}
