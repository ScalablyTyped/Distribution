package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  Filter :react-table.react-table.Renderer<react-table.react-table.FilterProps<D>>,   disableFilters :boolean,   defaultCanFilter :boolean,   filter :react-table.react-table.FilterType<D> | react-table.react-table.DefaultFilterTypes | string}> */
trait UseFiltersColumnOptions[D /* <: js.Object */] extends StObject {
  
  var Filter: js.UndefOr[Renderer[FilterProps[D]]] = js.undefined
  
  var defaultCanFilter: js.UndefOr[Boolean] = js.undefined
  
  var disableFilters: js.UndefOr[Boolean] = js.undefined
  
  var filter: js.UndefOr[FilterType[D] | DefaultFilterTypes | String] = js.undefined
}
object UseFiltersColumnOptions {
  
  @scala.inline
  def apply[D /* <: js.Object */](): UseFiltersColumnOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseFiltersColumnOptions[D]]
  }
  
  @scala.inline
  implicit class UseFiltersColumnOptionsMutableBuilder[Self <: UseFiltersColumnOptions[?], D /* <: js.Object */] (val x: Self & UseFiltersColumnOptions[D]) extends AnyVal {
    
    @scala.inline
    def setDefaultCanFilter(value: Boolean): Self = StObject.set(x, "defaultCanFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCanFilterUndefined: Self = StObject.set(x, "defaultCanFilter", js.undefined)
    
    @scala.inline
    def setDisableFilters(value: Boolean): Self = StObject.set(x, "disableFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableFiltersUndefined: Self = StObject.set(x, "disableFilters", js.undefined)
    
    @scala.inline
    def setFilter(value: Renderer[FilterProps[D]]): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
  }
}
