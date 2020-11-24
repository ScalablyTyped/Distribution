package typings.simperium.anon

import typings.simperium.mod.EntityId
import typings.simperium.mod.LocalQueuedChange
import typings.simperium.simperiumStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type
  extends LocalQueuedChange[js.Any] {
  
  var id: EntityId = js.native
  
  var `type`: remove = js.native
}
object Type {
  
  @scala.inline
  def apply(id: EntityId, `type`: remove): Type = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeOps[Self <: Type] (val x: Self) extends AnyVal {
    
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
    def setId(value: EntityId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: remove): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
