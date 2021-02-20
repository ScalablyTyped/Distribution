package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseGroupByCellProps[D /* <: js.Object */] extends StObject {
  
  var isAggregated: Boolean = js.native
  
  var isGrouped: Boolean = js.native
  
  var isPlaceholder: Boolean = js.native
}
object UseGroupByCellProps {
  
  @scala.inline
  def apply[D /* <: js.Object */](isAggregated: Boolean, isGrouped: Boolean, isPlaceholder: Boolean): UseGroupByCellProps[D] = {
    val __obj = js.Dynamic.literal(isAggregated = isAggregated.asInstanceOf[js.Any], isGrouped = isGrouped.asInstanceOf[js.Any], isPlaceholder = isPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseGroupByCellProps[D]]
  }
  
  @scala.inline
  implicit class UseGroupByCellPropsMutableBuilder[Self <: UseGroupByCellProps[_], D /* <: js.Object */] (val x: Self with UseGroupByCellProps[D]) extends AnyVal {
    
    @scala.inline
    def setIsAggregated(value: Boolean): Self = StObject.set(x, "isAggregated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGrouped(value: Boolean): Self = StObject.set(x, "isGrouped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPlaceholder(value: Boolean): Self = StObject.set(x, "isPlaceholder", value.asInstanceOf[js.Any])
  }
}
