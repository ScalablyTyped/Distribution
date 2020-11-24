package typings.screeps.anon

import typings.screeps.EventDestroyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeEventDestroyType extends js.Object {
  
  var `type`: EventDestroyType = js.native
}
object TypeEventDestroyType {
  
  @scala.inline
  def apply(`type`: EventDestroyType): TypeEventDestroyType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeEventDestroyType]
  }
  
  @scala.inline
  implicit class TypeEventDestroyTypeOps[Self <: TypeEventDestroyType] (val x: Self) extends AnyVal {
    
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
    def setType(value: EventDestroyType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
