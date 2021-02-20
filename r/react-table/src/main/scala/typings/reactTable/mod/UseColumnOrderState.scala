package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseColumnOrderState[D /* <: js.Object */] extends StObject {
  
  var columnOrder: js.Array[IdType[D]] = js.native
}
object UseColumnOrderState {
  
  @scala.inline
  def apply[D /* <: js.Object */](columnOrder: js.Array[IdType[D]]): UseColumnOrderState[D] = {
    val __obj = js.Dynamic.literal(columnOrder = columnOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseColumnOrderState[D]]
  }
  
  @scala.inline
  implicit class UseColumnOrderStateMutableBuilder[Self <: UseColumnOrderState[_], D /* <: js.Object */] (val x: Self with UseColumnOrderState[D]) extends AnyVal {
    
    @scala.inline
    def setColumnOrder(value: js.Array[IdType[D]]): Self = StObject.set(x, "columnOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnOrderVarargs(value: IdType[D]*): Self = StObject.set(x, "columnOrder", js.Array(value :_*))
  }
}
