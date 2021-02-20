package typings.reactTable.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  manualGroupBy :boolean,   disableGroupBy :boolean,   defaultCanGroupBy :boolean,   aggregations :std.Record<string, react-table.react-table.AggregatorFn<D>>, groupByFn (rows : std.Array<react-table.react-table.Row<D>>, columnId : react-table.react-table.IdType<D>): std.Record<string, std.Array<react-table.react-table.Row<D>>>,   autoResetGroupBy :boolean | undefined}> */
@js.native
trait UseGroupByOptions[D /* <: js.Object */] extends StObject {
  
  var aggregations: js.UndefOr[Record[String, AggregatorFn[D]]] = js.native
  
  var autoResetGroupBy: js.UndefOr[Boolean] = js.native
  
  var defaultCanGroupBy: js.UndefOr[Boolean] = js.native
  
  var disableGroupBy: js.UndefOr[Boolean] = js.native
  
  var groupByFn: js.UndefOr[
    js.Function2[
      /* rows */ js.Array[Row[D]], 
      /* columnId */ IdType[D], 
      Record[String, js.Array[Row[D]]]
    ]
  ] = js.native
  
  var manualGroupBy: js.UndefOr[Boolean] = js.native
}
object UseGroupByOptions {
  
  @scala.inline
  def apply[D /* <: js.Object */](): UseGroupByOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseGroupByOptions[D]]
  }
  
  @scala.inline
  implicit class UseGroupByOptionsMutableBuilder[Self <: UseGroupByOptions[_], D /* <: js.Object */] (val x: Self with UseGroupByOptions[D]) extends AnyVal {
    
    @scala.inline
    def setAggregations(value: Record[String, AggregatorFn[D]]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
    
    @scala.inline
    def setAutoResetGroupBy(value: Boolean): Self = StObject.set(x, "autoResetGroupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoResetGroupByUndefined: Self = StObject.set(x, "autoResetGroupBy", js.undefined)
    
    @scala.inline
    def setDefaultCanGroupBy(value: Boolean): Self = StObject.set(x, "defaultCanGroupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCanGroupByUndefined: Self = StObject.set(x, "defaultCanGroupBy", js.undefined)
    
    @scala.inline
    def setDisableGroupBy(value: Boolean): Self = StObject.set(x, "disableGroupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableGroupByUndefined: Self = StObject.set(x, "disableGroupBy", js.undefined)
    
    @scala.inline
    def setGroupByFn(value: (/* rows */ js.Array[Row[D]], /* columnId */ IdType[D]) => Record[String, js.Array[Row[D]]]): Self = StObject.set(x, "groupByFn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGroupByFnUndefined: Self = StObject.set(x, "groupByFn", js.undefined)
    
    @scala.inline
    def setManualGroupBy(value: Boolean): Self = StObject.set(x, "manualGroupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualGroupByUndefined: Self = StObject.set(x, "manualGroupBy", js.undefined)
  }
}
