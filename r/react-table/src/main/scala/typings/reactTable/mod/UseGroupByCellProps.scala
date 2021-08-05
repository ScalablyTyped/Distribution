package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseGroupByCellProps[D /* <: js.Object */] extends StObject {
  
  var isAggregated: Boolean
  
  var isGrouped: Boolean
  
  var isPlaceholder: Boolean
}
object UseGroupByCellProps {
  
  inline def apply[D /* <: js.Object */](isAggregated: Boolean, isGrouped: Boolean, isPlaceholder: Boolean): UseGroupByCellProps[D] = {
    val __obj = js.Dynamic.literal(isAggregated = isAggregated.asInstanceOf[js.Any], isGrouped = isGrouped.asInstanceOf[js.Any], isPlaceholder = isPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseGroupByCellProps[D]]
  }
  
  extension [Self <: UseGroupByCellProps[?], D /* <: js.Object */](x: Self & UseGroupByCellProps[D]) {
    
    inline def setIsAggregated(value: Boolean): Self = StObject.set(x, "isAggregated", value.asInstanceOf[js.Any])
    
    inline def setIsGrouped(value: Boolean): Self = StObject.set(x, "isGrouped", value.asInstanceOf[js.Any])
    
    inline def setIsPlaceholder(value: Boolean): Self = StObject.set(x, "isPlaceholder", value.asInstanceOf[js.Any])
  }
}
