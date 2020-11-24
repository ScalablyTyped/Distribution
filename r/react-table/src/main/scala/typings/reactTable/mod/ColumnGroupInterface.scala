package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnGroupInterface[D /* <: js.Object */] extends js.Object {
  
  var columns: js.Array[Column[D]] = js.native
}
object ColumnGroupInterface {
  
  @scala.inline
  def apply[D /* <: js.Object */](columns: js.Array[Column[D]]): ColumnGroupInterface[D] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGroupInterface[D]]
  }
  
  @scala.inline
  implicit class ColumnGroupInterfaceOps[Self <: ColumnGroupInterface[_], D /* <: js.Object */] (val x: Self with ColumnGroupInterface[D]) extends AnyVal {
    
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
    def setColumnsVarargs(value: Column[D]*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[Column[D]]): Self = this.set("columns", value.asInstanceOf[js.Any])
  }
}
