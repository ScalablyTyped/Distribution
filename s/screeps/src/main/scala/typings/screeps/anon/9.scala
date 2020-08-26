package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `9` extends js.Object {
  var capacity: typings.screeps.screepsNumbers.`4` = js.native
}

object `9` {
  @scala.inline
  def apply(capacity: typings.screeps.screepsNumbers.`4`): `9` = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[`9`]
  }
  @scala.inline
  implicit class `9Ops`[Self <: `9`] (val x: Self) extends AnyVal {
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
    def setCapacity(value: typings.screeps.screepsNumbers.`4`): Self = this.set("capacity", value.asInstanceOf[js.Any])
  }
  
}

