package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseGroupByState[D /* <: js.Object */] extends js.Object {
  
  var groupBy: js.Array[IdType[D]] = js.native
}
object UseGroupByState {
  
  @scala.inline
  def apply[D /* <: js.Object */](groupBy: js.Array[IdType[D]]): UseGroupByState[D] = {
    val __obj = js.Dynamic.literal(groupBy = groupBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseGroupByState[D]]
  }
  
  @scala.inline
  implicit class UseGroupByStateOps[Self <: UseGroupByState[_], D /* <: js.Object */] (val x: Self with UseGroupByState[D]) extends AnyVal {
    
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
    def setGroupByVarargs(value: IdType[D]*): Self = this.set("groupBy", js.Array(value :_*))
    
    @scala.inline
    def setGroupBy(value: js.Array[IdType[D]]): Self = this.set("groupBy", value.asInstanceOf[js.Any])
  }
}
