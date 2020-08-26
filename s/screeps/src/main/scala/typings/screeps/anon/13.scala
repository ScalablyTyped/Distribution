package typings.screeps.anon

import typings.screeps.screepsNumbers.`0.3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `13` extends js.Object {
  var damage: `0.3` = js.native
}

object `13` {
  @scala.inline
  def apply(damage: `0.3`): `13` = {
    val __obj = js.Dynamic.literal(damage = damage.asInstanceOf[js.Any])
    __obj.asInstanceOf[`13`]
  }
  @scala.inline
  implicit class `13Ops`[Self <: `13`] (val x: Self) extends AnyVal {
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
    def setDamage(value: `0.3`): Self = this.set("damage", value.asInstanceOf[js.Any])
  }
  
}

