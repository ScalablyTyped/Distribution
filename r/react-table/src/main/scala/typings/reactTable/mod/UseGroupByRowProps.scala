package typings.reactTable.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseGroupByRowProps[D /* <: js.Object */] extends StObject {
  
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
  implicit class UseGroupByRowPropsMutableBuilder[Self <: UseGroupByRowProps[_], D /* <: js.Object */] (val x: Self with UseGroupByRowProps[D]) extends AnyVal {
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByID(value: IdType[D]): Self = StObject.set(x, "groupByID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByVal(value: String): Self = StObject.set(x, "groupByVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGrouped(value: Boolean): Self = StObject.set(x, "isGrouped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeafRows(value: js.Array[Row[D]]): Self = StObject.set(x, "leafRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeafRowsVarargs(value: Row[D]*): Self = StObject.set(x, "leafRows", js.Array(value :_*))
    
    @scala.inline
    def setSubRows(value: js.Array[Row[D]]): Self = StObject.set(x, "subRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubRowsVarargs(value: Row[D]*): Self = StObject.set(x, "subRows", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: Record[IdType[D], AggregatedValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
