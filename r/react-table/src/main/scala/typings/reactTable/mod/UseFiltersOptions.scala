package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  manualFilters :boolean,   disableFilters :boolean,   defaultCanFilter :boolean,   filterTypes :react-table.react-table.FilterTypes<D>,   autoResetFilters :boolean | undefined}> */
trait UseFiltersOptions[D /* <: js.Object */] extends StObject {
  
  var autoResetFilters: js.UndefOr[Boolean] = js.undefined
  
  var defaultCanFilter: js.UndefOr[Boolean] = js.undefined
  
  var disableFilters: js.UndefOr[Boolean] = js.undefined
  
  var filterTypes: js.UndefOr[FilterTypes[D]] = js.undefined
  
  var manualFilters: js.UndefOr[Boolean] = js.undefined
}
object UseFiltersOptions {
  
  @scala.inline
  def apply[D /* <: js.Object */](): UseFiltersOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseFiltersOptions[D]]
  }
  
  @scala.inline
  implicit class UseFiltersOptionsMutableBuilder[Self <: UseFiltersOptions[?], D /* <: js.Object */] (val x: Self & UseFiltersOptions[D]) extends AnyVal {
    
    @scala.inline
    def setAutoResetFilters(value: Boolean): Self = StObject.set(x, "autoResetFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoResetFiltersUndefined: Self = StObject.set(x, "autoResetFilters", js.undefined)
    
    @scala.inline
    def setDefaultCanFilter(value: Boolean): Self = StObject.set(x, "defaultCanFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCanFilterUndefined: Self = StObject.set(x, "defaultCanFilter", js.undefined)
    
    @scala.inline
    def setDisableFilters(value: Boolean): Self = StObject.set(x, "disableFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableFiltersUndefined: Self = StObject.set(x, "disableFilters", js.undefined)
    
    @scala.inline
    def setFilterTypes(value: FilterTypes[D]): Self = StObject.set(x, "filterTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterTypesUndefined: Self = StObject.set(x, "filterTypes", js.undefined)
    
    @scala.inline
    def setManualFilters(value: Boolean): Self = StObject.set(x, "manualFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualFiltersUndefined: Self = StObject.set(x, "manualFilters", js.undefined)
  }
}
