package typings.reactTable.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseGroupByRowProps[D /* <: js.Object */] extends js.Object {
  
  var depth: Double = js.native
  
  var groupByID: IdType[D] = js.native
  
  var groupByVal: String = js.native
  
  var id: String = js.native
  
  var index: Double = js.native
  
  var isGrouped: Boolean = js.native
  
  var leafRows: js.Array[Row[D]] = js.native
  
  var subRows: js.Array[Row[D]] = js.native
  
  var values: Record[IdType[D], AggregatedValue] = js.native
}
object UseGroupByRowProps {
  
  @scala.inline
  def apply[D /* <: js.Object */](
    depth: Double,
    groupByID: IdType[D],
    groupByVal: String,
    id: String,
    index: Double,
    isGrouped: Boolean,
    leafRows: js.Array[Row[D]],
    subRows: js.Array[Row[D]],
    values: Record[IdType[D], AggregatedValue]
  ): UseGroupByRowProps[D] = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], groupByID = groupByID.asInstanceOf[js.Any], groupByVal = groupByVal.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isGrouped = isGrouped.asInstanceOf[js.Any], leafRows = leafRows.asInstanceOf[js.Any], subRows = subRows.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseGroupByRowProps[D]]
  }
  
  @scala.inline
  implicit class UseGroupByRowPropsOps[Self <: UseGroupByRowProps[_], D /* <: js.Object */] (val x: Self with UseGroupByRowProps[D]) extends AnyVal {
    
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
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByID(value: IdType[D]): Self = this.set("groupByID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByVal(value: String): Self = this.set("groupByVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGrouped(value: Boolean): Self = this.set("isGrouped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeafRowsVarargs(value: Row[D]*): Self = this.set("leafRows", js.Array(value :_*))
    
    @scala.inline
    def setLeafRows(value: js.Array[Row[D]]): Self = this.set("leafRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubRowsVarargs(value: Row[D]*): Self = this.set("subRows", js.Array(value :_*))
    
    @scala.inline
    def setSubRows(value: js.Array[Row[D]]): Self = this.set("subRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: Record[IdType[D], AggregatedValue]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
}
