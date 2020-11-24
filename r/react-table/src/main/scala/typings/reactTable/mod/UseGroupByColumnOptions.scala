package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  aggregate :react-table.react-table.Aggregator<D>,   Aggregated :react-table.react-table.Renderer<react-table.react-table.CellProps<D, any>>,   disableGroupBy :boolean,   defaultCanGroupBy :boolean}> */
@js.native
trait UseGroupByColumnOptions[D /* <: js.Object */] extends js.Object {
  
  var Aggregated: js.UndefOr[Renderer[CellProps[D, _]]] = js.native
  
  var aggregate: js.UndefOr[Aggregator[D]] = js.native
  
  var defaultCanGroupBy: js.UndefOr[Boolean] = js.native
  
  var disableGroupBy: js.UndefOr[Boolean] = js.native
}
object UseGroupByColumnOptions {
  
  @scala.inline
  def apply[D /* <: js.Object */](): UseGroupByColumnOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseGroupByColumnOptions[D]]
  }
  
  @scala.inline
  implicit class UseGroupByColumnOptionsOps[Self <: UseGroupByColumnOptions[_], D /* <: js.Object */] (val x: Self with UseGroupByColumnOptions[D]) extends AnyVal {
    
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
    def setAggregated(value: Renderer[CellProps[D, _]]): Self = this.set("Aggregated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregated: Self = this.set("Aggregated", js.undefined)
    
    @scala.inline
    def setAggregateFunction3(
      value: (/* columnValues */ js.Array[CellValue[js.Any]], /* rows */ js.Array[Row[D]], /* isAggregated */ Boolean) => AggregatedValue
    ): Self = this.set("aggregate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAggregate(value: Aggregator[D]): Self = this.set("aggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregate: Self = this.set("aggregate", js.undefined)
    
    @scala.inline
    def setDefaultCanGroupBy(value: Boolean): Self = this.set("defaultCanGroupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCanGroupBy: Self = this.set("defaultCanGroupBy", js.undefined)
    
    @scala.inline
    def setDisableGroupBy(value: Boolean): Self = this.set("disableGroupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableGroupBy: Self = this.set("disableGroupBy", js.undefined)
  }
}
