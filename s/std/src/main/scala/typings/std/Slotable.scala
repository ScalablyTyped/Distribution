package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slotable extends js.Object {
  val assignedSlot: HTMLSlotElement | Null = js.native
}

object Slotable {
  @scala.inline
  def apply(): Slotable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Slotable]
  }
  @scala.inline
  implicit class SlotableOps[Self <: Slotable] (val x: Self) extends AnyVal {
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

