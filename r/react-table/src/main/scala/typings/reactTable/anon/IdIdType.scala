package typings.reactTable.anon

import typings.reactTable.mod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdIdType[D /* <: js.Object */] extends js.Object {
  
  var id: IdType[D] = js.native
}
object IdIdType {
  
  @scala.inline
  def apply[D /* <: js.Object */](id: IdType[D]): IdIdType[D] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdIdType[D]]
  }
  
  @scala.inline
  implicit class IdIdTypeOps[Self <: IdIdType[_], D /* <: js.Object */] (val x: Self with IdIdType[D]) extends AnyVal {
    
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
  }
}
