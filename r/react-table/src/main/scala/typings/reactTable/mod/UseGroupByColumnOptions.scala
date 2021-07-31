package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  aggregate :react-table.react-table.Aggregator<D>,   Aggregated :react-table.react-table.Renderer<react-table.react-table.CellProps<D, any>>,   disableGroupBy :boolean,   defaultCanGroupBy :boolean}> */
trait UseGroupByColumnOptions[D /* <: js.Object */] extends StObject {
  
  var Aggregated: js.UndefOr[Renderer[CellProps[D, js.Any]]] = js.undefined
  
  var aggregate: js.UndefOr[Aggregator[D]] = js.undefined
  
  var defaultCanGroupBy: js.UndefOr[Boolean] = js.undefined
  
  var disableGroupBy: js.UndefOr[Boolean] = js.undefined
}
object UseGroupByColumnOptions {
  
  @scala.inline
  def apply[D /* <: js.Object */](): UseGroupByColumnOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseGroupByColumnOptions[D]]
  }
  
  @scala.inline
  implicit class UseGroupByColumnOptionsMutableBuilder[Self <: UseGroupByColumnOptions[?], D /* <: js.Object */] (val x: Self & UseGroupByColumnOptions[D]) extends AnyVal {
    
    @scala.inline
    def setAggregate(value: Aggregator[D]): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateFunction3(
      value: (/* columnValues */ js.Array[CellValue[js.Any]], /* rows */ js.Array[Row[D]], /* isAggregated */ Boolean) => AggregatedValue
    ): Self = StObject.set(x, "aggregate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
    
    @scala.inline
    def setAggregated(value: Renderer[CellProps[D, js.Any]]): Self = StObject.set(x, "Aggregated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregatedUndefined: Self = StObject.set(x, "Aggregated", js.undefined)
    
    @scala.inline
    def setDefaultCanGroupBy(value: Boolean): Self = StObject.set(x, "defaultCanGroupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCanGroupByUndefined: Self = StObject.set(x, "defaultCanGroupBy", js.undefined)
    
    @scala.inline
    def setDisableGroupBy(value: Boolean): Self = StObject.set(x, "disableGroupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableGroupByUndefined: Self = StObject.set(x, "disableGroupBy", js.undefined)
  }
}
