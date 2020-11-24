package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseColumnOrderState[D /* <: js.Object */] extends js.Object {
  
  var columnOrder: js.Array[IdType[D]] = js.native
}
object UseColumnOrderState {
  
  @scala.inline
  def apply[D /* <: js.Object */](columnOrder: js.Array[IdType[D]]): UseColumnOrderState[D] = {
    val __obj = js.Dynamic.literal(columnOrder = columnOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseColumnOrderState[D]]
  }
  
  @scala.inline
  implicit class UseColumnOrderStateOps[Self <: UseColumnOrderState[_], D /* <: js.Object */] (val x: Self with UseColumnOrderState[D]) extends AnyVal {
    
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
    def setColumnOrderVarargs(value: IdType[D]*): Self = this.set("columnOrder", js.Array(value :_*))
    
    @scala.inline
    def setColumnOrder(value: js.Array[IdType[D]]): Self = this.set("columnOrder", value.asInstanceOf[js.Any])
  }
}
