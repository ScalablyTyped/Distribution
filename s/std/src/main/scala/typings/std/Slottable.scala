package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slottable extends js.Object {
  
  val assignedSlot: HTMLSlotElement | Null = js.native
}
object Slottable {
  
  @scala.inline
  def apply(): Slottable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Slottable]
  }
  
  @scala.inline
  implicit class SlottableOps[Self <: Slottable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssignedSlot(value: HTMLSlotElement): Self = this.set("assignedSlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedSlotNull: Self = this.set("assignedSlot", null)
  }
}
