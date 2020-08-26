package typings.screeps.anon

import typings.screeps.screepsNumbers.`0.5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `12` extends js.Object {
  var damage: `0.5` = js.native
}

object `12` {
  @scala.inline
  def apply(damage: `0.5`): `12` = {
    val __obj = js.Dynamic.literal(damage = damage.asInstanceOf[js.Any])
    __obj.asInstanceOf[`12`]
  }
  @scala.inline
  implicit class `12Ops`[Self <: `12`] (val x: Self) extends AnyVal {
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
    def setDamage(value: `0.5`): Self = this.set("damage", value.asInstanceOf[js.Any])
  }
  
}

