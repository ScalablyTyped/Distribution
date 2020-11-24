package typings.reactTable.anon

import typings.reactTable.mod.FilterValue
import typings.reactTable.mod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Value[D /* <: js.Object */] extends js.Object {
  
  var id: IdType[D] = js.native
  
  var value: FilterValue = js.native
}
object Value {
  
  @scala.inline
  def apply[D /* <: js.Object */](id: IdType[D], value: FilterValue): Value[D] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[D]]
  }
  
  @scala.inline
  implicit class ValueOps[Self <: Value[_], D /* <: js.Object */] (val x: Self with Value[D]) extends AnyVal {
    
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
    def setId(value: IdType[D]): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: FilterValue): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
