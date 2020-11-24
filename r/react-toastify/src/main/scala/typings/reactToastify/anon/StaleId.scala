package typings.reactToastify.anon

import typings.reactToastify.reactToastifyStrings.ADD
import typings.reactToastify.toastContainerReducerMod.Action
import typings.reactToastify.typesMod.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaleId extends Action {
  
  var staleId: js.UndefOr[Id] = js.native
  
  var toastId: Id = js.native
  
  var `type`: ADD = js.native
}
object StaleId {
  
  @scala.inline
  def apply(toastId: Id, `type`: ADD): StaleId = {
    val __obj = js.Dynamic.literal(toastId = toastId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaleId]
  }
  
  @scala.inline
  implicit class StaleIdOps[Self <: StaleId] (val x: Self) extends AnyVal {
    
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
    def setToastId(value: Id): Self = this.set("toastId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ADD): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaleId(value: Id): Self = this.set("staleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaleId: Self = this.set("staleId", js.undefined)
  }
}
