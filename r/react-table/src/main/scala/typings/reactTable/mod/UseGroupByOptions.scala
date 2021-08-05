package typings.reactTable.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  manualGroupBy :boolean,   disableGroupBy :boolean,   defaultCanGroupBy :boolean,   aggregations :std.Record<string, react-table.react-table.AggregatorFn<D>>, groupByFn (rows : std.Array<react-table.react-table.Row<D>>, columnId : react-table.react-table.IdType<D>): std.Record<string, std.Array<react-table.react-table.Row<D>>>,   autoResetGroupBy :boolean | undefined}> */
trait UseGroupByOptions[D /* <: js.Object */] extends StObject {
  
  var aggregations: js.UndefOr[Record[String, AggregatorFn[D]]] = js.undefined
  
  var autoResetGroupBy: js.UndefOr[Boolean] = js.undefined
  
  var defaultCanGroupBy: js.UndefOr[Boolean] = js.undefined
  
  var disableGroupBy: js.UndefOr[Boolean] = js.undefined
  
  var groupByFn: js.UndefOr[
    js.Function2[
      /* rows */ js.Array[Row[D]], 
      /* columnId */ IdType[D], 
      Record[String, js.Array[Row[D]]]
    ]
  ] = js.undefined
  
  var manualGroupBy: js.UndefOr[Boolean] = js.undefined
}
object UseGroupByOptions {
  
  inline def apply[D /* <: js.Object */](): UseGroupByOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseGroupByOptions[D]]
  }
  
  extension [Self <: UseGroupByOptions[?], D /* <: js.Object */](x: Self & UseGroupByOptions[D]) {
    
    inline def setAggregations(value: Record[String, AggregatorFn[D]]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    inline def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
    
    inline def setAutoResetGroupBy(value: Boolean): Self = StObject.set(x, "autoResetGroupBy", value.asInstanceOf[js.Any])
    
    inline def setAutoResetGroupByUndefined: Self = StObject.set(x, "autoResetGroupBy", js.undefined)
    
    inline def setDefaultCanGroupBy(value: Boolean): Self = StObject.set(x, "defaultCanGroupBy", value.asInstanceOf[js.Any])
    
    inline def setDefaultCanGroupByUndefined: Self = StObject.set(x, "defaultCanGroupBy", js.undefined)
    
    inline def setDisableGroupBy(value: Boolean): Self = StObject.set(x, "disableGroupBy", value.asInstanceOf[js.Any])
    
    inline def setDisableGroupByUndefined: Self = StObject.set(x, "disableGroupBy", js.undefined)
    
    inline def setGroupByFn(value: (/* rows */ js.Array[Row[D]], /* columnId */ IdType[D]) => Record[String, js.Array[Row[D]]]): Self = StObject.set(x, "groupByFn", js.Any.fromFunction2(value))
    
    inline def setGroupByFnUndefined: Self = StObject.set(x, "groupByFn", js.undefined)
    
    inline def setManualGroupBy(value: Boolean): Self = StObject.set(x, "manualGroupBy", value.asInstanceOf[js.Any])
    
    inline def setManualGroupByUndefined: Self = StObject.set(x, "manualGroupBy", js.undefined)
  }
}
