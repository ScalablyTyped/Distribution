package typings.reactTable.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseGroupByRowProps[D /* <: js.Object */] extends StObject {
  
  var depth: Double
  
  var groupByID: IdType[D]
  
  var groupByVal: String
  
  var id: String
  
  var index: Double
  
  var isGrouped: Boolean
  
  var leafRows: js.Array[Row[D]]
  
  var subRows: js.Array[Row[D]]
  
  var values: Record[IdType[D], AggregatedValue]
}
object UseGroupByRowProps {
  
  inline def apply[D /* <: js.Object */](
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
  implicit open class MutableBuilder[Self <: UseGroupByRowProps[?], D /* <: js.Object */] (val x: Self & UseGroupByRowProps[D]) extends AnyVal {
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setGroupByID(value: IdType[D]): Self = StObject.set(x, "groupByID", value.asInstanceOf[js.Any])
    
    inline def setGroupByVal(value: String): Self = StObject.set(x, "groupByVal", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIsGrouped(value: Boolean): Self = StObject.set(x, "isGrouped", value.asInstanceOf[js.Any])
    
    inline def setLeafRows(value: js.Array[Row[D]]): Self = StObject.set(x, "leafRows", value.asInstanceOf[js.Any])
    
    inline def setLeafRowsVarargs(value: Row[D]*): Self = StObject.set(x, "leafRows", js.Array(value*))
    
    inline def setSubRows(value: js.Array[Row[D]]): Self = StObject.set(x, "subRows", value.asInstanceOf[js.Any])
    
    inline def setSubRowsVarargs(value: Row[D]*): Self = StObject.set(x, "subRows", js.Array(value*))
    
    inline def setValues(value: Record[IdType[D], AggregatedValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
