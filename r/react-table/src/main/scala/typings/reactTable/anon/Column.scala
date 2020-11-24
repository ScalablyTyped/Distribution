package typings.reactTable.anon

import typings.reactTable.mod.HeaderGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Column[D /* <: js.Object */] extends js.Object {
  
  var column: HeaderGroup[D] = js.native
}
object Column {
  
  @scala.inline
  def apply[D /* <: js.Object */](column: HeaderGroup[D]): Column[D] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column[D]]
  }
  
  @scala.inline
  implicit class ColumnOps[Self <: Column[_], D /* <: js.Object */] (val x: Self with Column[D]) extends AnyVal {
    
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
    def setColumn(value: HeaderGroup[D]): Self = this.set("column", value.asInstanceOf[js.Any])
  }
}
