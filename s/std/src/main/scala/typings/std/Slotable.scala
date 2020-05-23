package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Slotable extends js.Object {
  val assignedSlot: HTMLSlotElement | Null
}

object Slotable {
  @scala.inline
  def apply(assignedSlot: HTMLSlotElement = null): Slotable = {
    val __obj = js.Dynamic.literal(assignedSlot = assignedSlot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slotable]
  }
}

