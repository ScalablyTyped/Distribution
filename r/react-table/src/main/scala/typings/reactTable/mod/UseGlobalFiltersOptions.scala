package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  globalFilter :(rows : std.Array<react-table.react-table.Row<D>>, columnIds : std.Array<react-table.react-table.IdType<D>>, filterValue : any): std.Array<react-table.react-table.Row<D>> | string,   manualGlobalFilter :boolean,   filterTypes :react-table.react-table.FilterTypes<D>,   autoResetGlobalFilter :boolean | undefined,   disableGlobalFilter :boolean | undefined}> */
@js.native
trait UseGlobalFiltersOptions[D /* <: js.Object */] extends js.Object {
  
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
  implicit class UseGlobalFiltersOptionsOps[Self <: UseGlobalFiltersOptions[_], D /* <: js.Object */] (val x: Self with UseGlobalFiltersOptions[D]) extends AnyVal {
    
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
    def setAutoResetGlobalFilter(value: Boolean): Self = this.set("autoResetGlobalFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoResetGlobalFilter: Self = this.set("autoResetGlobalFilter", js.undefined)
    
    @scala.inline
    def setDisableGlobalFilter(value: Boolean): Self = this.set("disableGlobalFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableGlobalFilter: Self = this.set("disableGlobalFilter", js.undefined)
    
    @scala.inline
    def setFilterTypes(value: FilterTypes[D]): Self = this.set("filterTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterTypes: Self = this.set("filterTypes", js.undefined)
    
    @scala.inline
    def setGlobalFilterFunction3(
      value: (/* rows */ js.Array[Row[D]], /* columnIds */ js.Array[IdType[D]], /* filterValue */ js.Any) => js.Array[Row[D]]
    ): Self = this.set("globalFilter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGlobalFilter(
      value: (js.Function3[
          /* rows */ js.Array[Row[D]], 
          /* columnIds */ js.Array[IdType[D]], 
          /* filterValue */ js.Any, 
          js.Array[Row[D]]
        ]) | String
    ): Self = this.set("globalFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalFilter: Self = this.set("globalFilter", js.undefined)
    
    @scala.inline
    def setManualGlobalFilter(value: Boolean): Self = this.set("manualGlobalFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManualGlobalFilter: Self = this.set("manualGlobalFilter", js.undefined)
  }
}
