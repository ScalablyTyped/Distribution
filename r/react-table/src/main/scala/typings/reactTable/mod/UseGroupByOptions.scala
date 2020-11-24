package typings.reactTable.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  manualGroupBy :boolean,   disableGroupBy :boolean,   defaultCanGroupBy :boolean,   aggregations :std.Record<string, react-table.react-table.AggregatorFn<D>>, groupByFn (rows : std.Array<react-table.react-table.Row<D>>, columnId : react-table.react-table.IdType<D>): std.Record<string, std.Array<react-table.react-table.Row<D>>>,   autoResetGroupBy :boolean | undefined}> */
@js.native
trait UseGroupByOptions[D /* <: js.Object */] extends js.Object {
  
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
  implicit class UseGroupByOptionsOps[Self <: UseGroupByOptions[_], D /* <: js.Object */] (val x: Self with UseGroupByOptions[D]) extends AnyVal {
    
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
    def setAggregations(value: Record[String, AggregatorFn[D]]): Self = this.set("aggregations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregations: Self = this.set("aggregations", js.undefined)
    
    @scala.inline
    def setAutoResetGroupBy(value: Boolean): Self = this.set("autoResetGroupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoResetGroupBy: Self = this.set("autoResetGroupBy", js.undefined)
    
    @scala.inline
    def setDefaultCanGroupBy(value: Boolean): Self = this.set("defaultCanGroupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCanGroupBy: Self = this.set("defaultCanGroupBy", js.undefined)
    
    @scala.inline
    def setDisableGroupBy(value: Boolean): Self = this.set("disableGroupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableGroupBy: Self = this.set("disableGroupBy", js.undefined)
    
    @scala.inline
    def setGroupByFn(value: (/* rows */ js.Array[Row[D]], /* columnId */ IdType[D]) => Record[String, js.Array[Row[D]]]): Self = this.set("groupByFn", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGroupByFn: Self = this.set("groupByFn", js.undefined)
    
    @scala.inline
    def setManualGroupBy(value: Boolean): Self = this.set("manualGroupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManualGroupBy: Self = this.set("manualGroupBy", js.undefined)
  }
}
