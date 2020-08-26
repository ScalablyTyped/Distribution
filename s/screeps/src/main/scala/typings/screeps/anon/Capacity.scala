package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Capacity extends js.Object {
  var capacity: typings.screeps.screepsNumbers.`2` = js.native
}

object Capacity {
  @scala.inline
  def apply(capacity: typings.screeps.screepsNumbers.`2`): Capacity = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Capacity]
  }
  @scala.inline
  implicit class CapacityOps[Self <: Capacity] (val x: Self) extends AnyVal {
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
    def setCapacity(value: typings.screeps.screepsNumbers.`2`): Self = this.set("capacity", value.asInstanceOf[js.Any])
  }
  
}

