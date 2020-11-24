package typings.reactTable.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseExpandedState[D /* <: js.Object */] extends js.Object {
  
  var expanded: Record[IdType[D], Boolean] = js.native
}
object UseExpandedState {
  
  @scala.inline
  def apply[D /* <: js.Object */](expanded: Record[IdType[D], Boolean]): UseExpandedState[D] = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseExpandedState[D]]
  }
  
  @scala.inline
  implicit class UseExpandedStateOps[Self <: UseExpandedState[_], D /* <: js.Object */] (val x: Self with UseExpandedState[D]) extends AnyVal {
    
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
    def setExpanded(value: Record[IdType[D], Boolean]): Self = this.set("expanded", value.asInstanceOf[js.Any])
  }
}
